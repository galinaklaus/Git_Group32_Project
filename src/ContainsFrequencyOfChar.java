public class ContainsFrequencyOfChar {
    public static void main(String[] args) {

        String s = "apple";
        String checked = "";

        for (int i = 0; i < s.length(); i++) {

            int count = 0;// every time outer loop execute,the counter is set back at 0. It resets for every character

            char letter = s.charAt(i);

            if (checked.contains("" + letter)) {
                continue;
            }

            for (int j = 0; j < s.length(); j++) {
                char eachLetter = s.charAt(j);

                if (letter == eachLetter) {//s.charAt(i)==s.CharAt(j)
                    count++;

                }

            }
            System.out.println(letter + " - " + count);
            checked +=letter;

        }


    }
}
