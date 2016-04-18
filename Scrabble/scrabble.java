package Scrabble;

/**
 * Created by Manikandan Sundararajan on 4/17/2016.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class scrabble {

    //Declaring a HashMap that will contain the Scrabble letter values
    static private HashMap<Integer, ArrayList<Character>> charValues = new HashMap<>();

    //Decaring an ArrayList that contains the dictionary of words
    static private ArrayList<String> words = new ArrayList<>();

    public scrabble() throws FileNotFoundException {
        //Initializing the HashMap
        charValues.put(1, new ArrayList<Character>(Arrays.asList('a','e','i','o','u','l','n','s','t','r')));
        charValues.put(2, new ArrayList<Character>(Arrays.asList('d','g')));
        charValues.put(3, new ArrayList<Character>(Arrays.asList('b','c','m','p')));
        charValues.put(4, new ArrayList<Character>(Arrays.asList('f','h','v','w','y')));
        charValues.put(5, new ArrayList<Character>(Arrays.asList('k')));
        charValues.put(8, new ArrayList<Character>(Arrays.asList('j','x')));
        charValues.put(10, new ArrayList<Character>(Arrays.asList('q','z')));

        //Initializing the ArrayList
        Scanner in = new Scanner(new File("src/Scrabble/dictionary.txt"));
        while(in.hasNext()){
            words.add(in.nextLine());
        }
    }

    //Function that calculates the scrabble word value of a given word using the charValues HashMap
    public int wordValue(String word){
        int val = 0;
        for (int i = 0; i < word.length(); i++){
            for (Map.Entry<Integer, ArrayList<Character>> entry : charValues.entrySet()){
                if (entry.getValue().contains(word.charAt(i))){
                    val += entry.getKey();
                }
            }
        }
        return val;
    }

    //Function that takes a string and returns an arraylist of characters contained in the string
    public ArrayList<Character> convertStrToList(String word){
        ArrayList<Character> chars = new ArrayList<Character>();
        for (char c : word.toCharArray()) {
            chars.add(c);
        }
        return chars;
    }

    //Function that calculates the best possible scrabble word from the input arraylist of characters
    public String bestScrabbleWord(ArrayList<Character> charList){
        PriorityQueue<Word> scrabbleQueue = new PriorityQueue<>(new WordComparator());
        //HashMap<String, Integer> scrabbleWordList = new HashMap<>();

        for (int i = 0; i < words.size(); i++){
            int sizeOfWord = words.get(i).length();
            //System.out.println(newMap.get('p'));
            ArrayList<Character> wordList = convertStrToList(words.get(i));

            //Magic line that computes the intersection between the characters in the current word and the characters in the input
            //If the length of the word is equal to the intersection we compute the score for the word and add it to the priority queue
            wordList.retainAll(charList);
            if (sizeOfWord == wordList.size()){
                //scrabbleWordList.put(words.get(i), wordValue(words.get(i)));
                scrabbleQueue.add(new Word(wordValue(words.get(i)), words.get(i)));
            }
            else
                continue;
        }
        return scrabbleQueue.peek().getWord();
    }

    //Custom class to contain both the word and its score
    public class Word{
        private int value;
        private String word;

        public Word(int v, String w){
            value = v;
            word = w;
        }


        private String getWord(){
            return this.word;
        }

        private int getValue(){
            return this.value;
        }
    }

    //Comparator that handles objects of the class Word
    static class WordComparator implements Comparator<Word> {
        public int compare(Word w1, Word w2){
            return w2.getValue() - w1.getValue();
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        scrabble sc = new scrabble();
        ArrayList<Character> ac = new ArrayList<>(Arrays.asList('m','o','o','a','m'));
        System.out.println(sc.bestScrabbleWord(ac));
    }
}
