public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(-5.0));
        System.out.println(area(-5,4));
    }
    public static double area(double radius){
        if(radius <= 0) {
            return -1;
        }
        else{
            double areaOfCircle = radius*radius*Math.PI;
            return areaOfCircle;
        }

    }
    public static double area(double x,double y){
        if(x <= 0 || y<=0){
            return -1;
        }
        else {
            double areaOfRectangle = x*y;
            return areaOfRectangle;
        }
    }
}
