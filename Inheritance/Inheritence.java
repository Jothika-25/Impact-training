package Inheritance;

class Employee{
	
	private String name;
	private int id;
	private double salary;
	
	public Employee() {
		
	}
	public Employee(int id,String name,double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public double getSalary(){
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void introduce() {
		System.out.println("Id "+id+" Name "+name+" Salary "+salary);
	}
	
}

//single

class Manager extends Employee{
	private String department;

	public Manager(int id, String name, double Salary, String department) {
		super(id,name,Salary);
		this.department = department;
	}
	public Manager() {
	
	}
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department=department;
	}
	@Override
	public void introduce() {
		super.introduce();
		System.out.println("Department: "+department);
	}
}


//multiLeveL

class SeniorManager extends Manager{
	private int teamSize;
	
	public SeniorManager(int id, String name, double Salary, String department,int teamSize) {
		super(id,name,Salary,department);
		this.teamSize = teamSize;
	}
	public int getTeamSize() {
		return teamSize;
	}
	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	@Override
	public void introduce() {
		super.introduce();
		System.out.println("TeamSize: "+teamSize);
	}
}

// Hierarchical 

class Developer extends Employee{
private String Language;
	
	public Developer(int id, String name, double Salary, String Language) {
		super(id,name,Salary);
		this.Language = Language;
	}
	public String getLanguage() {
		return Language;
	}
	public void setLanguage(String Language) {
		this.Language = Language;
	}
	@Override
	public void introduce() {
		super.introduce();
		System.out.println("programming Language: "+Language);
	}
	
}

//hybrid 

class TechLead extends Developer{
	private int projects;
	
	public TechLead(int id, String name, double Salary, String Language,int projects) {
		super(id,name,Salary,Language);
		this.projects = projects;
	}
	public int getProjects() {
		return projects;
	}
	public void setProject(int projects) {
		this.projects = projects;
	}
	@Override
	public void introduce() {
		super.introduce();
		System.out.println("Projects: "+projects);
	}
	
}


public class Inheritence {

	public static void main(String[] args) {
		
        //single
		
		Manager manager = new Manager();
		manager.setId(1);
		manager.setName("Lk");
		manager.setSalary(90000);
		manager.setDepartment("Lk");
		manager.introduce();
		
//		System.out.println(manager.getName());
		System.out.println();
		
		//mutliLevel
		SeniorManager seniorManager = new SeniorManager(2,"Jo",100000,"IT",10);
		seniorManager.introduce();
		System.out.println();
		
		
		//Hierarchical
		Developer developer = new Developer(3,"Jothika",75000,"Java");
		developer.introduce();
		System.out.println();
		
		
		//Hybrid
		TechLead TL = new TechLead(4,"Kavitha",100000,"Java",10);
		TL.introduce();
		System.out.println();
		
	}

}
