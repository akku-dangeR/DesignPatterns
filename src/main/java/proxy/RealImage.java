package proxy;

/**
 * Object implementing image interface.
 *
 * @author Yashraj R. Sontakke
 */
public class RealImage implements Image {

    private final String filename;

    public RealImage(final String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }

    public void loadImageFromDisk() {
        System.out.println(String.format("Loading image %s", filename));
    }

    @Override
    public void display() {
        System.out.println(String.format("Displaying image %s", filename));
    }
}
