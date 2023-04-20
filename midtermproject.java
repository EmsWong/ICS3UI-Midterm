//Escape The Villain's Lair
//Emily Wong
//v#3

import arc.*;
import java.awt.image.BufferedImage;
import java.awt.Color;

public class midtermproject{
	public static void main(String[] args){
		Console con = new Console("Escape The Villian's Lair", 1280, 720);
		String strName;
		char charInitial;
		char charLowerCase;
		String strPower;
		String strUrge;
		int intUrge;
		double dblsideA;
		double dblsideB;
		double dblsideC;
		double dblSemiP;
		double dblArea;
		char charDirection;
		String strLook;
		String strFight;
		int intPuzzle;
		String strPunch;
		double dblPunch;
		
		//Initial Setting
		scene1(con);
		
		//Hero Name Path Decision
		con.println("What is your hero name?");
		strName = con.readLine();
		charInitial = strName.charAt(0);
		charLowerCase = Character.toLowerCase(charInitial);
		if(charLowerCase >= 'a' && charLowerCase <= 'm'){
			//Telekinesis Power
			con.setDrawColor(Color.BLACK);
			con.fillRect(0, 0, 1280, 720);
			con.clear();
			
			con.println("TEMP - Scene 2");
			con.println("Without touch or force,");
			con.println("I can move things with ease.");
			con.println("Objects fly through the air,");
			con.println("Without any breeze.");
			con.println("What am I, this ability of the mind?");
			strPower = con.readLine();
			con.repaint();
			
			
			if(strPower.equalsIgnoreCase("telekinesis")){
				//Gaining telekinesis power
				
				con.setDrawColor(Color.BLACK);
				con.fillRect(0, 0, 1280, 720);
				con.clear();
				
				con.println("TEMP - Scene 5");
				con.println("Something feels weird... There's this urge.");
				con.println("Do you give into the urge?");
				strUrge = con.readLine();
				con.repaint();
				
				if(strUrge.equalsIgnoreCase("yes")){
					//Giving into urge
					intUrge = (int)(Math.random()*100);
					con.println(intUrge);
					con.sleep(100);
					
					if(intUrge >= 51){
						//Urge strong enough
						con.setDrawColor(Color.BLACK);
						con.fillRect(0, 0, 1280, 720);
						con.clear();
						
						con.println("TEMP - Scene 9");
						con.println("Another door... Enter 3 numbers for a triangle check");
						con.println("Number 1:");
						dblsideA = con.readDouble();
						con.println("Number 2:");
						dblsideB = con.readDouble();
						con.println("Number 3:");
						dblsideC = con.readDouble();	
						dblSemiP = (dblsideA + dblsideB + dblsideC)/2;
						
						if((dblsideA < dblSemiP) && (dblsideB < dblSemiP) && (dblsideC < dblSemiP)){
							//Password for door
							con.setDrawColor(Color.BLACK);
							con.fillRect(0, 0, 1280, 720);
							con.clear();
							
							dblArea = Math.sqrt(dblSemiP*(dblSemiP-dblsideA)*(dblSemiP-dblsideB)*(dblSemiP-dblsideC));
							con.println("It's a triangle with area: "+dblArea);
							con.println("TEMP - Scene 15");
							con.println("There's a fork in the road!");
							con.println("Do you take the 'l'eft or 'r'ight way");
							charDirection = con.getChar();
							
							if(charDirection == 'l'){
								//Run into villain
								con.setDrawColor(Color.BLACK);
								con.fillRect(0, 0, 1280, 720);
								con.clear();
			
								con.println("TEMP - Scene 17");
								con.println("You ran into SHADOW WEAVER!!");
								con.println("Do you fight?");
								strFight = con.readLine();
								
								if(strFight.equalsIgnoreCase("no")){
									//Run away
									con.setDrawColor(Color.BLACK);
									con.fillRect(0, 0, 1280, 720);
									con.clear();
									
									con.println("TEMP - Scene 18");
									
								}else if(strFight.equalsIgnoreCase("yes") && strPower.equalsIgnoreCase("telekinesis")){
									//Telekinesis powers
									con.setDrawColor(Color.BLACK);
									con.fillRect(0, 0, 1280, 720);
									con.clear();
									
									con.println("TEMP - Scene 19");
								}
								
							}else if(charDirection == 'r'){
								con.setDrawColor(Color.BLACK);
								con.fillRect(0, 0, 1280, 720);
								con.clear();
								
								con.println("TEMP - Scene 16");
							}
							
							
						}else{
							//Incorrect password
							con.setDrawColor(Color.BLACK);
							con.fillRect(0, 0, 1280, 720);
							con.clear();
							con.println("TEMP - Scene 12");
						}
						
					}else{
						//Urge not strong enough
						con.setDrawColor(Color.BLACK);
						con.fillRect(0, 0, 1280, 720);
						con.clear();
						
						con.println("TEMP - Scene 7");
					}
					
				}else if(strUrge.equalsIgnoreCase("no")){
					//Not giving into urge
					con.setDrawColor(Color.BLACK);
					con.fillRect(0, 0, 1280, 720);
					con.clear();
					
					con.println("TEMP - Scene 7");
				}
				
			}else{
				//No powers
				con.setDrawColor(Color.BLACK);
				con.fillRect(0, 0, 1280, 720);
				con.clear();
				
				con.println("TEMP - Scene 4");
			}
			
		}else{
			//X-Ray Power
			
			con.setDrawColor(Color.BLACK);
			con.fillRect(0, 0, 1280, 720);
			con.clear();
			
			con.println("TEMP - Scene 3");
			con.println("I can see through walls,");
			con.println("But I'm not a ghost.");
			con.println("I can spot your bones,");
			con.println("But I'm no doctor or host.");
			con.println("What am I, you may ask with precision?");
			strPower = con.readLine();
			con.repaint();
			
			if(strPower.equalsIgnoreCase("x-ray vision")){
				//Gaining x-ray power
				con.setDrawColor(Color.BLACK);
				con.fillRect(0, 0, 1280, 720);
				con.clear();
				
				con.println("TEMP - Scene 6");
				con.println("Something feels weird... What's this blurry thing on the wall?");
				con.println("Do you take a closer look?");
				strLook = con.readLine();
				
				if(strLook.equalsIgnoreCase("yes")){
					//Looking closer at wall
					con.setDrawColor(Color.BLACK);
					con.fillRect(0, 0, 1280, 720);
					con.clear();
					
					con.println("TEMP - Scene 8");
					con.println("There's a puzzle on the wall");
					con.println("Solve the puzzle!");
					intPuzzle = con.readInt();
					
					if(intPuzzle == 394){
						//Another door and puzzle
						con.setDrawColor(Color.BLACK);
						con.fillRect(0, 0, 1280, 720);
						con.clear();
						
						con.println("TEMP - Scene 11");
						con.println("That door needs fingerprint ID to get throguh!");
						con.println("Using x-ray vision there seems to be a hollow part in the wall");
						con.println("Do you punch the wall?");
						strPunch = con.readLine();
						
						if(strPunch.equalsIgnoreCase("yes")){
							
							//Punching the wall
							dblPunch = (double)(Math.random()*500.0+500.0);
							con.println(dblPunch);
							con.sleep(100);
							
							if(dblPunch <= 749.99){
								//Guard hears the noise
								con.setDrawColor(Color.BLACK);
								con.fillRect(0, 0, 1280, 720);
								con.clear();
								
								con.println("TEMP - Scene 13");
								
							}else{
								//Strong punch
								con.setDrawColor(Color.BLACK);
								con.fillRect(0, 0, 1280, 720);
								con.clear();
								
								con.println("TEMP - Scene 14");
								con.println("The punch was really strong!");
								con.println("You crawl through and reach a fork");
								charDirection = con.getChar();
							
								if(charDirection == 'l'){
									//Run into villain
									con.setDrawColor(Color.BLACK);
									con.fillRect(0, 0, 1280, 720);
									con.clear();
			
									con.println("TEMP - Scene 17");
									con.println("You ran into SHADOW WEAVER!!");
									con.println("Do you fight?");
									strFight = con.readLine();
								
									if(strFight.equalsIgnoreCase("no")){
										//Run away
										con.setDrawColor(Color.BLACK);
										con.fillRect(0, 0, 1280, 720);
										con.clear();
										
										con.println("TEMP - Scene 18");
										
									}else if(strFight.equalsIgnoreCase("yes") && strPower.equalsIgnoreCase("x-ray vision")){
										//X-ray powers
										con.setDrawColor(Color.BLACK);
										con.fillRect(0, 0, 1280, 720);
										con.clear();
										
										con.println("TEMP - Scene 19");
									}
								
								}else if(charDirection == 'r'){
									//Escape
									con.setDrawColor(Color.BLACK);
									con.fillRect(0, 0, 1280, 720);
									con.clear();	
									
									con.println("TEMP - Scene 16");
								}
							}
						}else if(strPunch.equalsIgnoreCase("no")){
							//Taser
							con.setDrawColor(Color.BLACK);
							con.fillRect(0, 0, 1280, 720);
							con.clear();
							
							con.println("TEMP - Scene 12");
						}
						
					}else{
						//Taser
						con.setDrawColor(Color.BLACK);
						con.fillRect(0, 0, 1280, 720);
						con.clear();
			
						con.println("TEMP - Scene 12");
					}
					
				}else if(strLook.equalsIgnoreCase("no")){
					//Not looking closer
					con.setDrawColor(Color.BLACK);
					con.fillRect(0, 0, 1280, 720);
					con.clear();
					
					con.println("TEMP - Scene 10");
				}
				
			}else{
				//No powers
				con.setDrawColor(Color.BLACK);
				con.fillRect(0, 0, 1280, 720);
				con.clear();
				
				con.println("TEMP - Scene 4");
			}
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
