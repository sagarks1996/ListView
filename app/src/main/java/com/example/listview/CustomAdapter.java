package com.example.listview;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    Context context;
    String text[];
    String text1[];
    int image[];
    LayoutInflater inflater;

    public CustomAdapter(Context applicationContext, String[] text1, String[] text, int[] image) {


        this.context = applicationContext;
        this.text = text;
        this.text1 = text1;
        this.image = image;
        inflater = LayoutInflater.from(applicationContext);
    }

  /*  public CustomAdapter(Context applicationContext, String[] text, int[] image) {
        this.context = applicationContext;
        this.text = text;
        //this.text = text1;
        this.image = image;
        inflater = LayoutInflater.from(applicationContext);

    }
*/

    @Override
    public int getCount() {
        return text1.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = inflater.inflate(R.layout.activity_listview,null);
        TextView textView = convertView.findViewById(R.id.textview);
        TextView textView1 = convertView.findViewById(R.id.textview1);
        ImageView imageView = convertView.findViewById(R.id.imageview);

        textView.setText(text[position]);
        textView1.setText(text1[position]);
        imageView.setImageResource(image[position]);
        return convertView;



    }
}
