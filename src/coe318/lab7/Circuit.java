package coe318.lab7;
import java.util.ArrayList;

/**
 * Circuit that may contain a number of Resistor and VoltageSource objects while also being a singleton.
 *
 * @author Moiz Choudhary
 */
public class Circuit {
    private static Circuit instance = null;
    private ArrayList<Component> components = new ArrayList<>();
    
    /**
     * Returns the singleton Circuit object, and makes a new one if none exists
     * 
     * @return singleton Circuit object
     */
    public static Circuit getInstance(){
        if (instance == null){
            instance = new Circuit();
        }
        return instance;
    }
    private Circuit() {}
    
    /**
     * Add a component to the Circuit.
     * 
     * @param componentToAdd component to add to the Circuit
     */
    public void add(Component componentToAdd){
        if (componentToAdd == null){
            throw new IllegalArgumentException("Component cannot be null");
        }
        components.add(componentToAdd);
    }
    
    /**
     * Returns string representation of the Circuit, which lists its components
     * 
     * @return string representation of the Circuit
     */
    @Override
    public String toString(){
        String toReturn = "";
        
        for (int i = 0; i < components.size() - 1; i++){
            toReturn += components.get(i) + "\n";
        }
        toReturn += components.get(components.size()-1);
        
        return toReturn;
    }
}
