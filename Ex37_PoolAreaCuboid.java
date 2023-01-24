public class Ex37_PoolAreaCuboid extends Ex37_PoolAreaRectangle{

    private double height;

    public Ex37_PoolAreaCuboid(double width, double length, double height) {
        super(width, length);
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

        Ex37_PoolAreaRectangle rectangle = new Ex37_PoolAreaRectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        Ex37_PoolAreaCuboid cuboid = new Ex37_PoolAreaCuboid(5,10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());




    }
}
