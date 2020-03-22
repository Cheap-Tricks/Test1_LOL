package com.ariapps.testiboi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public String phoneticWord(String letter){
        HashMap<String,String> phonetics = new HashMap<String, String>();
        phonetics.put("A", "Alpha");
        phonetics.put("B", "Bravo");
        phonetics.put("C", "Charlie");
        phonetics.put("D", "Delta");
        phonetics.put("E", "Echo");
        phonetics.put("F", "Foxtrot");
        phonetics.put("G", "Golf");
        phonetics.put("H", "Hotel");
        phonetics.put("I", "India");
        phonetics.put("J", "Juliet");
        phonetics.put("K", "Kilo");
    +    phonetics.put("L", "Lima");
        phonetics.put("M", "Mike");
        phonetics.put("N", "November");
        phonetics.put("O", "Oscar");
        phonetics.put("P", "Papa");
        phonetics.put("Q", "Quebec");
        phonetics.put("R", "Romeo");
        phonetics.put("S", "Sierra");
        phonetics.put("T", "Tango");
        phonetics.put("U", "Uniform");
        phonetics.put("V", "Victor");
        phonetics.put("W", "Whiskey");
        phonetics.put("X", "X-Ray");
        phonetics.put("Y", "Yankee");
        phonetics.put("Z", "Zulu");
        return phonetics.get(letter.toUpperCase());
    }

    public String randomLetter(){
        Random randomnumber = new Random();
        int randomindex = randomnumber.nextInt(25);
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        return String.valueOf(alphabet.charAt(randomindex)).toUpperCase();
    }

    public String randomWord(int length){
        String word = "";
        while(word.length() < length){
            word = word.concat(randomLetter());
        }
        return word;
    }

    public void setText(View view) {
        TextView lettertext = findViewById(R.id.lettertextview);
        TextView wordtext = findViewById(R.id.wordtextview);
        String targetletter = randomLetter();
        lettertext.setText(randomWord(5));
        wordtext.setText(phoneticWord(targetletter));
    }
}
