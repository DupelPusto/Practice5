
public class Pract5First
{
    public static final double a = 0.3;
    public static final double b = 0.9;
    public static final double c = 0.61;


    public static void main(String[] args)
    {
        double first = Math.pow(a, 2 * c) + (Math.pow(b, -c) * Math.cos(Math.toRadians(a) + Math.toRadians(b)));
        double second = c + 1;
        double result = first + second;
        System.out.println("Result is: " + result);



    }
}
