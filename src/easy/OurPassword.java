package easy;

public class OurPassword {
    public static void main(String[] args) {
        System.out.println(solution("aukks","wbqd",5));
    }
    public static String solution(String s, String skip, int index) {
        String answer = "";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int passwordCount=index;
            char password= s.charAt(i);

            for (int j = 0; j < passwordCount; j++) {
                password = (char)(password+1);
                if(password==123) {password=97;}
                if(skip.contains(String.valueOf(password))) {
                    passwordCount++;
                    continue;
                }
            }
            stringBuilder.append(password);
        }
        answer=stringBuilder.toString();
        return answer;
    }

}
