public class TomatoToppings implements Pizza{
    Pizza pz;
    public TomatoToppings(Pizza p){
        pz = p;
    }
    public double getCost(){
        return pz.getCost() + 30;
    }
    public String getDesc(){
     return pz.getDesc() + " Tomato + ";
    }
}
