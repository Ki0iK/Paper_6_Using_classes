public class Main {
    public static void main(String[] args)
    {
       for (int k = 0; k < 11; k = k + 1)
       {
           double a = k * Math.PI/5;
           System.out.println(a + ", " + Math.sin(a) + ", " + Math.cos(a));
       }
    }
}