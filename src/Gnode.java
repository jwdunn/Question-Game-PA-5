/** Jared Dunn
 * PA5 Java
 * Question Game
 * Jbs2011
 * 
 * here is my Gnode Class it has two constructors one is Gnode(String question, String Guess) 
 * the other is Gnode(String question, String Gues String Guess)
 * 
 * Methods
 * addFlase(gnode) 
 * addTrue(gnode) 
 * getFalse() 
 * getTrue() 
 * addQuestion(String) 
 * addGuess(String) 
 * getQuestion() 
 * getGuess(0)
 */
public class Gnode{

 private String Question;   
 private String Guess;
 private Gnode True;
 private Gnode False;  

 public Gnode(String Q, String g){
	 Question = Q;
	 Guess = g;
    }
 
 public Gnode( String Q, String gl, String gr){  
	  Question = Q;
	  Guess = null;
      True =new Gnode(null, gl);
      False = new Gnode(null,gr);   
   }
 
   public void addFalse(Gnode F){
	   False = F;
   }
   public void addTrue(Gnode T){
	   True = T;
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
   public Gnode getTrue(){
	   return True;
   }
   public Gnode getFalse(){
	   return False;
   }
}
  

 /*   public String getQuestion(){
	   return Question;
   }
   public String getGuess(){
	   return getGuess();
   }  
*/ 