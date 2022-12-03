
import java.util.ArrayList;

public class Phone{
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
    public static void deleteRow(String fName){
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
    }
    public static void searchRow(String fName){
        try {
            for (int i = 0; i < firstNameList.size(); i++) {
                if (firstNameList.get(i).equals(fName)) {
                    System.out.println("Result:" + firstNameList.get(i) );
                    break;
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Query Not Found :(");
        }

    }
    public static void getAllRows() {
        for (int i = 0; i < firstNameList.size(); i++) {
            System.out.println(firstNameList.get(i) + lastNameList.get(i)+BirthdayList.get(0)+AddressList.get(i)+EmailList.get(i)+numberList.get(i));
        }
    }
    public static void main(String[] args) {
        //Data structuring
        db.add(firstNameList);
        db.add(lastNameList);
        db.add(BirthdayList);
        db.add(AddressList);
        db.add(EmailList);
        db.add(numberList);

        //Adding Sample Data
        addRow("Angelo", "Recio", "07-02-2001", "Balete", "2020251@ub.edu.ph", "097725778170");
        addRow("Joe", "Mama", "04-20-6969", "YoMama", "ElonMusk@gmail.com", "09255224380");
        

        System.out.println("hi");
        System.out.println(db.get(0));
        getAllRows();
    }
}


