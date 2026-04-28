import java.util.Scanner;

    public class Exercicio08 {

        public static void main(String[] args) {

            //Declaração de Variáveis
            Scanner sc = new Scanner(System.in);
            double salarioB, aliquota, imposto, salarioL;

            //Entrada de Dados
            System.out.println("Digite seu salário bruto: ");
            salarioB = sc.nextDouble();

            //Processamento de Dados
            if (salarioB <= 2112) {
                aliquota = 0;
            } else if (salarioB <= 2826.65) {
                aliquota = 7.5;
            } else if (salarioB <= 3751.05) {
                aliquota = 15;
            } else if (salarioB <= 4664.68) {
                aliquota = 22.5;
            } else {
                aliquota = 27.5;
            }

            imposto = salarioB * aliquota / 100;
            salarioL = salarioB - imposto;

            //Saída de Dados
            System.out.println("Salário Bruto: R$" + String.format("%.2f", salarioB));
            System.out.println("Alíquota: " + String.format("%.2f%%", aliquota));
            System.out.println("Imposto: R$" + String.format("%.2f", imposto));
            System.out.println("Salário Líquido: R$" + String.format("%.2f", salarioL));

        }
    }

