package jim.vmware.draw.shape;

public class Square implements Shape {
    private String name;
    
    public Square(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("draw square " + name);
    }

    @Override
    public String name() {
        return name;
    }

}
