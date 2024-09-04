package Week2_Assignments;

class task1 {
    String name;
    int age;


    public task1(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
       
        task1 task = new task1("Suraj", 25);
        task.display();
    }
}
