public class ValidatePin {
    public static void main(String[] args) {
        String str = "123k26";
        System.out.println(validatePin(str));
        System.out.println(validatePin2(str));
    }

    public static boolean validatePin(String pin) {
        var isValid = pin.matches("^[0-9]*$");
        var isValidLength = pin.length() == 4 || pin.length() == 6;
        return isValid && isValidLength;
    }

    public static boolean validatePin2(String pin) {
        return pin.matches("\\d{4}|\\d{6}");
    }
}
