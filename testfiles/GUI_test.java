package Java_Finals.testfiles;
import java.util.LinkedList;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Dimension;

public class GUI_test {
    //Array Data
    private static LinkedList<String> firstName  = new LinkedList<String>();
    private static ArrayList<String> Age  = new ArrayList<String>();


    //COMPONENTS
    private static JFrame MainFrame;
    private static JPanel ListView;
    public static void MainView(){
       

        MainFrame = new JFrame("Calculator");
        MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MainFrame.getContentPane().setBackground(Color.lightGray);
        MainFrame.setResizable(false);




        firstName.add("Angelo");Age.add("34");
        firstName.add("Denis");Age.add("12");
        firstName.add("Linus");Age.add("32");
        firstName.add("Felix");Age.add("24");

        JList nameList = new JList(firstName.toArray());
        
        nameList.addMouseListener(new MouseAdapter(){
            public static void mousePressed(MouseEvent e){
                for (int i=0;i<firstName.size();i++){
                    System.out.println(firstName.get(i));
                }
            }
        });
        JList nameList1 = new JList(firstName.toArray()); //should be reversed

        
        JTabbedPane ListPane = new JTabbedPane();
        ListPane.setBounds(0,0,200,400);  
            JScrollPane Alphabetical = new JScrollPane(nameList);
            JScrollPane RevAlphabetical = new JScrollPane(nameList1);
        ListPane.add("A-Z",Alphabetical);
        ListPane.add("Z-A",RevAlphabetical);


        JPanel test = new JPanel();
        JTabbedPane DetailsPane = new JTabbedPane();
        DetailsPane.setBounds(200,0,400,400); 
        DetailsPane.add("zxc",test);

        
        MainFrame.add(ListPane);MainFrame.add(DetailsPane);
        MainFrame.setSize(600,440);
        MainFrame.setLayout(null);  
        MainFrame.setVisible(true);
    }
    
    public static void main(String[] args){
        System.out.println("Program Started");
        MainView();
    }
}
