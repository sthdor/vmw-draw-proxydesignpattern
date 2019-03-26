package jim.vmware.draw.service;

import jim.vmware.draw.shape.Shape;
import jim.vmware.draw.shape.ShapeAgent;

public class DrawService {
    private ShapeAgent shapeProxy;
    
    private static final DrawService drawService = new DrawService(new ShapeAgent());
    
    private DrawService() {};
    
    public static DrawService getService() {
        return drawService;
    }
    
    public DrawService(ShapeAgent shapeProxy) {
        super();
        this.shapeProxy = shapeProxy;
    }

    public void drawShape(Shape shape) {
        shapeProxy.setShape(shape);
        shapeProxy.draw();
    }

}
