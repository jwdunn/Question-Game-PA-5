import java.util.Scanner;

/**
 * Jared Dunn
 * PA5
 * Question Game
 * Client program
 * this program makes nodes "gnode" and calls build tree recursivly inorder to add the users guess to the database
 * the more you play the larger the database becomes this is just the java version.
 * 
 *
 */
public class Client {

	//Main method. uses a while loop to keep looping through 
	 public static void main(String[] argggs){
		 Scanner input = new Scanner(System.in);
		 String swtch = "yes";
		 System.out.println("welcome to my question game");
		 Gnode first = new Gnode("can it swim?", "Dog" , "Pig");
		 while(!swtch.equals("quit")){	
		 buildTree(input, first);
		 System.out.println("If you would like to play again press andy key and then enter. otherwise type quit");
		 swtch = input.nextLine();
		 }
		 	  
	  }
	// this is a recursive algorithm that chooses where in the tree to go.
	 
		public static void buildTree(Scanner input, Gnode gn) {
			
			if(gn.getQuestion() != null) {
				System.out.println(gn.getQuestion());	
				String Input = input.nextLine();
				if (Input.toLowerCase().equals("yes")){
					buildTree(input, gn.getTrue());
				}
				else
					buildTree(input, gn.getFalse());		
				} 
			else if(gn.getQuestion() == null) {
				System.out.println("Is it a " + gn.getGuess() + "?");
				String Input = input.nextLine();
				if(Input.toLowerCase().equals("yes")) {
				} 
				else {
					System.out.println("IDEFK! what is your animal?");
					String userGuess = input.nextLine();
					System.out.println("What is a question that you would answer yes to " + userGuess + ", but no to " + gn.getGuess() + "?");
					String newQuestion = input.nextLine();
					Gnode r = new Gnode(newQuestion, userGuess, gn.getGuess());	
					System.out.println("Your animal, " + userGuess + ", has been added to the database.");	
	
				//	System.out.println(r.False.getGuess());	 
				//	System.out.println(userGuess);
				//	System.out.println(gn.getQuestion());
			        gn.addQuestion(newQuestion);
				 // System.out.println(gn.getQuestion());
			        gn.addTrue(new Gnode(null, userGuess));
				    gn.addFalse(new Gnode(null,gn.getGuess()));
				    gn.addQuestion(newQuestion);
				}
			}
	}
	}

