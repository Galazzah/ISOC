package com.isoc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by z on 6/20/2015.
 */
public class FortyAtFortyActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forty_at_forty);

        TextView sponsors       = (TextView)findViewById(R.id.sponsors);
        ImageButton project    = (ImageButton)findViewById(R.id.project);
        ImageButton back = (ImageButton)findViewById(R.id.back);
        ImageButton home = (ImageButton)findViewById(R.id.home);

        back.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        finish();
                    }
                }
        );
        home.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(FortyAtFortyActivity.this, MainActivity.class);
                        startActivity(intent);
                    }
                }
        );


        QueryHelper q = new QueryHelper(this);
        q.appendTextQuery("40x40_amt", sponsors);

        project.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(FortyAtFortyActivity.this, SponsorProjectActivity.class);
                        intent.putExtra("from", "40x40");
                        startActivity(intent);
                    }
                }
        );
    }
}
