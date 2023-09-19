package ua.ithillel.lesson4;

public class MissedValue {
    static int numbers[] = {2, 3, 4, 6, 7, 9};

    public static void main(String[] args) {

       for (int j = 1; j < 11; j++) {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == j) {
                    break;
                }
                else if (i == numbers.length-1) {
                    System.out.println(j);
                }
        }
        }
    }
}
