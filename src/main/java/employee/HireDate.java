package employee;

public class HireDate {

    private int hireMonth;
    private int hireDay;
    private int hireYear;

    public HireDate (int hireMonth, int hireDay, int hireYear){

        this.hireDay = hireDay;
        this.hireMonth = hireMonth;
        this.hireYear = hireYear;

    }


    public int getHireMonth() {
        return hireMonth;
    }

    public void setHireMonth(int hireMonth) {
        this.hireMonth = hireMonth;
    }

    public int getHireDay() {
        return hireDay;
    }

    public void setHireDay(int hireDay) {
        this.hireDay = hireDay;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }
}
