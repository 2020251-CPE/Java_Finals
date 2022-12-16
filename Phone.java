//package Java_Finals;

import java.util.LinkedList;
import javax.swing.*;
import java.awt.event.MouseEvent;
import javax.swing.event.MouseInputAdapter;


import java.awt.Color;

public class Phone{
    public static LinkedList<LinkedList<String>> db = new LinkedList<LinkedList<String>>();
    public static LinkedList<String> firstNameList = new LinkedList<String>();
    public static LinkedList<String> lastNameList = new LinkedList<String>();
    public static LinkedList<String> BirthdayList = new LinkedList<String>();
    public static LinkedList<String> AddressList = new LinkedList<String>();
    public static LinkedList<String> EmailList = new LinkedList<String>();
    public static LinkedList<String> numberList = new LinkedList<String>();
    //CREATE
    public static void addRow(String fName, String lName, String BDay, String Addr,String email, String number){
        firstNameList.add(fName);
        lastNameList.add(lName);
        BirthdayList.add(BDay);
        AddressList.add(Addr);
        EmailList.add(email);
        numberList.add(number);
    }
    //CREATE with specific index
    public static void InsertRow(int row,String fName, String lName, String BDay, String Addr,String email, String number ){
        try {
            db.get(row);
            firstNameList.add(fName);
            lastNameList.add(lName);
            BirthdayList.add(BDay);
            AddressList.add(Addr);
            EmailList.add(email);
            numberList.add(number);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    // READ a single row
    public static void searchRow(String query, LinkedList<String> field){
        try {
            for (int i = 0; i < field.size(); i++) {
                if (field.get(i).equals(query)) {
                    System.out.println("Result:"+firstNameList.get(i)+" "+lastNameList.get(i)+" "+BirthdayList.get(i)+" "+AddressList.get(i)+" "+EmailList.get(i)+" "+numberList.get(i) );
                }
            }
 
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Query Not Found :(");
        }
    }
    //READ all rows
    public static void getAllRows() {
        for (int i = 0; i < firstNameList.size(); i++) {
            System.out.println(firstNameList.get(i)+" "+lastNameList.get(i)+" "+BirthdayList.get(i)+" "+AddressList.get(i)+" "+EmailList.get(i)+" "+numberList.get(i) );
        }
    }
    //UPDATE in any field
    public static void updateRow(String fName,LinkedList<String> field, String input) {
        try {
            for (int i = 0; i < firstNameList.size(); i++) {
                if (firstNameList.get(i).equals(fName)) {
                    String oldValue = field.get(i);
                    field.set(i, input);
                    System.out.println(oldValue + " is now " + input);
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Query Not Found :(");
        }
    }
    //DELETE a row
    public static void deleteRow(String fName){
        try {
            for (int i = 0; i < firstNameList.size(); i++) {
                if (fName.equals(firstNameList.get(i))){
                    firstNameList.remove(i);
                    lastNameList.remove(i);
                    BirthdayList.remove(i);
                    AddressList.remove(i);
                    EmailList.remove(i);
                    numberList.remove(i);
                }
            }
        } catch (Exception e) {
            System.out.println("Query Not Found :(");
        }
        
    }
    //SORT first name (used for GUI only, not really arranging all fields)
    public static String[] bubbleSort(LinkedList<String> arr){
        String[] array = arr.toArray(String[]::new);
        int size = array.length;  
        for(int i = 0; i<size-1; i++){  
            for (int j = i+1; j<array.length; j++){  
            //compares each elements of the array to all the remaining elements  
                if(array[i].compareTo(array[j])>0){  
                    //swapping array elements  
                    String temp = array[i];  
                    array[i] = array[j];  
                    array[j] = temp;  
                }  
            }  
        }  
        return array; //returns String[]
    }
    public static void mouseClicked(MouseEvent event){
        System.out.println("test"); 
    }
    public static JFrame mainF;
    public static JScrollPane selection;
    public static void app(){
        mainF = new JFrame("Phonebook");
        mainF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainF.getContentPane().setBackground(Color.LIGHT_GRAY);
        mainF.setResizable(false);
        String[] names = bubbleSort(firstNameList);
            JList<String> items = new JList<String>(names);  
            items.addMouseListener(new MouseInputAdapter() {
                
               @Override
               public void mouseClicked(MouseEvent e) {
                   // TODO Auto-generated method stub
                   System.out.println("lol");
               }
            });
                
        selection = new JScrollPane(items);
            selection.setBounds(10,10,150,240);
            selection.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
                   
        mainF.add(selection);
        mainF.setSize(500,300);
        mainF.setLayout(null);  
        mainF.setVisible(true);
    }
    public static void main(String[] args) {
        //Data Structuring
        db.add(firstNameList);
        db.add(lastNameList);
        db.add(BirthdayList);
        db.add(AddressList);
        db.add(EmailList);
        db.add(numberList);
        //adding Sample data
        addRow("Joe", "Mama", "04-20-6969", "YoMama", "ElonMusk@gmail.com", "09255224380");
        addRow("Jedrick", "Idol", "02-20-1993", "Worldwide", "BestTiktoker@tiktok.com", "09876543210");
        addRow("Angelo", "Recio", "07-02-2001", "Balete", "2020251@ub.edu.ph", "097725778170");
        //initializing app
        app();
        addRow("Nice", "Guy", "01-01-2001", "SimpTown", "allWomenAreQueens@gmail.com", "09696969696");
        selection.revalidate();
    }
    
}


