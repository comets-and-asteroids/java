package lab07;

public class ComputerFacade {
    private CPU cpu;
    private HardDrive hardDrive;
    private Memory memory;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.hardDrive = new HardDrive();
        this.memory = new Memory();
    }

    public void start(){
        cpu.freeze();
        memory.load(0, hardDrive.read(0, 1024));
        cpu.jump(0);
        cpu.execute();
    }
}
