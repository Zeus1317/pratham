public class string4 {
    public static void main(String[] args) {
        String string ="Hello Moto";
        int count =0;

        for(int i=0;i<string.length();i++){
            if(string.charAt(i)!=' '){
                count++;
            }

        }
        System.out.println(count);
    }
}

