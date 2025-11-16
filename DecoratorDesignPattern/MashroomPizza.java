public class MashroomPizza extends ToppingDecorator {

    MashroomPizza(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public String getDescription() {
        return basePizza.getDescription() + " "+ "Extra mashroom";
    }

    @Override
    public Integer getCost() {
        return basePizza.getCost() + 15;
    }
}
