public class HandTossedBase implements Pizza{
    Pizza pz;
    public HandTossedBase(){}
    public HandTossedBase(Pizza p){
        pz=p;
    }
    public double getCost(){
        if (pz!=null){
            return pz.getCost()+200;
        }
        return 200;
    }

    public String getDesc(){
        if (pz!=null){
            return pz.getDesc() + "Hand Tossed + ";
        }
        return "Hand Tossed";
    }
}
