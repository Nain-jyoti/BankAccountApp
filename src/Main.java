import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HDFCAccount hdfcAccount1 = new HDFCAccount("Nain", 50000, "abs123");
        System.out.println("Congrats ! " +hdfcAccount1.getName()+
                "Your account has been created with account no. :" +hdfcAccount1.getAccountNo());


        HDFCAccount hdfcAccount2 = new HDFCAccount("Shikha", 50000, "abs123");
        System.out.println("Congrats ! " +hdfcAccount2.getName()+
                "Your account has been created with account no. :" +hdfcAccount2.getAccountNo());

        //adding money
        hdfcAccount1.addMoney(100000);

        //withdraw both cases
        System.out.println(hdfcAccount1.withdrawMoney("abs3", 1000));
        System.out.println(hdfcAccount1.withdrawMoney("abs123", 1000));

        //calculate interest
        System.out.println("Enter the number of years:");
        int year = sc.nextInt();
        System.out.println("Interest for" +year+ "years is:" + hdfcAccount1.calculateInterest(year));

    }
}