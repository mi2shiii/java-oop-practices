package polymorphism;

public class Square extends Rectangle {

    public Square(){
        super();
    }

    public Square(double side){
        super(side, side);
    }

    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    public void setSide(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    public double getSide(){
        return super.getWidth();
    }

    public void setWith(double side){
        super.setWidth(side);
    }

    public void setLength(double side){
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square[Rectangle{" + "[Shape color:"+ super.getColor() + ", filled:" + super.isFilled() + "]"+
                ", width=" + super.getWidth() +
                ", length=" + super.getLength() + "}"
                + "side=" + getSide()
                +"]";
    }
}
