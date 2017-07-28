/**
 * Test CODPersonnel Class
 * 
 * @author Ali Bayati
 * @version 7/16/2017
 *
 */
public class TestCod {

	public static void main(String[] args) {
		Course curs1= new Course(123, "Java2571", "CIS");
		Course curs2= new Course(211, "C++2542", "CIT");
		Course curs3= new Course(211, "Python", "CIT");
		Course curs4= new Course(211, ".NET", "CIT");
		Address stud1Addr = new Address("11 nathan", "Chicago", "IL", "60625");
		Address stud2Addr = new Address("55 torinto", "sky", "IL", "60555");
		
		Address emp1Addr= new Address("555 washtinao", "glendale heights", "IL", "60139");
		Address emp2Addr= new Address ("213 chicago st","skokie","IL","60076");
		Address emp3Addr= new Address ("16 alkindi","baghadad","IL","00964");
		Student stud1 = new Student(991, "Ali Bayati", stud1Addr,curs1);
		Student stud2 = new Student(993, "hasan imam", stud2Addr, curs1);
		Student stud3 = new Student(993, "tofy", stud2Addr, curs1);
		PayInfo payemp1 = new PayInfo(200.3, true);
		PayInfo payemp2 = new PayInfo(1000.55,false);
		PayInfo payemp3 = new PayInfo(333.44,true);
		Employee emp1 = new Employee("Safaa Bayati", emp1Addr, payemp1);
		Employee emp2 = new Employee("Rohel",emp2Addr, payemp2);
		Employee emp3 = new Employee("Badri",emp3Addr, payemp3);
		CODPersonnel codp= new CODPersonnel(emp1, stud1);
		
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
						
		
		
		codp.addEmployee(emp2);
		codp.addEmployee(emp3);
		codp.addStudent(stud2);
		codp.addStudent(stud3);
		for (int i=0;i<codp.getEmployees().size();i++){
		sb1.append("Employee "+(i+1)+" name: "+codp.getEmployees().get(i).getName()+"\n");
		sb1.append("Employee address: "+codp.getEmployees().get(i).getAddress().getStreetAddress());
		sb1.append("\nEmployee full time: "+codp.getEmployees().get(i).getPay().getIsFullTime());
		sb1.append("\nEmployee course Section: "+codp.getStudents().get(i).getCourses().get(0).getSection());
		System.out.println(sb1);
		sb1 = new StringBuilder();
		sb2.append("\nStudent "+(i+1)+" name: "+codp.getStudents().get(i).getName());
		sb2.append("\nStudent address: "+codp.getStudents().get(i).getAddress().getStreetAddress());
		sb2.append("\nStudent employee salary: $"+codp.getEmployees().get(i).getPay().getSalary());
				
		for(int j=0;j<codp.getStudents().get(i).getCourses().size();j++){
		sb2.append("\nStudent course: "+codp.getStudents().get(i).getCourses().get(j).getName());
		}
		System.out.println(sb2+"\n");
		sb2=new StringBuilder();
		}
		
		System.out.println("Registering Classes for Student 1 :");
		System.out.println(" "+curs3.getName()+" "+curs2.getName()+" "+curs4.getName());
		
		stud1.registerCourse(curs3);
		stud1.registerCourse(curs2);
		stud1.registerCourse(curs4);
		
		sb2.append("\nStudent 1 name: "+codp.getStudents().get(0).getName());
		sb2.append("\nStudent address: "+codp.getStudents().get(0).getAddress().getStreetAddress());
		sb2.append("\nStudent employee salary: $"+codp.getEmployees().get(0).getPay().getSalary());
				
		for(int j=0;j<codp.getStudents().get(0).getCourses().size();j++){
		sb2.append("\nStudent course: "+codp.getStudents().get(0).getCourses().get(j).getName());
		}
		System.out.println(sb2+"\n");
		sb2=new StringBuilder();
		
		System.out.println("Droping Classes for Student 1 ");
		stud1.dropCourse(curs1);
		stud1.dropCourse(curs2);
		sb2.append("\nStudent 1 name: "+codp.getStudents().get(0).getName());
		sb2.append("\nStudent address: "+codp.getStudents().get(0).getAddress().getStreetAddress());
		sb2.append("\nStudent employee salary: $"+codp.getEmployees().get(0).getPay().getSalary());
				
		for(int j=0;j<codp.getStudents().get(0).getCourses().size();j++){
		sb2.append("\nStudent course: "+codp.getStudents().get(0).getCourses().get(j).getName());
		}
		System.out.println(sb2+"\n");
		sb2=new StringBuilder();
		
		System.out.println("Setting Student 1 to Student 3");
		codp.setStudents(stud3);
		sb2.append("\nStudent 1 name: "+codp.getStudents().get(0).getName());
		sb2.append("\nStudent address: "+codp.getStudents().get(0).getAddress().getStreetAddress());
		sb2.append("\nStudent employee salary: $"+codp.getEmployees().get(0).getPay().getSalary());
				
		for(int j=0;j<codp.getStudents().get(0).getCourses().size();j++){
		sb2.append("\nStudent course: "+codp.getStudents().get(0).getCourses().get(j).getName());
		}
		System.out.println(sb2+"\n");
		sb2=new StringBuilder();
	}
	
}
/*Output
 * Employee 1 name: Safaa Bayati
Employee address: 555 washtinao
Employee full time: true
Employee course Section: CIS

Student 1 name: Ali Bayati
Student address: 11 nathan
Student employee salary: $200.3
Student course: Java2571

Employee 2 name: Rohel
Employee address: 213 chicago st
Employee full time: false
Employee course Section: CIS

Student 2 name: hasan imam
Student address: 55 torinto
Student employee salary: $1000.55
Student course: Java2571

Employee 3 name: Badri
Employee address: 16 alkindi
Employee full time: true
Employee course Section: CIS

Student 3 name: tofy
Student address: 55 torinto
Student employee salary: $333.44
Student course: Java2571

Registering Classes for Student 1 

Student 1 name: Ali Bayati
Student address: 11 nathan
Student employee salary: $200.3
Student course: Java2571
Student course: Python
Student course: C++2542
Student course: .NET

Droping Classes for Student 1 

Student 1 name: Ali Bayati
Student address: 11 nathan
Student employee salary: $200.3
Student course: Python
Student course: .NET
Student course: Dropped class
Student course: Dropped class

Setting Student 1 to Student 3

Student 1 name: tofy
Student address: 55 torinto
Student employee salary: $200.3
Student course: Java2571

*/
