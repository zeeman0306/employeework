package employee;

public abstract class Employee implements IPayable{

    //Instance Variables
    private static int count = 0;
    private String firstName;
    private String lastName;
    private final String socialSecurityNumber;

    //Constructor
    public Employee (String fName, String lName, String sSN){
        this.firstName = fName;
        this.lastName = lName;
        this.socialSecurityNumber = sSN;
        count++;

        System.out.printf("Constructed employee %s %s | count=%d%n", firstName, lastName, count);

    }


    //Method
    public double RnngsMthd(){
        return 0;
    }


    //getter, but no setter
    public static int getCount() {
        return count;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //Instance Variables
    @Override
    public String   toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                '}';
    }

    public double getPaymentAmount() {
        return this.RnngsMthd();
    }
}
