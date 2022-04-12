package Personal.java.words;

import java.util.Scanner;

public class error {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double v= scnr.nextInt();
        double rate=2.3;
        for(int i=0;i<50;++i){
          v=(v*rate)+1.0;
          System.out.printf("%.2f\n",v);
        }

        scnr.close();
    }
}
