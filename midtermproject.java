//Escape The Villain's Lair
//Emily Wong
//v#5

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
			scene2(con);
			con.println("Without touch or force,");
			con.println("I can move things with ease.");
			con.println("Objects fly through the air,");
			con.println("Without any breeze.");
			con.println("What am I, this ability of the mind?");
			strPower = con.readLine();
			con.repaint();
			
			
			if(strPower.equalsIgnoreCase("telekinesis")){
				//Gaining telekinesis power
				con.println("TEMP - Scene 5");
				con.println("Something feels weird... There's this urge.");
				con.println("Do you give into the urge?");
				strUrge = con.readLine();
				con.repaint();
				
				if(strUrge.equalsIgnoreCase("yes")){
					//Giving into urge
					//Changed from random number to input (different from flowchart)
					//Talked about change in class and it's okay
					con.println("Enter a number 1 - 100:");
					intUrge = con.readInt();
					
					if(intUrge >= 51){
						//Urge strong enough
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
							dblArea = Math.sqrt(dblSemiP*(dblSemiP-dblsideA)*(dblSemiP-dblsideB)*(dblSemiP-dblsideC));
							con.println("It's a triangle with area: "+dblArea);
							con.println("TEMP - Scene 15");
							con.println("There's a fork in the road!");
							con.println("Do you take the 'l'eft or 'r'ight way");
							charDirection = con.getChar();
							
							if(charDirection == 'l'){
								//Run into villain
								con.println("TEMP - Scene 17");
								con.println("You ran into SHADOW WEAVER!!");
								con.println("Do you fight?");
								strFight = con.readLine();
								
								if(strFight.equalsIgnoreCase("no")){
									//Run away
									con.println("TEMP - Scene 18");
									
								}else if(strFight.equalsIgnoreCase("yes") && strPower.equalsIgnoreCase("telekinesis")){
									//Telekinesis powers
									con.println("TEMP - Scene 19");
								}
								
							}else if(charDirection == 'r'){
								//Escape
								con.println("TEMP - Scene 16");
							}
							
						}else{
							//Incorrect password
							con.println("TEMP - Scene 12");
						}
						
					}else{
						//Urge not strong enough
						con.println("TEMP - Scene 7");
					}
					
				}else if(strUrge.equalsIgnoreCase("no")){
					//Not giving into urge
					con.println("TEMP - Scene 7");
				}
				
			}else{
				//No powers
				con.println("TEMP - Scene 4");
			}
			
		}else{
			//X-Ray Power
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
				con.println("TEMP - Scene 6");
				con.println("Something feels weird... What's this blurry thing on the wall?");
				con.println("Do you take a closer look?");
				strLook = con.readLine();
				
				if(strLook.equalsIgnoreCase("yes")){
					//Looking closer at wall
					con.println("TEMP - Scene 8");
					con.println("There's a puzzle on the wall");
					con.println("Solve the puzzle!");
					intPuzzle = con.readInt();
					
					if(intPuzzle == 394){
						//Another door and puzzle
						con.println("TEMP - Scene 11");
						con.println("That door needs fingerprint ID to get throguh!");
						con.println("Using x-ray vision there seems to be a hollow part in the wall");
						con.println("Do you punch the wall?");
						strPunch = con.readLine();
						
						if(strPunch.equalsIgnoreCase("yes")){
							
							//Punching the wall
							dblPunch = Math.round((double)(Math.random()*49999.99+50000.00));
							dblPunch = dblPunch/100;
							con.println(dblPunch);
							con.sleep(100);
							
							if(dblPunch <= 749.99){
								//Guard hears the noise
								con.println("TEMP - Scene 13");
								
							}else{
								//Strong punch
								con.println("TEMP - Scene 14");
								con.println("The punch was really strong!");
								con.println("You crawl through and reach a fork");
								con.println("Do you take the 'l'eft or 'r'ight way");
								charDirection = con.getChar();
							
								if(charDirection == 'l'){
									//Run into villain
									con.println("TEMP - Scene 17");
									con.println("You ran into SHADOW WEAVER!!");
									con.println("Do you fight?");
									strFight = con.readLine();
								
									if(strFight.equalsIgnoreCase("no")){
										//Run away
										con.println("TEMP - Scene 18");
										
									}else if(strFight.equalsIgnoreCase("yes") && strPower.equalsIgnoreCase("x-ray vision")){
										//X-ray powers
										con.println("TEMP - Scene 19");
									}
								
								}else if(charDirection == 'r'){
									//Escape
									con.println("TEMP - Scene 16");
								}
							}
						}else if(strPunch.equalsIgnoreCase("no")){
							//Taser
							con.println("TEMP - Scene 12");
						}
						
					}else{
						//Taser
						con.println("TEMP - Scene 12");
					}
					
				}else if(strLook.equalsIgnoreCase("no")){
					//Not looking closer
					con.println("TEMP - Scene 10");
				}
				
			}else{
				//No powers
				con.println("TEMP - Scene 4");
			}
		}
	}
	public static void scene1(Console con){
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
		con.clear();
		BufferedImage imgScene1 = con.loadImage("scene1.jpg");
		con.println("You've been trapped in The Shadow Weaver's lair and have to escape!");
		con.drawImage(imgScene1, 0, 0);
	}
	public static void scene2(Console con){
		int intXGlow;
		int intYGlow;
		int intWidthGlow;
		int intHeightGlow;
		int intCount;
		intXGlow = 390;
		intYGlow = 390;
		intWidthGlow = 205;
		intHeightGlow = 205;
		
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
		con.clear();
		
		for(intCount = 50; intCount >= 1; intCount--){
			BufferedImage imgBackground = con.loadImage("background.jpg");
			con.drawImage(imgBackground, 0, 0);
			BufferedImage imgScene2 = con.loadImage("scene2.png");
			con.drawImage(imgScene2, 390, 390);
			con.setDrawColor(Color.WHITE);
			con.drawString("Look a glowing orb!", 650, 450);
			con.drawString("It has a riddle", 650, 470);
			
			con.setDrawColor(new Color(0, 255, 255));
			con.drawOval(intXGlow, intYGlow, intWidthGlow, intHeightGlow);
			intXGlow = intXGlow - 1;
			intYGlow = intYGlow - 1;
			intWidthGlow = intWidthGlow + 2;
			intHeightGlow = intHeightGlow + 2;
			con.repaint();
		}	
	}
	public static void scene3(Console con){
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
		con.clear();
	}
	public static void scene4(Console con){
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
		con.clear();
	}
	public static void scene5(Console con){
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
		con.clear();
	}
	public static void scene6(Console con){
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
		con.clear();
	}
	public static void scene7(Console con){
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
		con.clear();
	}
	public static void scene8(Console con){
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
		con.clear();
	}
	public static void scene9(Console con){
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
		con.clear();
	}
	public static void scene10(Console con){
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
		con.clear();
	}
	public static void scene11(Console con){
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
		con.clear();
	}
	public static void scene12(Console con){
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
		con.clear();
	}
	public static void scene13(Console con){
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
		con.clear();
	}
	public static void scene14(Console con){
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
		con.clear();
	}
	public static void scene15(Console con){
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
		con.clear();
	}
	public static void scene16(Console con){
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
		con.clear();
	}
	public static void scene17(Console con){
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
		con.clear();
	}
	public static void scene18(Console con){
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
		con.clear();
	}
	public static void scene19(Console con){
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
		con.clear();
	}
	public static void scene20(Console con){
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
		con.clear();
	}
}
