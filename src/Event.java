import java.util.ArrayList;
import java.util.List;

public abstract class Event {
    protected String eventName;
    protected String eventDate;
    protected String eventLocation;
    protected Organizer organizer;
    protected List<Participant> participantList;

    public Event(String eventName, String eventDate, String eventLocation, Organizer organizer) {
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventLocation = eventLocation;
        this.organizer = organizer;
        this.participantList = new ArrayList<>();
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public Organizer getOrganizer() {
        return organizer;
    }

    public List<Participant> getParticipantList() {
        return participantList;
    }

    public void addParticipant(Participant participant) {
        participantList.add(participant);
    }

    public void removeParticipant(Participant participant) {
        participantList.remove(participant);
    }


    public abstract void displayEventDetails();
}
