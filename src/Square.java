public class Square extends Shape {


    //Square specific property
    private double lengthOfSides;

    //Square constructor Method
    public Square(int numOfSides, int numOfAngles, double lengthOfSides) {
        super(numOfSides, numOfAngles);
        this.lengthOfSides = lengthOfSides;
    }

    //Square override of main getArea method
    @Override
    double getArea() {

        return lengthOfSides * lengthOfSides;
    }
}
