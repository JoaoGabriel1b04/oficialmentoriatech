import java.util.Scanner;

public class mentoriatech {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double[] notas = new double[8];

        System.out.println("Digite as 8 notas anuais do aluno:");

        for (int i = 0; i < 8; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        double mediaBimestre1 = (notas[0] + notas[1]) / 2;
        double mediaBimestre2 = (notas[2] + notas[3]) / 2;
        double mediaBimestre3 = (notas[4] + notas[5]) / 2;
        double mediaBimestre4 = (notas[6] + notas[7]) / 2;


        double mediaSemestre1 = (mediaBimestre1 + mediaBimestre2) / 2;
        double mediaSemestre2 = (mediaBimestre3 + mediaBimestre4) / 2;


        double mediaFinal = (mediaSemestre1 + mediaSemestre2) / 2;


        System.out.println("\n--- Resultados ---");
        System.out.println("Média do 1º Bimestre: " + mediaBimestre1);
        System.out.println("Média do 2º Bimestre: " + mediaBimestre2);
        System.out.println("Média do 3º Bimestre: " + mediaBimestre3);
        System.out.println("Média do 4º Bimestre: " + mediaBimestre4);
        System.out.println("Média do 1º Semestre: " + mediaSemestre1);
        System.out.println("Média do 2º Semestre: " + mediaSemestre2);
        System.out.println("Média Final: " + mediaFinal);


        if (mediaFinal >= 7) {
            System.out.println("Aluno Aprovado!");
        } else if (mediaFinal >= 5) {
            System.out.println("Aluno em Recuperação!");
        } else {
            System.out.println("Aluno Reprovado!");
        }

        scanner.close();
    }
}







