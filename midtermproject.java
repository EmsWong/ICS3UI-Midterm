//Escape The Villain's Lair
//Emily Wong
//v#10

import arc.*;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Font;

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
		
		//Initial Start
		//Scene 1
		scene1(con);
		
		//Hero Name Path Decision
		con.println("What is your hero name?");
		strName = con.readLine();
		charInitial = strName.charAt(0);
		charLowerCase = Character.toLowerCase(charInitial);
		if(charLowerCase >= 'a' && charLowerCase <= 'm'){
			//Telekinesis Power
			//Scene 2
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
				//Scene 5
				scene5(con);
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
						//Scene 9
						scene9(con);
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
							//Scene 15
							dblArea = Math.sqrt(dblSemiP*(dblSemiP-dblsideA)*(dblSemiP-dblsideB)*(dblSemiP-dblsideC));
							con.println("It's a triangle with area: "+dblArea);
							con.sleep(1000);
							scene15(con);
							con.println("There's a fork in the road!");
							con.println("Do you take the 'l'eft or 'r'ight way");
							charDirection = con.getChar();
							
							if(charDirection == 'l'){
								//Run into villain
								//Scene 17
								scene17(con);
								con.println("You ran into SHADOW WEAVER!!");
								con.println("Do you fight?");
								strFight = con.readLine();
								
								if(strFight.equalsIgnoreCase("no")){
									//Run away
									//Scene 18
									scene18(con);
									
								}else if(strFight.equalsIgnoreCase("yes") && strPower.equalsIgnoreCase("telekinesis")){
									//Telekinesis powers
									//Scene 19 
									scene19(con);
								}
								
							}else if(charDirection == 'r'){
								//Escape
								//Scene 16
								scene16(con);
							}
							
						}else{
							//Incorrect password
							//Scene 12
							scene12(con);
						}
						
					}else{
						//Urge not strong enough
						//Scene 7
						scene7(con);
					}
					
				}else if(strUrge.equalsIgnoreCase("no")){
					//Not giving into urge
					//Scene 7
					scene7(con);
				}
				
			}else{
				//No powers
				//Scene 4
				scene4(con);
			}
			
		}else{
			//X-Ray Power
			//Scene 3
			scene3(con);
			con.println("I can see through walls,");
			con.println("But I'm not a ghost.");
			con.println("I can spot your bones,");
			con.println("But I'm no doctor or host.");
			con.println("What am I, you may ask with precision?");
			strPower = con.readLine();
			con.repaint();
			
			if(strPower.equalsIgnoreCase("x-ray vision")){
				//Gaining x-ray power
				//Scene 6
				scene6(con);
				con.println("Something feels weird... What's this blurry thing on the wall?");
				con.println("Do you take a closer look?");
				strLook = con.readLine();
				
				if(strLook.equalsIgnoreCase("yes")){
					//Looking closer at wall
					//Scene 8
					scene8(con);
					con.println("There's a puzzle on the wall");
					con.println("Solve the puzzle!");
					intPuzzle = con.readInt();
					
					if(intPuzzle == 394){
						//Another door and puzzle
						//Scene 11
						scene11(con);
						con.println("That door needs fingerprint ID to get through!");
						con.println("Using x-ray vision there seems to be a hollow part in the wall");
						con.println("Do you punch the wall?");
						strPunch = con.readLine();
						
						if(strPunch.equalsIgnoreCase("yes")){
							
							//Strength of punching the wall
							dblPunch = Math.round((double)(Math.random()*49999.99+50000.00));
							dblPunch = dblPunch/100;
							
							if(dblPunch <= 749.99){
								//Guard hears the noise
								//Scene 13
								scene13(con);
								
							}else{
								//Strong punch
								//Scene 14
								scene14(con);
								con.println("The punch was really strong!");
								con.println("You crawl through and reach a fork");
								con.println("Do you take the 'l'eft or 'r'ight way");
								charDirection = con.getChar();
							
								if(charDirection == 'l'){
									//Run into villain
									//Scene 17
									scene17(con);
									con.println("You ran into SHADOW WEAVER!!");
									con.println("Do you fight?");
									strFight = con.readLine();
								
									if(strFight.equalsIgnoreCase("no")){
										//Run away
										//Scene 18
										scene18(con);
										
									}else if(strFight.equalsIgnoreCase("yes") && strPower.equalsIgnoreCase("x-ray vision")){
										//X-ray powers
										//Scene 20
										scene20(con);
									}
								
								}else if(charDirection == 'r'){
									//Escape
									//Scene 16
									scene16(con);
								}
							}
						}else if(strPunch.equalsIgnoreCase("no")){
							//Taser
							//Scene 12
							scene12(con);
						}
						
					}else{
						//Taser
						//Scene 12
						scene12(con);
					}
					
				}else if(strLook.equalsIgnoreCase("no")){
					//Not looking closer
					//Scene 10
					scene10(con);
				}
				
			}else{
				//No powers
				//Scene 4
				scene4(con);
			}
		}
	}
	//Scene 1
	public static void scene1(Console con){
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
		con.clear();
		BufferedImage imgScene1 = con.loadImage("scene1.jpg");
		con.println("You've been trapped in The Shadow Weaver's lair and have to escape!");
		con.drawImage(imgScene1, 0, 0);
	}
	//Scene 2
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
			con.drawString("Look, a glowing orb!", 650, 450);
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
	//Scene 3
	public static void scene3(Console con){
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
			BufferedImage imgScene3 = con.loadImage("scene3.png");
			con.drawImage(imgScene3, 390, 390);
			con.setDrawColor(Color.WHITE);
			con.drawString("Look, a glowing orb!", 650, 450);
			con.drawString("It has a riddle", 650, 470);
			
			con.setDrawColor(new Color(0, 0, 205));
			con.drawOval(intXGlow, intYGlow, intWidthGlow, intHeightGlow);
			intXGlow = intXGlow - 1;
			intYGlow = intYGlow - 1;
			intWidthGlow = intWidthGlow + 2;
			intHeightGlow = intHeightGlow + 2;
			con.repaint();
		}	
	}
	//Scene 4
	public static void scene4(Console con){
		int intCount;
		for(intCount = 3; intCount >= 0; intCount--){
			con.setDrawColor(Color.BLACK);
			con.fillRect(0, 0, 1280, 720);
			con.clear();
			BufferedImage imgBackground = con.loadImage("background.jpg");
			con.drawImage(imgBackground, 0, 0);
			BufferedImage imgScene4 = con.loadImage("scene4.png");
			con.drawImage(imgScene4, 390, 390);
			con.repaint();
			con.setDrawColor(Color.WHITE);
			con.drawString("Oh no!", 450, 355);
			con.drawString("There's a self destruct timer!", 335, 375);
			con.setDrawColor(Color.BLUE);
			con.drawString("0:0"+intCount, 465, 470);
			con.sleep(500);
		}
		BufferedImage imgExplosion = con.loadImage("explosion.jpg");
		con.drawImage(imgExplosion, 0, 0);
		con.repaint();
		con.sleep(250);
		BufferedImage imgGameOver = con.loadImage("gameover.jpg");
		con.drawImage(imgGameOver, 0, 0);
		con.repaint();
		con.sleep(3000);
		con.closeConsole();
	}
	//Scene 5	
	public static void scene5(Console con){
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
		con.clear();
		BufferedImage imgBackground = con.loadImage("background.jpg");
		con.drawImage(imgBackground, 0, 0);
		BufferedImage imgScene5 = con.loadImage("scene5.png");
		con.drawImage(imgScene5, 550, 500);
		con.repaint();
		con.setDrawColor(Color.WHITE);
		con.drawString("It opened!", 570, 300);
		con.setDrawColor(new Color(0, 255, 255));
		con.fillOval(620, 500, 10, 10);
		con.fillOval(615, 430, 20, 20);
		con.fillOval(607, 340, 40, 40);
		con.sleep(2000);
		BufferedImage imgGuard = con.loadImage("guard.jpg");
		con.drawImage(imgGuard, 0, 0);
		BufferedImage imgKey = con.loadImage("key.png");
		con.drawImage(imgKey, 530, 370);
		con.repaint();
	}
	//Scene 6
	public static void scene6(Console con){
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
		con.clear();
		BufferedImage imgBackground = con.loadImage("background.jpg");
		con.drawImage(imgBackground, 0, 0);
		BufferedImage imgScene6 = con.loadImage("scene6.png");
		con.drawImage(imgScene6, 550, 500);
		con.repaint();
		con.setDrawColor(Color.WHITE);
		con.drawString("It opened!", 570, 300);
		con.setDrawColor(new Color(0, 0, 205));
		con.fillOval(620, 500, 10, 10);
		con.fillOval(615, 430, 20, 20);
		con.fillOval(607, 340, 40, 40);
		con.sleep(2000);
		BufferedImage imgWall = con.loadImage("scene6bg.jpg");
		con.drawImage(imgWall, 0, 0);
		BufferedImage imgBlurpuzzle = con.loadImage("blurpuzzle.png");
		con.drawImage(imgBlurpuzzle, 480, 200);
	}
	//Scene 7
	public static void scene7(Console con){
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
		con.clear();
		con.setDrawColor(Color.WHITE);
		con.println("The urge wasn't very strong.");
		BufferedImage imgScene5Guard = con.loadImage("scene5guard.jpg");
		con.drawImage(imgScene5Guard, 0, 0);
		con.repaint();
		con.sleep(1500);
		con.clear();
		BufferedImage imgScene7 = con.loadImage("scene7.jpg");
		con.drawImage(imgScene7, 0, 0);
		con.repaint();
		con.println("Oh no! A fight broke out!");
		con.sleep(3000);
		con.clear();
		BufferedImage imgBullet = con.loadImage("bullet.jpg");
		con.drawImage(imgBullet, 0, 0);
		con.repaint();
		con.sleep(500);
		BufferedImage imgGameOver = con.loadImage("gameover.jpg");
		con.drawImage(imgGameOver, 0, 0);
		con.repaint();
		con.sleep(3000);
		con.closeConsole();
	}
	//Scene 8
	public static void scene8(Console con){
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
		con.clear();
		BufferedImage imgWall = con.loadImage("scene6bg.jpg");
		con.drawImage(imgWall, 0, 0);
		BufferedImage imgPuzzle = con.loadImage("puzzle.png");
		con.drawImage(imgPuzzle, 400, 50);
		con.repaint();
	}
	//Scene 9
	public static void scene9(Console con){
		int intCount;
		int intKeyX;
		int intKeyY;
		intCount = 1;
		intKeyX = 530;
		intKeyY = 370;
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
		con.clear();
		while(intCount == 1){
			BufferedImage imgGuard = con.loadImage("guard.jpg");
			con.drawImage(imgGuard, 0, 0);
			BufferedImage imgKey = con.loadImage("key.png");
			con.drawImage(imgKey, intKeyX, intKeyY);
			con.repaint();
			con.sleep(33);
			intKeyX = intKeyX - 10;
			intKeyY = intKeyY + 10;
			if(intKeyY == 570){
				con.setDrawColor(Color.BLACK);
				con.fillRect(0, 0, 1280, 720);
				BufferedImage imgUnlock = con.loadImage("scene1.jpg");
				con.drawImage(imgUnlock, 0, 0);
				con.drawImage(imgKey, 530, 570);
				con.repaint();
				con.println("It's unlocked!");
				con.sleep(2000);
				con.clear();
				BufferedImage imgHall = con.loadImage("hall.png");
				con.drawImage(imgHall, 0, 0);
				con.repaint();
				con.setDrawColor(Color.WHITE);
				con.println("Let's go to the door");
				con.sleep(2000);
				con.clear();
				BufferedImage imgDoor = con.loadImage("door.png");
				con.drawImage(imgDoor, 0, 0);
				con.repaint();
				intCount = intCount + 1;
			}
		}
	}
	//Scene 10
	public static void scene10(Console con){
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
		con.clear();
		con.setDrawColor(Color.WHITE);
		con.println("The alarm went off!");
		con.println("That's poison gas!");
		BufferedImage imgHall = con.loadImage("hall.png");
		con.drawImage(imgHall, 0, 0);
		BufferedImage imgPoisongas = con.loadImage("poisongas.png");
		con.drawImage(imgPoisongas, 0, 0);
		con.repaint();
		con.sleep(1500);
		con.clear();
		BufferedImage imgGameOver = con.loadImage("gameover.jpg");
		con.drawImage(imgGameOver, 0, 0);
		con.repaint();
		con.sleep(3000);
		con.closeConsole();
	}
	//Scene 11
	public static void scene11(Console con){
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
		con.clear();
		BufferedImage imgScene11 = con.loadImage("scene11.png");
		con.drawImage(imgScene11, 0, 0);
		con.repaint();
	}
	//Scene 12
	public static void scene12(Console con){
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
		con.clear();
		BufferedImage imgHall = con.loadImage("hall.png");
		con.drawImage(imgHall, 0, 0);
		con.repaint();
		con.println("Can't seem to open the door...");
		con.sleep(2000);
		con.clear();
		con.println("Oh no! A guard found you!");
		BufferedImage imgScene12 = con.loadImage("scene12.png");
		con.drawImage(imgScene12, 0, 0);
		con.repaint();
		con.sleep(2000);
		con.setDrawColor(new Color(209, 248, 253));
		con.fillRect(0, 0, 1280, 720);
		con.clear();
		con.sleep(250);
		BufferedImage imgGameOver = con.loadImage("gameover.jpg");
		con.drawImage(imgGameOver, 0, 0);
		con.repaint();
		con.sleep(3000);
		con.closeConsole();
	}
	//Scene 13
	public static void scene13(Console con){
		int intNoiseX;
		int intNoiseY;
		int intCount;
		intNoiseX = 50;
		intNoiseY = 350;
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
		con.clear();
		for(intCount = 1; intCount <= 10; intCount++){
			BufferedImage imgScene11 = con.loadImage("scene11.png");
			con.drawImage(imgScene11, 0, 0);
			BufferedImage imgNoise = con.loadImage("noise.png");
			con.drawImage(imgNoise, intNoiseX, intNoiseY);
			con.repaint();
			intNoiseY = intNoiseY - 5;
			if(intNoiseX <= 60){
				intNoiseX = intNoiseX + 5;
			}else if(intNoiseX >= 40){
				intNoiseX = intNoiseX - 5;
			}
			con.sleep(250);
		}
		con.println("A guard heard the noise!");
		BufferedImage imgScene12 = con.loadImage("scene12.png");
		con.drawImage(imgScene12, 0, 0);
		con.repaint();
		con.sleep(1000);
		con.clear();
		BufferedImage imgGameOver = con.loadImage("gameover.jpg");
		con.drawImage(imgGameOver, 0, 0);
		con.repaint();
		con.sleep(3000);
		con.closeConsole();
	}
	//Scene 14
	public static void scene14(Console con){
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
		con.clear();
		int intNoiseX;
		int intNoiseY;
		int intCount;
		intNoiseX = 50;
		intNoiseY = 350;
		for(intCount = 1; intCount <= 10; intCount++){
			BufferedImage imgScene14 = con.loadImage("scene14.png");
			con.drawImage(imgScene14, 0, 0);
			BufferedImage imgNoise = con.loadImage("noise.png");
			con.drawImage(imgNoise, intNoiseX, intNoiseY);
			con.repaint();
			intNoiseY = intNoiseY - 5;
			if(intNoiseX <= 60){
				intNoiseX = intNoiseX + 5;
			}else if(intNoiseX >= 40){
				intNoiseX = intNoiseX - 5;
			}
			con.sleep(250);
		}
		BufferedImage imgTunnel = con.loadImage("tunnel.png");
		con.drawImage(imgTunnel, 0, 0);
		con.repaint();
		con.sleep(1000);
		con.clear();
		BufferedImage imgPathfork = con.loadImage("pathfork.jpg");
		con.drawImage(imgPathfork, 0, 0);
		con.repaint();
	}
	//Scene 15
	public static void scene15(Console con){
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
		con.clear();
		BufferedImage imgPathfork = con.loadImage("pathfork.jpg");
		con.drawImage(imgPathfork, 0, 0);
		con.repaint();
	}
	//Scene 16
	public static void scene16(Console con){
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
		con.clear();
		BufferedImage imgScene16 = con.loadImage("scene16.jpg");
		con.drawImage(imgScene16, 0, 0);
		con.repaint();
		con.sleep(750);
		BufferedImage imgEscape = con.loadImage("escape.jpg");
		con.drawImage(imgEscape, 0, 0);
		con.repaint();
		con.sleep(3000);
		con.closeConsole();
	}
	//Scene 17
	public static void scene17(Console con){
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
		con.clear();
		BufferedImage imgVillain = con.loadImage("villain.png");
		con.drawImage(imgVillain, 0, 0);
		con.repaint();
	}
	//Scene 18
	public static void scene18(Console con){
		int intCount;
		int intDarkY;
		intDarkY = 0;
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
		con.clear();
		con.println("You run away!");
		BufferedImage imgHall = con.loadImage("hall.png");
		con.drawImage(imgHall, 0, 0);
		con.repaint();
		for(intCount = 0; intCount <= 20; intCount++){
			con.fillRect(0, 0, 1280, intDarkY);
			intDarkY = intDarkY + 36;
			con.repaint();
			con.sleep(33);
		}
		con.clear();
		con.println("The darkness devours you.");
		con.sleep(1000);
		con.clear();
		BufferedImage imgGameOver = con.loadImage("gameover.jpg");
		con.drawImage(imgGameOver, 0, 0);
		con.repaint();
		con.sleep(3000);
		con.closeConsole();
	}
	//Scene 19
	public static void scene19(Console con){
		int intCount;
		int intCount2;
		int intRockX;
		int intRockX2;
		int intRockY;
		int intRockY2;
		intRockX = 50;
		intRockY = 470;
		intRockX2 = 570;
		intRockY2 = 370;
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
		con.clear();
		con.println("Look, a rock behind you! Grab it!");
		for(intCount = 1; intCount <= 20; intCount++){
			BufferedImage imgPathfork = con.loadImage("pathfork.jpg");
			con.drawImage(imgPathfork, 0, 0);
			BufferedImage imgRock = con.loadImage("rock.png");
			con.drawImage(imgRock, intRockX, intRockY);
			con.repaint();
			intRockX = intRockX + 26;
			intRockY = intRockY - 5;
			con.sleep(33);
		}
		con.clear();
		for(intCount2 = 1; intCount2 <= 10; intCount2++){
			BufferedImage imgVillain = con.loadImage("villain.png");
			con.drawImage(imgVillain, 0, 0);
			BufferedImage imgRock = con.loadImage("rock.png");
			con.drawImage(imgRock, intRockX2, intRockY2);
			con.repaint();
			intRockX2 = intRockX2 - 2;
			intRockY2 = intRockY2 + 5;
			con.sleep(33);
		}
		BufferedImage imgDiedVillain = con.loadImage("diedvillain.png");
		con.drawImage(imgDiedVillain, 0, 0);
		con.repaint();
		con.sleep(2000);
		BufferedImage imgEscape = con.loadImage("escape.jpg");
		con.drawImage(imgEscape, 0, 0);
		con.repaint();
		con.sleep(3000);
		con.closeConsole();
	}
	//Scene 20
	public static void scene20(Console con){
		con.setDrawColor(Color.BLACK);
		con.fillRect(0, 0, 1280, 720);
		con.clear();
		con.println("Look! You can see the core using x-ray vision!");
		BufferedImage imgScene20 = con.loadImage("scene20.png");
		con.drawImage(imgScene20, 0, 0);
		BufferedImage imgCore = con.loadImage("core.png");
		con.drawImage(imgCore, 300, 400);
		con.repaint();
		con.println("Let's hit it!");
		con.sleep(2000);
		con.drawImage(imgScene20, 0, 0);
		BufferedImage imgBrokenCore = con.loadImage("brokencore.png");
		con.drawImage(imgBrokenCore, 300, 400);
		con.repaint();
		con.clear();
		con.sleep(2000);
		BufferedImage imgDeadVillain = con.loadImage("deadvillain.png");
		con.drawImage(imgDeadVillain, 0, 0);
		con.repaint();
		con.sleep(1000);
		BufferedImage imgEscape = con.loadImage("escape.jpg");
		con.drawImage(imgEscape, 0, 0);
		con.repaint();
		con.sleep(3000);
		con.closeConsole();
	}
}
