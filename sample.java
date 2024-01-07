import java.util.ArrayList;
import java.util.List;

public class sample {

    // fn to create list of tokens
    private static List<Token> tokensize(String code) {
        List<Token> tokens = new ArrayList<>();

        String[] words = code.split("\\s+|\\(|\\)|\\{|\\}|\\;");

        for (String word : words) {
            if (!word.isEmpty()) {
                String type = TokenType.determineTokenType(word);
                tokens.add(new Token(type, word));
            }
        }

        return tokens;

    }

    public static void main(String args[]) {
        // add code in c
        String code = "#include <stdio.h>\n\nint main() {\n    int a = 5;\n    int b = 7;\n    int result = a + b;\n\n    printf(\"Sum: %d\\n\", result);\n\n    return 0;\n}";

        // lexical analysis
        List<Token> tokens = tokensize(code);

        for (Token t : tokens) {
            System.out.println(t.type + " - " + t.value);
        }
        // System.out.print(tokens.get(1).value);
    }
}