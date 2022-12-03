package proxy;

public class ProxyImage implements MyImage {
    private String filename;
    private MyImage realImage;

    public ProxyImage(String filename) {
        this.filename = filename;
    }
    @Override
    public void display() {
        if (realImage == null) {
            this.realImage = new RealImage(filename);
        }
        realImage.display();
    }
}
