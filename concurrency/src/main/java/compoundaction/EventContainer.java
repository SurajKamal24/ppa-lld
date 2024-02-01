package compoundaction;

public class EventContainer {
    private final EventTitle title;
    private final EventSyllabys syllabys;

    public EventContainer(EventTitle title, EventSyllabys syllabys) {
        this.title = title;
        this.syllabys = syllabys;
    }

    public synchronized void increment() {
        title.next();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        syllabys.next();
    }

    public synchronized String get() {
        String s = "Title : " + title.get() + " | " + "Syllabus : " + syllabys.get();
        return s;
    }
}
