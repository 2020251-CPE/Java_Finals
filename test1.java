import java.util.LinkedList;

class Entry{
    String firstName;
    String lastName;
    int Age;

    Entry(String fName,String lName,int age){
        firstName = fName;
        lastName = lName;
        Age = age;

    }

}

public class test1 {
    
    public static void main(String[] args) {
        LinkedList<Entry> EntryList = new LinkedList<Entry>();
        EntryList.add(new Entry("Angelo","Recio",21));
        EntryList.add(new Entry("Aira","Elchico",22));

        System.out.println(EntryList.get(0).firstName);
        for (Entry element: EntryList){
            System.out.println(element.firstName);
        }
        
    }
}
