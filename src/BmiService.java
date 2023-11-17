public class BmiService {
    public int calculate(int weightKg, double heightMt) {
        double bmi = weightKg / (heightMt * heightMt) ;
        return (int)  bmi;
    }
}