class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String msg){
        super(msg);
    }
}

public class Task8 {
    static void withdraw(double balance,double amount) throws InsufficientBalanceException{
        if(amount>balance){
            throw new InsufficientBalanceException("Insuff balance");

        }else{
            balance=balance-amount;
            System.out.println("withdrawal success");
            System.out.println("remaining balance:"+balance);
        }

    }
    public static void main(String[] args){
        try{
            withdraw(5000,7000);
        }catch(InsufficientBalanceException e){
            System.out.print(e.getMessage());
        }
    }

}
