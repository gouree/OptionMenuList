package com.example.gouree.optionmenulist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
    }


    @Override

    //function to create menuinflater object and inflate the menus
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main,menu);

        return super.onCreateOptionsMenu(menu);
    }


    @Override

    //function to perform action on click of each item
    public boolean onOptionsItemSelected(MenuItem item) {

        //get item id and execute cases accordingly
        switch(item.getItemId())
        {
            //display a toast message on click of each item corresponding to the id
            case R.id.cameraid:
                            Toast.makeText(getBaseContext(),"You selected Camera option",Toast.LENGTH_SHORT).show();
                            break;

            case R.id.computerid:
                Toast.makeText(getBaseContext(),"You selected Computer option",Toast.LENGTH_SHORT).show();
                break;


            case R.id.emailid:
                Toast.makeText(getBaseContext(),"You selected Email option",Toast.LENGTH_SHORT).show();
                break;

            case R.id.gamepadid:
                Toast.makeText(getBaseContext(),"You selected Gamepad option",Toast.LENGTH_SHORT).show();
                break;


            case R.id.videoid:
                Toast.makeText(getBaseContext(),"You selected Video option",Toast.LENGTH_SHORT).show();
                break;



        }


        return super.onOptionsItemSelected(item);
    }
}
