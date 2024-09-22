class rect {
        private int length;
        private int breadth;

        // Parameterized Constructor declaration
        public rect(){
            this.length = 4;
            this.breadth = 5;
        }

        public int getLength(){
            return length;
        }

        public int getBreadth(){
            return breadth;
        }
    }

public class Rectangle {
    public static void main(String[] args) {
        rect r = new rect();
        System.out.println("Length of the rectangle is: "+r.getBreadth());
        System.out.println("Breadth of the rectangle is: "+r.getLength());
    }
}
