// Dart Program to show
// Static methods in Dart
class Employee {
  static var emp_dept;
  var emp_name;
  int emp_salary = 0;

// Function to show details
// of the Employee
  showDetails() {
    print("Name of the Employee is: ${emp_name}");
    print("Salary of the Employee is: ${emp_salary}");
    print("Dept. of the Employee is: ${emp_dept}");
  }
}

// Main function
void main() {
  Employee e1 = new Employee();
  Employee e2 = new Employee();
  Employee.emp_dept = "MIS";

  print("GeeksforGeeks Dart static Keyword Example");
  e1.emp_name = 'Rahul';
  e1.emp_salary = 50000;
  e1.showDetails();

  e2.emp_name = 'Tina';
  e2.emp_salary = 55000;
  e2.showDetails();
}
