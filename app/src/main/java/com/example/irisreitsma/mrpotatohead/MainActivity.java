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

    // list of checkbox numbers
    int checkboxesID[] = new int[]{R.id.eyes, R.id.glasses, R.id.eyebrows, R.id.ears, R.id.arms, R.id.mouth, R.id.moustache, R.id.nose, R.id.hat, R.id.shoes};
    String checkboxesName[] = {"eyes", "glasses", "eyebrows", "ears", "arms", "mouth", "moustache", "nose", "hat", "shoes"};

    // check if boxes are clicked
    public void checkClicked(View v) {
        Log.d("potato", "checkClicked: ");
        CheckBox checkbox = (CheckBox) v;
        boolean checked = checkbox.isChecked();
        String boxName = checkbox.getText().toString();

        // show the body parts when boxes are clicked
        int length = checkboxesID.length;
        for (int i = 0; i < length; i++) {
            if (boxName.equals(checkboxesName[i])) {
                Log.d("glasses",checkboxesName[i]);
                ImageView image = findViewById(checkboxesID[i]);
                if (checked) {
                    image.setVisibility(View.VISIBLE);
                } else {
                    image.setVisibility(View.INVISIBLE);
                }
            }
        }

    }

}

