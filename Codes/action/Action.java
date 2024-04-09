package action;

import java.time.*;

public class Action {

    private int actionId;
    private LocalDateTime localDateTime;
    private int line;
    private String text;
    private boolean isadded;

    public Action(int actionId, LocalDateTime localDateTime,  boolean isadded, int line, String text){
        this.actionId = actionId;
        this.localDateTime = localDateTime;
        this.line = line;
        this.text = text;
        this.isadded = isadded;
    }
    
    public int getactionId(){
        return this.actionId;
    }
    
    public LocalDateTime getLocalDateTime(){
        return this.localDateTime;
    }
    public int getline(){
        return this.line;
    }

    public String gettext(){
        return this.text;
    }

    public boolean getisadded(){
        return this.isadded;
    }

}
