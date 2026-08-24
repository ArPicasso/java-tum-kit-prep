package Tag6_Arrays;
//Цель программы посчитать среднее значение вычислений
public class DoubleArrayDurchschnittChalenge {
    public static void main(String[] args){
        double[] experiment = {1.3, 2.4, 3.3, 3.1, 3.0, 1.9, 1.0};
        double sum = 0.0;
        int k = 0;
        for (int i = 0; i < experiment.length; i++){
            sum += experiment[i];
            k += 1;
        }
        System.out.println(sum / k);
    }
}
