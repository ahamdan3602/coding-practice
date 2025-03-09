class ValidParantheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        if (s.length() % 2 != 0) {
            return false;
        }

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            }else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            }else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

        
}
