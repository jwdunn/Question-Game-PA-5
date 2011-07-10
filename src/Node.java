//unimportant node class that i started with but im leaving in the package just in case i need it in the future.



public class Node {
	
	private String Question;   
    private String Guess; 

   public Node(String Q, String G){
	   Question = Q;
	   Guess= G;
   }

   public String getQuestion(){
	   return Question;
   }
   public String getGuess(){
	   return Guess;
   }
   public void addQuestion(String Q){
	   Question = Q;
   } 
   public void addGuess(String G){
	   Guess=G;
   }
}