
:: NOTE->java should be intalled  and added to Path Environment
:: Maybe running this Batch file wont work and if that happens, just copy each line of command the terminal/cmd

:: MAIN COMMANDS
    :: Compiling files
javac CRUD_Interface.java
javac -d . CRUD_Interface.java
javac MainF.javac
javac -d . MainF.java
javac Phonebook.java
javac -d . Phonebook.java
    :: Running the Main File
:: java phonebook.Phonebook (Optional, uncomment to enable)
    ::Making a .jar file
jar -cvfm Phonebook.jar manifest.mf phonebook/ *.class
    :: Run the .jar file
java -jar Phonebook.jar
