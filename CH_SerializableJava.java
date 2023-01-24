import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class CH_SerializableJava {



    public static void main(String[] args) {
        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
        Student student = new Student("Muhammad ", "Afzal ", 12345);
        studentMap.put(0, student);

        Student student1 = new Student("Muhammad ", "Akram  ", 23456);
        studentMap.put(1, student1);


        try (ObjectOutputStream data = new ObjectOutputStream(new BufferedOutputStream( new FileOutputStream("E:\\ObjectOutPut.txt")))){
            for(Object obj: studentMap.values()){
                data.writeObject(obj);
//                System.out.println(obj);
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }finally {

        }


        try (ObjectInputStream  data2 = new ObjectInputStream(new BufferedInputStream( new FileInputStream("E:\\ObjectOutPut.txt")))){

            Student student3 = (Student) data2.readObject();
            System.out.println(student3);
            System.out.println(data2.toString());
            System.out.println(data2.available());

        }catch (IOException e){
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {

        }

    }


}

class Student implements Serializable {
    private String firstName;
    private String lastName;

    private int rollNumber;

    private Map<Integer, Student> studentMap;

    public Student(String firstName, String lastName, int rollNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rollNumber = rollNumber;
        this.studentMap = new HashMap<Integer,Student>() ;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", rollNumber=" + rollNumber +
                '}';
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

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
}

