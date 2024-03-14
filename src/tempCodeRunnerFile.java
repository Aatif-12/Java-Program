// public class cae1 {

//     static String Employee_name;
//     static float Employee_salary;

//     public static void set(String n, float p) {
//         Employee_name = n;
//         Employee_salary = p;
//     }

//     public static void get() {
//         System.out.println("Employee Name : " + Employee_name);
//         System.out.println("Employee Salary : " + Employee_salary);
//     }

//     public static void main(String[] args) {
//         cae1.set("Avinash", 1000.0f);
//         cae1.get();
//     }
// }

public class tempCodeRunnerFile {

    private String make;
    private String model;
    private int year;

    // Constructor
    public tempCodeRunnerFile(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public static void main(String[] args) {
        tempCodeRunnerFile mycar = new tempCodeRunnerFile("BMW", "Camry", 2023);
        System.out.println("Make : " + mycar.getMake());
        System.out.println("Model : " + mycar.getModel());
        System.out.println("year : " + mycar.getYear());
    }
}
