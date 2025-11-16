public class Client {
    public static void main(String[] args) {
        //plain pizza
        PlainPizza pizza1 = new PlainPizza();
        System.out.println("Plain pizza details: ");

        System.out.println(pizza1.getDescription());
        System.out.println(pizza1.getCost());

        System.out.println("\n");


        BasePizza pizza2 = new CheeseTopping(new PlainPizza()); // plain -> cheese
        System.out.println("Cheese + Plain: ");

        System.out.println(pizza2.getDescription());
        System.out.println(pizza2.getCost());

        System.out.println("\n");
 
        BasePizza pizza3 = new MashroomPizza(new CheeseTopping(new FarmhousePizza()));  // farmhouse -> cheese -> mashroom
        System.out.println("Mashroom + Cheese + Farmhouse : ");

        System.out.println(pizza3.getDescription());
        System.out.println(pizza3.getCost());

        System.out.println("\n");


    }
}
