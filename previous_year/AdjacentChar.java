import java.util.*;
public class AdjacentChar{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str =sc.next();
        sc.close();
        Stack<Character> importChar= new Stack<>();
        for(int i= 0;i<str.length(); i++){
            char temp= str.charAt(i);
            if(importChar.isEmpty()){
                importChar.push(temp);
            }else{
                if(importChar.peek()==temp){
                    importChar.pop();
                }else{
                    importChar.push(temp);
                }
            }
        }
        StringBuilder sb= new StringBuilder();
        while(!importChar.isEmpty()){
            sb.append(importChar.pop());
        }
        System.out.print(sb.reverse());
        
    }
}