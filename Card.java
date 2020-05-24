import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.lang.*;
import java.util.*;

public class Card {
  private String title;
  private JTextArea cardTitle;
  private JPanel cardPanel;
  private JButton add;
  private JButton expand;
  
  
  public JPanel build (){
    
    cardPanel = new JPanel();
    cardPanel.setPreferredSize(new Dimension(10, 10));
    cardPanel.setBackground(Color.orange);
    
    cardTitle = new JTextArea ();
    
    cardPanel.add(cardTitle);
    
    return cardPanel;
  }
  
  
}