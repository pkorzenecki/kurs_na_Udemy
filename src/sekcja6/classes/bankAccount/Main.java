package sekcja6.classes.bankAccount;

public class Main {
    public static void main(String[] args) {
        /*Account bobsAccount = new Account(); //"1234", 0.00, "Bob Brown", "myemail@bob.com", "+48 657908387");

        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.00);

        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.0);

        Account timsAccount = new Account("Tim", "tim@email.com", "12345");
        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());*/

        VipCustomer customer1 = new VipCustomer();
        System.out.println(customer1.getName());

        VipCustomer customer2 = new VipCustomer("Bob", 25000.00);
        System.out.println(customer2.getName());


        VipCustomer customer3 = new VipCustomer("Tim", 100.00, "tim@emial.com");
        System.out.println(customer3.getName());

        System.out.println(customer3.getEmailAddress());
    }
}
