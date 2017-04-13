package com.example.mina.actionbartest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

public class HideActivity extends AppCompatActivity {
    EditText editText;
    CheckBox hide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hidepassword);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        editText =(EditText)findViewById(R.id.editText);
        hide = (CheckBox)findViewById(R.id.hide);

        hide.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(hide.isChecked()){
                    editText.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }else{
                    editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
        });
   }

}
