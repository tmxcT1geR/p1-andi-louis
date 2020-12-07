// Louis Kruysse 19-123-041
// Andreas Dobler 19-105-238
// P1 Übungsserie 8 Aufgabe 8-1

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Dictionary extends HashMap<String, List<String>> {
    public void addTranslations(String key, String[] arr){
        List<String> value = Arrays.asList(arr);
        put(key, value);
    }

    public List<String> translate(String word) throws WordNotFoundException{
        //WordNotFoundException Problem = new WordNotFoundException(word);
        //if(get(word) == null){
        //    throw Problem;
        //}
        if(get(word) == null){
           return Arrays.asList(new String[]{"Word not found.\n"});
        }
        return get(word);
    }
}
