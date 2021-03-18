package Medium;

public class PrintAna {
    public static void main(String[] args) {
        String a = "ABC";
        findAna(a," ");
    }

    static void findAna(String a,String ans){
        if(a.length()==0){
            System.out.print(ans);
            return;
        }

        for(int i=0;i<a.length();i++){
            char hold = a.charAt(i);
            String rest = a.substring(0,i) + a.substring(i+1);
            findAna(rest,hold+ans);
        }
    }
}
