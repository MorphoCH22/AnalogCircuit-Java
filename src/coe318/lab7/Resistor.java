package coe318.lab7;

/**
 * Resistor, which is a type of component, that has an associated resistance in Ohms.
 *
 * @author Moiz Choudhary
 */
public class Resistor extends Component {
    private static int numResistors = 0;
    private double resistance;
    private int resistorNumber;
    
    /**
     * Create an ideal Resistor,with a given resistance and two unique nodes and its own unique identifying number.
     * 
     * @param resistance resistance in Ohms
     * @param node0 first node of the Resistor
     * @param node1 second node of the Resistor
     */
    public Resistor(double resistance, int node0, int node1){
        super(node0, node1);
        
        if (resistance < 0){
            throw new IllegalArgumentException("Resistance cannot be negative");
        }
        if (resistance == 0){
            throw new IllegalArgumentException("A resistor component is expected to have resistance");
        }
        
        this.resistance = resistance;
        this.resistorNumber = ++numResistors;
    }
    
    /**
     * Returns string representation of the Resistor in the form:
     * <pre>
     * RN n0 n1 resistance
     * </pre>
     * Where N represents the unique Resistor number
     * @return string representation of Resistor
     */
    @Override
    public String toString(){
        return "R" + resistorNumber + " " + nodes[0] + " " + nodes[1] + " " + resistance;
    } 
}