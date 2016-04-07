package com.bedoya.esau.yarumaltour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.mBares) {
            // Toast.makeText(this,"Presionó configurar", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, BaresActivity.class);
            startActivityForResult(intent, 1);

        }else if (id==R.id.mHoteles){
            Intent intent=new Intent(this, HotelesActivity.class);
            startActivityForResult(intent,2);

        }else if (id==R.id.mTuristicos){
            Intent intent=new Intent(this,SitiosActivity.class);
            startActivityForResult(intent,3);

        }else if (id==R.id.mDemografia){
            Intent intent=new Intent(this,DemografiaActivity.class);
            startActivityForResult(intent,4);

        }else if (id==R.id.mAcerca){
            Intent intent=new Intent(this,AcercadeActivity.class);
            startActivityForResult(intent,5);

        }
        return super.onOptionsItemSelected(item);
    }
}
