package com.example.mitaapp3;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Rs extends ListActivity {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] listHos = new String[]{"Rumah Sakit Awal Bros", "Eka Hospital", "Rumah Sakit Jiwa Tampan", "Rumah Sakit Umum Daerah Arifin Ahmad"};
        this.setListAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listHos));
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
            if (pilihan.equals("Rumah Sakit Awal Bros")) {
                a = new Intent(this, Awal.class);
            } else if (pilihan.equals("Eka Hospital")) {
                a = new Intent(this, Eka.class);
            } else if (pilihan.equals("Rumah Sakit Jiwa Tampan")) {
                a = new Intent(this, Rsj.class);
            } else if (pilihan.equals("Rumah Sakit Umum Daerah Arifin Ahmad")) {
                a = new Intent(this, Arifin.class);
            }
            startActivity(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
