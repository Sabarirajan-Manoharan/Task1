import java.util.Scanner;

public class loops {
    public static void main(String[] args){


        // 1-----------> for loop to print 10 to 50 number
        int i=10;
        for ( i=10;i<=50;i++){
            System.out.println(i);
        }

        //while loop to print 10 to 50 number
        while (i<=50){
            System.out.println(i);
            i++;
        }

        // 2-----------> to check given number is postivie or negative using scanner to take input from user
        Scanner sca1 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Number to check +ve or -ve: ");

        int num = Integer.parseInt(sca1.nextLine());  // Read user input
        if(num>=0){
            System.out.println("It is Positive");
        }else{
            System.out.println("It is Negative");
        }

        // 3-----------> to reverse the given number, using scanner to take input from user
        Scanner sca2 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Number to Reverse: ");

        String data = sca2.nextLine();  // Read user input

        for(int j=1;j<data.length()+1;j++){

            System.out.print(data.charAt(data.length()-j));
        }

        // 4-----------> find the smallest number, created method called findSmallest
        int datanum = findSmallest(12,345,0);
        System.out.println(datanum);

        // 5-----------> calculate discount amount from given purchase amount, created method called discount
        double purchaseamt=550;
        double discountamt = discount(purchaseamt);
        System.out.println(purchaseamt+discountamt);


        // 6-----------> get input from scanner and draw the pattern, using scanner to take input from user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        for (int a = rows; a >= 1; a--) {
            for (int b = rows; b > a; b--) {
                System.out.print(b);
            }
            for (int c = 1; c <= a; c++) {
                System.out.print(a);
            }
            System.out.println();
        }

        scanner.close();

    }
    public static double discount(double amt){

        double discountprice=0;
        double calc;

        if(amt<500){
            discountprice=0;
        }
        if (amt>=500 && amt<=1000){
            discountprice = amt/100*10;
        }
        if (amt>1000){
            discountprice = (amt/100)*20;
        }

        return discountprice;
    }

    public static int findSmallest(int a, int b, int c) {
        int smallest = a;

        if (b < smallest) {
            smallest = b;
        }

        if (c < smallest) {
            smallest = c;
        }

        return smallest;
    }
}
