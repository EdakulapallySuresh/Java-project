public class RomanToInteger {
    public static void main(String[] args) {
        String romanNumeral = "IX";
        int integer = romanToInteger(romanNumeral);
        System.out.println(romanNumeral + " = " + integer);
    }

    public static int romanToInteger(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int current = romanValue(s.charAt(i));
            int next = (i + 1 < s.length()) ? romanValue(s.charAt(i + 1)) : 0;

            if (current < next) {
                result += next - current;
                i++;  // Skip the next character since it's already been accounted for.
            } else {
                result += current;
            }
        }

        return result;
    }

    public static int romanValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
