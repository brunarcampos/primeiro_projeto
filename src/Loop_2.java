import java.util.Scanner;

public class Loop_2 {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        double averageRating = 0;
        double grade = 0;
        int totalMarks = 0;

        while (grade != -1) {
            System.out.println("Diga a sua avaliação para o filme ou -1 para encerrar: ");
            grade =  reading.nextDouble();
            if(grade != -1) {
                averageRating += grade;
                totalMarks++;
            }

        }

        System.out.println("Média de avaliações: " + averageRating/totalMarks);
    }
}
