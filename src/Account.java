class TestAccount{
    String name;
    int accountNumber;
    float amount;

    void insert(String n, int ac, float am){
        name = n;
        accountNumber = ac;
        amount = am;
    }

    void deposit(int amnt){
        amount = amount + amnt;
        System.out.println(amnt + " Deposited");
    }

    void withdraw(int amnt){
        if(amnt <= amount){
            amount = amount - amnt;
            System.out.println(amnt + " Withdrawn");
        }else {
            System.out.println("Insufficient fund in account");
        }
    }

    void display(){
        System.out.println(name + " " + accountNumber + " " + amount);
    }

    void checkBalance(){
        System.out.println("Balance is " + amount);
    }
}

public class Account {
    public static void main(String[] args) {
        TestAccount holder1 = new TestAccount();
        TestAccount holder2 = new TestAccount();
        holder1.insert("Olukunle Afolabi", 123456, 25000);
        holder2.insert("Oyindamola Eluyeni", 9876543, 50000);
        holder1.display();
        holder1.checkBalance();
        holder1.deposit(40000);
        holder1.checkBalance();
        holder1.withdraw(15000);
        holder1.checkBalance();
    }
}