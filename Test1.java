import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
//  w w  w.jav a 2 s. co  m
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class Test1 {
  public static void main(String[] args) {

    String[] listValues = { "Click", "To", "Add", "New", "Values" };
    DefaultListModel<String> model = new DefaultListModel<>();
    for (String s : listValues) {
      model.addElement(s);
    }
    JList<String> list = new JList<>(model);
    MouseListener addListener = new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent me) {
        model.addElement("aa");     
      }
    };
    list.addMouseListener(addListener);
    JOptionPane.showMessageDialog(null, new JScrollPane(list));
  }
}


//model.addElement(CRUD_Interface.firstNameList.get(i));