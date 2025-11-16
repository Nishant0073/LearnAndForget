public class CheeseTopping extends ToppingDecorator{

    CheeseTopping(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public String getDescription() {
        return basePizza.getDescription() + " Extra cheese";
    }

    @Override
    public Integer getCost() {
        return basePizza.getCost() + 10;
    }
}
