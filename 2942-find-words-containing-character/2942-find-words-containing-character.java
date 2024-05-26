class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        final List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if(words[i].indexOf(x) != -1){
                resultList.add(i);
            }
        }
        return resultList;
    }
}