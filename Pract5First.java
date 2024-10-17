
public class Pract5First
{
    //Створення констант необхідних за умовою
    public static final double a = 0.3;
    public static final double b = 0.9;
    public static final double c = 0.61;


    public static void main(String[] args)
    {
        //Проведення обчислень в 3 етапи

        //Знаходимо перший доданок прикладу
        double first = Math.pow(a, 2 * c) + (Math.pow(b, -c) * Math.cos(Math.toRadians(a) + Math.toRadians(b)));

        //Знаходимо другий доданок прикладу
        double second = c + 1;

        //Знаходимо результат прикладу
        double result = first + second;

        //Виведення результату обчислення прикладу
        System.out.println("Result is: " + result);

        //Завершення програми
    }

}
