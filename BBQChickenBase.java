public class BBQChickenBase implements Pizza{

    Pizza pz;
    public BBQChickenBase(){}
    public BBQChickenBase(Pizza p){
        pz = p;
    }
    public double getCost(){
        if (pz!=null){
            return pz.getCost() + 200;
        }
        return 200;
    }
    public String getDesc(){
        if (pz!=null){
            return pz.getDesc() + " BBQChicken +";
        }
        return "BBQChicken";
    }
}
