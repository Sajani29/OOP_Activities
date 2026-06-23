class Cat{
private String name;
}
class Demo{
public static void main(String args[]){
Cat cat; //Line 1
Cat[] cats; //Line 2
cat=new Cat[5]; //Line 3
cat=new Cat(); //Line 4
cats=new Cat(); //Line 5
//Institute of Computer Engineering Technology
//Page 19 of 31
cats=new Cat[5]; //Line 6
}
}

/*class Box{
int length;
int width;
int height;
static{
System.out.println("Box is loaded into memory");
}
{
System.out.println("A box object is created..");
}
}
class Demo{
public static void main(String args[]){
Box b1=new Box();
Box b2=new Box();
Box b3=new Box();
}
}


/*class Cylinder{
	private double length;
	private double radius;
	
	public double calculateVolume(){
		double volume = 3.14*(radius*radius)*length;
		return volume;
	}
	public double calculateArea(){
		double area = (2*3.14*radius*length) + (2*3.14*radius*radius);
		return area;
	}
	
	public Cylinder(){
		
	}
	public Cylinder(double length, double radius){
		setLength(length);
		setRadius(radius);
	}
	
	public void setLength(double length){
		this.length = length;
	}
	
	public void setRadius(double radius){
		this.radius = radius;
	}
	public double getLength(){
		return this.length;
	}
	public double getRadius(){
		return this.radius;
	}
}
class Demo{
	public static void main(String args[]){
	Cylinder c1=new Cylinder(10,20);
	System.out.println("The Volumn of the Cylinder : "+c1.calculateVolume());
	System.out.println("The Area of the Cylinder : "+c1.calculateArea());
	
	
	}
}

/*import java.util.*;
class Rectangle{
	private int length = 1;
	private int width = 1;
	
	
	public void calculateArea(){
		int area = length * width;
		System.out.println("Area of the rectangle: "+area);
	}
	public void calculatePerimeter(){
		int perimeter = 2*(length + width);
		System.out.println("Perimeter of the rectangle: "+perimeter);
	}
	public boolean validateLength(int length){
		if (length >0.0 && length <20.0)
		{
			return true;
		}
		return false;
	}
	public boolean validateWidth(int width){
		if (width>0.0 && width<20.0)
		{
			return true;
		}
		return false;
	}
	
	public void setLength(int length){
		if (validateLength(length))
		{
			this.length = length;
		}else
		{
			System.out.println("Invalid length value .. try again...");
		}
	}
	public void setWidth(int width){
		if(validateWidth(width))
		{
			this.width = width;
		}else
		{
			System.out.println("Invalid width value .. try again...");
		}
	}
}
 
class Demo{
	public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	Rectangle r1=new Rectangle();
	System.out.print("Enter value for rectangle length: ");
	int inputLength = input.nextInt();
	System.out.print("Enter value for rectangle width: ");
	int inputWidth = input.nextInt();
	r1.setLength(inputLength);
	r1.setWidth(inputWidth);
	r1.calculatePerimeter();
	r1.calculateArea();

	}
}

/*class Date{
	private int year=1970;
	private int month=1;
	private int day=1;
	
	public  void printDate(){
		System.out.println(this.year+"-"+this.month+"-"+this.day);
	}
	
	public void setYear(int year){
		this.year = year;
	}
	public void setMonth(int month){
		this.month = month;
	}
	
	public void setDay(int day){
		this.day = day;
	}
	
	public int getYear(){
		return this.year;
	}
	public int getMonth(){
		return this.month;
	}
	public int getDay(){
		return this.day;
	}
}
class Demo{
	public static void main(String args[]){
	Date d1=new Date();
	d1.printDate(); //1970-1-1
	//d1.year=2016; //Illegal
	//d1.month=5; //Illegal
	//d1.day=30; //Illegal
//year, month and day attributes cannot be accessed to another class
	d1.setYear(2016);
	d1.setMonth(5);
	d1.setDay(31);
	System.out.println("Year : "+d1.getYear());
	System.out.println("Month :"+d1.getMonth());
	System.out.println("Day : "+d1.getDay());
	}
}
/*import java.util.*;


class Student{
	String id;
	String name;
	int prfMarks;
	int dbmsMarks;
	
	Student(String id, String name, int prfMarks, int dbmsMarks){
		this.id = id;
		this.name = name;
		this.prfMarks = prfMarks;
		this.dbmsMarks = dbmsMarks;
	}
	
	public String toString(){
		return id+"\t"+name+"\t"+prfMarks+"\t"+dbmsMarks;		
	}
}
class Demo{
	public static Student[] student={
						new Student("s001","Sajani",23,45),
						new Student("s002","Nimal",13,45),
						new Student("s003","Siri",23,45)
		};
	
	
	public static void addStudent(){
		Scanner input=new Scanner(System.in);
		System.out.print("Input Student Id : ");
		String id=input.nextLine(); 
		System.out.print("Input Student Name : ");
		String name=input.nextLine();
		System.out.print("Input PRF  Marks : ");
		int prfMarks=input.nextInt();
		System.out.print("Input DBMS Marks : ");
		int dbmsMarks=input.nextInt();
		
		incrementArrrays();
		Student s1= new Student(id,name,prfMarks,dbmsMarks);
		student[student.length-1] = s1;
	}
	private static void incrementArrrays(){
		Student[] tempStudent = new Student[student.length+1];
		
		for(int i=0; i<student.length; i++){
			tempStudent[i]=student[i];			
		}
		student = tempStudent;
	}

	public static void printStudentsDetail(){
		System.out.println("ID\tName\tPRF\tDBMS");
		System.out.println("=========================");
		for (int i = 0; i <student.length; i++)
		{
			System.out.println(student[i].toString());
		}
		
	}
	
	public static void deleteStudents(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter student ID: ");
		String inputID = input.next();
		int output = searchID(inputID);
		if (output<0)
		{
			System.out.println("This ID is unavailable...");
		}else
		{
			for (int i = 0; i <student.length-1; i++)
			{
				
			}
			
		}
	}
	
	public static int searchID(String inputID){
		for (int i = 0; i <student.length; i++)
		{
			if (student[i].id.equalsIgnoreCase(inputID))
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String args[]){
		addStudent();
		addStudent();
		printStudentsDetail();
		deleteStudents();
	}	
}
*/


