package entities;

public class Retangle {

        public double width;
        public double height;

        public double area(){
            return width * height;

        }

        public Double perimeter(){
            return 2 * (width + height);


        }

        public Double Diagonal(){
            return Math.sqrt(width * width + height * height);

        }
}
