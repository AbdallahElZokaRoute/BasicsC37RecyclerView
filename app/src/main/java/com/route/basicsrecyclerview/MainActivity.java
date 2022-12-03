package com.route.basicsrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    /*
        Recylcer View -> Facebook Timeline
                         Whatsapp Contacts
                         Settings Items
       List View (X) -> 1000 Whatsapp Contacts -> Resources
       Grid View (X)


     */
    RecyclerView recyclerView;
    SettingsAdapter settingsAdapter;
    ArrayList<SettingsItem> settingsItems;//null

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.settings_recycler_view);
        initializeRecyclerViewData();
        settingsAdapter = new SettingsAdapter(settingsItems);
        recyclerView.setAdapter(settingsAdapter);
    }

    public void initializeRecyclerViewData() {
        settingsItems = new ArrayList<>(1000);
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0)
                settingsItems.add(new SettingsItem(
                        "Wi-FI,",
                        "Wi-Fi Devices and other settings",
                        R.drawable.ic_wifi));
            else if (i % 3 == 1) {
                settingsItems.add(new SettingsItem("Battery",
                        "100%",
                        R.drawable.ic_battery
                ));
            } else if (i % 3 == 2) {
                settingsItems.add(new SettingsItem("Apps & Notifcations", "Recent apps , default apps", R.drawable.ic_apps));

            }
        }

    }


}