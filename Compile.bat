
:: NOTE->java should be installed and added to Path Environment to work
:: Maybe running this Batch file wont work and if that happens, just copy each line of command to the terminal/cmd and press enter
@echo off 
cd phonebook
:: MAIN COMMANDS
    :: Compiling files
echo COMPILING JAVA...
javac -d . CRUD_Interface.java
javac -d . MainF.java
javac -d . Phonebook.java
    ::Creating Manifest File
echo CREATING MANIFEST FILE...
echo Main-Class: phonebook.Phonebook > manifest.mf  
    ::Making .jar files
echo CREATING .JAR FILE...
jar -cvfm Phonebook.jar manifest.mf phonebook/ *.class
jar -cvfm ../Phonebook.jar manifest.mf phonebook/ *.class    
echo COMPILATIONS COMPLETE
echo RUNNING FILE
cd ..
java -jar Phonebook.jar
