package com.londonappbrewery.destini;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mStory;
    private Button topButton;
    private Button downButton;
    private int storyIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStory = findViewById ( R.id.storyTextView );
        topButton = findViewById ( R.id.buttonTop );
        downButton = findViewById ( R.id.buttonDown);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        topButton.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                //Log.d ( "Topbutton", "top is pressed" );
                if(storyIndex == 1 || storyIndex == 2) {
                    mStory.setText ( R.string.T3_Story );
                    topButton.setText ( R.string.T3_Ans1 );
                    downButton.setText ( R.string.T3_Ans2 );
                    storyIndex = 3;
                }
                else{
                    mStory.setText(R.string.T6_End);
                    topButton.setVisibility ( View.GONE );
                    downButton.setVisibility ( View.GONE );

                }

            }
        } );


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        downButton.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                //Log.d ( "downButton", "down is press" );
                if(storyIndex == 1) {
                    mStory.setText ( R.string.T2_Story );
                    topButton.setText ( R.string.T2_Ans1 );
                    downButton.setText ( R.string.T2_Ans2 );
                    storyIndex = 2;
                }
                else if(storyIndex == 2){
                    mStory.setText ( R.string.T4_End );
                    topButton.setVisibility ( View.GONE );
                    downButton.setVisibility ( View.GONE );

                }
                else{
                     mStory.setText ( R.string.T5_End );
                    topButton.setVisibility ( View.GONE );
                    downButton.setVisibility ( View.GONE );
                }

            }
        } );
    }
}
