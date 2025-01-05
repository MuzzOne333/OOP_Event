public class SpecialEvent extends Event {

    public SpecialEvent(String eventName, String eventDate, String eventLocation, Organizer organizer) {
        super(eventName, eventDate, eventLocation, organizer);
    }

    @Override
    public void displayEventDetails() {
        System.out.println("Special Event: " + eventName + " on " + eventDate + " at " + eventLocation);
        System.out.println("Organizer: " + organizer.getName());
        System.out.println("Participants: " + participantList.size());
    }
}
