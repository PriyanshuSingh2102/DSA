class Solution {
    public String interpret(String command) {
        String str="";
        for(int i=0;i<command.length();){
            if(command.charAt(i)=='G'){
            str+=command.charAt(i);
            i++;
            }
            else if(command.charAt(i)=='(' && command.charAt(i+1)==')'){
            str+='o';
            i+=2;}
            else {
            str+="al";
            i+=4;
            }

        }
        return str;
    }
}