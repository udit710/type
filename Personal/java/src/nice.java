package Personal.java.src;

public class nice {
    protected String team;
    protected int rank;

    public nice(String teamName,int teamRank){
        team=teamName;
        rank=teamRank;
    }
    public void printInfo(){
        System.out.println(team + " is at rank "+rank);
    }
}
