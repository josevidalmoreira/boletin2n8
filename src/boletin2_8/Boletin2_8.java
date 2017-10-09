
package boletin2_8;
 import java.util.Scanner;

public class Boletin2_8 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        float b100,b20,b5,m1, c;
        System.out.println("teclea billetes de 100:");
        b100=sc.nextFloat();
          System.out.println("teclea billetes de 20:");
        b20=sc.nextFloat();
          System.out.println("teclea billetes de 5:");
        b5=sc.nextFloat();
          System.out.println("teclea monedas de 1:");
        m1=sc.nextFloat();
        c=(b100*100)+(b20*20)+(b5*5)+m1;
        System.out.println("tienes en total  "+c+"  euros" );
        
    }
    
}
