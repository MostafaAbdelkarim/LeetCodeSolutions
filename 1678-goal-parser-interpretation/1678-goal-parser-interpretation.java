class Solution {
    public String interpret(String command) {
       char[] array = command.toCharArray();
        StringBuilder result = new StringBuilder();
        for(int i=0;i<array.length;i++)
        {
            if(array[i]=='G'){
                result.append("G");
            }
            if(array[i]=='(' && array[i+1]==')')
            {
                result.append("o");
                i++;
            }
            if(array[i]=='(' && array[i+1]=='a')
            {
                result.append("al");
                i+=3;
            }
        }
        return result.toString();
    }
}


// replace function for strings
// return command.replace("()","o").replace("(al)","al");