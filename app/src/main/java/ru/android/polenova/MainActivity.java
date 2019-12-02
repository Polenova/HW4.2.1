package ru.android.polenova;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Random random = new Random();
    private List<Drawable> images = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fillImages();
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(new ContactAdapter(this, generateRandomContactItem()));
    }

    private List<ContactItem> generateRandomContactItem() {
        List<ContactItem> contacts = new ArrayList<>();
        contacts.add(new ContactItem(images.get(random.nextInt(images.size())),"Звонок","Ivanov +7900" + random.nextInt(9999999),random.nextBoolean()));
        contacts.add(new ContactItem(images.get(random.nextInt(images.size())),"Звонок","Petrov +7900" + random.nextInt(9999999),random.nextBoolean()));
        contacts.add(new ContactItem(images.get(random.nextInt(images.size())),"Звонок","Sidorov +7900" + random.nextInt(9999999),random.nextBoolean()));
        contacts.add(new ContactItem(images.get(random.nextInt(images.size())),"Звонок","Pupkov +7900" + random.nextInt(9999999),random.nextBoolean()));
        contacts.add(new ContactItem(images.get(random.nextInt(images.size())),"Звонок","Ivanov +7900" + random.nextInt(9999999),random.nextBoolean()));
        contacts.add(new ContactItem(images.get(random.nextInt(images.size())),"Звонок","Petrov +7900" + random.nextInt(9999999),random.nextBoolean()));
        contacts.add(new ContactItem(images.get(random.nextInt(images.size())),"Звонок","Sidorov +7900" + random.nextInt(9999999),random.nextBoolean()));
        contacts.add(new ContactItem(images.get(random.nextInt(images.size())),"Звонок","Pupkov +7900" + random.nextInt(9999999),random.nextBoolean()));
        return contacts;
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

