package lab07;

public class CPU {
    public void freeze(){
        System.out.println("CPU: FREZZING");
    }
    public void jump(int temp){
        System.out.println("CPU: Jump to position: " + temp);
    }

    public void execute() {
        System.out.println("CPU:execute");
    }
}
