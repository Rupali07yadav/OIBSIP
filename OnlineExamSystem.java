import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;



public class OnlineExamSystem {
	private static Timer timer;
	private static int timeRemains;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int score=0;
		timeRemains=60;
		
		//Start timer
		timer =new Timer();
		timer.schedule(new TimerTask() {
			
		
		public void run() {
			timeRemains--;
			if(timeRemains==0) {
				System.out.println("Time is up !!");
				displayResults(score);
				timer.cancel();
				System.exit(0);
			}
		}

},1000, 1000);
		
             //Question 1
		      System.out.println("Who is the inventor of java ?");
		      System.out.println("A. James Gosling");
		      System.out.println("B. Dennis Ritchie");
		      System.out.println("C. Bjarne Stroustrup");
		      System.out.println("D. None of the above");
		      String answer1 =sc.nextLine().toUpperCase();
		      if(answer1.equals("A")) {
			  score++;
		      }
		

	            //Question 2
			    System.out.println("What does JRE stand for ?");
				System.out.println("A. Java Runtime Execution");
				System.out.println("B. Java Runtime Environment");
				System.out.println("C. Java Run Execution");
				System.out.println("D. None of the above");
				String answer2 =sc.nextLine().toUpperCase();
				if(answer1.equals("B")) {
					score++;
				}
				
				
				//Question 3
				System.out.println("Which of the following command is used to compile java code ?");
				System.out.println("A. javac file_Name.java");
				System.out.println("B. javac file_Name");
				System.out.println("C. java file_Name");
				System.out.println("D. java file_Name.java");
				String answer3 =sc.nextLine().toUpperCase();
				if(answer1.equals("A")) {
					score++;
				}
				
				//Question 4
				System.out.println("Why is the java main() method public ?");
				System.out.println("A. Because JVM calls the main() outside the class.");
				System.out.println("B. JVM calls the main() method without creating an instance of a class.");
				System.out.println("C. If you want to pass arguments through the command line.");
				System.out.println("D. None of the above.");
				String answer4 =sc.nextLine().toUpperCase();
				if(answer1.equals("A")) {
					score++;
				}
				

				//Question 5
				System.out.println("Who is responsible for executing java programs line by line ?");
				System.out.println("A. JDK");
				System.out.println("B. JRE");
				System.out.println("C. JVM");
				System.out.println("D. None of the above");
				String answer5 =sc.nextLine().toUpperCase();
				if(answer1.equals("C")) {
					score++;
				}	
				
				//stop timer
				timer.cancel();
				
				//display result
				displayResults(score);

	}
	private static void displayResults(int score) {
		System.out.println("Your score is "+score);
		System.out.println("Time Remaining :22 seconds");
	}
}
				

