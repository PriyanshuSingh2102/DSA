class Solution {
    public String capitalizeTitle(String title) {
         title = title.toLowerCase() + " ";
        String str="",res="";
        for(int i=0;i<title.length();i++){
            if(title.charAt(i)!=' ')
            str=str+title.charAt(i);
            else{
                if(str.length()>2)
                 res=res+str.substring(0,1).toUpperCase()+str.substring(1)+" ";
                 else
                 res+=str+" ";
              str="";
        }}
        return res.trim();
    }
}