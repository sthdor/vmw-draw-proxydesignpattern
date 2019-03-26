package jim.vmware.draw.shape;

public class Circle implements Shape {
    private String name;
    
    public Circle(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("draw circle " + name);
    }

    @Override
    public String name() {
        return name;
    }

}
