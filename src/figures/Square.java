package figures;

public class Square {
    private double length;

    public Square(){
    }

    public Square(double length){
        this.length = length;
    }

    public void drawSquare(){
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    // getter y setter
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}


