import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arithematic {
    public static void main(String args[]) {
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader bR = new BufferedReader(isr);
            System.out.println("Enter Value A -");
            int A = Integer.parseInt(bR.readLine());
            System.out.println("Enter Value B -");
            int B = Integer.parseInt(bR.readLine());
            int Add = A + B;
            int Sub = A - B;
            int Mul = A * B;
            int Div = A / B;
            System.out.println("RESULTS :" + "\nAdd :" +Add +"\nSub :" +Sub +"\nMul :" +Mul +"\nDiv :" +Div);
        } catch (IOException RESULTS) {
            System.out.println(RESULTS);
        }


    }

}
