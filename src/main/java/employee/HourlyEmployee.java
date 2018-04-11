package employee;

public class HourlyEmployee extends  Employee {

    //Instance Variables
    private double wage;
    private double hours;
    private HireDate hireDate;


    //Constructor
    public HourlyEmployee (String fName, String lName, String sSN, double wg, double hrs, HireDate hireDate){
        super(fName, lName, sSN, hireDate);
        this.wage = wg;
        this.hours = hrs;

    }


    //method
    @Override
    public double RnngsMthd(){
        return wage * hours;
    }


    //hours worked by wage

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public HireDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(HireDate hireDate) {
        this.hireDate = hireDate;
    }

    //toString


    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "wage=" + wage +
                ", hours=" + hours +
                '}';
    }




    public double getPaymentAmount() {
        return 0;
    }
}