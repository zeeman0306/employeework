package employee;

public class EmployeeMain {
    public static void main(String[] args) {




        HourlyEmployee McDonalds = new HourlyEmployee("Alicia", "Johnson", "222-22-2222", 9.0, 21.5);


        SalariedEmployee IBM = new SalariedEmployee("Larry", "Buonocore", "333-33-3333", 625.75);


        BasePlusCommissionEmployee Sears = new BasePlusCommissionEmployee("Zamir", "Lewis", "555-55-5555", 4000.0, 0.05, 155.5);


        Invoice invoice = new Invoice("225-563", "Catalytic Converter", 6, 7.0);




        Employee[] EmpArray = new Employee[]{McDonalds, IBM , Sears};
        for (Employee worker: EmpArray){
            System.out.println("=========================================");
            System.out.println("This employee earned " + worker.RnngsMthd());
        }


        System.out.println("HR owes $" + invoice.getPaymentAmount() + ".");

    }
}
