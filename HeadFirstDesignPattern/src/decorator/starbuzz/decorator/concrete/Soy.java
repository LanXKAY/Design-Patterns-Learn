package decorator.starbuzz.decorator.concrete;

import decorator.starbuzz.Size;
import decorator.starbuzz.component.Beverage;
import decorator.starbuzz.decorator.CondimentDecorator;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    // Before Add Size
//    @Override
//    public double getCost() {
//        return beverage.getCost() + .15;
//    }

    // After Add Size
    @Override
    public double getCost() {
        double cost = beverage.getCost();
        if (beverage.getSize() == Size.TALL) {
            cost += .10;
        } else if (beverage.getSize() == Size.GRANDE) {
            cost += .15;
        } else if (beverage.getSize() == Size.VENTI) {
            cost += .20;
        }
        return cost;
    }
}
