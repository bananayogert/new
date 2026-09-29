import java.util.Scanner;

public class Alunomedia {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("===Média  Estudantil===");


        System.out.println("Inscreve o nome do aluno: ");
        String alunoNome = sc.nextLine();

        System.out.println("Inscreve o o número total do valor " + alunoNome + ":   ");
        Double alunoNota = sc.nextDouble();

        System.out.println("Inscreve o número total do grupo de alunos: ");
        int groupSize = sc.nextInt();

        double[] groupValues = new double[groupSize];
        double groupSum = 0.0;


        System.out.println("Inscreve  os  valores de cada aluno: ");
        for (int i = 0; i < groupSize; i++) {
            System.err.println("Member" + (i + 1) + "Value: ");
            groupValues[i] = sc.nextDouble();
            groupSum += groupValues[i];
        }
        

        double alunoAvg = groupSum / groupSize;
        String status = (alunoNota >= alunoAvg) ? "Aprovado" : "Reprovado/Recuperação";



        System.out.println("===Resultados dos Alunos===");
        System.out.printf("Object: %s | Group Average: %.2f | Status: [%s]%n", alunoNome, alunoAvg, status);
       sc.close();
    }
}