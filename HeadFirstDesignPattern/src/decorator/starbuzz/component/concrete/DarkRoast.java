package decorator.starbuzz.component.concrete;

import decorator.starbuzz.component.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double getCost() {
        return .99;
    }
}
