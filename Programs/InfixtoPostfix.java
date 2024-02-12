class Solution {
    // Function to convert an infix expression to a postfix expression.
    public static String infixToPostfix(String exp) {
        // Your code here
        String res="";
        Stack<Character> s=new Stack<>();
        for(int i=0;i<exp.length();i++){
            char c=exp.charAt(i);
            if((c>='A' && c<='Z') || (c>='a' && c<='z') || (c-'0'>=0 && c-'0'<=9)){
                res=res+c;
            }
            else if(c=='(')
               s.push(c);
            else if(c==')'){
                while(!s.isEmpty() && s.peek()!='('){
                    res=res+s.peek();
                    s.pop();
                }
                s.pop();
            }
            else{
                while(!s.isEmpty() && checkpri(c)<=checkpri(s.peek()))
                     res=res+s.pop();
                s.push(c);
            }
        }
            while(!s.isEmpty())
                res=res+s.pop();
        return res;
    }
    public static int checkpri(char c){
        if(c=='+'||c=='-')
             return 1;
        else if(c=='*'||c=='/')
             return 2;
        else if(c=='^')
             return 3;
        return 0;
    }
}
