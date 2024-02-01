package compoundaction;

import java.util.Arrays;
import java.util.List;

public class EventSyllabys {

    private static final List<String> syllabus =
            Arrays.asList("Arrays, Maths, DP, Graph",
                    "SOLID principles and design patterns",
                    "Locking",
                    "Caching",
                    "Asynchronous javascript",
                    "Pyhton Operators",
                    "Intro to Mobile App Dev");
    private int counter = 0;

    public synchronized void next() {
        counter = (counter + 1) % syllabus.size();
    }

    public String get() {
        return syllabus.get(counter);
    }
}
