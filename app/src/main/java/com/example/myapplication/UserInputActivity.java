package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UserInputActivity extends AppCompatActivity {
    public Button btn_save;
    public EditText editTextName,editTextEmail,editTextPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_input);
        EditText editTextName = (EditText) findViewById(R.id.editTextName);
        EditText editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        EditText editTextPhone = (EditText) findViewById(R.id.editTextPhone);
        Button btn_save = (Button) findViewById(R.id.btn_save);


        editTextPhone.setFilters( new InputFilter[]{ new ValidateFilter()}) ;

        btn_save.setOnClickListener(new View.OnClickListener() {
            String pass = "true";
            @Override
            public void onClick(View view) {
                if(editTextEmail.length()==0 || editTextName.length()==0 || editTextPhone.length()==0){
                    Toast.makeText(getApplicationContext(), "you should fill all the fields", Toast.LENGTH_SHORT).show();
                    pass ="false";
                }
                else
                    pass="true";

                if(!editTextEmail.getText().toString().matches("[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+")){
                    editTextEmail.setError("Enter correct email id");
                    editTextEmail.requestFocus();
                    pass ="false";
                    return;
                }
                else
                    pass="true";
                if(!editTextPhone.getText().toString().matches("[0-9]{10}")){
                    editTextPhone.setError("Enter 10 digits");
                    editTextPhone.requestFocus();
                    pass ="false";
                    return;
                }
                else{
                    pass="true";

                }

                if(pass.equals("true") ){
                    Toast.makeText(getApplicationContext(), "Validation success", Toast.LENGTH_SHORT).show();
                    openActivity3();
                }
            }
        });
        
    }
    public void openActivity3(){
        Intent intent= new Intent(this,UserValidationActivity.class);
        startActivity(intent);
    }
    
}