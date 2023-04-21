package com.umang_rathod.webio;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class AllCategories extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_categories);

        listView = findViewById(R.id.showlisthere);
        String[] data = {"Apparel & Accessories", "Food & Beverage", "Toys", "Crafts & Hobbies", "Electronics & Computers",
                "Fruits & Veg", "Jewelery", "Health & Beauty", "Footwear", "Home & Furniture","Books, Music & Video", "Art &amp; Photography", "Gifts & Flowers",
                "Pet Products", "Sports, Fitness & Outdoors", "Grocery & Organic Foods"};
        Integer[] imgid = new Integer[15];
        for(int i=0;i<=14; i++){
            imgid[i] = R.drawable.temporary_image;
        }

        CustomAdapter adapter = new CustomAdapter(this, data, imgid);
        listView.setAdapter(adapter);
    }

    public class CustomAdapter extends ArrayAdapter<String> {

        private final Activity context;
        private final String[] data;
        private final Integer[] imgid;


        public CustomAdapter(Activity context, String[] data, Integer[] imgid) {
            super(context, R.layout.template_viewer_list, data);
            this.context = context;
            this.data = data;
            this.imgid = imgid;
        }

        public View getView(int i, View view, ViewGroup parent){
            LayoutInflater inflater = context.getLayoutInflater();
            View v1 = inflater.inflate(R.layout.template_viewer_list,null,true);
            ImageView img = v1.findViewById(R.id.imageoftemplate);
            TextView name = v1.findViewById(R.id.templatecategory);
            img.setImageResource(imgid[i]);
            name.setText(data[i]);
            return v1;
        }
    }

}