public class A_Worker {
    private String name;
    private String birthDate;
    protected String endDate;

    public A_Worker() {
    }

    public A_Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "A_Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }

    public int getAge() {
        int currentYear = 2023;
        int yearOfBirth = Integer.parseInt(birthDate.substring(6));
        return (currentYear - yearOfBirth);
    }

    public double collectPay() {
        return 0.0;
    }

    public void terminate(String endDate) {
        if (endDate == "10-02-1990") {
            System.out.println("Your Contract Ends Already! ");
        }
    }

    public static void main(String[] args) {
        Employee tim = new Employee("tim", "10/02/1990", "21/02/2022");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());

        SalariedEmployee joe = new SalariedEmployee("Joe", "10/02/1993", "10/05/2022",
                2600, true);
        System.out.println(joe);
        System.out.println("Joes Check = " + joe.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "10/02/1993", "10/10/2025", 45.5);
        System.out.println(mary);
        System.out.println("Mary's PayCheck = " + mary.collectPay());
        System.out.println("Mary Holiday pay = " + mary.getDoublePay());
    }
}
