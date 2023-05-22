package BeOriginal;
import java.util.Scanner;
public class Find {
	public Find() {
		originality();
	}
	
	public static int originality(){
		Scanner in = new Scanner(System.in);
		String titlePitch = in.next();
	    int similar = 0;
	    String[]CharName = new String[3];
	    	CharName[0] = ("batman");
	    	CharName[1] = ("superman");
	    	CharName[2] = ("wonder woman");
			
			for(int i = 0; i < CharName.length; i++) {
				for(int j = 0; j < titlePitch.length(); j++) {
					if(CharName[i].equals(titlePitch)){
						similar++;
					}
				}
			}
	    return similar;
	  }
}
