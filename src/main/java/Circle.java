public class Circle{
    protected double radius;
    public Circle(double radius){
    this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double diameter(){
        return 2*this.radius;
    }
    
    public double perimeter(){
        return 2*this.radius*Math.PI;
    }

    public double area(){
        return this.radius*this.radius*Math.PI;
    }

    
}