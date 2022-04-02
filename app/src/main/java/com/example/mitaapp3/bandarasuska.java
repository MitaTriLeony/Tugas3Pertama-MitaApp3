package com.example.mitaapp3;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class bandarasuska extends ListActivity {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] listAct = new String[]{"Call Center", "Message", "Direction", "Website", "Google Info", "Exit"};
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
                String tel = "tel:(0761) 674694 ";
                a = new Intent(Intent.ACTION_DIAL, Uri.parse(tel));
            } else if (pilihan.equals("Message")) {
                String msg = "Mita Tri Leony/P";
                a = new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("sms:(0761) 674694 "));
                a.putExtra("sms_body", msg);
            } else if (pilihan.equals("Direction")) {
                String dir = "https://www.google.com/maps/place/Sultan+Syarif+Kasim+II+International+Airport/@0.4645874,101.445533,17z/data=!3m1!4b1!4m5!3m4!1s0x31d5afd168f25799:0xeb2fdddc9da30d93!8m2!3d0.4645874!4d101.4477217";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(dir));
            } else if (pilihan.equals("Website")) {
                String web = "https://sultansyarifkasim2-airport.co.id/";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(web));
            } else if (pilihan.equals("Google Info")) {
                String inf = "https://www.google.com/search?q=bandara+sultan+syarif+kasim&oq=bandara+sultan+syarif+kasim+&aqs=chrome..69i57j46i20i175i199i263i512j0i512j0i22i30l6.16064j0j9&sourceid=chrome&ie=UTF-8";
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
