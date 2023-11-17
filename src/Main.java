public class Main {
    public static <BmiService> void main(String[] args) {
        BmiService service = new BmiService() ;
        int weightKg = 98;
        double heightMt = 187;
        System.out.println(weightKg / (heightMt * heightMt));
    }
}