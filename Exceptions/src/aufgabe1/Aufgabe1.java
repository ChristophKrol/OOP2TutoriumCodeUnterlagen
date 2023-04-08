package aufgabe1;

import java.util.Arrays;

class Aufgabe1 {




    static int[] parseInts(String... numbers) {
        int[] ints = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            ints[i] = insert(numbers[i]);
        }

        return ints;
    }

    private static int insert(String number){
        try {
            return Integer.parseInt(number);
        }
        catch (NumberFormatException nfe) {
            return 0;
        }
    }

    public static void main(String[] args) {
        int[] numbers = parseInts("1", "abcs", "2", "3", "4", "a", null);
        System.out.println(Arrays.toString(numbers));

    }
}
