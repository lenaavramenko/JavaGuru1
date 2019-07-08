package com.JavaGuru1.lv.lesson4.phraseAnalyser;

public class PhraseAnalyser {
    public String analyse(String text) {
        String ans;
        String textBegin = "Make";
        String textEnd = "great again";

        if ((text.startsWith(textBegin)) && (text.endsWith(textEnd))) {
            ans = "It stands no chance";
        } else if ((text.startsWith(textBegin)) || (text.endsWith(textEnd))) {
            ans = "It could be worse";
        } else {
            ans = "It is fine, really";
        }
        System.out.println(text + " => " + ans);
        return ans;
    }
}
