package Personal.java.F1SpeedSim;

import java.util.Scanner;

public class perform {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        double speed = 0;
        String team;
        String pedal;
        System.out.println("Enter team name(press L to have a team list): ");
        System.out.println("Note:team name should match the exact one in the list");
        team=scnr.next();
        if(!(team.equals("L"))){
        System.out.println("Enter 'a' to accelerate and 'b' to brake");
        pedal = scnr.next();
        }

        if(team.equals("L")){
            System.out.println("Ferrari");
            System.out.println("Mercedes");
            System.out.println("Redbull");
            System.out.println("Mclaren");
            System.out.println("Astonmartin");
            System.out.println("Alpine");
            System.out.println("Alfatauri");
            System.out.println("Alfaromeo");
            System.out.println("Williams");
            System.out.println("Haas");
            System.out.println("Enter team name(press L to have a team list): ");
        System.out.println("Note:team name should match the exact one in the list");
        team=scnr.next();
        }
        while((speed >= 0)&&(speed<400)){
             if(team.equals("Ferrari")||team.equals("Redbull")||team.equals("Mercedes")){
                System.out.println("Enter 'a' to accelerate and 'b' to brake and 'end' to end(Note:The program will automatically end if max speed if obained)");
                 pedal = scnr.next();
                
                   if (pedal.equals("a")){
                       if (speed<200){
                      speed=(speed*2.5)+1;
                       }
                      else if (speed>=200){
                          speed+=30;
                      }
                   }
                   else if (pedal.equals("b")){
                       if(speed<100){
                         speed-=5;
                       }else if(speed<200){
                        speed-=25;
                      }else if(speed<361){
                        speed-=40;
                      }else if(speed<6){
                        speed-=1;
                      }else if(speed==0){
                        speed-=0;
                      }
                   }
                   
                   else if (pedal.equals("end")){
                      break;
                   }
                   System.out.printf("Speed: %.2f KPH\n", speed);            
              }else if(team.equals("Mclaren")||team.equals("Astonmartin")||team.equals("Alpine")||team.equals("Alphatauri")){
            System.out.println("Enter 'a' to accelerate and 'b' to brake and 'end' to end(Note:The program will automatically end if max speed if obained)");
             pedal = scnr.next();
            
               if (pedal.equals("a")){
                   if (speed<200){
                  speed=(speed*2.0)+1;
                   }
                  else if (speed>=200){
                      speed+=30;
                  }
               }
               else if (pedal.equals("b")){
                   if(speed<100){
                     speed-=5;
                   }else if(speed<200){
                    speed-=25;
                  }else if(speed<361){
                    speed-=40;
                  }else if(speed<6){
                    speed-=1;
                  }else if(speed==0){
                    speed-=0;
                  }
               }
               
               else if (pedal.equals("end")){
                  break;
               }
               System.out.printf("Speed: %.2f KPH\n", speed);            
              }else if(team.equals("Alfaromeo")||team.equals("Williams")||team.equals("Haas")){
            System.out.println("Enter 'a' to accelerate and 'b' to brake and 'end' to end(Note:The program will automatically end if max speed if obained)");
             pedal = scnr.next();
            
               if (pedal.equals("a")){
                   if (speed<200){
                  speed=(speed*1.6)+1;
                   }
                  else if (speed>=200){
                      speed+=30;
                  }
               }
               else if (pedal.equals("b")){
                   if(speed<100){
                     speed-=5;
                   }else if(speed<200){
                    speed-=25;
                  }else if(speed<361){
                    speed-=40;
                  }else if(speed<6){
                    speed-=1;
                  }else if(speed==0){
                    speed-=0;
                  }
               }
               
               else if (pedal.equals("end")){
                  break;
               }
               System.out.printf("Speed: %.2f KPH\n", speed);            
              }
    }
    System.out.printf("Final speed: %.2f KPH\n", speed);            
    scnr.close();
    System.out.println("Bringing car to stop...");
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    System.out.println("Speed: 0.00 KPH");
}
}

