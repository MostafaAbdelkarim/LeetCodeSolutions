class Solution {
    public int mostWordsFound(String[] sentences) {
        int counter = 0;
        for(int i =0; i < sentences.length; i++)
        {
            String s = sentences[i];
            String [] words = s.split(" ");
            if(counter < words.length)
            {
                counter = words.length;
            }
        }
        return counter;
    }
}

//Declarative approach:
// return 1 + Stream.of(sentences).mapToInt(s -> (int)s.chars.filter(ch -> ch == ' ').count()).max().getAsInt();