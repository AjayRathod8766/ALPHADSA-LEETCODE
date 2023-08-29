public class Oops {
    static String emp_name ;
    static float emp_salary;

    static void set(String n,float p){
        emp_name = n;
        emp_salary = p;
    }
    static void get(){
        System.out.println("employee name "+emp_name);
        System.out.println("employee salary "+emp_salary);
    }


    public static void main(String[] args) {
        Oops.set("Avinash",10000.0f);
        Oops.get();
    }
}
