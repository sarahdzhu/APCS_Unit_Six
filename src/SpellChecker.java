import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SpellChecker {
    public static String[] getDic() throws IOException {
        String[] dictionary= new String [61336];
        Scanner scan= new Scanner(new File("files/words.txt"));
        int count=0;

        while (scan.hasNext()){
            dictionary[count] = scan.next();
            count ++;
        }

        return dictionary;
    }



    public static int wordInDictionary(String word, String [] dictionary)
    {
        int min = 0;
        int max = dictionary.length - 1;
        while (min <= max)
        {
            int mid = (min + max) / 2;
            if (dictionary[mid].compareToIgnoreCase(word) == 0)
                return 0;
            else if (dictionary[mid].compareToIgnoreCase(word) > 0)
                max = mid - 1;
            else
                min = mid + 1;
        }
        return -1;
    }


    public static void main(String [] args) throws IOException
    {
        String[] arr = getDic();
        String currentWord;
        Scanner correctWord = new Scanner(System.in);
        Scanner wrong = new Scanner(new File("files/alice.txt"));
        FileWriter accurate = new FileWriter("files/corrected.txt");
        while (wrong.hasNext())
        {
            currentWord = wrong.next();
            if (wordInDictionary(currentWord, arr) == -1)
            {
                System.out.println("Honey, you are so stupid. You spelled " + currentWord + " wrong :( You wanna change the spelling? Please type Y or N.");
                String answer = correctWord.nextLine();
                if (answer.equals("Y"))
                {
                    System.out.println("Try again darling! ");
                    accurate.write(correctWord.nextLine() + " ");
                }
                else
                {
                    accurate.write(currentWord + " ");
                }
            }
            else
            {
                accurate.write(currentWord + " ");
            }
        }
        accurate.close();
    }
}





