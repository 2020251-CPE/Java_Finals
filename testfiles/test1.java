package Java_Finals.testfiles;
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
    //Sample Bubblesort(https://www.javatpoint.com/bubble-sort-in-java)
    // to be modified to sort LinkList<Object>
    public static void BubbleSort(LinkedList<Entry> arr){
        int n = arr.size();
        LinkedList<Entry> temp = new LinkedList<Entry>();
        for (int i=0; i<n; i++){
            for (int j=0;j<(n-1);j++){
                //swap elements  
                if(arr[j-1] > arr[j]){ 
                temp = arr[j-1];  
                arr[j-1] = arr[j];  
                arr[j] = temp;  
                }  
            }
        }
    }
    
    public static void main(String[] args) {
        LinkedList<Entry> EntryList = new LinkedList<Entry>();
        
        //CREATING ENTRY
            //other Options: addFirst(), addLast()
        EntryList.add(new Entry("Angelo","Recio",21));
        EntryList.add(new Entry("Thomas","The Tank Engine",25));
        EntryList.add(new Entry("Barrack","Obama",25));
        EntryList.add(new Entry("Aira","Elchico",22));
        //READING ENTRY
        System.out.println(EntryList.get(0).firstName); //other Options: getFirst(), getLast()
        for (Entry element: EntryList){
            System.out.println(element.firstName + " " + element.Age);
        }
        System.out.println("\n");
        //UPDATING ENTRY
        EntryList.get(0).firstName = "Rafael";
        for (Entry element: EntryList){
            System.out.println(element.firstName + " " + element.Age);
        }
        System.out.println("\n");
        //DELETING ENTRY
        EntryList.remove(0); //other Options: removeFirst(), removeLast()
        for (Entry element: EntryList){
            System.out.println(element.firstName + " " + element.Age);
        }
        // NEXT: SORTING ENTRY

    }
}
