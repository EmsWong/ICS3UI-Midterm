import arc.*;
import java.awt.image.BufferedImage;
import java.awt.Color;

public class midtermproject{
	public static void main(String[] args){
		Console con = new Console("Escape The Villian's Lair", 1280, 720);
		
		//Initial Setting
		scene1(con);
		
		//Hero Name Path Decision
		String strName;
		char charInitial;
		char charLowerCase;
		
		con.println("What is your hero name?");
		strName = con.readLine();
		charInitial = strName.charAt(0);
		charLowerCase = Character.toLowerCase(charInitial);
		if(charLowerCase >= 'a' && charLowerCase <= 'm'){
			//Telekinesis Power
			con.println("TEMP - Scene 2");
			
		}else{
			//X-Ray Power
			con.println("TEMP - Scene 3");
		}
	}
	public static void scene1(Console con){
		BufferedImage imgScene1 = con.loadImage("scene1.jpg");
		con.println("You've been trapped in The Shadow Weaver's lair and have to escape!");
		con.drawImage(imgScene1, 0, 0);
	}
	public static void scene2(Console con){
		
	}
}
