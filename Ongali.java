public class Ongali {
    public static void main(String[] args) {
        String[] a = {"ayaye", "yeye", "yewiew" };
        int result = solution(a);
        System.out.println("result = " + result);

    }
    public static int solution(String[] babbling) {
        int answer = 0;

        String[] str = {"aya", "ye", "woo", "ma"};

        for(int i=0; i<babbling.length; i++){
            String before ="";
            String after ="";
            for(int j=0; j<str.length; j++){
                if(babbling[i].charAt(0)==str[j].charAt(0)){
                    if(babbling[i].equals(str[j]) && !before.equals(babbling[i])){
                        answer++;
                        continue;
                    }else if(babbling[i].length()>str[j].length()){
                        after = babbling[i].substring(str[j].length(),babbling[i].length());
                        if(before.equals(babbling[i].substring(0,str[j].length()))) break;
                        before = babbling[i].substring(0,str[j].length());
                        if(before.equals(str[j])){
                            j=-1;
                            babbling[i] = after;
                        }
                    }
                }
            }
        }

        return answer;
    }

}
