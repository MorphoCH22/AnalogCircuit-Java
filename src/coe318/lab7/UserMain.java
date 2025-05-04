package coe318.lab7;
import java.util.Scanner;

/**
 * Main class for user to build Circuit
 *
 * @author Moiz Choudhary
 */
public class UserMain {
    public static void main(String[] args){
        Circuit c = Circuit.getInstance();
        
        Scanner in = new Scanner(System.in);
        String userinput = "";
        
        while (!(userinput.equals("end"))){
            userinput = in.nextLine();
            
            if (userinput.equals("spice")){
                System.out.println(c);
            }
            
            String[] splitstring = userinput.split(" ");
            
            if (splitstring[0].equals("v")){
                c.add(new VoltageSource(Double.parseDouble(splitstring[3]), Integer.parseInt(splitstring[1]), Integer.parseInt(splitstring[2])));
            } else if (splitstring[0].equals("r")){
                c.add(new Resistor(Double.parseDouble(splitstring[3]), Integer.parseInt(splitstring[1]), Integer.parseInt(splitstring[2])));
            }
        }
        System.out.println("All Done");
    }
}
