package structural.proxy;

/**
 * Created by Administrator on 2017\10\15 0015.
 */
public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("loading "+fileName);
    }

    @Override
    public void display() {
        System.out.println("displaying "+fileName);
    }
}
