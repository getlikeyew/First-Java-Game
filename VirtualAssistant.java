import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class VirtualAssistant {

	public static void main(String[] args) throws FileNotFoundException {
		sayHello();
		Scanner tasks = new Scanner(System.in);
		executeTask(tasks);	
		Scanner report = new Scanner(new File("report.txt"));
		extract(report);
		Scanner feedback = new Scanner(System.in);
		goodJob(feedback);
		nextTask(tasks);
		report = new Scanner(new File("report1.txt")) ;
		extract(report);
		goodJob(feedback);
	}

	public static void sayHello() {
		System.out.println("Hello Gavin, wonderful weather we're having");
		System.out.println("What can I help you with today?");
	}

	public static void executeTask(Scanner tasks) {
		tasks.nextLine();
		System.out.println();
		System.out.println("Okay, what kind of report would you like to run?");
		String reportType = tasks.nextLine();
		System.out.println();
		System.out.println("No problem, would prefer the default format or");
		System.out.println("one of your custom styles for the " + reportType + " Report?");
		tasks.nextLine();
		System.out.println();
		System.out.println("Understood!");
		System.out.println("One moment please...");
		System.out.println();
	}
	
	public static void extract(Scanner report) {
		while(report.hasNextLine()) { 
			String row = report.nextLine();
			System.out.println(row);
		}	
	}
	
	public static void goodJob(Scanner feedback) {
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		int csat;
		do {
			System.out.println("On a scale of 1-10, how did I do?");
			while (!feedback.hasNextInt()) {
				System.out.println("That's not a number...");
				System.out.println("On a scale of 1-10, how did I do?");
				feedback.next();
			}	
			csat = feedback.nextInt();
		} while (csat <= 0);
		if (csat <= 4) {
			System.out.println("Aw jeez, I'm sorry.");
			System.out.println("How could I do better?");
			System.out.println("Would you like to try again?");
		} else if (csat <= 7) {
			System.out.println("That's good, I'm glad I could provide assistance.");
			System.out.println("Was there something else you needed?");	
		} else if (csat <= 10) {
			System.out.println("Awesome! I appreciate it.");
			System.out.println("What did I do well?");
		} else {
			System.out.println("That's a very generous score :)");
			System.out.println();
		}			
	}
	
	public static void nextTask(Scanner tasks) {
		System.out.println();
		System.out.println();
		System.out.println("Is there any other task you need help with today m'lord?");
		tasks.nextLine();
		System.out.println("Okay, what kind of report would you like to run?");
		String reportType = tasks.nextLine();
		System.out.println();
		System.out.println("No problem, would prefer the default format or");
		System.out.println("one of your custom styles for the " + reportType + " Report?");
		tasks.nextLine();
		System.out.println();
		System.out.println("Understood!");
		System.out.println("One moment please...");
		System.out.println();
	}
	
}

