package Java_Finals.packages;

import java.util.ArrayList;
import javax.swing.*;
import java.awt.Color;

public class Phone{
    public static ArrayList<ArrayList<String>> db = new ArrayList<ArrayList<String>>();
    public static ArrayList<String> firstNameList = new ArrayList<String>();
    public static ArrayList<String> lastNameList = new ArrayList<String>();
    public static ArrayList<String> BirthdayList = new ArrayList<String>();
    public static ArrayList<String> AddressList = new ArrayList<String>();
    public static ArrayList<String> EmailList = new ArrayList<String>();
    public static ArrayList<String> numberList = new ArrayList<String>();
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
    public static void searchRow(String query, ArrayList<String> field){
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
    public static void updateRow(String fName,ArrayList<String> field, String input) {
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
    public static String[] bubbleSort(ArrayList<String> arr){
        String[] countries = arr.toArray(String[]::new);
        int size = countries.length;  
        for(int i = 0; i<size-1; i++){  
            for (int j = i+1; j<countries.length; j++){  
            //compares each elements of the array to all the remaining elements  
                if(countries[i].compareTo(countries[j])>0){  
                    //swapping array elements  
                    String temp = countries[i];  
                    countries[i] = countries[j];  
                    countries[j] = temp;  
                }  
            }  
        }  
        return countries; //returns String[]
    }
    public static JFrame mainF;
    public static void app(){
        mainF = new JFrame("Phonebook");
        mainF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainF.getContentPane().setBackground(Color.GRAY);
        mainF.setResizable(false);

        mainF.setSize(500,300);
        mainF.setLayout(null);  
        mainF.setVisible(true);
    }
    public static void main(String[] args) {
        
    }
    
}


