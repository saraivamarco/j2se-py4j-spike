package py4j.examples;

import py4j.GatewayServer;

/**
 * This should be runned before the python scripts.
 * When running your application, you may get a java.net.BindException:
 * Address already in use exception. There are two common causes: either
 * you are already running another instance of your program or another
 * program on your computer is listening to the port 25333.
 * see https://www.py4j.org/getting_started.html for more details.
 * 
 * @author SaraivaM
 *
 */
public class StackEntryPoint {

    private final Stack stack;

    public StackEntryPoint() {
        stack = new Stack();
        stack.push("Initial Item");
    }

    public Stack getStack() {
        return stack;
    }

    public static void main(String[] args) {
        GatewayServer gatewayServer = new GatewayServer(new StackEntryPoint());
        gatewayServer.start();
        System.out.println("Gateway Server Started");
    }

}
