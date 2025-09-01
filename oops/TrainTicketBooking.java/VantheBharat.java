
public class VantheBharat extends Train{
    public boolean includeFood;

    public VantheBharat(int trainNo, String trainName,String source, String destination, boolean includeFood){
        super(trainNo, trainName, source, destination);
        this.includeFood = includeFood;
    }

    @Override
    public double fairPrice(double distance){
        return distance * 1.5;
    }
}
