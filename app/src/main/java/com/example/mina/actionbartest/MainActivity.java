package com.example.mina.actionbartest;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.tool_bar);
      setSupportActionBar(toolbar);
       getSupportActionBar().setLogo(R.drawable.favorite24);    //加上这行就可以直接再action bar上加入LOGO
       getSupportActionBar().setDisplayUseLogoEnabled(true);          //不确定要加不要加（DEMO起来有加跟没加一样
        Inflater inflater = new Inflater();

    }

    @Override                                                      //28行到47行放按钮在action bar上面，Toast测试按钮的可用性
    public boolean onCreateOptionsMenu(Menu menu) {                 //注意：最重要的是要在menu上面放上所需要用的材料
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                Toast.makeText(MainActivity.this,"setting",Toast.LENGTH_LONG).show();
                return true;

            case R.id.action_favorite:
                Toast.makeText(MainActivity.this,"favorite",Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }}
