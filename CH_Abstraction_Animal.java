abstract class CH_Abstraction_Animal {

    private String name;

    public CH_Abstraction_Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String animalLegs();
    public abstract String food();
    public void classType(){
        System.out.println("This is an Abstract Class. ");
    }
}


class Color extends CH_Abstraction_Animal{

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Color(String name) {
        super(name);
    }

    @Override
    public String animalLegs() {
        if (type == "Bird"){
            return "Animal Type is Bird and have two Legs";
        } else if (type == "Animal") {
            return "Animal Type is Animal have two 4 Legs";
        }
        return null;
    }

    @Override
    public String food() {
        if (type == "Bird"){
            return " Bird is flying and can eat outside";
        } else if (type == "Animal") {
            return "Animal is walking and will eat at house";
        }
        return null;
    }
}

class Dog extends Color{

    public Dog(String name) {
        super(name);
    }

    @Override
    public String food() {
        return "Dogs eats Food at home";
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie");
        dog.setType("Animal");
        System.out.println(dog.food());
        System.out.println(dog.animalLegs());
        System.out.println(dog.getType());
    }

}

