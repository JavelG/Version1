package com.example.version1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.TextView);

        String version = "3.5.2";

        try{
            PackageInfo packageInfo = getPackageManager().getPackageInfo(getPackageName(), 0);

            version= packageInfo.versionName;

        }
        catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        textView.setText("Version" + version);
    }
}
