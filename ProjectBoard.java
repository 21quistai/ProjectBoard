import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.lang.*;
import java.util.*;

public class ProjectBoard {
  private JFrame frame;
  private JPanel mainPanel;
  private JPanel boardPanel;
  private JButton addListButton;
  private ArrayList<List> listslist = new ArrayList<List>();
  private JPanel optionsPanel;
  private JButton save;
  
  public static void main (String[] args){
    ProjectBoard board = new ProjectBoard ();
    board.build();
  }
  
  public void build (){
    frame = new JFrame ("Board");
    mainPanel = new JPanel();
    mainPanel.setBackground(Color.blue);
    //board
    buildBoard();
    buildOptions();
    
    
    //options
    
    frame.getContentPane().add(mainPanel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //frame.setSize(900,600);
    frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
    frame.setVisible(true);
  }
  
  public void buildBoard(){
    boardPanel = new JPanel();
    boardPanel.setLayout(new BoxLayout(boardPanel, BoxLayout.X_AXIS));
    boardPanel.setPreferredSize(new Dimension(800, 800));
    addListButton = new JButton("add");
    addListButton.addActionListener(new AddListButtonListener());
    boardPanel.add(addListButton);
    
    JScrollPane boardScroll = new JScrollPane (boardPanel);
    boardScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
    boardScroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
    mainPanel.add(BorderLayout.WEST, boardScroll);
  }
  /** The option panel 
    * Creates a new panel, adds a save button*/
  
  public void buildOptions(){
    optionsPanel = new JPanel();
    optionsPanel.setLayout(new BoxLayout(optionsPanel, BoxLayout.Y_AXIS));
    save = new JButton("Save");
    optionsPanel.add(save);
    
    mainPanel.add(BorderLayout.EAST, optionsPanel);
  }
  
  /** Creates a new List when the AddlistButton is pressed
    * Creates a new List, adds it to the Listslist, 
    * displays it, refreshes the panel*/
  
  public class AddListButtonListener implements ActionListener{
    public void actionPerformed(ActionEvent ev){
      List newList = new List();
      listslist.add(newList);
      boardPanel.add(newList.build());
      boardPanel.revalidate();
    }
  }
  
  
}