import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.lang.*;
import java.util.*;

public class List {
  private String title;
  private JTextField titleLabel;
  private JButton addCardButton;
  private JPanel fullPanel; //This is the overall panel
  private JPanel topPanel; //This is the panel where the title and add button reside
  private JPanel cardListPanel; //This is the panel where the cards reside
  public ArrayList<Card> cardList = new ArrayList<Card>();
  
  
  public JPanel build(){
    //Top Panel
    topPanel = new JPanel();
    topPanel.setBackground(Color.green);
    topPanel.setPreferredSize(new Dimension(100, 25));
    
    titleLabel = new JTextField (15);
    titleLabel.setEditable(true);
    topPanel.add(BorderLayout.WEST,titleLabel);
    
    addCardButton = new JButton ("Add");
    addCardButton.addActionListener(new AddCardButtonListener());
    topPanel.add(BorderLayout.EAST, addCardButton);
    
    //cardListPanel
    cardListPanel = new JPanel();
    cardListPanel.setBackground(Color.green);
    cardListPanel.setLayout(new BoxLayout(cardListPanel, BoxLayout.Y_AXIS));
    
    JScrollPane cardScroll = new JScrollPane (cardListPanel);
    cardScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    cardScroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
    
    //fullPanel
    fullPanel = new JPanel();
    fullPanel.setLayout(new BoxLayout(fullPanel, BoxLayout.Y_AXIS));
    fullPanel.setPreferredSize(new Dimension(100, 500));
    
    fullPanel.add(BorderLayout.NORTH, topPanel);
    fullPanel.add(BorderLayout.WEST, cardScroll);
    
    return fullPanel;
  }
  
  public class AddCardButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent ev){
      System.out.println("HHHHH");
      Card newCard = new Card ();
      cardList.add(newCard);
      cardListPanel.add(newCard.build());
      cardListPanel.revalidate();
    }
  }
  
  //Getters / Setters
  public String getTitle(){
    return title;
  }
  public void setTitle(String t){
    title = t;
  }
  
}