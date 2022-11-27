import java.util.LinkedList;
import java.util.ArrayList;
import java.util.HashMap;

public class test {
    private static LinkedList<String> firstName  = new LinkedList<String>();
    private static ArrayList<String> Age  = new ArrayList<String>();
    
    public static void main(String[] args) {

        firstName.add("Angelo");Age.add("34");
        firstName.add("Denis");Age.add("12");
        firstName.add("Linus");Age.add("32");
        firstName.add("Felix");Age.add("24");

        System.out.println(firstName);
        System.out.println(firstName.get(2));

        LinkedList<LinkedList<String>> fullList = new LinkedList<LinkedList<String>>();
        for (int i = 0;i < firstName.size();i++)   {
            System.out.println(firstName.get(i) + " " + Age.get(i));
            LinkedList<String> temp = new LinkedList<String>();
            temp.add(firstName.get(i));
            temp.add(Age.get(i));
            fullList.add(temp);
        }   
        //ACCESING fullList ( LinkedList<LinkedList<String>> )
            System.out.println("\nACCESING fullList");
            System.out.println(fullList);
            System.out.println(fullList.get(1));
            System.out.println(fullList.get(1).get(0));
            for(int i = 0;i<fullList.size();i++){ //Selects and loop every linkedList
                System.out.println(fullList.get(i));
            }
            for(int i = 0;i<fullList.size();i++){ //Selects and loop every name in every linkedList
                System.out.println(fullList.get(i).get(0));
                //Add code to get all selected data and store it into another LinkedList
            }
        //ADDING on fullList
            System.out.println("ADDING fullList");
            LinkedList<String> temp = new LinkedList<String>();
            temp.add("Johnny"); //NOTE: Arrangement of String to be added is important
            temp.add("22");
            fullList.add(temp);
            System.out.println(fullList);
        // UPDATING on fullList
            System.out.println("UPDATING fullList");
            LinkedList<String> update = new LinkedList<String>(); update.add("Jojo"); update.add("16");
            fullList.set(1,update); //NOTE: arguements: .set(int index, var value)
            System.out.println(fullList);
        // REMOVING on fullList
            System.out.println("REMOVING fullList");
            fullList.remove(1);
            System.out.println(fullList);
        //SORTING on FullList
        //NOTE: we'll use bubble sort for siimplest sorting algorith
        





        LinkedList<HashMap<String,String>> fullList2 = new LinkedList<HashMap<String,String>>(); 
        for (int i=0 ; i<firstName.size() ; i++)   {
            HashMap<String,String> tempHashMap = new HashMap<String,String>();
            tempHashMap.put("FirstName",firstName.get(i));
            tempHashMap.put("Age",Age.get(i));
            fullList2.add(tempHashMap);
        }  
        //ACCESING fullList2 ( LinkedList<HashMap<String,String>> )
            System.out.println("\nACCESING fullList2");
            System.out.println(fullList2);
            System.out.println(fullList2.get(1));
            System.out.println(fullList2.get(1).get("FirstName"));
            for(int i = 0;i<fullList2.size();i++){ //Selects and loop every linkedList
                System.out.println(fullList2.get(i));
            }
            for(int i = 0;i<fullList2.size();i++){ //Selects and loop all name in every linkedList
                System.out.println(fullList2.get(i).get("FirstName"));
                //Add code to get all sepected data and store it into another LinkedList
            }
        //ADDING on fullList
            HashMap<String,String> temp2 = new HashMap<String,String>();
            temp2.put("FirstName","Johnny");
            temp2.put("Age","22");
            fullList2.add(temp2);
            System.out.println(fullList2);


    }

}
