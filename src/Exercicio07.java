import java.util.Scanner;

public class Exercicio07 {

        public static void main(String[] args) {

            //Declaração de Variáveis
            Scanner sc = new Scanner(System.in);
            String login, senha;

            //Entrada de Dados
            System.out.println("Digite seu login: ");
            login = sc.next();


            //Processamento de Dados
            if(login.equals("admin")) {
                System.out.println("Digite sua senha: ");
                senha = sc.next();
                if (senha.equals("fiap2026")) {


                    System.out.println("Acesso Liberado");
                }

                else {
                    System.out.println("Senha incorreta.");
                }
            }

            else {
                System.out.println("Usuário não encontrado.");
            }
        }
    }

