public class Ex36_Cylinder extends Ex36_Circle{

    private double height;

    public Ex36_Cylinder(double radius, double height) {
        super(radius);
        if(height < 0) height = 0;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return super.getArea() * height;
    }

    public static void main(String[] args) {
        Ex36_Circle circle = new Ex36_Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Ex36_Cylinder cylinder = new Ex36_Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());
    }
}
