public class Ex32_WallArea {

    private double width;
    private double height;

    public Ex32_WallArea(double width, double height) {
        if (width < 0) width = 0;
        this.width = width;
        if (height < 0 ) height = 0;
        this.height = height;

//        System.out.println("Width " + width + " Height " + height);
    }
    public Ex32_WallArea() {

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0) width = 0;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0 ) height = 0;
        this.height = height;
//        System.out.println(this.height);
    }

    public double getArea(){
           return this.height * this.width;
    }
    public static void main(String[] args) {
        Ex32_WallArea wall = new Ex32_WallArea(5,4);
        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());

    }
}
