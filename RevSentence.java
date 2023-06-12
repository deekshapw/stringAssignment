public class RevSentence {
    public static void main(String[] args)
    {
        String s1 = "THINK TWICE";
        String s2 = " ";
        String Sarr[] = s1.split(" ");
        for(String elem : Sarr){
            for(int i = elem.length()-1 ; i>= 0 ; i--){
            s2 = s2 + elem.charAt(i);

        }
        s2 =  s2 + " ";
    }
    System.out.println(" before reversing : " + s1);
    System.out.println("after reversing : " + s2);
    }
    
}
