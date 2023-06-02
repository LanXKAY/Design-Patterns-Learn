package decorator.starbuzz;

import decorator.starbuzz.component.Beverage;
import decorator.starbuzz.component.concrete.DarkRoast;
import decorator.starbuzz.component.concrete.Espresso;
import decorator.starbuzz.component.concrete.HouseBlend;
import decorator.starbuzz.decorator.concrete.Mocha;
import decorator.starbuzz.decorator.concrete.Soy;
import decorator.starbuzz.decorator.concrete.Whip;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
                + " $" + beverage.getCost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()
                + " $" + beverage2.getCost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription()
                + " $" + beverage3.getCost());

        Beverage beverage4 = new HouseBlend();
        beverage4.setSize(Size.VENTI);
        beverage4 = new Soy(beverage4);
        beverage4 = new Mocha(beverage4);
        beverage4 = new Whip(beverage4);
        System.out.println(beverage4.getDescription()
                + " $" + String.format("%.2f", beverage4.getCost()));
    }
}
