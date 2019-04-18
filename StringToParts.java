public class StringToParts {
    private GenQueue<Character> queueLetters;
    private GenQueue<Character> queueNums;

    public StringToParts(String str) {
        this.queueLetters = new GenQueue<Character>();
        this.queueNums = new GenQueue<Character>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                this.queueNums.push(ch);
            } else {
                this.queueLetters.push(ch);
            }
        }
    }
    public String getLetters () {
        String result = new String();
        while (this.queueLetters.getSize() > 0) {
            result += this.queueLetters.pull();
        }
        return result;
    }
    public String getNums () {
        String result = new String();
        while (this.queueNums.getSize() > 0) {
            result += this.queueNums.pull();
        }
        return result;
    }
}
