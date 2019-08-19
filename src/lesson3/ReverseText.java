package lesson3;

import lesson3.stack.StackImpl;

public class ReverseText {

    public static void main(String[] args) {
        String example = "Это тестовая строка";
        System.out.println(new ReverseText(example).reverse());
    }

    private final String text;

    public ReverseText(String text) {
        this.text = text;
    }

    public String reverse(){
        if (!text.isEmpty()){
            StringBuilder result = new StringBuilder();
            StackImpl<Character> stack = new StackImpl<>(100);

            for (int i = 0; i < text.length(); i++) {
                stack.push(text.charAt(i));
            }

            while (!stack.isEmpty()){
                result.append(stack.pop());
            }

            return result.toString();
        } else return "";
    }

}
