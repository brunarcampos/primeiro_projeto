public class Conditional {
    public static void main(String[] args) {
        int yearOfRelease = 1990;
        boolean includedInThePlan = true;
        double filmNote = 8.1;
        String flatType = "plus";

        if(yearOfRelease >= 2022){
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }
        if(includedInThePlan == true && flatType.equals("plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }
    }
}
