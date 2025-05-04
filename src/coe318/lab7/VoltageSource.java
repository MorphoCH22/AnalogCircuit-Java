package coe318.lab7;

/**
 * VoltageSource, which is a type of component that has an associated DC voltage.
 *
 * @author Moiz Choudhary
 */
public class VoltageSource extends Component {
    private static int numVSources = 0;
    private double voltage;
    private int vSourceNumber;
    
    /**
     * Create an ideal VoltageSource object, with a given DC voltage between the first and second node
     * 
     * @param voltage DC voltage of the VoltageSource object
     * @param node0 first node of the VoltageSource object, which is the positive side of the source
     * @param node1 second node of the VoltageSource object, which is the negative side of the source
     */
    public VoltageSource(double voltage, int node0, int node1){
        super(node0, node1);
        
        this.voltage = voltage;
        this.vSourceNumber = ++numVSources;
    }
    
    /**
     * Returns string representation of the VoltageSource in the form:
     * <pre>
     * VN n0 n1 DC voltage
     * </pre>
     * Where N represents the unique VoltageSource number
     * @return string representation of VoltageSource
     */
    @Override
    public String toString(){
        return "V" + vSourceNumber + " " + nodes[0] + " " + nodes[1] + " DC " + voltage;
    } 
}
