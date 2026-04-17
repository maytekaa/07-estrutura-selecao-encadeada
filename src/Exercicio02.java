import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        //Exercicio Hotel - Cálculo de diárias

        //entrada de dados
        Scanner sc = new Scanner(System.in);
        int diarias;
        double conta, taxa;

        System.out.print("Número de diárias ---> ");
        diarias = sc.nextInt();

        //processamento de dados

        if( diarias > 15){

            taxa = 15.50;
        }

        else if( diarias == 15){

            taxa = 36;
        }

        else {

            taxa = 58;
        }

        conta = diarias * (250 + taxa); //250 * diarias + ( taxa * diarias)

        //saída de dados

        System.out.print("Total da conta ---> R$ " + String.format("%.2f", conta) );
    }
}
