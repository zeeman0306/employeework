package employee;

public class SalariedEmployee extends Employee{

    //Instance Variable
    private double weeklySalary;


    //Constructor
    public SalariedEmployee (String fName, String lName, String sSN, double wS){
        super(fName, lName, sSN);
        this.weeklySalary = wS;
    }


    //Earnings Method
    @Override
    public double RnngsMthd (){
        return weeklySalary;
    }


    //getters and Setters
    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }



    //toString
    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "weeklySalary=" + weeklySalary +
                '}';
    }
}