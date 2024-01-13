package abstractfactory;

public class Robusta extends Coffee{


    protected Robusta(IngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    @Override
    void brew() {

    }

    @Override
    void boil() {

    }
}
