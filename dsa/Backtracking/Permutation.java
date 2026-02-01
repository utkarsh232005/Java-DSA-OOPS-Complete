public class Permutation{

    static void findPermutation(String str,String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        //recursion
        for(int i = 0;i<str.length();i++){
            char currChar = str.charAt(i);
            //removing ith character from str
            String newstr = str.substring(0,i)+ str.substring(i+1);
            findPermutation(newstr,ans+currChar);
        }
    }

    public static void main(String[] args){
        String str = "abc" ;
        findPermutation(str, "");
    }
}