package abstractfactory;

public class Expresso extends Coffee{

    public Expresso(IngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    @Override
    void brew() {

    }

    @Override
    void boil() {

    }
}
