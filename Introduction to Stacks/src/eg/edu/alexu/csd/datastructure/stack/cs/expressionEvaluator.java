package eg.edu.alexu.csd.datastructure.stack.cs;

public class expressionEvaluator implements IExpressionEvaluator {
	
	
	static int test(char ch) {
		switch(ch) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		}
		return -1;
	}
	@Override
	public String infixToPostfix(String expression) {
		// TODO Auto-generated method stub
		IStack stack = new Stack();
		String str="";
		int i=0;
        while(i<expression.length()) {	
			
            char c = (char) expression.charAt(i); 
            if(c != ' ') {
		            if (Character.isLetterOrDigit(c) || (c == '-' && i+1<expression.length() && expression.charAt(i+1)!=' ')) {
		            	
		                	while(i<expression.length()) {
		                		c = (char) expression.charAt(i);
		                		if (Character.isLetterOrDigit(c) || c == '-') {
		                			str += c;
				                	i++;
		                		}else {
		                			str+=' ';
		                			break;
		                		}
		                	}
		                	if(i == expression.length())
		                		str+=' ';
		                	
		            } else if (c == '(') {
		                stack.push(c); 
		                i++;
		            }else if (c == ')'){ 
		                while (!stack.isEmpty() && (char) stack.peek() != '(') {
		                	str += stack.peek(); 
		                	str += ' ';
		                	stack.pop();
		                }
		                if (!stack.isEmpty() && (char)stack.peek() != '(') { 
		                    return "Invalid Expression";
		                }else {
		                    stack.pop(); 
		                    i++;
		                }
		            } 
		            else{ 
		                while (!stack.isEmpty() && test(c) <= test((char)stack.peek())) {
		                	str += stack.peek();
		                	str += ' ';
		                	stack.pop();
		               }
		                	stack.push(c); 
		                	i++;
		            }
            }else {
            	i++;
            }
        } 
		while(!stack.isEmpty()) {
			str += (char)stack.peek();
			str += ' ';
			stack.pop();
		}
		return str;
	}
	
	@Override
	public int evaluate(String expression) {
		// TODO Auto-generated method stub
		IStack Stack = new Stack();
		for(int i=0;i<expression.length();i++) 
        { 
	            char c=expression.charAt(i);
	            
	            if(c!=' ') { 
	            	
		            if(Character.isDigit(c) || (c == '-' && i+1<expression.length() && Character.isDigit((char)expression.charAt(i+1)))) {
		            	String digit="";
		            	int j=i;
		            	while(i<expression.length() && expression.charAt(i)!=' ') {
		            		i++;
		            	}
		            	digit = expression.substring(j, i);
		            	int x = Integer.valueOf(digit);
		            	Stack.push(x); 
		            } else
		            { 
		                int val1 = (int) Stack.peek(); 
		                Stack.pop();
		                int val2 = (int) Stack.peek(); 
		                Stack.pop();
		                switch(c) 
		                { 
		                    case '+': 
		                    	Stack.push(val2+val1); 
		                    break; 
		                      
		                    case '-': 
		                    	Stack.push(val2- val1); 
		                    break; 
		                      
		                    case '/': 
		                    	if(val1 == 0) {
		                    		System.out.println("Exception By Zero / 0");
		                    	}else {
		                    		Stack.push(val2/val1); 
		                    	}
		                    break; 
		                      
		                    case '*': 
		                    	Stack.push(val2*val1); 
		                    break; 
		              } 
		            } 
	        } 
        }
       
        return (int)Stack.peek();     
	}
	
}
