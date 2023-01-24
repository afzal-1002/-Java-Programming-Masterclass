public class Ex31_Person {

    private String firstName;
    private String lastName;
    private int age;

    public Ex31_Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Ex31_Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Ex31_Person() {
        this("Muhammad ", "Afzal", 25);
        System.out.println("Empty Constructor:");
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
       if(age < 0 || age > 100) age = 0;
        this.age = age;
    }

    public boolean isTeen(){
        if (age > 12 && age < 20) return true ;
        return false;
    }

    public String getFullName(){
        String fullName = "";
        if(this.firstName.isEmpty() && this.lastName.isEmpty()) return fullName;
        if (this.lastName.isEmpty()) fullName = firstName;
        if(this.firstName.isEmpty()) fullName = lastName;
        if(!firstName.isEmpty() && !lastName.isEmpty()) fullName = firstName + " " + lastName;
        return fullName;
    }


    public static void main(String[] args) {
        Ex31_Person person = new Ex31_Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
    }

}
