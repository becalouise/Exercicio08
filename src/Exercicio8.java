import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salarioHora;
        double horasTrabalhadas;
        double salarioMensal;

        System.out.println("Insira o valor ganho por hora");
        salarioHora = teclado.nextDouble();
        
        System.out.println("Insira a quantidade de horas trabalhadas");
        horasTrabalhadas = teclado.nextDouble();
        salarioMensal = (salarioHora * horasTrabalhadas);
        teclado.close();

        System.out.print("R$ " + salarioMensal);

    }

}
