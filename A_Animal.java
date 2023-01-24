public class A_Animal {
    private String type;
    private String size;
    private double weight;

    public void move(String speed){
        System.out.println(type  + " moves  " + speed);
    }
    public void makeNoise(){
        System.out.println(type + "  makes some kind of noise.");
    }

    public A_Animal() {

    }

    public A_Animal(String type, String size, double weight) {
        this();
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "A_Anima{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public static void main(String[] args) {


        A_Animal animal = new A_Animal("Generic Animal", "Huge", 400);

        doAnimalStuff(animal, "Slow ");

        A_Dog dog = new A_Dog();
        doAnimalStuff(dog, "fast");

        A_Dog yorkie = new A_Dog("Yorkie ", 15);
        doAnimalStuff(yorkie, "Fast");

        A_Dog retriever = new A_Dog("Labrador Retriever", 65, "Floppt", "Swimmer");
        doAnimalStuff(retriever, "Slow");


    }



    public static void doAnimalStuff(A_Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("-----------> ");
    }



}
