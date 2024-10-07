package com.example.labactivity22shapitjokes;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView jokeListTitle, jokeTitle, jokeSetup, jokePunchline;
    private Button backJokeButton, nextJokeButton;
    private int currentJokeIndex = 0;


    private String[][] jokes = {
            {"Why Did the Chicken?", "Why did the chicken cross the road?", "To get to the other side!"},
            {"Invisible Ink", "What do you call fake spaghetti?", "An impasta!"},
            {"Elevator Humor", "Why do elevator jokes work so well?", "Because they work on so many levels!"},
            {"The Scarecrow", "Why did the scarecrow win an award?", "Because he was outstanding in his field!"},
            {"Crab Conundrum", "Why don’t crabs give to charity?", "Because they’re shellfish!"},
            {"Alphabet Mystery", "I only know 25 letters of the alphabet.", "I don’t know Y."},
            {"The Bakery", "How does a baker keep calm?", "They go with the dough!"},
            {"Sleepy Shoes", "Why do shoes make terrible comedians?", "Because their jokes always fall flat!"},
            {"Dentist Drama", "Why did the dentist break up with the manicurist?", "Things got too hands-on!"},
            {"Broken Pencil", "I tried to write with a broken pencil...", "But it was pointless!"}
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_detail);


        jokeListTitle = findViewById(R.id.jokeList);
        jokeTitle = findViewById(R.id.jokeTitle);
        jokeSetup = findViewById(R.id.jokeSetup);
        jokePunchline = findViewById(R.id.jokePunchline);
        backJokeButton = findViewById(R.id.backJokeButton);
        nextJokeButton = findViewById(R.id.nextJokeButton);


        jokeListTitle.setText("Joke List");
        displayJoke(currentJokeIndex);


        nextJokeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentJokeIndex++;
                displayJoke(currentJokeIndex);
            }
        });


        backJokeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentJokeIndex--;
                displayJoke(currentJokeIndex);
            }
        });
    }


    private void displayJoke(int index) {
        jokeTitle.setText(jokes[index][0]);
        jokeSetup.setText(jokes[index][1]);
        jokePunchline.setText(jokes[index][2]);


        if (index == 0) {
            backJokeButton.setVisibility(View.INVISIBLE);
        } else {
            backJokeButton.setVisibility(View.VISIBLE);
        }

        if (index == jokes.length - 1) {
            nextJokeButton.setVisibility(View.INVISIBLE);
        } else {
            nextJokeButton.setVisibility(View.VISIBLE);
        }
    }
}