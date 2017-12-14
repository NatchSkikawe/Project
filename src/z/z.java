import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class z {
	
	JFrame window;
	Container con;
	JPanel picturePanel;
	JLabel pictureLabel;
	ImageIcon image;
        JLabel titleNameLabel, hpLabel, hpLabelNumber, weaponLabel,weaponLabelName,imageLabel; ; 
        JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel,imagePanel;
        Font titleFont = new Font("Times New Roman ",Font.PLAIN,90);
        Font normalFont =new Font("Times New Roman ",Font.PLAIN, 19);
        JButton startButton, choice1, choice2, choice3, choice4;
        JTextArea mainTextArea;
        int playerHP , monsterHP, bearMeat, cookie;
        String weapon, position;
        
        TitleScreenHandler tsHandler = new TitleScreenHandler();
        ChoiceHandler choiceHandler = new ChoiceHandler();

	public static void main(String[] args) {

		new z();
	}
	
	public z(){
		
			
		window = new JFrame(); //FUNCTION WINDOW
		window.setSize(800,600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
                 
		con = window.getContentPane(); 
		
		picturePanel = new JPanel(); //PICTURE
		picturePanel.setBounds(00, 0, 800, 800);
		picturePanel.setBackground(Color.white);
		con.add(picturePanel);
		
		pictureLabel = new JLabel();
		
		image = new ImageIcon(".//res//title.png");
                pictureLabel.setIcon(image);
		picturePanel.add(pictureLabel);
                
                titleNamePanel= new JPanel(); //TITLE NAME 
                titleNamePanel.setBounds(100, 100, 600, 150);
                titleNamePanel.setBackground(Color.black);
                titleNameLabel= new JLabel("Why i am here?");
                titleNameLabel.setForeground(Color.white);
                titleNameLabel.setFont(titleFont);
                
                startButtonPanel = new JPanel(); //BUTTON
                startButtonPanel.setBounds(300, 400, 200, 100);
                startButtonPanel.setBackground(Color.black);
                
                startButton = new JButton("START");
                startButton.setBackground(Color.black);
                startButton.setForeground(Color.white);
                startButton.setFont(normalFont);
                startButton.addActionListener(tsHandler);//when you clicked it recall tsHandler
                startButton.setFocusPainted(false);//MAKE WHITE BOX DISAPPEAR
                
                startButtonPanel.add(startButton);// PLACE PANEL ON CON
                titleNamePanel.add(titleNameLabel);
                con.add( titleNamePanel);
                con.add(startButtonPanel);
                
		
		
		
		
		window.setVisible(true);
	}
	
	public void createGameScreen(){
		
		  //make all thing in titleScreen invisible
            titleNamePanel.setVisible(false);
            startButtonPanel.setVisible(false);
            picturePanel.setVisible(false);
            
             
            mainTextPanel =new JPanel(); //IN GAME AREA TEXT
            mainTextPanel.setBounds(50, 350, 430, 250);
            mainTextPanel.setBackground(Color.black);
            con.add(mainTextPanel);
            
            mainTextArea = new JTextArea("Happy Christmas.");//FONT IN GAME
            mainTextArea.setBounds(50, 350, 430, 250);
            mainTextArea.setBackground(Color.black);
            mainTextArea.setForeground(Color.white);
            mainTextArea.setFont(normalFont);
            mainTextArea.setLineWrap(true);//if text are too long it will wrap automatically.
            mainTextPanel.add(mainTextArea);
            
            choiceButtonPanel = new JPanel();
            choiceButtonPanel.setBounds(500, 350, 250, 150);
            choiceButtonPanel.setBackground(Color.black);
            choiceButtonPanel.setLayout(new GridLayout(4,1)); //make layout horizontal,vertizontal
            con.add(choiceButtonPanel);
            
            choice1 = new JButton("choice1");
            choice1.setBackground(Color.black);
            choice1.setForeground(Color.white);
            choice1.setFont(normalFont);
            choice1.addActionListener(choiceHandler);
            choice1.setActionCommand("c1");
            choiceButtonPanel.add(choice1); 
            
               
            choice2 = new JButton("choice2");
            choice2.setBackground(Color.black);
            choice2.setForeground(Color.white);
            choice2.setFont(normalFont);
            choice2.addActionListener(choiceHandler);
            choice2.setActionCommand("c2");
            choiceButtonPanel.add(choice2);
            
               
            choice3 = new JButton("choice3");
            choice3.setBackground(Color.black);
            choice3.setForeground(Color.white);
            choice3.setFont(normalFont);
            choice3.addActionListener(choiceHandler);
            choice3.setActionCommand("c3");
            choiceButtonPanel.add(choice3);
            
               
            choice4 = new JButton("choice4");
            choice4.setBackground(Color.black);
            choice4.setForeground(Color.white);
            choice4.setFont(normalFont);
            choice4.addActionListener(choiceHandler);
            choice4.setActionCommand("c4");
            choiceButtonPanel.add(choice4);
            
            playerPanel = new JPanel();   //player ui
            playerPanel.setBounds(500, 100, 270, 50);
            playerPanel.setBackground(Color.black);
            playerPanel.setLayout(new GridLayout(2,2));
            con.add(playerPanel);
            hpLabel = new JLabel("HP:");
            hpLabel.setFont(normalFont);
            hpLabel.setForeground(Color.white);
            playerPanel.add(hpLabel);
            hpLabelNumber = new JLabel();
            hpLabelNumber.setFont(normalFont);
            hpLabelNumber.setForeground(Color.white);
            playerPanel.add(hpLabelNumber);
            weaponLabel = new JLabel("Weapon:");
            weaponLabel.setFont(normalFont);
            weaponLabel.setForeground(Color.white);
            playerPanel.add(weaponLabel);
            weaponLabelName = new JLabel();
            weaponLabelName.setFont(normalFont);
            weaponLabelName.setForeground(Color.white);
            playerPanel.add(weaponLabelName);
           
            	imagePanel = new JPanel();
		imagePanel.setBounds(50, 50, 400, 260);
		imagePanel.setBackground(Color.black);
		
		imageLabel = new JLabel();
		
		image = new ImageIcon(".//res//dance.gif");
		
		imageLabel.setIcon(image);
		imagePanel.add(imageLabel);
		
		
		con.add(imagePanel);
            
            playerSetup();
            
            
            
            
        }
	public void playerSetup(){
		playerHP = 100;
		monsterHP = 120;
		weapon = "Knife";
		weaponLabelName.setText(weapon);
		hpLabelNumber.setText("" + playerHP);
		
		houseGate();
	}
	public void houseGate(){
              image= new ImageIcon(".//res//dance.gif");
            imageLabel.setIcon(image);
            
            
		position = "houseGate";
		mainTextArea.setText("Outside house is cold and snowy, feeling like snow storm is coming.\nYou being forced by mom to go buy some food.\nWhat do you do?");		
		choice1.setText("Talk to Mom");
		choice2.setText("Call brother for help");
		choice3.setText("Leave");
		choice4.setText("");
	}
	public void talkMom(){
                image= new ImageIcon(".//res//mom.jpg");
            imageLabel.setIcon(image);
            
		position = "talkMom";
		mainTextArea.setText("Mom:Don't come back.\nif you can't bring any food for dinner");
		choice1.setText(">");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
	}
	public void callBrother(){
                 image= new ImageIcon(".//res//brother.png");
            imageLabel.setIcon(image);
            
		position = "callBrother";
		mainTextArea.setText("Big Brother:Hey don't be stupid!.\nNobody going to help you. \n\nBig Brother kicked and hit you hard.\n(you receive 20 damage)");
		playerHP = playerHP -20;
		hpLabelNumber.setText(""+playerHP);
		choice1.setText(">");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
	}
	public void crossRoad(){
            image= new ImageIcon(".//res//crossroad.png");
            imageLabel.setIcon(image);
            
		position = "crossRoad";
		mainTextArea.setText("You are at a crossroad.\n(If you go south, you will go back to the house.)");
		choice1.setText("Go north");
		choice2.setText("Go east");
		choice3.setText("Go south");
		choice4.setText("Go west");
                
	}
       
        
	public void north(){
	   image= new ImageIcon(".//res//bakeryshop.png");
            imageLabel.setIcon(image);	
            cookie=cookie+1;
            position="north";
            mainTextArea.setText("There is a bakery.They give you a  free cookies.\n(Your HP is recovered by 24)");
            playerHP=playerHP+24;
            hpLabelNumber.setText(""+playerHP);
                  
            choice1.setText("Go south");
            choice2.setText("");
            choice3.setText("");
            choice4.setText("");	
	}
	public void east(){
               image= new ImageIcon(".//res//sword.png");
            imageLabel.setIcon(image);	
            
		position = "east";
		mainTextArea.setText("You walk into a city but unlucky every store is closed.You accidently found a Long Sword\n\n(You obatined a Long Sword)");
		weapon = "Long Sword";
		weaponLabelName.setText(weapon);
		choice1.setText("Go west");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
		
	}
	public void west(){
            image= new ImageIcon(".//res//bear.png");
            imageLabel.setIcon(image);
            
            
		position = "west";
		mainTextArea.setText("You encounter a polar bear!");
		choice1.setText("Fight");
		choice2.setText("Run");
		choice3.setText("");
		choice4.setText("");
	}
	public void fight(){
		position = "fight";
		mainTextArea.setText("Bear? HP: " + monsterHP + "\n\nWhat do you do?");
		choice1.setText("Attack");
		choice2.setText("Run");
		choice3.setText("");
		choice4.setText("");
	}
	public void playerAttack(){
		position = "playerAttack";
		
		int playerDamage = 0;
		
		if(weapon.equals("Knife")){
			playerDamage = new java.util.Random().nextInt(15);
		}
		else if(weapon.equals("Long Sword")){
			playerDamage = new java.util.Random().nextInt(40); 
		}
		
		mainTextArea.setText("You attacked the enemy and gave " + playerDamage + " damage!");
		
		monsterHP = monsterHP - playerDamage;
		
		choice1.setText(">");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");		
	}
	public void monsterAttack(){
		position = "monsterAttack";
		
		int monsterDamage = 0;
		
		monsterDamage = new java.util.Random().nextInt(40); 
		
		mainTextArea.setText("The bear? attacked you and gave " + monsterDamage + " damage!");
		
		playerHP = playerHP - monsterDamage;
		hpLabelNumber.setText(""+playerHP);
		
		choice1.setText(">");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");	
	}
	public void win(){
		position = "win";
		
		mainTextArea.setText("You defeated the polar bear!\nYou dismember the polar bear.!\n\n(You obatined a Bear Meats!)");
		
		bearMeat = 1;
		
		choice1.setText("Go east");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
		
	}
	public void lose(){
		position = "lose";
            image= new ImageIcon(".//res//dead.jpg");
            imageLabel.setIcon(image);
		
		mainTextArea.setText("You ripped apart by Bear?.You are dead!\n\n<GAME OVER>");
		
		choice1.setText("");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
		choice1.setVisible(false);
		choice2.setVisible(false);
		choice3.setVisible(false);
		choice4.setVisible(false);
	}
        public void lose2(){
              image= new ImageIcon(".//res//dead2.png");
            imageLabel.setIcon(image);
            
            	position = "lose2";
		
		mainTextArea.setText("You are murdered by YOUR BROTHER!\n\n<GAME OVER>");
		
		choice1.setText("");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
		choice1.setVisible(false);
		choice2.setVisible(false);
		choice3.setVisible(false);
		choice4.setVisible(false);
            
        }
          public void lose3(){
              image= new ImageIcon(".//res//dead3.png");
            imageLabel.setIcon(image);
            
            	position = "lose3";
		
		mainTextArea.setText("You're eating a cookies too fast.\nYou chocked to death. \n\n<GAME OVER>");
		
		choice1.setText("");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
		choice1.setVisible(false);
		choice2.setVisible(false);
		choice3.setVisible(false);
		choice4.setVisible(false);
            
        }
	public void ending(){
             image= new ImageIcon(".//res//mom2.jpg");
            imageLabel.setIcon(image);
            
		position = "ending";
		
		mainTextArea.setText("Mom:Oh you killed a polar bear!?\n Well done.I'm going to make a dinner!\nWelcome to back!\n\n<THE END>\nThank you for playing");
                
                
		
		choice1.setText("");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
		choice1.setVisible(false);
		choice2.setVisible(false);
		choice3.setVisible(false);
		choice4.setVisible(false);
	}



	
	
	
		
	
	
	
	public class TitleScreenHandler implements ActionListener{
		
		public void actionPerformed(ActionEvent event){
			
			createGameScreen();
		}
	}
	public class ChoiceHandler implements ActionListener{
		
		public void actionPerformed(ActionEvent event){
			
			String yourChoice = event.getActionCommand();
			
			switch(position){
			case "houseGate":
				switch(yourChoice){
				case "c1": 
					if(bearMeat==1){
						ending();
					}
					else{
						talkMom();
					}
					break;
				case "c2": callBrother();break;
				case "c3": crossRoad();break;
				}
				break;
			case "talkMom":
				switch(yourChoice){
				       case "c1":
                                           if(playerHP<1){
                                        lose();
                                           }else{
                                       houseGate();
                                           }
                                        break;
                                }
                                break;
			case "callBrother":
				switch(yourChoice){
				case "c1":if(playerHP<1){
						lose2();
					}
					else{
						houseGate();
					}
					break;
                                   
                                
				}
				break;
			case "crossRoad":
				switch(yourChoice){
				case "c1": north(); break;
				case "c2": east();break;
				case "c3": houseGate(); break;
				case "c4": west();break;
				}
				break;
			case "north":
				switch(yourChoice){
				case "c1": 
                                    if(cookie==4){
						lose3();
					}
					else{
						crossRoad();
					}
					break;
                                   
                                  
				}
				break;
			case "east":
				switch(yourChoice){
				case "c1": crossRoad(); break;
				}
				break;
			case "west":
				switch(yourChoice){
				case "c1": fight(); break;
				case "c2": crossRoad(); break;
				}
				break;
			case "fight":
				switch(yourChoice){
				case "c1": playerAttack();break;
				case "c2": crossRoad(); break;
				}
				break;
			case "playerAttack":
				switch(yourChoice){
				case "c1": 
					if(monsterHP<1){
						win();
					}
					else{
						monsterAttack();
					}
					break;
				}
				break;
			case "monsterAttack":
				switch(yourChoice){
				case "c1": 
					if(playerHP<1){
						lose();
					}
					else{
						fight();
					}
					break;
				}
				break;
			case "win":
				switch(yourChoice){
				case "c1": crossRoad();
				}
				break;
				
			}
			
			
		}
	}



        }

