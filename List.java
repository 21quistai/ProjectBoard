import javax.swing.*;
import java.awt.Event.*;
import java.awt.*;


public class List {
  private String title;
  private JTextField titleLabel;
  public JPanel listPanel;
  
  public List (){
    build();
  }
  
  public JScrollPane build(){
    listPanel = new JPanel();
    titleLabel = new JTextField ("title");
    titleLabel.setEditable(true);
    titleLabel.setColumns(15);
    
    listPanel.add(titleLabel);
    listPanel.setBackground(Color.green);
    listPanel.setPreferredSize(new Dimension(100, 500));
    JScrollPane listScroll = new JScrollPane (listPanel);
    listScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    listScroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
    
    return listScroll;
  }
  
  //Getters / Setters
  public String getTitle(){
    return title;
  }
  public void setTitle(String t){
    title = t;
  }
  
}