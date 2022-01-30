package SolidPrinciples;

public class Cube implements ShapeInterface,ThreeDimnesionalShapeInterface{
float side;
        Cube(float side)
        {
            this.side=side;
        }
    @Override
    public float area() {
        return 6*side*side;
    }

    @Override
    public float volume() {
        return side*side*side;
    }
}
