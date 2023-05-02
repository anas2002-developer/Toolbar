package com.anas.toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar=findViewById(R.id.toolbar);

        //for using customised toolbar
        setSupportActionBar(toolbar);

        if (getSupportActionBar()!=null) {

            // for enabling home button which is back arrow by default
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            //for setting title as high priority
            getSupportActionBar().setTitle("Title");
        }

        //for setting sub title
        toolbar.setSubtitle("sub title");



    }

    //for using menu
    @Override
    public boolean onCreateOptionsMenu(Menu main_menu) {
        new MenuInflater(this).inflate(R.menu.option_menu,main_menu);
          //or
//        MenuInflater inflater=getMenuInflater();
//        inflater.inflate(R.menu.option_menu,menu);
        return super.onCreateOptionsMenu(main_menu);
    }

    //for clicks on Menu Items or Other toolbar items
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int ItemId=item.getItemId();

        if(ItemId==android.R.id.home){              //Id of Home Button set through setDisplayHomeAsUpEnabled(true);
            super.onBackPressed();
        }
        else if (ItemId==R.id.item1){
            Toast.makeText(this,"New Clicked",Toast.LENGTH_SHORT).show();
        }
        else if (ItemId==R.id.item2){
            Toast.makeText(this,"Open Clicked",Toast.LENGTH_SHORT).show();
        }
        else if (ItemId==R.id.item3){
            Toast.makeText(this,"Save Clicked",Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}