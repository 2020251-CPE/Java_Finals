/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package phonebook;


/**
 *
 * @author user
 */
public class Phonebook implements CRUD_Interface {

    public static void main(String[] args) {
        //Initialize Data Structure
        CRUD_Interface.DB_Initialize();
        //Insert Sample Data
        System.out.println("Adding Sample Data");
        CRUD_Interface.addRow("Joe", "Mama", "20/04/6969", "YoMama", "ElonMusk@gmail.com", "09255224380");
        CRUD_Interface.addRow("Jedrick", "Idol", "20/02/1993", "Worldwide", "BestTiktoker@tiktok.com", "09876543210");
        CRUD_Interface.addRow("Angelo", "Recio", "02/07/2001", "Balete", "2020251@ub.edu.ph", "097725778170");
        //Initialize GUI
        MainF app = new MainF();
        app.setVisible(true);
        System.out.println("Hello World!");
        
        
    }
}
