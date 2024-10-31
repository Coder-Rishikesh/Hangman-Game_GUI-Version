//Activity 8.1
//Show The Menu Option Start Window

package game;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import javax.swing.JOptionPane;

public class Menu extends JFrame implements ActionListener
{
    JButton option1;
    JButton option2;
    JButton option3;
    JLabel name;
    
    public Menu()
    {
        option1 = new JButton("Play Game");
        option2 = new JButton("View Instructions");
        option3 = new JButton("Exit");
        name = new JLabel("HANGMAN");
        name.setFont(new Font("Serif", Font.PLAIN, 24));
        
        setTitle("Hangman Game");
        setSize(300,200);
        setResizable(false);
        setVisible(true);
        
        option1.addActionListener(this); 
        option2.addActionListener(this); 
        option3.addActionListener(this); 
    }
    
    public void actionPerformed(ActionEvent e) 
    { 
        if(e.getSource() == option1) 
        { 
            GameWindow obj = new GameWindow(); 
            obj.startGame(); 
        } 
        else if(e.getSource() == option2)
        { 
            JOptionPane.showMessageDialog(this, 
                "*********************************************************************************************\n" +
                "Hangman Game Instructions\n\n" +
                "**Objective**  \n" +
                "Guess the hidden word by suggesting letters before the hangman is fully drawn.\n\n" +
                "**How to Play**  \n" +
                "1. **Start the Game:** Click Start to begin a new game.  \n" +
                "2. **Guess a Letter:** Type a letter and click Guess or press Enter.  \n" +
                "3. **Correct Guess:** If the letter is in the word, it will appear in the correct position(s).  \n" +
                "4. **Incorrect Guess:** If the letter is not in the word, a part of the hangman will be drawn.  \n" +
                "5. **Win the Game:** Guess all the letters in the word before the hangman is fully drawn.  \n" +
                "6. **Lose the Game:** If the hangman is fully drawn before you guess the word, you lose.\n\n" +
                "**Tips**  \n" +
                "1. Start with common vowels a, e, i, o, u and frequently used consonants s, t, r, n.  \n" +
                "2. Pay attention to the length of the word and any letters already revealed. Use the hints provided if you get stuck.\n\n" +
                "**Game Controls**  \n" +
                "- **Start:** Begin a new game.  \n" +
                "- **Guess:** Submit your letter guess.  \n" +
                "- **Hint:** Get a hint for the current word (limited use).  \n" +
                "- **Reset:** Restart the current game.\n\n" +
                "**Have Fun!**  \n" +
                "Enjoy playing and improving your spelling skills!", 
                "Instructions", JOptionPane.INFORMATION_MESSAGE);
        } 
        else if(e.getSource() == option3) 
        { 
            System.exit(0); 
        } 
    } 
    
    public void addComponent()
    {
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        
        c.gridx = 0;
        c.gridy = 0;
        c.weighty = 0.1;
        c.anchor = c.CENTER;
        add(name,c);
        
        c.gridx = 0;
        c.gridy = 1;
        c.fill = c.HORIZONTAL;
        add(option1,c);
        
        c.gridx = 0;
        c.gridy = 2;
        c.fill = c.HORIZONTAL;
        add(option2,c);
        
        c.gridx = 0;
        c.gridy = 3;
        add(option3,c);
    }
}
