public class ThinCrustBase implements Pizza{
    Pizza pz;
    public ThinCrustBase(){}
    public ThinCrustBase(Pizza p){
        pz = p;
    }
    public double getCost(){
        if (pz!=null){
            return pz.getCost() + 150;
        }
       return 150;
    }
    public String getDesc(){
        if (pz!=null){
            return pz.getDesc() + "Thin crust, ";
        }
        return "Thin crust, ";
    }
}
