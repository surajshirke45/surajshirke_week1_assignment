package Week2_Assignments;

class task3 {
    double length;
    double breadth;

    task3() {
        length = 1.0;
        breadth = 1.0;
    }

    task3(double l, double b) {
        length = l;
        breadth = b;
    }

    double area() {
        return length * breadth;
    }

    double area(double l, double b) {
        return l * b;
    }

    public static void main(String[] args) {
        task3 rect1 = new task3();
        System.out.println("Area of rect1: " + rect1.area());

        task3 rect2 = new task3(5.0, 3.0);
        System.out.println("Area of rect2: " + rect2.area());

        System.out.println("Area of a fig with custom dimensions: " + rect2.area(4.0, 2.5));
    }
}
