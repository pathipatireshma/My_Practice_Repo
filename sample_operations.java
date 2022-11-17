import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class sample_operations {
    public static void main(String[] args) throws IOException {
        String initText = "I am learning cloud DevOps and Java programming";

        String[] splitText = initText.split(" ");
        System.out.print("Split_Text = ");
        for (int i=0;i<splitText.length;++i){
            System.out.print(splitText[i] + "\n");
        }
        String new_text = "I am cloud Engineer";
        String concatStr =  initText.concat("\t" +"and" + "\t" + new_text);
        System.out.println("\n"+"Concatenated_Text :" +concatStr );
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bR = new BufferedReader(isr);
        System.out.println("Enter Word -");
        String Word = bR.readLine();
        String[] strSplit = concatStr.split(" ");
        int counter = 0;
        for (String strVal : strSplit) {
            if (strVal.contains(Word)) {
                counter = counter +1;
            }
        }

        System.out.println("Count of Word "  +Word+ ":" +counter);
    }
}
