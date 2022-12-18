public class Dominos {
    public static void main(String[] args) {

        Pizza pz = new PannerToppings(new CheeseToppings(new TomatoToppings(new BBQChickenBase())));

        System.out.println(pz.getDesc());
        System.out.println(pz.getCost());
    }
}
