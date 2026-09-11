class Cycle {
    String define_me() {
        return "a vehicle with pedals.";
    }
}

class Motorcycle extends Cycle {
    String define_me() {
        return "a cycle with an engine.";
    }

    Motorcycle() {
        System.out.println("Hello I am a motorcycle, I am " + define_me());
        System.out.println("My ancestor is a cycle who is " + super.define_me());
    }
}

public class Main {
    public static void main(String[] args) {
        Motorcycle M = new Motorcycle();
    }
}
output:-
  Hello I am a motorcycle, I am a cycle with an engine.
My ancestor is a cycle who is a vehicle with pedals.
