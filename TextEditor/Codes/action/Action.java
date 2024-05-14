package action;
import java.time.LocalDateTime;

public class Action {
    private int actionId;
    private LocalDateTime ldt;
    private int lineno;
    private String text;
    private boolean isAddition;
    public Action(int actionId,int lineno,String text,boolean isAddition){
        this.actionId=actionId;
        this.ldt=LocalDateTime.now();
        this.lineno=lineno;
        this.text=text;
        this.isAddition=isAddition;
    }
    public void setActionId(int actionId){
        this.actionId=actionId;
    }
    public int getActionId(){
        return this.actionId;
    }
    public int getLineNumber(){
        return this.lineno;
    }
    public String getText(){
        return this.text;
    }
    public void getDetails(){
        System.out.println("Action id: "+actionId);
        System.out.println("Date and time: "+ldt);
        System.out.println("Line No: "+lineno);
        System.out.println("Text: "+text);
        System.out.println("isAddition: "+isAddition);
    }
}
