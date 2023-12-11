public class NumberUtility {

    private NumberUtility() {

    }

    public static String removeSymbols(String phoneNumber) {
        return phoneNumber
                .replace("-", "")
                .replace("(", "")
                .replace(")", "");
    }

    public static String validateCountry(String phoneNumber) {
        if (phoneNumber.startsWith("8")) {
            return phoneNumber.replaceFirst("8", "+7");
        } else if (phoneNumber.startsWith("7")) {
            return "+" + phoneNumber;
        }
        return phoneNumber;
    }
}