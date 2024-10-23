package Module3_Java_Collections.L1exercise3;

import java.io.*;
import java.util.*;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static final String countriesFile = "countries.txt";
    private static final String rankingFile = "ranking.txt";
    private static final int numQuestions = 10;

    public static void main(String[] args) {
        String user = "";
        String score = "";
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        fileToMap(capitalCities);
        System.out.println("Nombre del Usuario: ");
        user = scanner.next();
        score = String.valueOf((capitalGuesser(capitalCities)));
        createWriteFile(user, score);
    }

    private static void fileToMap(HashMap<String, String> capitalCities){
        try {
            BufferedReader countriesReader = new BufferedReader(new FileReader(countriesFile));
            String line = "";
            while((line = countriesReader.readLine()) != null){
                String[] splitLine = line.split(" ");
                capitalCities.put(splitLine[0], splitLine[1]);
            }
            countriesReader.close();
        } catch (IOException err){
            System.out.println(err.getMessage());
        }
    }

    private static int capitalGuesser(HashMap<String, String>capitalCities){
        int score = 0;
        String shuffleCountry = "";
        for (int i = 0; i < numQuestions; i++){
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
            FileWriter fileCountries = new FileWriter(rankingFile);
            fileCountries.write(user + "\n" + score);
            fileCountries.close();
        } catch (IOException err){
            System.out.println(err.getMessage());
        }
    }
}
