package com.example.mitaapp3;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class masjRahim extends ListActivity {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] listAct = new String[]{"Direction", "Google Info", "Exit"};
        this.setListAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listAct));
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
            if (pilihan.equals("Direction")) {
                String dir = "https://www.google.com/search?q=masjid+ar-rahim+pekanbaru&tbm=lcl&sxsrf=APq-WBupc_MTCFBR5soaX_ZRYO0LBU6Gbw%3A1647065360711&ei=EDksYrf6Kv-QseMP16ejiAs&oq=masjid+ar-rahim+pekanbaru&gs_l=psy-ab.3..0i22i30k1.146141.155765.0.156496.31.21.3.0.0.0.147.1859.16j4.20.0....0...1c.1.64.psy-ab..11.20.1527...38j35i39k1j0i273k1j0i203k1j0i512k1j0i457i22i30k1j0i8i13i30k1.0.Z8eAyZrBSnI#";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(dir));
            } else if (pilihan.equals("Google Info")) {
                String inf = "https://www.google.com/search?q=masjid+ar-rahim+pekanbaru&tbm=lcl&sxsrf=APq-WBupc_MTCFBR5soaX_ZRYO0LBU6Gbw%3A1647065360711&ei=EDksYrf6Kv-QseMP16ejiAs&oq=masjid+ar-rahim+pekanbaru&gs_l=psy-ab.3..0i22i30k1.146141.155765.0.156496.31.21.3.0.0.0.147.1859.16j4.20.0....0...1c.1.64.psy-ab..11.20.1527...38j35i39k1j0i273k1j0i203k1j0i512k1j0i457i22i30k1j0i8i13i30k1.0.Z8eAyZrBSnI#rlfi=hd:;si:16691650830050880390,l,ChltYXNqaWQgYXItcmFoaW0gcGVrYW5iYXJ1SJDvzq7Mj4CACFotEAAQARACGAAYARgCGAMiGW1hc2ppZCBhciByYWhpbSBwZWthbmJhcnUyAmlkkgEGbW9zcXVlqgEXEAEqEyIPbWFzamlkIGFyIHJhaGltKCY;mv:[[0.5131492,101.4588426],[0.4984959,101.4449101]]";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(inf));
            } else if (pilihan.equals("Exit")) {
                finish();
            }
            startActivity(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
