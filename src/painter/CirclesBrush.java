package painter;

import edu.macalester.graphics.Ellipse;
import edu.macalester.graphics.GraphicsGroup;
import edu.macalester.graphics.Point;

public class CirclesBrush implements Brush {
    public void apply(Point location, GraphicsGroup paintLayer, BrushOptions brushOptions) {
        int radius = brushOptions.getRadius();
        Ellipse circle = new Ellipse(0, 0, radius * 2, radius * 2);
        circle.setStrokeColor(brushOptions.getColor());
        circle.setStrokeWidth(0.2);
        circle.setCenter(location);
        paintLayer.add(circle);
    }
    public String getName() {
        return "Circles Brush";
    }
}