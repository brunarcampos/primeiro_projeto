import java.util.Scanner;

public class Reading {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);

        System.out.println("Digite seu filme favorito:");
        String film = reading.nextLine();
        System.out.println("Qual o ano de lançamento?");
        int yearOfRelease = reading.nextInt();
        System.out.println("Diga a sua avaliação para o filme: ");
        double rating = reading.nextDouble();

        System.out.println(film);
        System.out.println(yearOfRelease);
        System.out.println(rating);
    }
}
