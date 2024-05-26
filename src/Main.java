public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        //демонстрация

        System.out.println("MULT = " + calc.mult(5, 15));
        System.out.println("SUM = " + calc.sum(5, 15));
        System.out.println("POW = " + calc.pow(5, 2));
    }
}