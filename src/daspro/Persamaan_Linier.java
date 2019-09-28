
package daspro;

import java.util.Scanner;

public class Persamaan_Linier {
     public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        System.out.print("Persamaan     : ");
        String a = in.nextLine();

        String [] apalah = a.split("x");
        String [] apalah2 = apalah[1].split("=");
       
        int xa=0;
        int xb=0;
        int xc=0; 
        
        try {
            if(apalah[0].equals("-")){
                    xa=-1;
                }
           else if(apalah[0].isEmpty()){
                xa=1;
                }
            else{
                xa=Integer.valueOf(apalah[0]);
                }
            if(apalah2[0].isEmpty()){
                xb=0;
                }else{
                xb=Integer.valueOf(apalah2[0]);
                }
            if(apalah2[1].isEmpty()){
                xc=0;
                }else {
                xc=Integer.valueOf(apalah2[1]);
                }
        
            System.out.println("a = "+xa);
            System.out.println("b = "+xb);
            System.out.println("c = "+xc);
            int x = (xc-xb)/xa;
            int xcxb= xc-xb;
            if((xc-xb)%xa!=0){
                if(xc-xb<0&&xa<0){
                    xcxb=-(xcxb);
                    xa=-(xa);
                    System.out.println("x = "+xcxb+"/"+xa);
                }else{
                System.out.println("x = "+xcxb+"/"+xa);
                }
            }else{
                System.out.println("x = "+x);
            }
        } catch (NumberFormatException e) {
            System.out.println("Format Penulisan Salah ");
        }
            
    
    }
}
