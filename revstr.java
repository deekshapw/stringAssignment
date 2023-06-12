public class revstr {
    public static void main(String[] args){
        String s1 = "pwjava";
        String s2 = "";
        for(int i=s1.length()-1;i>=0;i--){
            s2=s2+s1.charAt(i);
        }
        System.out.println("before Reversing: " + s1);
        System.out.println("after reversing : " + s2);
    }
    
}
