import lombok.Getter;


public class A_Student {

    private String id;
    private String name;
    private String dataOfBirth;
    private String classList;

    public A_Student(String id, String name, String dataOfBirth, String classList) {
        this.id = id;
        this.name = name;
        this.dataOfBirth = dataOfBirth;
        this.classList = classList;
    }

    @Override
    public String toString() {
        return "A_Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dataOfBirth='" + dataOfBirth + '\'' +
                ", classList='" + classList + '\'' +
                '}';
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDataOfBirth() {
        return dataOfBirth;
    }

    public void setDataOfBirth(String dataOfBirth) {
        this.dataOfBirth = dataOfBirth;
    }

    public String getClassList() {
        return classList;
    }

    public void setClassList(String classList) {
        this.classList = classList;
    }

    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            A_Student student = new A_Student("E6578" + i,
                    switch (i){
                        case 1 -> "Mary";
                        case 2 -> "John";
                        case 3->  "Akash";
                        case 4 -> "Afzal";
                        case 5 -> "Bilal";
                        default -> "Unknown";
                    },
                    "10/02/1992",
                    "Java advance");
            System.out.println(student);

            System.out.println(student.getId());
            System.out.println(student.getName());
            System.out.println(student.getDataOfBirth());
            System.out.println(student.getClassList());


        }
    }
}
