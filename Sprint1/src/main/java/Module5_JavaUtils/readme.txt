To execute a Java file from the command interface,
you must first compile all .java files, using the following command:

javac name_of_the_file1.java, name_of_the_file2.java

And so on with all files required to run your main.

javac Main.java ClassA.java ClassB.java

If everything works without error, there will be no output.
The compiler will create the name_of_the_file1.class,
which contains the bytecode, in the current working directory.

Then, run the file where your main is:
java Main.

LEVEL 1
Exercise 1-2-3-4
javac Main.java Directory.java
java Main

Exercise 5
javac Main.java Directory.java
java Main

LEVEL 2
Exercise 1
javac Main.java Directory.java
java Main

LEVEL 3
Exercise 1
javac Main.java Directory.java EncryptionAES.java
java Main
