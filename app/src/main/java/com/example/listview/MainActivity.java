package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    ListView listView;
    String text[] = {"apple","orange","car","bus","bike","grape","Pen","pencil","Lap","Book","app"};
    String text1[] = {"red","yellow","white","blue","green","red","black","grey","green","grey"};
    int image[] = {R.drawable.image,R.drawable.image,R.drawable.image,R.drawable.image,R.drawable.image,R.drawable.image,
            R.drawable.image,R.drawable.image,R.drawable.image,R.drawable.image,R.drawable.image};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);

        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(),text1,text,image);
        listView.setAdapter(customAdapter);

        /*CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(),text,text1,image);
        listView.setAdapter(customAdapter);*/

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {



                String data = text[position]+"/"+text1[position];
                int im = image[position];

                Intent i = new Intent(getApplicationContext(),SecondActivity.class);


               Log.d("intentData",data);
                i.putExtra("content",data);
                i.putExtra("imagename",im);
                startActivity(i);
//                Toast.makeText(MainActivity.this,"Selected Content :\n"+text[+position]+"\n"+text1[+position],Toast.LENGTH_SHORT).show();



            }
        });



    }
}
