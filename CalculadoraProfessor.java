import java.util.Scanner;


public class CalculadoraProfessor
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        double salario_prof = 0;


        System.out.print("Digite o nome do professor: ");
        String nomeProfessor = teclado.nextLine();

        System.out.print("Qual o seu regime de pagamento? \n[1]CLT \n[2]Horista \n[3]PJ \n");
        int regimePagamento = teclado.nextInt();

        switch (regimePagamento){

            case 1:
                System.out.print("Qual o salário mensal do professor? \nR$");
                salario_prof = teclado.nextDouble();
                break;

            case 2:
                System.out.print("Qual o valor da hora de trabalho? \nR$");
                double valorHora = teclado.nextDouble();

                System.out.println("Quantas horas são trabalhadas?");
                double horaTrabalhada = teclado.nextDouble(); 

                salario_prof = valorHora * horaTrabalhada;
                break;
            
            case 3:
                System.out.print("Qual o valor dito no contrato? \nR$");
                salario_prof = teclado.nextDouble(); 
                break;
            
            default:
                System.out.print("Tente novamente, utilize uma opção válida.");
                return;
    }

        System.out.print("Nome do professor: " + nomeProfessor + "\nValor a receber: R$" + salario_prof);
    }
}