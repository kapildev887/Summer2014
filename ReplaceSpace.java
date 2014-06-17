public class classTest{
    public static char[] ReplaceSpace(String s){
        //convert string to char array
        int space=0;
        char[] sarray = s.toCharArray();
        //find space count
        for(int i=0;i<s.length();i++){
            if(sarray[i]==' '){
                space++;
            }   
        }
        System.out.println("Space count is :"+ space);
        int length =s.length();
        int newlength = s.length() +space*2;
        System.out.println("New length is :"+ newlength);
        char[] str = new char[newlength];
        //str[newlength]='\0';
        for(int i=length-1 ;i>=0;i--){
            if(sarray[i]==' '){
                str[newlength-1]='0';
                str[newlength-2]='2';
                str[newlength-3]='%';
                newlength=newlength-3;
            } else {
                str[newlength-1]=sarray[i];
                newlength=newlength-1;
            }
        }
       
        return str;
    }

     public static void main(String []args){
         
        char[] str =ReplaceSpace("K A P I L");
        for(char c : str)
            System.out.print(c);
     }
}
