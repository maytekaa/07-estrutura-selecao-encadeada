import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

        //Exercicio 6 - Classificador de turno escolar

        //entrada de variaveis
        Scanner sc = new Scanner(System.in);
        String turno;

        //entrada de dados
        System.out.print("Turno ---> ");
        turno = sc.next();

        //processamento de dados

        if(turno.equals("manha")){

            System.out.print("07h00 às 12h00 ");
        }

        else if(turno.equalsIgnoreCase("tarde")){ //IgnoreCase = ignorar se a String tem CapsLock ou não

            System.out.printf("13h00 às 18h00 ");
        }

        else if(turno.equals("noite")){

            System.out.printf("19h00 às 23h00 ");
        }

        else{

            System.out.printf("Turno inválido");
        }


    }
}
