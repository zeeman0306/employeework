package employee;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeMain {
    public static void main(String[] args) {




        HourlyEmployee McDonalds = new HourlyEmployee("Alicia", "Johnson", "222-22-2222", 9.0, 21.5, new HireDate(3, 6, 1997));


        SalariedEmployee IBM = new SalariedEmployee("Larry", "Buonocore", "333-33-3333", 625.75, new HireDate(3, 14, 2018));


        BasePlusCommissionEmployee Sears = new BasePlusCommissionEmployee("Zamir", "Lewis", "555-55-5555", 4000.0, 0.05, 155.5, new HireDate(2, 29, 1972));


        Invoice invoice = new Invoice("225-563", "Catalytic Converter", 6, 7.0);




        Employee[] EmpArray = new Employee[]{McDonalds, IBM , Sears};
        for (Employee worker: EmpArray){
            System.out.println("=========================================");
            System.out.println("This employee earned " + worker.RnngsMthd());
        }


        System.out.println("HR owes $" + invoice.getPaymentAmount() + ".");

    }

    ArrayList<Employee> employeeHireDateArr = new ArrayList<Employee>();



//    Iterator<Employee> employeeIterator = employeeHireDateArr.iterator();
//    while(employee{
//
//    }


}
