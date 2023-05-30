import java.util.Scanner;
public class CalculadoraProfessor{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do professor: ");
        String nomeProfessor = teclado.nextLine();

        System.out.print("Qual o seu regime de pagamento? \n[1]CLT \n[2]Horista \n[3]PJ \n");
        int regimePagamento = teclado.nextInt();

        switch (regimePagamento){
            case 1:
            System.out.print("Qual o salário mensal do professor? \nR$");
            double salarioCLT = teclado.nextDouble(); 

            System.out.print("Nome do professor: " + nomeProfessor + "\nValor a receber: R$" + salarioCLT); break;

            case 2:
            System.out.print("Qual o valor da hora de trabalho? \nR$");
            double valorHora = teclado.nextDouble();

            System.out.println("Quantas horas são trabalhadas?");
            double horaTrabalhada = teclado.nextDouble(); 

            double salarioHorista = valorHora * horaTrabalhada;

            System.out.printf("Nome do professor: %s \nValor a receber: R$%.2f",nomeProfessor,salarioHorista);break;
            
            case 3:
            System.out.print("Qual o valor dito no contrato? \nR$");
            double salarioPJ = teclado.nextDouble(); 
            
            System.out.print("Nome do professor: " + nomeProfessor + "\nValor a receber: R$" + salarioPJ); break;
            
            default:
            System.out.print("Tente novamente, utilize uma opção válida.");

    }
    }
}