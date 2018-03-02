import java.io.IOException;
        import java.util.List;

public class Main {

    public static void main(String[] args) {
        StringProcessor stringProcessor = new StringProcessor();
        try {
            String input = stringProcessor.readInputText();
            stringProcessor.showResult(stringProcessor.processText(input));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

