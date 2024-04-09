package notepad;

import action.Action;
import java.time.*;
import java.util.*;

public class Notepad {
    private int id = 1;
    private String notepad[];
    private Stack<Action> undoAction;
    private Stack<Action> redoAction;
    private Queue<String> clipBoard;
    private int capacity;

    public Notepad(int capacity){
        notepad = new String [capacity];

        for(int i=0; i<capacity; i++){
            notepad[i]="";
        }

        redoAction = new Stack<>();
        undoAction = new Stack<>();
        clipBoard = new LinkedList<>();
        this.capacity = capacity;
    }
    
    public void display(){
        for(int i=0; i<this.capacity; i++){
            System.out.println(notepad[i]);
        }
    }

    public void display(int startLine, int endline){
        if(startLine < 0 || startLine > endline || endline > this.capacity){
            System.out.println("Unable to display text, please check the input");
            return;
        }
        
        for(int i = startLine-1; i<endline ;i++){
            System.out.println(notepad[i]);
        }
    }

    public void insertLine(int line, String text){
        if(line > capacity){
            System.out.println("Notepad limit crossed");
            return;
        }
    
        notepad[line-1] = text;
        undoAction.push(new Action(id++, LocalDateTime.now(), true , line ,text));
    }

    public void delete(int line){
        if(line > capacity){
            System.out.println("No such row to delete");
            return;
        }

        if(notepad[line-1].isEmpty()){
            System.out.println("Nothing to delete");
            return;
        }

        redoAction.push(new Action(id++, LocalDateTime.now(), false, line, notepad[line-1]));
        notepad[line-1] = "";
    }

    public void delete (int startLine, int endline){
        if(startLine > endline || endline >capacity){
            System.out.println("Unable to delete, please check the inputs");
            return;
        }

        for(int i=startLine; i<=endline; i++){
            delete(i);
        }
    }

    public void copy(int startline, int endline){
        if(startline > endline || endline > this.capacity){
            System.out.println("Unable to copy");
            return;
        }

        String copyText = "";
        for(int i=startline-1 ; i<endline ;i++){
            copyText += (notepad[i] + "\n");
        }
        if(!copyText.isEmpty())
        clipBoard.add(copyText);
    }

    public void paste(int line){
        if(this.clipBoard.isEmpty()){
            System.out.println("Nothing to paste");
            return;
        }

        String text = clipBoard.peek();
        insertLine(line, text);
    }

    public void undo(){
        if(this.undoAction.isEmpty()){
            System.out.println("Nothing to undo");
            return;
        }

        Action action = this.undoAction.peek();
        this.undoAction.pop();

        delete(action.getline());
    }

    public void redo(){
        if(this.redoAction.isEmpty()){
            System.out.println("Nothing to redo");
            return;
        }

        Action action = redoAction.peek();
        redoAction.pop();

        insertLine(action.getline(), action.gettext());
    }

}
