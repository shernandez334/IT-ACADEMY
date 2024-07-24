package Module3.L1Exercise3;

import java.io.*;
import java.nio.file.DirectoryStream;
import java.util.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String score = "";
        String user = "";
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        fileToMap("countries.txt", capitalCities);
        System.out.println("Nombre del Usuario: ");
        user = scanner.next();
        score = String.valueOf((capitalGuesser(capitalCities)));
        createWriteFile(user, score);
    }

    static public void fileToMap(String file, HashMap<String, String> capitalCities){
        try {
            BufferedReader countriesReader = new BufferedReader(new FileReader(file));
            String line;
            while((line = countriesReader.readLine()) != null){
                String[] splitLine = line.split(" ");
                capitalCities.put(splitLine[0], splitLine[1]);
            }
            countriesReader.close();
        } catch (IOException err){
            err.printStackTrace();
        }
    }

    static public int capitalGuesser(HashMap<String, String>capitalCities){
        int score = 0;
        String shuffleCountry;
        for (int i = 0; i < 10; i++){
            String capit = "";
            List<String> countries = new ArrayList<String>(capitalCities.keySet());
            shuffleCountry = countries.get(0);
            Collections.shuffle(countries);
            while (i == 0 && countries.get(0).equals(shuffleCountry)){
                Collections.shuffle(countries);
            }
            System.out.println("What is the capital of: " + countries.get(0));
            capit = scanner.next();
            if (capit.equals(capitalCities.get(countries.get(0)))){
                score +=1;
                System.out.println(score);
                System.out.println("Correct.");
            } else {
                System.out.println(capit + " is not the capital of " + countries.get(0));
            }
        }
        return score;
    }

    public static void createWriteFile(String user, String score){
        try{
            FileWriter fileCountries = new FileWriter("ranking.txt");
            fileCountries.write(user + "\n" + score);
            fileCountries.close();
        } catch (IOException err){
            err.printStackTrace();
        }
    }
}
