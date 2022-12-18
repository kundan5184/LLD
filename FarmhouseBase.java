public class FarmhouseBase implements Pizza{
    Pizza pz;
    public FarmhouseBase(){}
    public FarmhouseBase(Pizza p){
        pz=p;
    }

    @Override
    public double getCost() {
        if (pz!=null){
            return pz.getCost()+150;
        }
        return 150;
    }
    public String getDesc(){
        if (pz!=null){
            return pz.getDesc()+" Farmhouse + ";
        }
        return "Farmhouse";
    }
}
