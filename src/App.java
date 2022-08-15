import java.util.Scanner;

public class App{
    private static Double inv;
    private static int entry;


    public static void main(String[] args) {
        Account user = new Account();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name to get started: ");
        user.setFirstName(input.nextLine());

        System.out.print("Enter your last name: ");
        user.setLastName(input.nextLine());


        while(true){

            //-----------------
            inv=user.getInvested();
            inv=inv*1.04;
            user.setInvested(inv);
            //-----------------

            System.out.println("//////////////////////////////////////////////////");
            System.out.println("//////////////////////-MENU-//////////////////////");
            System.out.println("                   1- Balance");
            System.out.println("                   2- Deposit");
            System.out.println("                   3- Withdraw");
            System.out.println("                   4- Investments");
            System.out.println("                   5- Check investments");
            System.out.println("                   6- Cancel account");
            System.out.print("                   Select an option: ");
            entry = Integer.parseInt(input.nextLine());

            switch (entry){
                case 1:
                    System.out.println("==================================================");
                    System.out.println("Hi "+user.getFirstName()+" "+user.getLastName()+", your balance is: R$ "+ user.getBalance());
                    System.out.println("==================================================");
                    break;
                case 2:
                    Scanner entryDeposit = new Scanner(System.in);
                    System.out.print("Enter the amount to be deposited: ");
                    user.setDeposit(Double.parseDouble(entryDeposit.nextLine()));
                    break;
                case 3:
                    Scanner entryWithdraw = new Scanner(System.in);
                    System.out.print("Enter the amount to be withdrawn: ");
                    user.setWithdraw(Double.parseDouble(entryWithdraw.nextLine()));
                    break;
                case 4:
                    Scanner entryInvestment = new Scanner(System.in);
                    System.out.print("Enter the amount to be invested: ");
                    user.setInvestment(Double.parseDouble(entryInvestment.nextLine()));
                    break;
                case 5:
                    System.out.println("==================================================");
                    System.out.printf("Hi "+user.getFirstName()+" "+user.getLastName()+", your investment is: R$ %.2f", user.getInvested());
                    System.out.println("\n==================================================");
                    break;
                case 6:
                    Scanner chooseOption = new Scanner(System.in);
                    System.out.print("Are you sure you want to close your account?(y/n) ");
                    user.setCloseOption(chooseOption.nextLine());
                    break;
                default:
                    System.out.println("==================================================");
                    System.out.println("                    Invalid!");
                    System.out.println("==================================================");
            }
        }
    }
}