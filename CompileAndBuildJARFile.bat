
:: NOTE->java should be installed and added to Path Environment to work
:: Maybe running this Batch file wont work and if that happens, just copy each line of command to the terminal/cmd and press enter

cd phonebook
:: MAIN COMMANDS
    :: Compiling files
javac CRUD_Interface.java
javac -d . CRUD_Interface.java
javac MainF.java
javac -d . MainF.java
javac Phonebook.java
javac -d . Phonebook.java
    :: Running the Main Java File
:: java phonebook.Phonebook (Optional, uncomment to enable)
    ::Creating Manifest File
echo Main-Class: phonebook.Phonebook > manifest.mf  
    ::Making .jar files
jar -cvfm Phonebook.jar manifest.mf phonebook/ *.class
jar -cvfm ../Phonebook.jar manifest.mf phonebook/ *.class    
    :: Run the .jar file
cd ..
java -jar Phonebook.jar
::PAUSE
