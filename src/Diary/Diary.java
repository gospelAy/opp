package Diary;

import java.util.ArrayList;
import java.util.List;

public class Diary {
    private String userName;
    private String passWord;
    private boolean isLocked;
    private List<Entry> entries;

    public Diary(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
        this.isLocked = isLocked;
        this.entries = entries;
    }
    public void unlockDiary(String passWord){
        if (passWord.matches(this.passWord)) isLocked = true;

    }
    public boolean isLocked(){
         return isLocked;
        }

    }

