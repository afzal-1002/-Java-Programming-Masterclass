class Employee extends A_Worker{

    private static long employeeId;
    private String hiringDate;

    public Employee(String name, String birthDate, String hiringDate) {
        super(name, birthDate);
        this.employeeId = Employee.employeeId++;
        this.hiringDate = hiringDate;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hiringDate='" + hiringDate + '\'' +
                '}';
    }

    public String getHiringDate() {
        return hiringDate;
    }

    public void setHiringDate(String hiringDate) {
        this.hiringDate = hiringDate;
    }

}


class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;


    public SalariedEmployee(String name, String birthDate, String endDate, double annualSalary, boolean isRetired) {
        super(name, birthDate, endDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public void retire(){
        System.out.println("Inside the SalariedEmployee Class and Method is retire()");
    }

    @Override
    public double collectPay(){
        return (int)  annualSalary / 26;
    }

    @Override
    public String toString() {
        return  "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                '}' ;
    }
}


class HourlyEmployee extends Employee{
    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, String endDate, double hourlyPayRate) {
        super(name, birthDate, endDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getDoublePay(){
        return 2 * collectPay();
    }

    @Override
    public double collectPay(){
        return 40 * hourlyPayRate;
    }



}