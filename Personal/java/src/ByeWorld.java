package Personal.java.src;

import java.util.Scanner;

public class ByeWorld{

    public static void main(String[] args) {
        Scanner scnr=new Scanner(System.in);
        System.out.println("Enter 3 team name(without spaces), rank and number of poles this season(in the order mentioned): ");
        String Team1=scnr.next();
        int rank1= scnr.nextInt();
        int poles1= scnr.nextInt();
        String Team2=scnr.next();
        int rank2= scnr.nextInt();
        int poles2= scnr.nextInt();
        String Team3=scnr.next();
        int rank3= scnr.nextInt();
        int poles3= scnr.nextInt();


        cow team1=new cow(Team1,rank1,poles1);
        cow team2=new cow(Team2,rank2,poles2);
        cow team3=new cow(Team3,rank3,poles3);


        team1.printInfo();
        team2.printInfo();
        team3.printInfo();

        scnr.close();
    }
}
