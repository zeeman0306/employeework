package employee;

import javax.jws.soap.SOAPBinding;

public class EmployeeMain {
    public static void main(String[] args) {

        Employee JakeFromStateFarm = new Employee("Jake" ,"From StateFrom", "111-11-1111");


        HourlyEmployee McDonalds = new HourlyEmployee("Alicia", "Johnson", "222-22-2222", 9.0, 21.5);


        SalariedEmployee IBM = new SalariedEmployee("Larry", "Buonocore", "333-33-3333", 625.75);


        CommissionedEmployee UsedCarSalesman = new CommissionedEmployee("James", "Jackson", "444-44-4444", 100000.0, 0.025);


        BasePlusCommissionEmployee Sears = new BasePlusCommissionEmployee("Zamir", "Lewis", "555-55-5555", 4000.0, 0.05, 155.5);



        Employee[] EmpArray = new Employee[]{McDonalds, IBM, UsedCarSalesman, Sears};
        for (Employee worker: EmpArray){
            System.out.println("=========================================");
            System.out.println("This employee earned " + worker.RnngsMthd());
        }


    }
}
