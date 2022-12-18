public class PannerToppings implements Pizza{
    Pizza pz;
    public PannerToppings(Pizza p){
        pz=p;
    }
    public double getCost(){
        return pz.getCost() + 60;
    }
    public String getDesc(){
        return pz.getDesc() + " Paneer + ";
    }
}
