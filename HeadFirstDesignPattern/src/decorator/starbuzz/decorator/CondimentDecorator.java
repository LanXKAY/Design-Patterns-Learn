package decorator.starbuzz.decorator;

import decorator.starbuzz.component.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
