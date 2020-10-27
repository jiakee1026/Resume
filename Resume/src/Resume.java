import java.util.*;
public class Resume {

	public static void main(String[] args) {
	 Scanner input = new Scanner(System .in);
	 
	 printName();
	 printGender();
	 printBirthday();
	 printAge();
	 printStatus();
	 printCitizenship();
	 printHome();
	 printHp();
	 printExam();
	 printCgpa();
	 printWork();
	 printLanguage();
	 printSkill();
	}
	
	public static void printName() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your name : ");
		String name = input.nextLine();
		System.out.println("Name :" + name);
	}
	
	public static void printGender() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your gender : ");
		String str = input.next();
		char gender = str.charAt(0);
		System.out.println("Gender : " + gender);
	}
	
	public static void printBirthday() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your birthday : ");
		String birthday = input.nextLine();
		System.out.println("Birthday : " + birthday);
	}
	
	public static void printAge() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your age : ");
		int age = input.nextInt();
		System.out.println("Age : " + age + " years old");
	}
	
	public static void printStatus() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your status : ");
		String status = input.next();
		System.out.println("Marital status : " + status);
	}
	
	public static void printCitizenship() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your citizenship : ");
		String citizenship = input.next();
		System.out.println("Citizenship : " + citizenship);
	}
	
	public static void printHome() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your home address : ");
		String home = input.nextLine();
		System.out.println("Home address : " + home);
	}
	
	public static void printHp() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your No. H/P : ");
		String hp = input.next();
		System.out.println("H/P : " + hp);
	}
	
	public static void printExam() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your exam : ");
		String exam = input.next();
		System.out.println("Exam : " + exam);
	}
	
	public static void printCgpa() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your CGPA : ");
		double cgpa = input.nextDouble();
		System.out.println("CGPA : " + cgpa);
	}
	
	public static void printWork() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your work experience 1 : ");
		String work1 = input.next();
		System.out.print("Enter your work experience 2 : ");
		String work2 = input.next();
		System.out.println("Work Experience : 1)" + work1 + "\n\t\t\s\s2)" + work2);
	}
	
	public static void printLanguage() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your language : ");
		String language = input.next();
		System.out.println("Language : " + language);
	}
	
	public static void printSkill() {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter your Professional Skill : ");
		String skill = input.nextLine();
		System.out.println("Professional skill : " + skill);
	}
}
