class last_word_length{
    public static int lengthOfLastWord(String s) {
        int i;
        String ar[]=s.split(" ");
        for(i=0;i<ar.length;i++);
        int val=ar[i-1].length();
        return val;
    }
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("hello world"));
        
    }
}