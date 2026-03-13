package collections.lowerCase;

import java.util.*;
//turn every string in List to lowerCase
public class Main {

    public static void main(String[] args) {
        String[] strings = {"Winter", "Spring", "Summer", "Autumn"};
        System.out.println(toLowerCase(strings));
    }

    public static List<String> toLowerCase(String[] str) {
        return Arrays.stream(str).map(String::toLowerCase).toList();
    }
}
