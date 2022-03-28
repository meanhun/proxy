package proxy;

import javax.management.RuntimeErrorException;

public class CalculatorProxy implements Icalculator{

    private ReadCalculator readCalculator;

    CalculatorProxy (){
        this.readCalculator = new ReadCalculator();
    }

    @Override
    public double add(double first, double second) {
        if(first /2 + second /2 >= Double.MAX_VALUE /2){
            throw new RuntimeException("out of range ");
        }
        if(first /2 + second /2 <= Double.MIN_VALUE /2){
            throw new RuntimeException("out of range ");
        }
        return this.readCalculator.add(first, second);
    }

    @Override
    public double div(double first, double second) {
        if(second == 0){
            throw new RuntimeException("Can't divide by zero");
        }
        return this.readCalculator.div(first, second);
    }
    
}
