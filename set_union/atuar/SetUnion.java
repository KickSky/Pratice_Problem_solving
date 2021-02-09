package set_union.atuar;

import java.util.Scanner;

public class SetUnion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input Sample:");
        String set1 = scanner.nextLine();
        String[] array = set1.split("\\s");

        if (set1.contains("UNION")) {
            System.out.println("Sample output:");
            System.out.print(array[1] + " u " + array[2]);
        } else if (set1.contains("SET")){
            System.out.println("Sample output:");
            System.out.print(array[1] + " n " + array[2]);
        }
        else {
            System.out.println("Input not match");
        }
    }
}
