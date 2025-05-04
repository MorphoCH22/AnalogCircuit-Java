package coe318.lab7;

/**
 * Component can either represent a resistor or a voltage source as a superclass.
 *
 * @author Moiz Choudhary
 */

public class Component {
    protected int nodes[] = new int[2];
    
    /**
     * Create a Component, which will be between two unique nodes.
     * 
     * @param node0 first node the Component is connected to
     * @param node1 second node the Component is connected to
     */
    public Component(int node0, int node1){
        if (node0 < 0 || node1 < 0){
            throw new IllegalArgumentException("No negative nodes allowed");
        }
        
        if (node0 == node1){
            throw new IllegalArgumentException("Node pair cannot be the same nodes");
        }
        
        this.nodes[0] = node0;
        this.nodes[1] = node1;
    }
}
