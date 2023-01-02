package org.la.test.code.ps.pck.genr;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class FlowerUtil {

    public static void print(List<? extends Flower> list) {
        list.forEach(flower ->
                System.out.println("{ name: " + flower.getName() + ", color: " + flower.getColor() + " }")
        );
    }

    public static List<? super Flower> add(List<? super Flower> list, Flower flower) {
        list.add(flower);
        return list;
    }

    public static <T extends Flower> List<T> copy(List<? extends Flower> list, Class<T> clazz) {
        List<T> lt = new ArrayList<>();

        list.forEach(f -> {
            try {
                final T constructor = clazz.getConstructor(String.class, String.class).newInstance("sdf", "dfs");
                lt.add(
                        clazz.getConstructor(String.class, String.class)
                                .newInstance(f.getName(), f.getColor())
                );
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        });
        return lt;
    }


}
