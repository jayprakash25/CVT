public class TokenType {

    public static String determineTokenType(String word) {
        if (isKeyword(word)) {
            return "KEYWORD";
        } else if (isVariable(word)) {
            return "VARIABLE";
        } else if (isNumber(word)) {
            return "NUMBER";
        } else if (isOperator(word)) {
            return "OPERATOR";
        } else {
            return "UNKNOWN";
        }
    }

    public static boolean isKeyword(String word) {
        return word.equals("int") || word.equals("if") || word.equals("else");
    }

    public static boolean isVariable(String word) {
        return Character.isLetter(word.charAt(0)) && word.matches("[a-zA-Z0-9_]+");
    }

    public static boolean isNumber(String word) {
        return word.matches("\\d+");
    }

    public static boolean isOperator(String word) {
        return word.matches("[+\\-*/]");
    }
}
