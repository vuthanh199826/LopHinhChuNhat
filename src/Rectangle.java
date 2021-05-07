public class Rectangle {
    double width, height;
    Rectangle(){
        width = 1;
        height =1;
    }
    Rectangle(double newWidth,double newHeight){
        width = newWidth;
        height = newHeight;
    }
    double getArea(){
        return this.width*this.height;
    }
    double getPerimeter(){
        return this.width+this.height;
    }

    public static void main(String[] args) {
        Rectangle obj1 = new Rectangle(2,2);
        System.out.println(obj1.width);
        System.out.println(obj1.getArea());
        System.out.println(obj1.getPerimeter());
    }
}
