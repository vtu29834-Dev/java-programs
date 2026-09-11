class Singleton {

    public String str;

    private static Singleton instance = null;

    private Singleton() {
    }

    public static Singleton getSingleInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

public class Solution {
    public static void main(String[] args) {

        Singleton s = Singleton.getSingleInstance();

        s.str = "hello world";

        System.out.println("Hello I am a singleton! Let me say " 
                           + s.str + " to you");
    }
}
ouput:-
  Hello I am a singleton! Let me say hello world to you
