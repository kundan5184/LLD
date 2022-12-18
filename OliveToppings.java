public class OliveToppings implements Pizza{
    Pizza pz;
    public OliveToppings(Pizza p){
        pz = p;
    }
    public double getCost(){
        return pz.getCost() + 20;
    }
    public String getDesc(){
        return pz.getDesc() + " Olive + ";
    }
}
