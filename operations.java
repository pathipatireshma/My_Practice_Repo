import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class operations {
    public static void main(String args[]) {

        int num1, num2;
        num1 = 25;
        num2 =10;
        calc c = new calc();
        c.add(num1,num2);
        c.sub(num1,num2);

        }
}

class calc{
    public void add(int a, int b){
        int addValue = a + b;
        System.out.println(addValue);
    }
    public void sub(int a, int b){
        int subValue = a - b;
        System.out.println(subValue);
    }
}
