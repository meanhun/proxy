package proxy;

public class Main {
    public static void main(String[] args) {
        Icalculator readCalculator = new CalculatorProxy();
        double add = readCalculator.add(4, 2);
        double div = readCalculator.div(4, 0);
        System.out.println(add +"   -   "+ div);
    }
}
