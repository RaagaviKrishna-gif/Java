package String;

public class RemoveDuplicate {
    public static void main(String[] args) {

        String s1 = "raagavi";
        String s2 = "gopalakrishnan";

        boolean[] visited = new boolean[26];
        String result = "";

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);

            int index = ch - 'a';

            if (!visited[index]) {
                result = result + ch;
                visited[index] = true;
            }
        }

        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);

            int index = ch - 'a';

            if (!visited[index]) {
                result = result + ch;
                visited[index] = true;
            }
        }

        System.out.println(result);
    }
}
