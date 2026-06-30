class Solution {
    public int lengthOfLastWord(String s) {
      Stack<String> stack = new Stack<>(); 
      String word="";
     for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != ' ') {
                word += s.charAt(i);
            } else {
                if (!word.equals("")) {
                    stack.push(word);
                    word = "";
                }
            }
        }

        // Push the last word if it exists
        if (!word.equals("")) {
            stack.push(word);
        }
      return((stack.peek()).length());  
    }
}