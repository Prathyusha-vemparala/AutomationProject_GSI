package secondPackage;


abstract class User{
	private String name;
	private String email;
	private int userId;
	
	User(String name,String email,int userId){
		this.setName(name);
		this.setEmail(email);
		this.setUserId(userId);
	}
	public abstract void viewProfile();
	final void displayWelcome() {
		System.out.println("Welcome"+name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}	
}

class Student extends User implements ProgressTrackable {
	private  String enrolledCourse1;
	private  String enrolledCourse2;
	private int enrolledCourseCount = 0;
	
	public Student(String name,String email,int userId) {
		super(name, email, userId);
		this.enrolledCourse1=null;
		this.enrolledCourse2=null;
	}
	@Override
	public void viewProfile() {
		System.out.println(super.getName()+" "+super.getEmail()+" "+super.getUserId());
		System.out.println();
	}
	
	
	void enrollCourse(String courseName) {
		if(enrolledCourseCount< 2) {
			if(this.enrolledCourse1 == null) {
				this.enrolledCourse1=courseName;
				enrolledCourseCount++;
			}
			else if(this.enrolledCourse2 == null) {
				this.enrolledCourse2 =courseName;
				enrolledCourseCount++;
			}	
		}
		else {
			System.out.println("Maximum enrollement course count reached, we cannot enroll further");
		}
		
		}
	@Override
	public void trackProgress() {
		// TODO Auto-generated method stub	
		System.out.println("Progress made so far for "+enrolledCourse1+"is 50%");
	}
	public String getEnrolledCourse1() {
		return enrolledCourse1;
	}
	public void setEnrolledCourse1(String enrolledCourse1) {
		this.enrolledCourse1 = enrolledCourse1;
	}
	public String getEnrolledCourse2() {
		return enrolledCourse2;
	}
	public void setEnrolledCourse2(String enrolledCourse2) {
		this.enrolledCourse2 = enrolledCourse2;
	}
	
}
class Instructor extends User{
	 private String createdCourse1;
	 private String createdCourse2; 
	 private int coursesCreated = 0;

	Instructor(String name, String email, int userId) {
		super(name, email, userId);
		this.createdCourse1=null;
		this.createdCourse2=null;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void viewProfile() {
		System.out.println("Instructor name is "+super.getName());
		System.out.println("Instructor email is "+super.getEmail());
		System.out.println("Instructor userID is "+super.getUserId());
	}
	
	public void createCourse(String courseName) {
		if(coursesCreated<=2) {
			if(createdCourse1 == null) {
				this.createdCourse1=courseName;
				coursesCreated++;
			}
			else if(createdCourse2 == null) {
				this.createdCourse2=courseName;
				coursesCreated++;
			}
		}
		else {
			System.out.println("Cannot create courses as maximum limit reached");
		}
		
	}
		
}


class Admin extends User{

	Admin(String name, String email, int userId) {
		super(name, email, userId);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void viewProfile() {
		System.out.println("Admin name is "+super.getName());
		System.out.println("Admin email is "+super.getEmail());
		System.out.println("Admin userID is "+super.getUserId());
	}
	
	void removeUser(User user) {
		System.out.println("Removed user is " + user.getName());
	}
		
}

 interface ProgressTrackable {
	void trackProgress();
}

 
 
    class Course{
	private  String title;
	private  int durationInHours;
	final int maxStudents;
	
	public Course(String title,int durationInHours,int maxStudents){
		this.maxStudents = 0;
		this.title=title;
		this.durationInHours=durationInHours;
	}
	public Course(String title) {
		
		this.title=title;
		this.durationInHours=0;
		this.maxStudents=0;
	}
	public void showCourseDetails() {
		System.out.println("Title:"+title);
		System.out.println("Duration in hours:"+durationInHours);
		System.out.println("Max students:"+maxStudents);
	}
	public int getDurationInHours() {
		return durationInHours;
	}
	public void setDurationInHours(int durationInHours) {
		this.durationInHours = durationInHours;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}

public class Project2 {

	public static void main(String[] args) {
		System.out.println("EduSmart - A Mini Learning Management System"); 
        Student student1 = new Student("Prathyusha","prathyusha@gmail.com",01);
        Student student2 = new Student("Sita","sita@gmail.com",02);
        
        Instructor instructor1 = new Instructor("Rahul","rahul@gmail.com",11);
        Instructor instructor2 = new Instructor("Meghana","meghana@gmail.com",12);
        
        Admin admin1 = new Admin("Ayesha","ayesha@gmail.com",01);
        
        student1.displayWelcome();
        student2.displayWelcome();
        
        instructor1.displayWelcome();
        instructor2.displayWelcome();
        
        admin1.displayWelcome(); 
        
        instructor1.createCourse("Java");
        instructor1.createCourse("Javascript");
        instructor2.createCourse("C++");
        instructor2.createCourse("Selenium");
        instructor2.createCourse("Python");
        
        instructor1.viewProfile();
        instructor2.viewProfile();
        
        student1.enrollCourse("Java");
        student1.enrollCourse("C++");
        student2.enrollCourse("Java");
        student2.enrollCourse("Selenium");
        student2.enrollCourse("Python");
        
        student1.viewProfile();
        student2.viewProfile();
        admin1.viewProfile();
        
        student1.trackProgress();
        student2.trackProgress();
        
        admin1.removeUser(student2);
        
        Course course1 =new Course("Java", 14, 4);
        course1.showCourseDetails();
        Course course2 = new Course("Python", 7, 2);
        course2.showCourseDetails();
		
	}

}
