AnalogCircuit Java program made for TMU course COE318 (Software Systems) This program allows a user to design a circuit that conforms to SPICE syntax The program is very minimal so I will be updating it soon to make it more documented and user friendly

There are four things the user is allowed to do as of now: Add a resistor, add a voltage source, print out the SPICE conforming circuit, and exiting the program

You may insert a voltage source of voltage vs between nodes node1 and node2 by using the following format: v node1 node2 vs

You may insert a resistor with a resistance of rs between nodes node1 and node2 by using the following format: r node1 node2 rs

"spice" without quotations will print out the SPICE formatted circuit

"exit" will exit the program