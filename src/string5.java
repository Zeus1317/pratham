public class string5 {
    public static void main(String[] args) {
        String s1 = "BRAG";
        String s2 = "GRAB";
        int count = 0;

        if (s1.length() == s2.length()) {
            for(int i=0;i<s1.length();i++){
                for(int j=0;j<s2.length();j++){
                    if(s1.charAt(i)==s2.charAt(j)){
                        count++;
                    }
                }
            }

            if(s1.length()==count){
                System.out.println("Anagram ");
            }else System.out.println("Error");

        }
        else System.out.println("error");
    }
}
