package files.projects.project_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

public class GibberishWriter implements Iterator<String>{
    
    private ArrayList<ContextData> contextData;

    private int contextSize;

    private ContextData lastContext;

    public GibberishWriter(int contextSize) {
        this.contextSize = contextSize;
        this.contextData = new ArrayList<>();
        this.lastContext = null;
        
    }

    @Override
    public boolean hasNext() throws NoSuchElementException {
        if (this.lastContext != null) {
            return this.lastContext.getFollowingWord(0) != null;
        }
        return true;
    }

    @Override
    public String next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }

        Random r = new Random();
        if (this.lastContext == null) {
            System.out.println("lastContext is null");
            this.lastContext = this.contextData.get(r.nextInt(this.contextData.size()));
        }
    
        int randIndex = r.nextInt(this.getContextData(Collections.binarySearch(this.contextData, this.lastContext)).numOccurences());
        
        String returnString = this.lastContext.getFollowingWord(randIndex);
        String[] newContextArray = new String[this.contextSize];
        
        for (int i = 0; i < this.contextSize; i++) {
            newContextArray[i] = this.lastContext.getContext().getWord(i);
        }
        
        GibberishWriter.updateContext(newContextArray, returnString);
        System.out.println("old context: " + this.lastContext.getContext().toString());
        System.out.println("new context: " + Arrays.toString(newContextArray));
        System.out.println("index of next context: " + Collections.binarySearch(this.contextData, new ContextData(new Context(newContextArray))));
        System.out.println("next context validated: " + this.getContextData(Collections.binarySearch(this.contextData, new ContextData(new Context(newContextArray)))).getContext().toString());
        this.lastContext = this.getContextData(Collections.binarySearch(this.contextData, new ContextData(new Context(newContextArray))));
        
        return returnString;
    }

    public int getContextSize() {
        return this.contextSize;
    }

    public ContextData getContextData(int index) {
        return this.contextData.get(index);
    }

    public static ContextData addContextData(Context context, LinkedList<ContextData> ll) {
        LLIterator<ContextData> lli = ll.iterator(); // iterator for looping through linked list
        ContextData save = new ContextData(context);
            if (lli.hasNext()) {
                GibberishWriter.ContextData currentNode = lli.next();
                while (context.compareTo(currentNode.getContext()) > 0 && lli.hasNext()) { // finding the node that is just after where the input should go
                    currentNode = lli.next();
                }

                // 3 cases for if the words is already in, there is no next element, or just regular
                if (context.compareTo(currentNode.getContext()) == 0) {
                    return currentNode;
                } else if (context.compareTo(currentNode.getContext()) < 0) {
                    lli.addBefore(save);
                    return save;
                } else {
                    lli.addAfter(save);
                    return save;
                }
            } else { // for adding to the empty linked list
                ll.addToFront(save);
                return save;
            }
        
    }

    public void addDataFile(String FileName) {
        LinkedList<ContextData> llContextData = this.toLinkedList();
        File file = new File("C:\\Users\\Stick\\2024 Semester 1\\CSDS_132\\src\\main\\java\\files\\projects\\project_4\\" + FileName); // whoever runs this will have to change it

        try {
            Scanner sc = new Scanner(file);
            int numWords = 0;
            String[] context = new String[this.contextSize];
            while (sc.hasNext()) {
                String nextWord = sc.next();
                if (numWords < this.contextSize) {
                    context[numWords] = nextWord;
                    numWords++;
                } else {
                    Context currentContext = new Context(context);
                    ContextData currentContextData = addContextData(currentContext, llContextData);
                    currentContextData.addFollowingWord(nextWord);
                    updateContext(context, nextWord);
                }
            }

            this.contextData = llContextData.toArrayList();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public LinkedList<ContextData> toLinkedList() {
        LinkedList<ContextData> llContextData = new LinkedList<>();
        for (int i = 0; i < this.contextData.size(); i++) {
            llContextData.addToEnd(this.contextData.get(i));
        }
        return llContextData;
    }

    public static void updateContext(String[] context, String newWord) {
        for (int i = context.length - 1; i > -1; i--) {
            String wordBehind = context[i];
            context[i] = newWord;
            newWord = wordBehind;
        }

    }

    /**
     * the main entry point into the program, takes 3 command line args, the file name with .txt at the end, the size of each context, and the number of words to output. then runs the program for that ammount of words
     */
    public static void main(String[] args) {

        String fileName = args[0];
        int contextSize = Integer.parseInt(args[1]);
        int numWordsOutput = Integer.parseInt(args[2]);

        ContextData u = new ContextData(new Context(new String[] {"aaaaay", "jpegmafia", "going"}));
        ContextData v = new ContextData(new Context(new String[] {"jpegmafia", "going", "gargleblast"}));
        System.out.println("u compared to v: " + u.compareTo(v));

        GibberishWriter g = new GibberishWriter(contextSize);
        g.addDataFile(fileName);
        System.out.println("running...");
        int i = 0;
        try {
            while (g.hasNext() && i < numWordsOutput) {
                System.out.println(g.next());                
                i++;
            }
        } catch (NoSuchElementException e) {
            System.out.println("there is no next value");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("you got a context with a next value that makes the context the last context in the text sample. it also happens that that last context is unique, so there is no next value for it :/");
        }

        System.out.println("ran");
        
    }


    /**
     * represents a specific word and the number of times it has been counted in the sample
     */
    public static class WordData {

        // holds the word this class represents
        private String word;

        // the number of times this word appears in the sample
        private int count;

        /**
         * the constructor, sets the word to the input and the count to 1
         * @param word the word to be set
         */
        public WordData(String word) {
            this.word = word;
            this.count = 1;
        }

        /**
         * increments the count field
         */
        public void incrementCount() {
            this.count += 1;
        }

        /**
         * gets the word field
         * @return a word of type String
         */
        public String getWord() {
            return this.word;
        }

        /**
         * gets the count field
         * @return a number of type int
         */
        public int getCount() {
            return this.count;
        }

    }


    /**
     * a class representing a context, ie a list of words. it implements comparable
     * includes the methods length, toString, compareTo, equals, and getWord
     */
    public static class Context implements Comparable<Context>{

        // the context, contains a list of words
        private String[] context;

        /**
         * the constructor, sets the context to the input using System.arraycopy
         * @param context the context to be set in the field, a String[]
         */
        public Context(String[] context) {
            this.context = new String[context.length];
            System.arraycopy(context, 0, this.context, 0, context.length);
        }

        /**
         * gets the length of the context
         * @return the length of the context as an int
         */
        public int length() {
            return this.context.length;
        }

        /**
         * overrides the toString method to join the words in the context into pairs seperated by a space\
         * @return returns a String with each word in the context paired together, except for if the length of the context is odd, in which case the last word is on its own
         */
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder(); // a stringbuilder for appending to

            // goes by 2 and concatenates the ith and ith + 1 together 
            for (int i = 0; i < this.length(); i += 2) {
                if (i == this.length() - 1) { // edge case
                    sb.append(this.context[this.context.length - 1]);
                } else {
                    sb.append(this.context[i]);
                    sb.append(this.context[i + 1]);
                    if (i != this.length() - 2) {
                        sb.append(" ");
                    }
                }
            
            }
            return sb.toString();
        }

        /**
         * gets the word in the context and index i
         * @param i the index of the word to be gotten
         * @return the word as a String
         */
        public String getWord(int i) {
            return this.context[i];
        }

        /**
         * overrides the equals method to compare the length and words in the context
         * @return returns a boolean representing if the length and the words are the same in both contexts
         */
        @Override
        public boolean equals(Object o) {
            if (o instanceof Context) {
                Context c = (Context)o; // make it type Context

                if (this.length() != c.length()) { // if the lengths are not equal, neither are the Contexts
                    return false;
                }

                // looping through each context, comparing each word
                for (int i = 0; i < this.length(); i++) {
                    if (!(this.getWord(i).equals(c.getWord(i)))) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }

        /**
         * overrides the compareTo method to compare each word in the context lexographically and add them up
         * @param c the context to be compared to, of type Context
         * @return an int representing if this is smaller, equal to, or bigger than context(negative, 0, or positive)
         */
        @Override
        public int compareTo(Context c) {
            int sum = 0; // the sum of the strings being compared
            int length = this.length(); // the smaller length, compareTo will only be based on the same number of elements

            if (this.length() < c.length()) { // if the c length is smaller, use that
                length = c.length();
            }

            ArrayList<String> thisContextPadded = new ArrayList<>();
            ArrayList<String> contextPadded = new ArrayList<>();

            for (int i = 0; i < length; i++) {
                if (!(i > this.length() - 1)) {
                    thisContextPadded.add(this.context[i]);
                } else {
                    thisContextPadded.add("");
                }

                if (!(i > c.length() - 1)) {
                    contextPadded.add(c.context[i]);
                } else {
                    contextPadded.add("");
                }
            }

            // summing up the compareTo's of each word
            for (int i = 0; i < length; i++) {
                sum += thisContextPadded.get(i).compareTo(contextPadded.get(i));
            }
            return sum;
        }

    }


    /**
     * a class representing data about a context
     * includes the methods getContext, numOccurences, compareTo, addFollowingWord, getFollowingWord
     */
    public static class ContextData implements Comparable<ContextData> {
        
        // a Context representing the context
        private GibberishWriter.Context context;

        // an int representing the number of occurences of all the words in the context
        private int numOccurences;

        // a linked list representing ordered words and how many times they have been added
        public LinkedList<WordData> ll;

        /**
         * the constructor, sets the context to the input, the numOccurences to 0, and ll to a new LinkedList
         * @param context the context to be set, of type GibberishWriter.Context
         */
        public ContextData(GibberishWriter.Context context) {
            this.context = context;
            this.numOccurences = 0;
            this.ll = new LinkedList<>();
        }

        /**
         * gets the context field
         * @return a Context object representing the context of this class
         */
        public Context getContext() {
            return this.context;
        }

        /**
         * gets the number of occurences
         * @return an int representing the number of occurences
         */
        public int numOccurences() {
            return this.numOccurences;
        }

        /**
         * overrides the compareTo method of Comparable to compare the Contexts
         * @return returns an int representing the lexographic order of the Contexts, follows compareTo in Context
         */
        @Override
        public int compareTo(ContextData cd) {
            return this.getContext().compareTo(cd.getContext());
        }

        /**
         * adds the input to the correct place in the linkedlist determined by compareTo
         * @param word the word to be added as a WordData
         */
        public void addFollowingWord(String word) { // i feel like there is a better way to write this and the next method, but i don't know how
            LLIterator<GibberishWriter.WordData> lli = ll.iterator(); // iterator for looping through linked list
            if (lli.hasNext()) {
                GibberishWriter.WordData currentNode = lli.next();
                while (word.compareTo(currentNode.getWord()) > 0 && lli.hasNext()) { // finding the node that is just after where the input should go
                    currentNode = lli.next();
                }

                // 3 cases for if the words is already in, there is no next element, or just regular
                if (word.compareTo(currentNode.getWord()) == 0) {
                    currentNode.incrementCount();
                    this.numOccurences++;
                } else if (!(lli.hasNext())) {
                    lli.addAfter(new WordData(word));
                } else {
                    lli.addBefore(new WordData(word));
                    this.numOccurences++;
                }
            } else { // for adding to the empty linked list
                this.ll.addToFront(new WordData(word));
                this.numOccurences++;
            }
            
        }

        /**
         * gets the word at the input value, depending on the count of each word EX: if the WordData object "thing1" had a count of 2 and "thing2" had a count of 1, value 3 would give "thing2" 
         * @param value the number corresponding to the element we want(kinda)
         * @return the word we want as a String
         */
        public String getFollowingWord(int value) throws NoSuchElementException {
            LLIterator<GibberishWriter.WordData> lli = ll.iterator();
            String returningWord = null;
            int count = 0;
            while (lli.hasNext()) { // looping through the linked list
                GibberishWriter.WordData nextNode = lli.next();
                count += nextNode.getCount();
                if (count >= value) {
                    return nextNode.getWord();
                }
            }

            // throwing error if value is out of bounds
            if (value > this.numOccurences() || value < 1) {
                throw new NoSuchElementException();
            }

            return returningWord;

        }
    }
}
