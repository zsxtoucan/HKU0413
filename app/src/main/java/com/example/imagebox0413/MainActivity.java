package com.example.imagebox0413;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView img5,img6,img7,img8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img5 = findViewById(R.id.img5);
        img6 = findViewById(R.id.img6);
        img7 = findViewById(R.id.img7);
        img8 = findViewById(R.id.img8);
    }

    public void BtnOK(View view) {
        img5.setVisibility(View.GONE);
        img6.setVisibility(View.GONE);
        img7.setVisibility(View.GONE);
        img8.setVisibility(View.GONE);

        CheckBox chk;

        int[] id = {R.id.chk1,R.id.chk2,R.id.chk3,R.id.chk4};

        for(int i : id){
            chk = findViewById(i);

            if(chk.isChecked()){
                if(chk.getId() ==R.id.chk1)
                    img5.setVisibility(View.VISIBLE);
                if(chk.getId() ==R.id.chk2)
                    img6.setVisibility(View.VISIBLE);
                if(chk.getId() ==R.id.chk3)
                    img7.setVisibility(View.VISIBLE);
                if(chk.getId() ==R.id.chk4)
                    img8.setVisibility(View.VISIBLE);
            }
        }
    }
}
