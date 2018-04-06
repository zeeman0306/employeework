package employee;

public class BasePlusCommissionEmployee extends CommissionedEmployee {


    //Base salary
    private double salary;


    //Constructor
    public BasePlusCommissionEmployee (String fName, String lName, String sSN, double gS, double cR, double slry){
        super(fName, lName, sSN, gS, cR);
        this.salary = slry;
    }


    //Earnings Method
    @Override
    public double RnngsMthd(){
        return (super.RnngsMthd() + salary);
    }



    //getters and setters
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }



    //toString
    @Override
    public String toString() {
        return "BasePlusCommissionEmployee{" +
                "salary=" + salary +
                '}';
    }

    public double getPaymentAmount() {
        return 0;
    }
}