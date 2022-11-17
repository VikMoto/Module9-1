package ua.goit.CoreHW7;

class GooWordStat {
    private String word;
    private int freq;


    public String getWord() {
        return word;
    }

    public int getFreq() {
        return freq;
    }

    public GooWordStat(String word,int freq) {
        this.word = word;
        this.freq = freq;
    }

    @Override
    public String toString() {
         String low = "LOW";
         String medium = "MEDIUM";
         String high = "HIGH";
         String extraHigh = "EXTRA HIGH";
         String result = "";

        if (freq < 1000) result = low;
        if (freq >=1000 && freq < 100000) result = medium;
        if (freq >=100000 && freq < 1000000) result = high;
        if (freq >= 1000000) result = extraHigh;

        final String s = "Word is [" + word + "], search freq is " + result;
        return s;
    }
}


class GooWordStatTest {
    public static void main(String[] args) {
        //Word is [human], search freq is LOW
        System.out.println(new GooWordStat("human", 10));

        //Word is [mars], search freq is MEDIUM
        System.out.println(new GooWordStat("mars", 10000));

        //Word is [space], search freq is HIGH
        System.out.println(new GooWordStat("space", 9965499));

        //Word is [life], search freq is EXTRA HIGH
        System.out.println(new GooWordStat("Moluex", 6978540));
    }
}


