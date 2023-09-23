package com.pro.productpro.utils;

import java.util.List;
import java.util.function.Consumer;

public class Utils {

    public static <T> void replaceList(List<T> oldList, List<T> newList) {
        if (oldList != null && newList != null) {
            oldList.clear();
            oldList.addAll(newList);
        }
    }

    public static <T> void applyInList(List<T> list, Consumer<T> consumer) {
        if (list != null)
            list.forEach(consumer);

    }

}
