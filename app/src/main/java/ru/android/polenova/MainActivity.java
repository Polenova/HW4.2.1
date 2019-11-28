package ru.android.polenova;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Random random = new Random();
    private ContactAdapter adapter;
    private List<Drawable> images;
    private List<ContactItem> contacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fillImages();

        initList();
    }

    private void initList() {
        ListView listView = findViewById(R.id.list);
        contacts = generateRandomContactItem();
        adapter = new ContactAdapter(this, contacts);
        listView.setAdapter(adapter);
    }

    private List<ContactItem> generateRandomContactItem() {
        return Arrays.asList(new ContactItem(
                images.get(random.nextInt(images.size())),
                "Call" + adapter.getCount(),
                "Ivanov +79012345678",
                random.nextBoolean()));
    }


    private void fillImages() {
        images.add(ContextCompat.getDrawable(MainActivity.this,
                android.R.drawable.ic_menu_report_image));
        images.add(ContextCompat.getDrawable(MainActivity.this,
                android.R.drawable.ic_menu_add));
        images.add(ContextCompat.getDrawable(MainActivity.this,
                android.R.drawable.ic_menu_agenda));
        images.add(ContextCompat.getDrawable(MainActivity.this,
                android.R.drawable.ic_menu_camera));
        images.add(ContextCompat.getDrawable(MainActivity.this,
                android.R.drawable.ic_menu_call));
    }
}

