package com.ptp.phamtanphat.sharepreference0405;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtUsername,edtPassword;
    Button btnLuu;
    CheckBox checkBox;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtPassword = findViewById(R.id.edittextPassword);
        edtUsername = findViewById(R.id.edittextUsername);
        btnLuu = findViewById(R.id.buttonDangnhap);
        checkBox = findViewById(R.id.checkboxLuu);

        edtUsername.requestFocus();

        editor = sharedPreferences.edit();
        sharedPreferences = getSharedPreferences("Value",MODE_PRIVATE);

        btnLuu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = edtUsername.getText().toString().trim();
                String password = edtPassword.getText().toString().trim();

                if (user.length() > 0 && password.length() > 0){
                    if (user.equals("android123") && password.equals("123")){
                        if (checkBox.isChecked()){
                            editor.putString("username",user);
                            editor.putString("password",password);
                            editor.putBoolean("checked",true);

                            editor.commit();
                        }else {
                            editor.remove("username");
                            editor.remove("password");
                            editor.remove("checked");

                            editor.commit();
                        }
                    }else{
                        Toast.makeText(MainActivity.this, "That bai", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });
    }




}
