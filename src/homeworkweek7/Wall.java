package homeworkweek7;


public class Wall {
    double width;
    double height;

    //no parameters
    public Wall() {


    }

    public Wall(double w, double h) {

        if (w <= 0) {
            width = 0;
        } else {
            width = w;
        }
        if (h <= 0) {
            height = 0;
        } else {
            height = h;
        }
    }

    //with return no parameter
    public double getWidth() {
        return width;
    }

    //with return type no parameter
    public double getHeight() {
        return height;

    }

    // set the value of the width
    public void setWidth(double w1) {
        if (w1 <= 0) {
            width = 0;
        } else {
            width = w1;
        }
    }

    //set the value of height
    public void setHeight(double h1) {
        if (h1 <= 0) {
            height = 0;

        } else {
            height = h1;
        }

    }
         //get the area of wall
    public double getArea() {
        return height * width;
    }

    public static void main(String[] args) {

        Wall wall = new Wall(5, 4);
        System.out.println("area = " + wall.getArea());
        wall.setWidth(5);
        System.out.println("width= " + wall.getWidth());
        wall.setHeight(-1.5);
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());

    }
}


