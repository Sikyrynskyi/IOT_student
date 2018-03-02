import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.*;

public class StringProcessor {

    public String readInputText() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String: ");
        return br.readLine();
    }

    public String processText(String inputText) {
        inputText = inputText.replaceAll("(?i)bus\\s+[0-9]{1,3}", "BUS UNKNOWN");
        return inputText;
    }

    public void showResult(String resultText) {
        System.out.println(resultText);
    }
}

