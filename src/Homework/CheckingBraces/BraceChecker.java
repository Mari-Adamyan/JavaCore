package Homework.CheckingBraces;

public class BraceChecker {
    Stack stack = new Stack(20);
    String text;

    BraceChecker(String inputText){
        text = inputText;
    }

    void check() {
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);

            switch (current) {
                case '[':
                    stack.push('[');
                    break;
                case ']':
                    if (stack.tos < 0) {
                        System.out.println("Error: closed ] but not opened!");
                    }
                    else {
                        char c = stack.pop();
                        if (c != '[') {
                            System.out.println("Error: opened " + c + " but closed ]");
                        }
                        else {
                            System.out.println("Everything is ok! Opened [ and closed ]");
                        }
                    }
                    break;
                case '{':
                    stack.push('{');
                    break;
                case '}':
                    if (stack.tos < 0) {
                        System.out.println("Error: closed } but not opened!");
                    }
                    else {
                        char c = stack.pop();
                        if (c != '{') {
                            System.out.println("Error: opened " + c + " but closed }");
                        }
                        else {
                            System.out.println("Everything is ok! Opened { and closed }");
                        }
                    }
                    break;
                case '(':
                    stack.push('(');
                    break;
                case ')':
                    if (stack.tos < 0) {
                        System.out.println("Error: closed ) but not opened!");
                    }
                    else {
                        char c = stack.pop();
                        if (c != '(') {
                            System.out.println("Error: opened " + c + " but closed (");
                        }
                        else {
                            System.out.println("Everything is ok! Opened ( and closed )");
                        }
                    }
                    break;
            }


        }

        if (stack.tos >= 0) {
            for (int i = 0; i <= stack.tos; i++) {
                System.out.println("Error: opened " + stack.pop() + " but not closed");
            }
        }
    }
}
