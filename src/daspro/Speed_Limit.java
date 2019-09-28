
package daspro;

import java.util.Scanner;

public class Speed_Limit {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       double speed;
       int poin = 0;
       
       boolean a=true;
       while(a){
           System.out.println("========== Speed Limit ==========");
           System.out.print("Kecepatan  : ");
           speed=in.nextDouble();
           
           if(speed<=70){
               System.out.println("Ok");}
           
               if(speed>70){
                   poin=(int) (speed-70)/(int)5;
                   System.out.println("poin       : "+poin);
               }
               if(poin>=14){
                   System.out.println("Licensed suspend");
               }
       }
    }    
}
