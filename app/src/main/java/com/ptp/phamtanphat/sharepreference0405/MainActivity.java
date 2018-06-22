package com.ptp.phamtanphat.sharepreference0405;

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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtPassword = findViewById(R.id.edittextPassword);
        edtUsername = findViewById(R.id.edittextUsername);
        btnLuu = findViewById(R.id.buttonDangnhap);
        checkBox = findViewById(R.id.checkboxLuu);

        btnLuu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = edtUsername.getText().toString().trim();
                String password = edtPassword.getText().toString().trim();

                if (user.length() > 0 && password.length() > 0){
                    if (user.equals("android123") && password.equals("123")){
                        Toast.makeText(MainActivity.this, "Dang nhap thanh cong!!", Toast.LENGTH_SHORT).show();
                    }else{
                        Toast.makeText(MainActivity.this, "That bai", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }
}
