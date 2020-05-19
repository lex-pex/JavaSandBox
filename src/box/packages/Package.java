package box.packages;

public class Package {
    public void printInfo() {
        System.out.println(
                "This is the class with full name: \n"
                + this.getClass()
        );
    }
}
