import java.util.Scanner;


public class NumOrg {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//Ask the user for three numbers that are in need to be organized
        System.out.println("Enter three numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();



        if (num1 <= num2 && num2 <= num3) {

            System.out.println("Numbers already in ascending order: " + num1 + " " + num2 + " " + num3); //Already Ascending order output

        } else if (num1 >= num2 && num2 >= num3) {

            System.out.println("Numbers already in descending order: " + num3 + " " + num2 + " " + num1); // Already descending order output

        } else {

            //Sorter Part of the code:

            int temp; //A temporary variable

            if (num1 > num2) {

                temp = num1;
                num1 = num2;
                num2 = temp;

            }

            if (num2 > num3) {

                temp = num2;
                num2 = num3;
                num3 = temp;

            }

            if (num1 > num2) {
                temp = num1;
                num1 = num2;
                num2 = temp;

            }
            System.out.println("Numbers in ascending order: " + num1 + " " + num2 + " " + num3);
        }




        scanner.close();

    }

}
