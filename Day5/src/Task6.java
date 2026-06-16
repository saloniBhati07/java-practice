class InvalidSalaryException extends Exception{
    public InvalidSalaryException(String msg){
        super(msg);
    }
}

public class Task6 {
    static void checkSalary(double salary)throws InvalidSalaryException{
        if(salary<10000){
            throw new InvalidSalaryException("Salary too low");

        }else{
            System.out.println("Valid salary");
        }
    }
    public static void main(String[] args){
        try{
            checkSalary(5000);
        }catch(InvalidSalaryException e){
            System.out.println(e.getMessage());

        }
    }
}
