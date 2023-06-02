package decorator.starbuzz.component.concrete;

import decorator.starbuzz.component.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    public double getCost() {
        return 1.99;
    }
}
