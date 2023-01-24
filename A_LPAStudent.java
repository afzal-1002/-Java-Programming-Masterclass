
public record A_LPAStudent( String id, String name,  String dataOfBirth, String classList) {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            A_LPAStudent recordStudent = new A_LPAStudent("E6578" + i,
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

            System.out.println(recordStudent.id);
            System.out.println(recordStudent.name);
            System.out.println(recordStudent.dataOfBirth);
            System.out.println(recordStudent.classList);

            System.out.println(recordStudent);
        }
    }
}
