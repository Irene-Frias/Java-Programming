package tarea1.pkg10;

import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Tarea110 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean rain;
        boolean final_act;
        boolean library;
        boolean go_out;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("It's rainning (true or false): ");
        rain = sc.nextBoolean();
        
        System.out.print("It's you finish the homework (true or false): ");
        final_act = sc.nextBoolean();
        
        System.out.print("It's you have go to the library (true or false): ");
        library = sc.nextBoolean();
        
        go_out = !(rain) && final_act || library;
        System.out.println("Final result: " + go_out);
    }
    
}
