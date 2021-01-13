public class ShapeFactory {
    private ShapeFactory(){
    }
    public static Shape getShape(ShapeType shapeType){
        switch (shapeType){
            case CIRCLE:
                return new Circle();
            case SQUARE:
                return new Square();
            case RECTANGLE:
                return new Rectangle();
            default:
                throw new IllegalArgumentException("Not supported this shape");
        }
    }
}
