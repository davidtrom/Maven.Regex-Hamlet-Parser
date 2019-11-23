import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.*;


/**
 * Created by thook on 10/7/15.
 */
public class HamletParser {

    private String hamletData;
    private Pattern pattern;
    private Matcher matcher;

    public HamletParser() throws FileNotFoundException {
        this.hamletData = loadFile();
    }

    private String loadFile(){
        //ClassLoader classLoader = getClass().getClassLoader();
        File file = new File("/Users/david/Desktop/TrombelloProjects/IntelliJ Labs/Maven.Regex-Hamlet-Parser/src/main/resources/hamlet.txt");
        StringBuilder result = new StringBuilder("");

        try(Scanner scanner = new Scanner(file)){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                result.append(line).append("\n");
            }

            scanner.close();
        }catch(IOException e){
            e.printStackTrace();
        }

        return result.toString();
    }

//    private String myFileLoader () throws FileNotFoundException {
//        StringBuilder sb = new StringBuilder("");
//        File file = new File("/Users/david/Desktop/TrombelloProjects/IntelliJ Labs/Maven.Regex-Hamlet-Parser/src/main/resources/hamlet.txt");
//        Scanner scanner = new Scanner(file);
//            while(scanner.hasNextLine()){
//                String line = scanner.nextLine();
//                sb.append(line).append("\n");
//            }
//        return sb.toString();
//    }


    public String getHamletData(){
        return hamletData;
    }

    public void findHamlet () throws FileNotFoundException {
        System.out.println(hamletData);
    }

    public String replaceHamlet () {
        String regex = "Hamlet";
        pattern = Pattern.compile(regex);   //pattern to look for in the data
        matcher = pattern.matcher(hamletData);  //matches the given pattern in the data
        String newHamlet  =matcher.replaceAll(("Leon"));    //the matches get replaced with the new word in parenthesis
        return newHamlet;
        //System.out.println(newHamlet);
    }

    public String replaceHoratio () {
        String regex = "Horatio";
        pattern = Pattern.compile(regex);   //pattern to look for in the data
        matcher = pattern.matcher(hamletData);  //matches the given pattern in the data
        String newHamlet  =matcher.replaceAll(("Tariq"));    //the matches get replaced with the new word in parenthesis
        return newHamlet;
    }

}
