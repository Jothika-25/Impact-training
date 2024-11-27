package Java_Practices;

class Employee{
	 
void login(String name) {
System.out.println("Employee name(overloading) - " + name);
}
 
void login() {
System.out.println("Employee Logged In");
}
}
 
class Hr extends Employee {
@Override
void login() {
System.out.println("Hr logged In");
}
}
 
class Manager extends Employee {
@Override
void login() {
System.out.println("Manager LoggedIn");
}
}
 
public class polymorphism {
public static void main(String[] args) {
Employee employee;
String parameter = "Jothika";
Employee employee1 = new Employee();
employee1.login(parameter);
employee = new Hr();
employee.login();
 
employee = new Manager();
employee.login();
}
}
