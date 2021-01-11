
package sequenciafibonacci;

import java.util.Scanner;

/**
 *
 * @author Alexssandro
 */
public class SequenciaFibonacci {

    public static void main(String[] args) {
        
         Scanner input = new Scanner (System.in);
         int f1 = 0;
         int f2 = 1;
         int limit = input.nextInt();
         while (f2 < limit ) {
             int fn = f1 + f2;
             if(fn > limit)
                 break;
             System.out.println (fn);
             f1 = f2;
             f2 = fn;
                     
                  
         }
                 
    }
    
}
