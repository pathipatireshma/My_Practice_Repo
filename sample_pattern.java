public class sample_pattern
{
    public static void main(String[] args) {
        String companyName = "\t\tCapGemini IT Services";
        String companyAdd = "\tGachibowli, Hyderabad, 500032";
        int flag = 1;
        for (int i = 1; i <= 25; i++) {
            System.out.print(" *");

            for (int j = 1; j <= 25; j++) {
                System.out.print(" \n*");

                for ( i = 1; i <= 15; i++) {
                    System.out.print("\n*");

                    if (i == 1) {
                        System.out.println(companyName);
                    } else if (i == 2) {
                        System.out.println(companyAdd);
                    } else if (i == 4 || i == 10) {
                        System.out.print(" 1");
                    }
                }
            }
        }
//        for (int j = 1; j <= 15; j++){
//            System.out.print(" *");
//        }

//            {
//            if (i == 1) {
//                System.out.print(" *");
//            }

//                else
//                    System.out.print("  ");

            System.out.println();
    }
}