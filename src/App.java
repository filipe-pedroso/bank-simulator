import java.util.Scanner;

public class App{
    private static Double balance=0.00, deposit, withdraw;
    private static String FirstName, LastName, closeOption;
    private static int entry;
    
    
    public static void checkBalance() {
        System.out.println("==================================================");
        System.out.println("Hi "+FirstName+" "+LastName+", your balance is: R$ "+balance);
        System.out.println("==================================================");
    }

    public static void depositMoney() {
        Scanner entryDeposit = new Scanner(System.in);
        System.out.println("Enter the amount to be deposited:");
        deposit = Double.parseDouble(entryDeposit.nextLine());

        if(deposit>=0){
            balance=balance+deposit;
            System.out.println("==================================================");
            System.out.println("Great! your new balance is: R$ "+balance);
            System.out.println("==================================================");
        }else{
            System.out.println("==================================================");
            System.out.println("                    Invalid!");
            System.out.println("==================================================");
        }
    }

    public static void withdrawMoney() {
        Scanner entryWithdraw = new Scanner(System.in);
        System.out.println("Enter the amount to be withdrawn:");
        withdraw = Double.parseDouble(entryWithdraw.nextLine());

        if(withdraw<balance){
            balance=balance-withdraw;
            System.out.println("==================================================");
            System.out.println("Great! your new balance is: R$ "+balance);
            System.out.println("==================================================");
        }else{
            System.out.println("==================================================");
            System.out.println("                    Invalid!");
            System.out.println("==================================================");
        }
    }

    public static void cancelAccount() {
        Scanner chooseOption = new Scanner(System.in);
        System.out.println("Are you sure you want to close your account?(y/n)");
        closeOption = chooseOption.nextLine();
        char option=closeOption.charAt(0);
        
        if(option=='y'){
            System.exit(0);
        }else if(option=='n'){
            System.out.println("Your account will not be closed!");
        }else{
            System.out.println("==================================================");
            System.out.println("                    Invalid!");
            System.out.println("==================================================");
        }
    }

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name to get started:");
        FirstName = input.nextLine();

        System.out.println("Enter your last name:");
        LastName = input.nextLine();


        while(true){
            System.out.println("//////////////////////////////////////////////////");
            System.out.println("//////////////////////-MENU-//////////////////////");
            System.out.println("                   1- Balance");
            System.out.println("                   2- Deposit");
            System.out.println("                   3- Withdraw");
            System.out.println("                   4- Cancel account");
            System.out.println("                   Select an option:");
            entry = Integer.parseInt(input.nextLine());

            switch (entry){
                case 1:
                    checkBalance();
                    break;
                case 2:
                    depositMoney();
                    break;
                case 3:
                    withdrawMoney();
                    break;
                case 4:
                    cancelAccount();
                    break;
                default:
                    System.out.println("==================================================");
                    System.out.println("                    Invalid!");
                    System.out.println("==================================================");
            }
        }
    }
}