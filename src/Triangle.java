public class Triangle extends Shape {


    //Triangle specific properties
    private double base;
    private double height;

    //Triangle constructor method
    public Triangle(int numOfSides, int numOfAngles, double base, double height) {
        super(numOfSides, numOfAngles);
        this.base = base;
        this.height = height;
    }

    //Triangle override of main getArea method
    @Override
    double getArea() {

        return (base * height) / 2;
    }
}
