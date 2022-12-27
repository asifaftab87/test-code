package org.la.test.code.thred.mcp.util;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.la.test.code.thred.mcp.model.Sample;

import java.io.File;
import java.io.FileInputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Util {

    public static void main(String[] args) {
        Arrays.stream(generateExample(10)).forEach(System.out::println);
        System.out.println("size: "+readCsvEuriborem().length);
    }

    /** Size of generated array is 4119 */
    public static double[] readCsvEuriborem() {
        List<Double> list = new ArrayList<>();
        try {
            Sheet sheet = new XSSFWorkbook(
                    new FileInputStream(new File(
                             "./src/main/java/org/la/test/code/thred/mcp/util/bank-additional.xlsx")))
                    .getSheetAt(0);
            for (Row row : sheet) {
                for (Cell cell : row) {
                    switch (cell.getCellType()) {
                        case STRING:
                            if (cell.getColumnIndex() == 18
                                && Pattern.compile("-?\\d+(\\.\\d*)?")
                                    .matcher(cell.getStringCellValue()).matches()) {
                                list.add(Double.valueOf(cell.getStringCellValue()));
                            }
                            break;
                        default:
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list.stream().mapToDouble(Double::doubleValue).toArray();
    }

    public static double[] generateExample(int range) {
        Random r = new Random();
        double[] arr = new double[range];
        for (int i=0; i<range; i++) {
            arr[i] = Double.parseDouble(new DecimalFormat("#.###")
                    .format(1.0 + 3.0 * r.nextDouble()));
        }
        return arr;
    }

    public static List<Sample> listSample() {
        return Arrays.asList(readCsvEuriborem())
                .stream()
                .map(d -> new Sample("ample", d))
                .collect(Collectors.toList());
    }

    public static List<Sample> listSample(int range) {
        return Arrays.asList(generateExample(range))
                .stream()
                .map(d -> new Sample("ample", d))
                .collect(Collectors.toList());
    }
}
