package jim.vmware.draw.templatemethod;

public abstract class ShapeProvide {
    
    private void pre() {
        System.out.println("pre");
    }
    
    private void post() {
        System.out.println("post");
    }
    
    protected abstract void draw(); 
    
    public void drawExt() {
        pre();
        draw();
        post();
    }

}
