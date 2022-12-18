public class PepperoniBase implements Pizza{
    Pizza pz;
    public PepperoniBase(){}
    public PepperoniBase(Pizza p){
        pz = p;
    }
    public double getCost(){
        if (pz!=null){
            return pz.getCost()+180;
        }
        return 180;
    }

    public String getDesc(){
        if (pz!=null){
            return pz.getDesc() + " Pepperoni , ";
        }
        return " Pepperoni , ";
    }
}
