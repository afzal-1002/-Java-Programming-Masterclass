public class Ex37_PoolAreaRectangle {
    private double width;
    private double length;

    public Ex37_PoolAreaRectangle(double width, double length) {
        if (width < 0) width = 0;
        if (length < 0) length = 0;
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea(){
        return (width * length);
    }
}
