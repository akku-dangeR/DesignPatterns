package singleton;

/**
 * Implement singleton design pattern
 *
 * @author Yashraj R. Sontakke
 */
public class Singleton {
    private static Singleton instance = null;

    private final Long creationTime;

    private Singleton(){
        creationTime = System.currentTimeMillis();
    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    protected void demo(){
        System.out.println(String.format("Creation time = {%d}", creationTime));
    }

}
