package Personal.java.F1SpeedSim;

public class speed {
    private int speed;

    public void setSpeed(int speed){
        this.speed=speed;
    }
    public int getSpeed1(){
        return (speed*4)+1;
    }
    public void printSpeed1(){
        System.out.println("Speed: "+ getSpeed1());
    }
    public int getSpeed2(){
        return (speed*3)+1;
    }
    public void printSpeed2(){
        System.out.println("Speed: "+ getSpeed2());
    }
    public int getSpeed3(){
        return (speed*2)+1;
    }
    public void printSpeed3(){
        System.out.println("Speed: "+ getSpeed3());
    }
}
