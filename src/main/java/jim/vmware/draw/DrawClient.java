package jim.vmware.draw;

import jim.vmware.draw.service.DrawService;
import jim.vmware.draw.shape.Circle;
import jim.vmware.draw.shape.Square;

public class DrawClient 
{
    public static void main( String[] args )
    {
        DrawService.getService().drawShape(new Circle("c1"));
        DrawService.getService().drawShape(new Square("s2"));
    }
}
