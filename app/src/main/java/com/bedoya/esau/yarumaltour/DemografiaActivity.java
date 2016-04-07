package com.bedoya.esau.yarumaltour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class DemografiaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demografia);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menudemo, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.mHoteles) {
            // Toast.makeText(this,"Presionó configurar", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, HotelesActivity.class);
            startActivityForResult(intent, 2);
            finish();
        }else if (id==R.id.mBares){
            Intent intent=new Intent(this, BaresActivity.class);
            startActivityForResult(intent,1);
            finish();
        }else if (id==R.id.mTuristicos){
            Intent intent=new Intent(this,SitiosActivity.class);
            startActivityForResult(intent,3);
            finish();
        }else if (id==R.id.mPpal){
            Intent intent=new Intent(this,MainActivity.class);
            startActivityForResult(intent,6);
            finish();
        }else if (id==R.id.mAcerca){
            Intent intent=new Intent(this,AcercadeActivity.class);
            startActivityForResult(intent,5);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
