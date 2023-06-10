import java.util.UUID;

public class HDFCAccount implements BankAccountInterface{
    private String name;
    private String accountNo;//Random and unique --> UUID for  Unique random no
    private double balance;
    private String password;
    final double rateOfInterest = 6.1;

    //we need to construct a 2 constructor for every class, one is default-non-paramterised and other parameterised

    //no argument const.
    public HDFCAccount() {
    }


    //all argument constructor
    public HDFCAccount(String name, double balance, String password) {
        this.name = name;
        this.accountNo = String.valueOf(UUID.randomUUID());
        this.balance = balance;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String fetchBalance(String password) {
       if(this.password.equals(password)){
           return "Your Current balance is:" + this.balance;

       }
       return "Incorrect Password";
    }

    @Override
    public double addMoney(double amount) {
        this.balance += amount;
        return balance;
    }

    @Override
    public String withdrawMoney(String password, double amount) {
        if (this.password.equals(password)) {
            if(amount<=this.balance){
                this.balance -= amount;
                return "Money has been withdrawn. The current Balance is: "+this.balance;
            }
            else{
                return "Insufficient Balance";
            }

        }
        return "Incorrect Password !";
    }

    @Override
    public String changePassword(String newPassword, String oldPassword) {
        if(this.password.equals(oldPassword)){
            this.password = newPassword;
            return "Congrats !! Password has been updated";
        }
        return "Incorrect Password";
    }

    @Override
    public double calculateInterest(int year) {
       return (this.balance*rateOfInterest*year)/100;
    }
}
