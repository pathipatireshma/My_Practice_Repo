public class pattern {
    static void printSpiralPattern(int size)
    {
        int row = 0, col = 0;
        int boundary = size - 1;
        int sizeLeft = size - 1;
        int flag = 1;
        char move = 'r';
        int[][] matrix =new int [size][size];
        for (int i = 1; i <= size; i++) {
            matrix[row][col] = i;
            switch (move) {
                case 'r':
                    col = 1;
                    break;

//                case 'u':
//                    row = 1;
//                    break;

            }
            if (i == boundary) {
                boundary = boundary + sizeLeft;
                if (flag != 2) {
                    flag = 2;
                } else {
                    flag = 1;
                    sizeLeft = 1;
                }
            }
        }
        for (row = 1; row <= size; row++)
        {
            for (col = 1; col <= size; col++)
            {
//                int n = matrix[row][col];
                if(row==1 || row==25 || col == 1 || col == 25)
                    System.out.print(" *");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int size = 25;
        System.out.println("Spiral Matrix or Pattern is: \n");
        printSpiralPattern(size);
    }
}
