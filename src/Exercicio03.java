import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        //entrada de variaveis
        double a, b, c, delta;
        double x1, x2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe os valores (a, b c): ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        if (a != 0) {

            delta = b * b - 4 * a * c;

            if (delta >= 0){

                x1 = (- b + (Math.sqrt(delta))) / (2 * a);
                x2 = (- b - (Math.sqrt(delta))) / (2 * a);

                System.out.printf("x1= %.2f", x1);
                System.out.println(" ");
                System.out.printf("x2= %.2f", x2);
            }

            else {

                System.out.println("A equação não possui raiz real.");
            }
        }

        else {

            System.out.println("O valor de a deve ser diferente de zero. ");
        }
    }
}
