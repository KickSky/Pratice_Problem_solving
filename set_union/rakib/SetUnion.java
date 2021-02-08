package basic.String;

import java.util.ArrayList;
import java.util.Scanner;

public class SetUnion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sample input Quantity");
        int q = scanner.nextInt();
        scanner.nextLine();
        int union = 5;
        int set = 3;
        ArrayList<String> list = new ArrayList();
        System.out.println("Give your" + q + "Value");
        for (int i = 0; i < q; i++) {
            list.add(scanner.nextLine());
        }
        list.forEach(s -> {
            if (s.contains("UNION")) {
                String[] values = s.substring(union).split("\\s");
                System.out.println(values[1] + " U " + values[2]);
            } else if (s.contains("SET")) {
                String[] values = s.substring(set).split("\\s");
                System.out.println(values[1] + " n " + values[2]);
            } else {
                System.out.println("Fixed this Value According to the format  first " + s);
            }
        });

    }
}
