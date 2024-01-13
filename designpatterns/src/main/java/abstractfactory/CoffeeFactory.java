package abstractfactory;

public class CoffeeFactory {
    public Coffee getCoffee(String coffeeType) {
        Coffee coffee;
        if (coffeeType.equals("Cappuccino"))
            coffee = new Cappuccino(new CappuccinoIngredientFactory());
        else if (coffeeType.equals("Expresso"))
            coffee = new Expresso(new ExpressoIngredientFactory());
        else
            coffee = new Robusta(new DefaultIngredientFactory());
        return coffee;
    }
}
