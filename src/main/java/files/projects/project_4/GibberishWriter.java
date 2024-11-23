package files.projects.project_4;

import java.util.ArrayList;
import java.util.Arrays;

public class GibberishWriter {
    
    private ArrayList<ContextData> contextData;

    private int contentSize;



    /**
     * represents a specific word and the number of times it has been counted in the sample
     */
    public class WordData {

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

    public static void main(String[] args) {
        GibberishWriter g = new GibberishWriter();
        GibberishWriter.Context c = g.new Context(new String[] {"ahing1", "thing2", "thing3", "thing4", "thing5", "thing6"});
        GibberishWriter.Context b = g.new Context(new String[] {"thing1", "thing2", "thing3", "thing4", "thing5"});
        System.out.println(c.compareTo(b));
    }

    public class Context implements Comparable<Context>{

        String[] context;

        public Context(String[] context) {
            this.context = new String[context.length];
            System.arraycopy(context, 0, this.context, 0, context.length);
            Arrays.sort(this.context);
        }

        public int length() {
            return this.context.length;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < this.length(); i += 2) {
                if (i == this.length() - 1) {
                    sb.append(this.context[this.context.length - 1]);
                } else {
                    sb.append(this.context[i]);
                    sb.append(this.context[i + 1]);
                    sb.append(" ");
                }
            
            }
            return sb.toString();
        }

        public String getWord(int i) {
            return this.context[i];
        }

        @Override
        public boolean equals(Object o) {
            if (o instanceof Context) {
                Context c = (Context)o;

                if (this.length() != c.length()) {
                    return false;
                }

                for (int i = 0; i < this.length(); i++) {
                    if (!(this.getWord(i).equals(c.getWord(i)))) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }

        @Override
        public int compareTo(Context c) {
            int sum = 0;
            int length = this.length();
            if (this.length() > c.length()) {
                length = c.length();
            }
            for (int i = 0; i < length; i++) {
                sum += this.context[i].compareTo(c.context[i]);
            }
            return sum;
        }

    }

    public class ContextData implements Comparable {
        
    }

}
