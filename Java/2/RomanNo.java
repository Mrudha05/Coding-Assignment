import java.util.HashMap;
import java.util.Scanner;

public class RomanNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the Roman number: ");
        String romanNumeral = scanner.nextLine();
        // String romanNumeral = "IX"; // Example Roman numeral
        int result = romanToInt(romanNumeral);
        System.out.println(romanNumeral + " = " + result);
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> romanNumber = new HashMap<>();
        romanNumber.put('I', 1);
        romanNumber.put('V', 5);
        romanNumber.put('X', 10);
        romanNumber.put('L', 50);
        romanNumber.put('C', 100);
        romanNumber.put('D', 500);
        romanNumber.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanNumber.get(s.charAt(i));
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
            prevValue = currentValue;
        }
        return result;
    }
}
