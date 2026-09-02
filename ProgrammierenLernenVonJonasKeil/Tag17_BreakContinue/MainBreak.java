package Tag17_BreakContinue;
import  java.util.Random;
public class MainBreak {
    public static void main( String[] args){
        Random random = new Random();
        whileLoop: while (true){
            if (random.nextInt(5)==3){
                break whileLoop;
            } else{
                System.out.println("!");
            }
        }
    }
}
