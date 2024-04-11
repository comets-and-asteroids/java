package lab07;

public class HardDrive {
    public byte[] read(int lba, int size) {
        System.out.println("HardDrive: Read data from LBA " + lba + " with size " + size);
        return new byte[size];
    }
}
