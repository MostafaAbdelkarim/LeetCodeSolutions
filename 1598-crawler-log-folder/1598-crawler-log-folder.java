class Solution {
    public int minOperations(String[] logs) {
        final Stack<String> log=new Stack<String>();
        for (String str: logs) {
            if (str.equals("../")) {
                if (!log.isEmpty()) {
                    log.pop();
                }
            } else if (!str.equals("./")) {
                log.push(str);
            }
        }
       return log.size();
    }
}