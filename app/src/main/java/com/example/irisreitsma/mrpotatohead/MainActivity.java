package com.example.irisreitsma.mrpotatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // check if boxes are clicked
    public void checkClicked(View v) {
        Log.d("potato", "checkClicked: ");
        CheckBox checkbox = (CheckBox) v;
        boolean checked = checkbox.isChecked();
        String boxName = checkbox.getText().toString();

        // show the body parts when boxes are clicked
        if (checked):{
            ImageView image = findViewById(R.id.checkbox);
            image.setVisibility(View.VISIBLE);
        }
        else {
            ImageView image = findViewById(R.id.checkbox);
            image.setVisibility(View.INVISIBLE); 
        }
    }


}

