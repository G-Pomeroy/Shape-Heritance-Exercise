public class Circle extends Shape {

    //Circle specific property
    private double radius;

    //Circle constructor method
    public Circle(int numOfSides, int numOfAngles, double radius) {
        super(numOfSides, numOfAngles);
        this.radius = radius;
    }

    //Circle override of main getArea method
    @Override
    public double getArea() {

        return Math.PI * radius * radius;
    }
}
