package com.example.mitaapp3;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class masjid extends ListActivity {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] listmasjid = new String[]{"Masjid Raya Nur Alam", "Masjid Ar-Rahman", "Masjid Ar-Rahim"};
        this.setListAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listmasjid));
    }

    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkan(pilihan);
    }

    private void tampilkan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("Masjid Raya Nur Alam")) {
                a = new Intent(this, masjRaya.class);
            } else if (pilihan.equals("Masjid Ar-Rahman")) {
                a = new Intent(this, masjRahman.class);
            } else if (pilihan.equals("Masjid Ar-Rahim")) {
                a = new Intent(this, masjRahim.class);
            }
            startActivity(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
