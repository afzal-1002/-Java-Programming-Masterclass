public class Ex34_FloorCarpetCostCalculator {
    private double width;
    private double length;


    public Ex34_FloorCarpetCostCalculator(double width, double length) {
        if(width < 0) width = 0;
        this.width = width;
        if (length < 0) length = 0;
        this.length = length;
    }


    public double getArea(){
        return  (width * this.length);
    }

}
class Calculator{
    private Ex34_FloorCarpetCostCalculator floor;
    private Carpet carpet;

    public Calculator(Ex34_FloorCarpetCostCalculator floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost(){
        return (floor.getArea() * carpet.getCost());
    }
}
class Carpet{
    private  double cost;

    public Carpet(double cost) {
        if(cost < 0) cost = 0;
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}