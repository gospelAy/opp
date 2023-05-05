package Diary;

import java.util.ArrayList;

class Diary {
    private ArrayList<Entry> entries;

    public Diary() {
        entries = new ArrayList<Entry>();
    }

    public void addEntry(String content) {
        entries.add(new Entry(content));
    }

    public void displayEntries() {
        for (Entry entry : entries) {
            System.out.println(entry.getContent());
        }
    }
}

class Entry {
    private String content;

    public Entry(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}

public class E_Diary {
    public static void main(String[] args) {
        Diary myDiary = new Diary();
        myDiary.addEntry("Today was a great day!");
        myDiary.addEntry("I met a new friend.");
        myDiary.addEntry("I learned something new in class.");
        myDiary.displayEntries();
    }
}

