package SolutionDSA;

public class Lenght_of_last_word {
     public int lengthOfLastWord(String s) {
   
        int length = 0;
        int n = s.length() - 1;

        while(n>=0 && s.charAt(n) == ' '){
               n--;
            } 
        while(n>=0 && s.charAt(n) != ' '){
            length++;
            n--;
        }

           return length; 


        
    }

}
