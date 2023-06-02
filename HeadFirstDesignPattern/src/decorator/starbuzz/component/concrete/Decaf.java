package decorator.starbuzz.component.concrete;

import decorator.starbuzz.component.Beverage;

public class Decaf extends Beverage {
    public Decaf() {
        description = "DeCaf Coffee";
    }

    @Override
    public double getCost() {
        return 1.05;
    }
}
