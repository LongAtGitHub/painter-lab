package painter;

import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.GraphicsObject;
import edu.macalester.graphics.Point;

public class SprayPaint implements Brush {
    public void apply(Point location, CanvasWindow canvas, BrushOptions brushOptions) {
        GraphicsObject dot = PaintUtils.createFuzzyDot(
            location,
            brushOptions.getColor(),
            brushOptions.getRadius(),
            0.2f);
        dot.setCenter(location);
        canvas.add(dot);
    }
}
