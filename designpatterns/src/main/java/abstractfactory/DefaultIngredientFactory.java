package abstractfactory;

public class DefaultIngredientFactory implements IngredientFactory{
    @Override
    public Bean getBean() {
        return new AmericanBean();
    }

    @Override
    public Sugar getSugar() {
        return new RegularSugar();
    }

    @Override
    public Milk getMilk() {
        return new powderedMilk();
    }
}
