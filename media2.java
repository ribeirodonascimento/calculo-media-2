import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        double notaA = s.nextDouble();
        double notaB = s.nextDouble();
        double notaC = s.nextDouble();
        double media = (notaA * 2 + notaB * 3 + notaC * 5) / 10;
        System.out.printf("MEDIA = %.1f%n",media);
    }
}