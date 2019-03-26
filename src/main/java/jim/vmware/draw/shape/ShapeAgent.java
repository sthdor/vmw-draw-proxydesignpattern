package jim.vmware.draw.shape;

public class ShapeAgent implements Shape {
    private Shape shape;
    
    private void preProcess() {
        System.out.println("pre " + name());
    }
    
    private void postProcess() {
        System.out.println("post " + name());
    }
    
    @Override
    public void draw() {
        preProcess();
        shape.draw();
        postProcess();
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    @Override
    public String name() {
        return shape.name();
    }
}
