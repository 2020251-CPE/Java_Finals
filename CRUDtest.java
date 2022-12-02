
import java.util.ArrayList;

public class CRUDtest {
    public static ArrayList<ArrayList<String>> db = new ArrayList<ArrayList<String>>();
    public static ArrayList<String> firstNameList = new ArrayList<String>();
    public static ArrayList<String> lastNameList = new ArrayList<String>();
    public static ArrayList<String> BirthdayList = new ArrayList<String>();
    public static ArrayList<String> AddressList = new ArrayList<String>();
    public static ArrayList<String> EmailList = new ArrayList<String>();
    public static ArrayList<String> numberList = new ArrayList<String>();

    public static void addRow(String Fname, String lName, String BDay, String Addr,String email, String number){
        firstNameList.add(Fname);
        lastNameList.add(lName);
        BirthdayList.add(BDay);
        AddressList.add(Addr);
        EmailList.add(email);
        numberList.add(number);
    }
    public static void InsertRow(int row,String Fname, String lName, String BDay, String Addr,String email, String number ){
        try {
            db.get(row);
            firstNameList.add(Fname);
            lastNameList.add(lName);
            BirthdayList.add(BDay);
            AddressList.add(Addr);
            EmailList.add(email);
            numberList.add(number);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        
    }
}
