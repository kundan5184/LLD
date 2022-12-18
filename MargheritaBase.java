public class MargheritaBase implements Pizza{
    Pizza pz;
    public MargheritaBase(){}
    public MargheritaBase(Pizza p){
        pz = p;
    }
    public double getCost(){
        if (pz != null){
            return pz.getCost() + 200;
        }
        return 200;
    }

    public String getDesc(){
        if (pz!=null){
            return pz.getDesc()+" Margherita + ";
        }
        return "Margherita";
    }
}
