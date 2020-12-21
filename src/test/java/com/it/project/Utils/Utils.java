package com.it.project.Utils;

import java.util.Random;
import java.util.stream.Collectors;

public class Utils {
    public static String getRandomString(int count) {
        return new Random()
                .ints('a', 'z')
                .limit(count)
                .mapToObj(s -> "" + (char) s)
                .collect(Collectors.joining());
    }
}
