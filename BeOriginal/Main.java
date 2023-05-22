package BeOriginal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    System.out.println("Enter your character name:");
	    String titlePitch = in.nextLine();
	    System.out.println("Enter your character powers:");
	    String powers = in.nextLine(); 
	    System.out.println("write a few keywords about your character:");
	    String about = in.nextLine(); 
	    int result = find(titlePitch, powers, about);
	    System.out.println("Originality score: " + result + " out of 15");
	}
	 public static int find(String titlePitch, String powers, String about) {
		    int similarName = 0;
		    int countName = 0;
		    int similarPowers = 0;
		    int countPowers = 0;
		    int similarKeyWords = 0;
		    int countKeyWords = 0;
		    
		    String[] CharName = {
		      "batman",
		      "superman",
		      "wonder",
		      "woman",
		      "iron",
		      "man",
		      "hulk",
		      "thor",
		      "wasp",
		      "captain",
		      "america",
		      "spawn",
		      "shazam",
		      "miss",
		      "king",
		      "queen",
		      "guardian"
		    };
		    
		    String[] CharPowers = {
		      "flight",
		      "strength",
		      "gadgets",
		      "wings",
		      "speed",
		      "swimming",
		      "telepathy",
		      "shrinking",
		      "growing",
		      "armor",
		      "rockets",
		      "animals",
		      "fire",
		      "water",
		      "amphibian",
		      "magic",
		      "construction"
		    };
		    
		    String[] keyWords = {
		       "survivor",
		       "trauma",
		       "warrior",
		       "nuclear",
		       "orphan",
		       "alien",
		       "mermaid",
		       "robot",
		       "immortal",
		       "weird",
		       "freak"
		    };
		    
		    String[] nameWords = titlePitch.toLowerCase().split("\\s+");
		    
		    for (String word : nameWords) {
		      for (String charName : CharName) {
		        if (charName.equalsIgnoreCase(word)) {
		          similarName += 3;
		          countName++;
		          break;
		        }
		      }
		    }
		    
		    String[] powerList = powers.toLowerCase().split("\\s*\\+\\s*");
		    
		    for (String power : powerList) {
		      for (String charPower : CharPowers) {
		        if (charPower.equalsIgnoreCase(power)) {
		          similarPowers += 4;
		          countPowers++;
		          break;
		        }
		      }
		    }
		    
		    String[] KeyList = about.toLowerCase().split("\\s*\\+\\s*");
		    
		    for (String aboutItem : KeyList) {
		    	  for (String keyItem : keyWords) {
		    	    if (keyItem.equalsIgnoreCase(aboutItem)) {
		    	      similarKeyWords += 2;
		    	      countKeyWords++;
		    	      break;
		    	    }
		    	  }
		    	}
		    
		    int finalcalculate = similarName + similarPowers + similarKeyWords;
		    boolean original = false;
		    if(finalcalculate < 15) {
		    	original = true;
		    }
		    
		    if(original) {
		    	System.out.println("Great job with thinking outside the box");
		    } else {
		    	System.out.println("you can do better");
		    }
			return finalcalculate;
		  }
}
