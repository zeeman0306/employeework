package employee;

public abstract class CommissionedEmployee extends Employee {

    //Instance Variables
    private double grossSales;
    private double commissionRate;


    //Constructor
    public CommissionedEmployee (String fName, String lName, String sSN, double gS, double cR){
        super(fName, lName, sSN);
        this.grossSales = gS;
        this.commissionRate = cR;

    }


    //Earnings Method
    @Override
    public double RnngsMthd(){
     return (grossSales * commissionRate);
    }



    //Getter and Setters

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }


    //toString method
    @Override
    public String toString() {
        return "CommissionedEmployee{" +
                "grossSales=" + grossSales +
                ", commissionRate=" + commissionRate +
                '}';
    }
}