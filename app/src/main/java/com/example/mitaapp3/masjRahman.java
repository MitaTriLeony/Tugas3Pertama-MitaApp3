package com.example.mitaapp3;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class masjRahman extends ListActivity {
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
                String dir = "https://www.google.com/search?q=masjid+ar-rahman+pekanbaru&tbm=lcl&sxsrf=APq-WBu1JLzhFxaJBFZfqTnvMMUJjBGn3A%3A1647063375185&ei=TzEsYtLqCrGUseMP07mOIA&oq=masjid+ar-rahman+pekanbaru&gs_l=psy-ab.3..0i22i30k1l2j38l2.4652.14235.0.14522.40.30.0.1.1.0.273.2415.18j6j1.26.0....0...1c.1.64.psy-ab..14.26.2531.10..35i39k1j35i362i39k1j0i273k1j0i512i433k1j0i433i131k1j0i512k1j0i512i433i131k1j0i433k1j0i67k1j0i512i263i433i20k1j0i433i273k1j0i203k1j0i512i263i20k1j0i512i457k1.219.U5Fkylj9yy4#";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(dir));
            } else if (pilihan.equals("Google Info")) {
                String inf = "https://www.google.com/search?q=masjid+ar-rahman+pekanbaru&tbm=lcl&sxsrf=APq-WBu1JLzhFxaJBFZfqTnvMMUJjBGn3A%3A1647063375185&ei=TzEsYtLqCrGUseMP07mOIA&oq=masjid+ar-rahman+pekanbaru&gs_l=psy-ab.3..0i22i30k1l2j38l2.4652.14235.0.14522.40.30.0.1.1.0.273.2415.18j6j1.26.0....0...1c.1.64.psy-ab..14.26.2531.10..35i39k1j35i362i39k1j0i273k1j0i512i433k1j0i433i131k1j0i512k1j0i512i433i131k1j0i433k1j0i67k1j0i512i263i433i20k1j0i433i273k1j0i203k1j0i512i263i20k1j0i512i457k1.219.U5Fkylj9yy4#rlfi=hd:;si:12243235273591188065,l,ChptYXNqaWQgYXItcmFobWFuIHBla2FuYmFydUiehb6szI-AgAhaLhAAEAEQAhgAGAEYAhgDIhptYXNqaWQgYXIgcmFobWFuIHBla2FuYmFydTICaWSSAQZtb3NxdWU;mv:[[0.5145715184126038,101.45216611041182],[0.5077053365705613,101.44019272936934],null,[0.5111384284091662,101.44617941989058],17]";
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
