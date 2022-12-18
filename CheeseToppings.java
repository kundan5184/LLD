public class CheeseToppings implements Pizza{

    Pizza pz;
    public CheeseToppings(Pizza p){
        pz = p;
    }

    public double getCost(){
        return pz.getCost()+80;
    }

    public String getDesc(){
        return pz.getDesc() + "cheez + ";
    }
}
