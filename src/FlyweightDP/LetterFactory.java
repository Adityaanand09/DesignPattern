package FlyweightDP;

import java.util.HashMap;
import java.util.Map;

public class LetterFactory {
    Map<Character, ILetter> cache = new HashMap<>();

    public ILetter createLetter(char ch){
        if(cache.containsKey(ch)){
            return cache.get(ch);
        }

        ILetter newChar = new Letter(ch,"Times New Roman", 16);
        cache.put(ch,newChar);
        return  newChar;
    }
}
