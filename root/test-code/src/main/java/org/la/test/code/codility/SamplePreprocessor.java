package org.la.test.code.codility;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SamplePreprocessor {

    Stream<BigDecimal> preprocess(Stream<BigDecimal> input) {
        Map<BigDecimal, List<BigDecimal>> collect = null;
        input.filter(Objects::nonNull)
                .filter(bd -> bd.compareTo(BigDecimal.ZERO) > 0)
                .collect(
                        Collectors.groupingBy(bigDecimal -> {
                            if (bigDecimal.compareTo(new BigDecimal(25)) > 0) {
                                return bigDecimal;
                            }
                            if (bigDecimal.compareTo(new BigDecimal(40)) > 0) {
                                return bigDecimal;
                            }
                            return bigDecimal;
                        })
                )
                .entrySet()
                .stream()
                .filter((k) -> {
                    List<BigDecimal> value = k.getValue();
                    Double average = value.stream().mapToDouble(bd -> bd.doubleValue()).average().getAsDouble();
                    if(average <30 ) {
                        return true;
                    }
                    return false;
                })
                .flatMap(es -> es.getValue().stream())
        .mapToDouble(db -> db.doubleValue())
        ;
        collect.values().stream()
        .flatMap(list -> list.stream())
        .mapToDouble(bd -> bd.doubleValue())
                .average();
        return null;
    }
}
