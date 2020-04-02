package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView storyTextView;
    Button topButton;
    Button bottomButton;
    int mStoryIndex;

    StoryLine[] storyLines = new StoryLine[]{
            new StoryLine(R.string.T1_Story,R.string.T1_Ans1,R.string.T1_Ans2),
            new StoryLine(R.string.T2_Story,R.string.T2_Ans1,R.string.T2_Ans2),
            new StoryLine(R.string.T3_Story,R.string.T3_Ans1,R.string.T3_Ans2),
            new StoryLine(R.string.T4_End),
            new StoryLine(R.string.T5_End),
            new StoryLine(R.string.T6_End),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        storyTextView = findViewById(R.id.storyTextView);
        topButton = findViewById(R.id.buttonTop);
        bottomButton = findViewById(R.id.buttonBottom);

        mStoryIndex = 1;
        topButton.setVisibility(View.VISIBLE);
        bottomButton.setVisibility(View.VISIBLE);
        updateStory();

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (mStoryIndex){
                    case 1:
                    case 2:
                        mStoryIndex = 3;
                        break;
                    case 3:
                        mStoryIndex = 6;
                        break;
                }
                updateStory();
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        bottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (mStoryIndex){
                    case 1:
                        mStoryIndex = 2;
                        break;
                    case 2:
                        mStoryIndex = 4;
                        break;
                    case 3:
                        mStoryIndex = 5;
                }
                updateStory();
            }
        });
    }

    private void updateStory() {
        if(storyLines[mStoryIndex-1].isEnded()){
            storyTextView.setText(storyLines[mStoryIndex-1].getStoryTextId());
            topButton.setVisibility(View.INVISIBLE);
            bottomButton.setVisibility(View.INVISIBLE);
        }else {
            storyTextView.setText(storyLines[mStoryIndex-1].getStoryTextId());
            topButton.setText(storyLines[mStoryIndex-1].getTopButtonTextId());
            bottomButton.setText(storyLines[mStoryIndex-1].getBottomButtonTextId());
        }
    }
}
