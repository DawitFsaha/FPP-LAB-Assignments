package lab7.problem3;

import java.util.Stack;

public class BrowserHistory {
    private String current;
    private Stack<String> backwardHistory;
    private Stack<String> forwardHistory;

    public BrowserHistory(String url){
        current = url;
        backwardHistory = new Stack<>();
        forwardHistory = new Stack<>();
    }

    public void visit(String url){
        if(url == null) return;
        if(current != null){
            backwardHistory.push(current);
        }
        System.out.println("Visited : " + url);
        current = url;
    }

    public void back(){
        if(backwardHistory.empty()){
            System.out.println("No history to go back to.");
        }else{
            System.out.println("Back to : " + backwardHistory.peek());
            forwardHistory.push(current);
            current = backwardHistory.pop();
        }
    }

    public void forward(){
        if(forwardHistory.empty()){
            System.out.println("No forward history.");
        }else{
            backwardHistory.push(current);
            System.out.println("Forward to: " + forwardHistory.peek());
            current = forwardHistory.pop();

        }

    }


}
