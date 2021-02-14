package rakib_hasan;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiConsumer;

public class SetUnion {
    public static void printValue(String caseValue) {
        System.out.println(caseValue);
    }

    public static void main(String[] args) {
        Map<String, BiConsumer> logics = new HashMap<>();
        logics.put("UNION", (value1, value2) -> printValue(value1 + " u " + value2));
        logics.put("SET", (value1, value2) -> printValue(value1 + " n " + value2));

        Scanner scanner = new Scanner(System.in);
        int numberOfInput = scanner.nextInt();
        scanner.nextLine();
        String[] caseLine = new String[numberOfInput];

        for (int i = 0; i < numberOfInput; i++) {
            caseLine[i] = scanner.nextLine();
            String[] caseValues = caseLine[i].split(" ");
            logics.get(caseValues[0]).accept(caseValues[1], caseValues[2]);
        }
    }
}
