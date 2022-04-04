package painter;

import edu.macalester.graphics.GraphicsGroup;
import edu.macalester.graphics.Point;
import edu.macalester.graphics.Rectangle;

public class NormalBrush implements Brush{
    public void apply(Point location, GraphicsGroup paintLayer, BrushOptions brushOptions) {
        double height = brushOptions.getRadius() * 2;
        double width = brushOptions.getRadius() * 2;
        Rectangle stroke = new Rectangle(0, 0, width, height);
        stroke.setStrokeColor(brushOptions.getColor());
        stroke.setFillColor(brushOptions.getColor());
        stroke.setCenter(location);
        paintLayer.add(stroke);
    }
    public String getName() {
        return "Normal Brush";
    }
}
