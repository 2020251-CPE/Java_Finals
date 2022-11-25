import java.util.LinkedList;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Dimension;

public class Finals {
    //Array Data
    private static LinkedList<String> names  = new LinkedList<String>();
    private static ArrayList<String> Age  = new ArrayList<String>();


    //COMPONENTS
    private static JFrame MainFrame;
    private static JPanel ListView;
    public static void MainView(){
       

        MainFrame = new JFrame("Calculator");
        MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MainFrame.getContentPane().setBackground(Color.lightGray);
        MainFrame.setResizable(false);




        names.add("Angelo");
        names.add("Denis");
        names.add("Linus");
        names.add("Felix");

        JList nameList = new JList(names.toArray());
        JList nameList1 = new JList(names.toArray()); //should be reversed

        
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
