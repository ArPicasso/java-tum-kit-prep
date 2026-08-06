public class KlugesLaden {
    public static void main(String[] args)  throws InterruptedException {
        boolean is_bought_watermelon = true;
        int how_many_bought = 2;
        int sum_of_watermelon = 12;
        double balance = 5.0;

        if (is_bought_watermelon){
            sum_of_watermelon -= (1 * how_many_bought);
            balance += (2.3 * how_many_bought);
            for (int i=0; i<101; i+=20){
                System.out.print("\r die Rechnung wird heruntegeladen\t" + i + "%");
                Thread.sleep(400);
            }
        System.out.println("\n Rechnung \n Anzahl \t" + how_many_bought + "\t Stück" + "\n Kosten \t" + 2.3 * how_many_bought + "\t Euro");

        }
        System.out.println("-----------------------------");
        System.out.print("\n Konto \n Verkaufsmenge \t" + how_many_bought + "\t Stück" + "\n Erlös \t" + 2.3 * how_many_bought + "\t Euro" + "\n Balance \t" + balance + "\t Euro" );
    }
}
