package com.example.mitaapp3;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class masjRaya extends ListActivity {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] listAct = new String[]{"Call Center", "Message", "Direction", "Google Info", "Exit"};
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
            if (pilihan.equals("Call Center")) {
                String tel = "tel:0812-7528-661 ";
                a = new Intent(Intent.ACTION_DIAL, Uri.parse(tel));
            } else if (pilihan.equals("Message")) {
                String msg = "Mita Tri Leony/P";
                a = new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("sms: 0812-7528-661"));
                a.putExtra("sms_body", msg);
            } else if (pilihan.equals("Direction")) {
                String dir = "https://www.google.com/search?q=daftar+masjid+di+pekanbaru&tbm=lcl&sxsrf=APq-WBu1JLzhFxaJBFZfqTnvMMUJjBGn3A%3A1647063375185&ei=TzEsYtLqCrGUseMP07mOIA&oq=daftar+masjid+di+pekanbaru&gs_l=psy-ab.3..0i203k1.4241.20319.0.21286.41.24.1.11.11.0.194.2446.4j15.20.0....0...1c.1.64.psy-ab..11.30.2331.10..35i39k1j0i22i30k1j35i362i39k1j0i273k1j0i67k1j0i433i131k1j0i512k1j0i512i433i131k1j0i512i433k1j0i433i273k1j0i10i203k1.204.tNRkzql2ieE#";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(dir));
            } else if (pilihan.equals("Google Info")) {
                String inf = "https://www.google.com/search?q=masjid+raya+nur+alam&tbm=lcl&sxsrf=APq-WBtQww1k-9BLOhtzxbYzMQACJSavug%3A1647064691860&ei=czYsYteGNP-VseMP0N-qgA0&oq=masjid+raya+nur+alam&gs_l=psy-ab.3..0i203k1j38.77625.84844.0.85168.46.25.0.4.4.0.262.2546.8j12j1.22.0....0...1c.1.64.psy-ab..25.21.2373.10..35i362i39k1j35i39k1j0i273k1j0i67k1j0i512i433k1j0i433i131k1j0i512i433i131k1j0i457i67k1j0i402k1j0i512i263i433i20k1j0i512k1j0i433i273k1j0i433i131i457i67k1j0i22i30k1.276.WoPtSvMkY7U#rlfi=hd:;si:4991330536572126428,l,ChRtYXNqaWQgcmF5YSBudXIgYWxhbUipjcyO-6yAgAhaNhAAEAEQAhADGAAYARgCGAMiFG1hc2ppZCByYXlhIG51ciBhbGFtKgoIAhAAEAEQAhADMgJpZJIBBm1vc3F1ZQ,y,dVt6kssWMIw;mv:[[0.5381732773190296,101.44239278525339],[0.5378133226809704,101.4420328147466]]";
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
