public class Ex36_Circle {

    private double radius;

    public Ex36_Circle(double radius) {
        if(radius < 0)  radius = 0;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }
}


