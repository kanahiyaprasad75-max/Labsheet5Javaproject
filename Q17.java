interface Printer {

    void print();
}

interface Scanner {

    void scan();
}

class MultiFunctionMachine implements Printer, Scanner {

    private String machineName;
    private int machineId;

    
    public String getMachineName() {
        return machineName;
    }

    public int getMachineId() {
        return machineId;
    }

    
    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public void setMachineId(int machineId) {
        this.machineId = machineId;
    }

    @Override
    public void print() {
        System.out.println("Machine is printing.");
    }

    @Override
    public void scan() {
        System.out.println("Machine is scanning.");
    }

    public void displayMachine() {
        System.out.println("Machine Name: " + machineName);
        System.out.println("Machine ID: " + machineId);
    }
}

public class Q17MultiFunctionMachine {
    public static void main(String[] args) {

        MultiFunctionMachine machine =
                new MultiFunctionMachine();

        machine.setMachineName("HP MultiFunction");
        machine.setMachineId(501);

        machine.displayMachine();
        machine.print();
        machine.scan();
    }
}
