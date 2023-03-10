public class CH_Dog extends CH_Animal {

    private String earShape;
    private String tailShape;

    public CH_Dog() {
        super("Mutt", "Big", 45);
    }

    public CH_Dog(String type, double weight){
        this(type, weight, "Perky", "Curled");
    }
    public CH_Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "Small" : (weight < 35 ? "Medium" : "Large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    public CH_Dog(String earShape, String tailShape) {
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "CH_Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                '}';
    }

    @Override
    public void move(String speed) {
        super.move(speed);
//        System.out.println("Dog Walks, Run and wag their tails. ");
        if (speed =="slow"){
            walk();
            wagTail();
        }else {
            run();
            bark();
        }
        System.out.println();
    }

    public void  makeNoise(){
        bark();
        System.out.println();
    }

    private void bark(){
        System.out.print("Wolf!");
    }

    private void run(){
        System.out.print("Dog Running !");
    }

    private void walk(){
        System.out.print("Dog Walking !");
    }

    private void wagTail(){
        System.out.print("Tail Wagging !");
    }
}


