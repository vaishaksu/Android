package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class UserValidationActivity extends AppCompatActivity {
    ImageButton btnid_t1,btnid_t3,btnid_t4,btnid_t5;
    ImageView btnid_t2;
    Button btnSubmit;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_validation);

        btnid_t1 = findViewById(R.id.t1);
        btnid_t2 = findViewById(R.id.t2);
        btnid_t3 = findViewById(R.id.t3);
        btnid_t4 = findViewById(R.id.t4);
        btnid_t5 = findViewById(R.id.t5);

        findViewById(R.id.t1).setOnClickListener(btn_t1);
        findViewById(R.id.t2).setOnClickListener(btn_t2);
        findViewById(R.id.t3).setOnClickListener(btn_t3);
        findViewById(R.id.t4).setOnClickListener(btn_t4);
        findViewById(R.id.t5).setOnClickListener(btn_t5);

        btnSubmit = findViewById(R.id.bsubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Validation success", Toast.LENGTH_SHORT).show();
                openActivity4();
            }
        });



    }
    public void openActivity4(){
        Intent intent= new Intent(this,UserProfile.class);
        startActivity(intent);
    }
    View.OnClickListener btn_t1 = new View.OnClickListener() {

        public void onClick(View v) {

            btnid_t1.setBackgroundResource(R.drawable.tl_selected);

        }
    };
    View.OnClickListener btn_t2 = new View.OnClickListener() {

        public void onClick(View v) {

            btnid_t2.setBackgroundResource(R.drawable.t1_selected);

        }
    };
    View.OnClickListener btn_t3 = new View.OnClickListener() {

        public void onClick(View v) {

            btnid_t3.setBackgroundResource(R.drawable.t2_selected);

        }
    };
    View.OnClickListener btn_t4 = new View.OnClickListener() {

        public void onClick(View v) {

            btnid_t4.setBackgroundResource(R.drawable.t3_selected);

        }
    };
    View.OnClickListener btn_t5 = new View.OnClickListener() {

        public void onClick(View v) {

            btnid_t5.setBackgroundResource(R.drawable.t4_selected);

        }
    };


}