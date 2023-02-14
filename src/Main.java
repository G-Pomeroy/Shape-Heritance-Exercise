public class Main {
    public static void main(String[] args) {

        //Instantiate objects
        Circle myCircle = new Circle (1, 0,3);
        Triangle myTriangle = new Triangle (3, 3, 5,7);
        Square mySquare = new Square (4, 4, 7);


        //Call each objects getArea method
        System.out.println("The circle has a total area of: " + myCircle.getArea());
        System.out.println("The triangle has a total area of: " + myTriangle.getArea());
        System.out.println("The square has a total area of: " + mySquare.getArea());



    }
}