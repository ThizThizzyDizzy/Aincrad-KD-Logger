import java.io.Serializable;
public class Event implements Serializable{
    public final String event;
    public final String subject;
    public final String indirectSubject;
    public Event(String event, String cause){
        this(event, cause, null);
    }
    public Event(String event, String cause, String indirectCause){
        this.event = event;
        this.subject = cause;
        this.indirectSubject = indirectCause;
    }
}