package Personal.java.src;

public class cow extends nice {
    private int poles;

    public cow(String team,int rank,int poles){
        super(team, rank);
        this.poles=poles;
    }

    @Override
    public void printInfo(){
        System.out.println(team + " is at rank "+rank + " and have had "+poles+" poles yet this season.");
    }
}
