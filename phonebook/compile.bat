
:: NOTE->java should be intalled  and added to Path Environment
:: Maybe running this Batch file wont work and if tha happens, jus copy each line of command the terminal/cmd

:: Compiling files
javac CRUD_Interface.java
javac -d . CRUD_Interface.java
javac MainF.javac
javac -d . MainF.javac
javac Phonebook.java
javac -d . MainF.javac
:: Running the Main File
java phonebook.Phonebook
::Making a .jar file
jar -cvfm Phonebook.jar manifest.mf phonebook/ *.class
:: Run the .jar file
java -jar Phonebook.jar
