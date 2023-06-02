package decorator.starbuzz.decorator.concrete;

import decorator.starbuzz.component.Beverage;
import decorator.starbuzz.decorator.CondimentDecorator;

public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + .10;
    }
}
