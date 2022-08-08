public class Main {
    public static void main(String[] args) {
        double pi;
        pi = 3.141597;
        // declaring pi value
        double circleRadius;
        circleRadius = 12.0;
        // declaring circleRadius value
        double circleDiameter;
        circleDiameter = circleRadius*2;
        // calculates the diameter of the circle by multiplying the radius by 2
        double circleCircumference;
        circleCircumference =2*pi*circleRadius;
        // calculates the circumference by multiplying pi, radius and 2 together
        double circleArea;
        circleArea = circleRadius*circleRadius*pi;
        // calculates the area by squaring the radius and multiplying it by pi

        System.out.println(circleDiameter);
        // prints out the result for diameter
        System.out.println(circleCircumference);
        // prints out the result for circumference
        System.out.println(circleArea);
        // prints out the result for area
    }
}
