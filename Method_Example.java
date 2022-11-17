public class Method_Example {

    public static void add(){
        int a = 5;
        int b = 6;
        int add = a + b;
        System.out.println("Add :" + add);
    }
    public static void sub(int a , int b){
        int sub;
        sub = a - b;
        System.out.println("Sub :" +sub);
    }
    public static int mul(){
        int  a , b;
        a = 5;
        b = 3;
        int mul = a * b;
        return mul;
    }
    public static int div(int a , int b){
        int div;
        div = a / b;
//        System.out.println(div);
        return div;
    }
    public static void main(String args[]){
        int a = 6;
        int b = 4;
        add();
        sub(a,b);
        int mul = mul();
        int div = div(a,b);

        System.out.println("\nMul :" + mul + "\nDiv :" + div);
    }
}