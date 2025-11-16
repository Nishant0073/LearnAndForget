public class FarmhousePizza implements BasePizza{

    @Override
    public String getDescription() {
        return "Farmhouse Pizza";
    }

    @Override
    public Integer getCost() {
        return 30;
    }
}
