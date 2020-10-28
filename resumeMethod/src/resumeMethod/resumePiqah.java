package resumeMethod;
import java.util.*;
public class resumePiqah {

	public static void main(String[] args) {
		Scanner in =  new Scanner (System.in);
		
		name();
		age();
		birthday();
		gender();
		number();
		marital();
		citizen();
		address();
		result();
		cgpa();
		work();
		language();
		skill();
		award();
		
	}
	
	public static void name() {
		Scanner in =  new Scanner (System.in);
		
		System.out.print("Enter your name: ");
		String name = in.next();
		System.out.println("Your name is " + name);
		System.out.println();
		
	}
	
	public static void age() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter your age: ");
		int age = in.nextInt();
		System.out.println("Your age is " + age);
		System.out.println();

	}
	
	public static void gender() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter your gender: ");
		char gender = in.next().charAt(0);
		System.out.println("Your gender is " + gender);
		System.out.println();
	}
	
	public static void birthday() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter your birthday: ");
		String birthday = in.nextLine();
		System.out.println("Your birthday is on " + birthday);
		System.out.println();
	}

	public static void marital() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter your marital status: ");
		String status = in.next();
		System.out.println("Your marital status is " + status);
		System.out.println();
	}
	
	public static void citizen() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter your citizenship: ");
		String citizen = in.next();
		System.out.println("Your citizenship is " + citizen);
		System.out.println();
	}
	
	public static void address() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter your address: ");
		String address = in.nextLine();
		System.out.println("Your address is " + address);
		System.out.println();
	}
	
	public static void number() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter your phone number: ");
		String no = in.next();
		System.out.println("Your phone number is " + no);
		System.out.println();
	}
	
	public static void result() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter your exam grade for STIA1113: ");
		char grade = in.next().charAt(1);
		System.out.println("Your grade is " + grade);
		System.out.println();
	}
	
	public static void cgpa() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter your GPA for semester 1: ");
		double gpa1 = in.nextDouble();
		System.out.print("Enter your GPA for semester 2: ");
		double gpa2 = in.nextDouble();
		
		double sum = gpa1 + gpa2;
		double cgpa = sum/2;
		System.out.println("CGPA for current semester is " + cgpa);
		System.out.println();
		
	}
	
	public static void work() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter your work experience: ");
		String exp = in.nextLine();
		System.out.println("Your work experience is " + exp);
		System.out.println();
	}
	
	public static void language() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter your first language: ");
		String lang1 = in.nextLine();
		System.out.print("Enter your second language: ");
		String lang2 = in.nextLine();
		
		System.out.println("Your languages are " + lang1 + "and " + lang2);
		System.out.println();
	}
	
	public static void skill() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter your professional skill: ");
		String skill1 = in.nextLine();
		System.out.print("Enter your other professional skill: ");
		String skill2 = in.nextLine();
		
		System.out.println("Your professional skills are " + skill1 + "and " + skill2);
		System.out.println();
	}
	
	public static void award() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter your award and certificate: ");
		String award = in.nextLine();
		System.out.println("Your award and certificate is " + award);
	}
}
