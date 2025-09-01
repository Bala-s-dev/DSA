
public abstract class Train {
    protected int trainNo;
    protected String trainName;
    protected String source;    
    protected String destination;
    
    public Train(int trainNo, String trainName, String source, String destination){
        this.trainNo = trainNo;
        this.trainName = trainName;
        this.source = source;
        this.destination = source;
    }
    public void getTrainDetail(){
        System.out.println("Train NO: " + trainNo + " Train Name " + trainName);
        System.out.println("From "+ source + " To" + destination);
    }

    public abstract double fairPrice(double distance);

}

