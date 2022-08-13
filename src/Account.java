public class Account {

    private static Double balance=0.00, deposit, withdraw;
    private static String FirstName, LastName, closeOption, message;

    
    public static void setDeposit(Double deposit) {
        Account.deposit = deposit;

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
    public static void setWithdraw(Double withdraw) {
        Account.withdraw = withdraw;

        if(withdraw<=balance){
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
    public static void setFirstName(String firstName) {
        FirstName = firstName;
    }
    public static void setLastName(String lastName) {
        LastName = lastName;
    }
    public static void setCloseOption(String closeOption) {
        Account.closeOption = closeOption;
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
    public static Double getBalance() {
        return balance;
    }
    public static String getFirstName() {
        return FirstName;
    }
    public static String getLastName() {
        return LastName;
    }

    
}
