import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String userName, password;

        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0){
            System.out.print("Enter your username :");
            userName = input.nextLine();
            System.out.print("Enter your password : ");
            password = input.nextLine();

            if(userName.equals("test") && password.equals("test123")){
                System.out.println("Hello, you successfully logged in!");

                do{
                    System.out.println("1-Deposit Money\n" +
                            "2-Withdraw Money\n" +
                            "3-Balance\n" +
                            "4-Exit ");
                    System.out.print("Please select one of the options : ");
                    select = input.nextInt();
                    if (select == 1) {
                        System.out.print("Enter the amount of Money to deposit : ");
                        int price = input.nextInt();
                        balance += price;
                    } else if (select == 2) {
                        System.out.print("Amount of withdrawal: ");
                        int price = input.nextInt();
                        if (price > balance) {
                            System.out.println("Not Enough Money.");
                        } else {
                            balance -= price;
                        }
                    } else if (select == 3) {
                        System.out.println("Balance : " + balance);
                    }



                }while(select!=4);
                System.out.println("Have a great day and See you later!");
                break;
            }else {
                right--;
                System.out.println("Wrong username or password. Please try again!");
                if (right == 0) {
                    System.out.println("Your account has been blocked, please contact the bank.");
                } else {
                    System.out.println("Number of attempts left for login " + right);
                }
            }

        }
    }
}