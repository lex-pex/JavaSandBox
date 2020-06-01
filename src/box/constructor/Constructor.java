package box.constructor;

public class Constructor {
    public void info() {
        System.out.println(
                new Rectangle()
        );
        new Rectangle("Hello, People!");
    }
}

class Rectangle {
    String description;
    public Rectangle() {
        System.out.println("Default Constructor");
    }
    public Rectangle(String message) {
        description = message;
        System.out.println("Constructor: " + description);
    }
}
