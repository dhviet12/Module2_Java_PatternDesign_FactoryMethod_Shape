public class TestShape {
    public static void main(String[] args) {
        Shape shape = ShapeFactory.getShape(ShapeType.CIRCLE);
        shape.draw();
        Shape shape1 = ShapeFactory.getShape(ShapeType.RECTANGLE);
        shape1.draw();
        Shape shape2 = ShapeFactory.getShape(ShapeType.SQUARE);
        shape2.draw();
    }
}
