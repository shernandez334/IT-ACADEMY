# How to Compile and Execute a Java File

To execute a Java file from the command line, you must first compile all `.java` files, using the following command:

```bash
javac name_of_the_file1.java name_of_the_file2.java
```

And so on with all files required to run your main.

```bash
javac Main.java ClassA.java ClassB.java
```

If everything works without error, there will be no output. The compiler will create the name_of_the_file1.class,
which contains the bytecode, in the current working directory.

Then, run the file where your main is:
```bash
java Main.
```

## LEVEL 1
Exercise 1-2-3-4
```bash
javac Main.java Directory.java
java Main
```

Exercise 5
```bash
javac Main.java Directory.java
java Main
```

## LEVEL 2
Exercise 1
```bash
javac Main.java Directory.java
java Main
```

## LEVEL 3
Exercise 1
```bash
javac Main.java Directory.java EncryptionAES.java
java Main
```