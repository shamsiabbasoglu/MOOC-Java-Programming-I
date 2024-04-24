
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        
        Account account1 = new Account("Matthews account", 1000);
        Account account2 = new Account("My account", 0);
        
        account1.withdrawal(100);
        account2.deposit(100);
        
        System.out.println(account1);
        System.out.println(account2);
    }
}
