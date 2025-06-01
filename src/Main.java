public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match!");
        System.out.println("Filme: Top Gun: Maverick");

        int yearOfRelease = 2022;
        System.out.println("Ano de lançamento: " + yearOfRelease);
        boolean includedInThePlan = true;
        double filmNote = 8.1;
        //Média calculada pelas 3 notas
        double mean = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(mean);
        String synopsis;
        synopsis = """
                Filme To Gun
                Filme de aventura com galã dos anos 80
                Muito bom!
                Ano de lançamento
                """ + yearOfRelease;
        System.out.println(synopsis);

        int rating = (int) mean /2;
        System.out.println(rating);
    }
}