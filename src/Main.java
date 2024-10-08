
import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int birthmonth = 0;
        String trash = "";


        System.out.println("enter your birth month [1-12]");
        if(console.hasNextInt()) {
            birthmonth = console.nextInt();
            console.nextLine();
            if (birthmonth >= 1 && birthmonth <= 12) {
                System.out.println("your birthmonth is " + birthmonth);

            } else {
                System.out.println("Invalid birthmonth" + birthmonth + "run the code again");
            }
        }
        else
        {
            trash = console.nextLine();
            System.out.println("your birthmonth is " + birthmonth);
            System.out.println("Run the program again");
        }


        }
    }
