

public class Ex33_Point {

    private int x;
    private  int y;
    public Ex33_Point() {
    }

    public Ex33_Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        return Math.sqrt( (getX() - 0.0) * ( getX() - 0)  + (getY() - 0) * (getY() - 0));
    }
    public double distance(int x, int y){
        return Math.sqrt( (getX() - x) * ( getX() - x)  + (getY() - y ) * (getY() - y));
    }

    public double distance(Ex33_Point xy){
        return Math.sqrt( (getX() - xy.getX()) * ( getX() - xy.getX())  + (getY() - xy.getY() ) * (getY() - xy.getY()));
    }

    public static void main(String[] args) {

        Ex33_Point first = new Ex33_Point(6, 5);
        Ex33_Point second = new Ex33_Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Ex33_Point point = new Ex33_Point();
        System.out.println("distance()= " + point.distance());

    }

}
