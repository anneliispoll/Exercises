package OOP.geometry;

public class Square extends Rectangular{

    protected float side;

    public Square(float side) {
        super(side, side);
        this.side = side;
    }

    public float getSide(){
        return side;
    }
}

