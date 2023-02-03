public class MehodOverload {
    public static void main(String[] args) {
        System.out.println("height in cm " + heightInches(10) + " cm");
        System.out.println("height in " + heightInches(5,8) + " cm");
    }
    public static double heightInches(int height){
        System.out.println("height in inches " + height);
        return height*2.54;
    }

    public static double heightInches(int height,int heightInch){
        return heightInches((height * 12) + heightInch);
    }
}
