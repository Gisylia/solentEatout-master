package com.example.user.solenteatout;

import android.content.res.Configuration;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;

public class MainActivity extends AppCompatActivity {

    MapView mv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Configuration.getIstance().load(this, PreferenceManager.getDefultSharedPreferences(this));
        setContentView(R.layout.activity_main);

        // buttons
        Button b = (Button) findViewById(R.id.btn1);
        b.setOnClickListener((View.OnClickListener) this);

        Button ok = (Button) findViewById(R.id.btn1);
        ok.setOnClickListener((View.OnClickListener) this);

        Button c = (Button) findViewById(R.id.btn2);
        c.setOnClickListener((View.OnClickListener) this);

        //text views
       /* TextView tv=new TextView(this);
        tv.setText("hello World!");
        setContentView(tv);*/
        //map
        mv = findViewById(R.id.map1);
        mv.setBuiltInZoomControls(true);
        mv.getController().setCenter(new GeoPoint(51.05,-0.72));
    }
        public void onClick (View view)
        {
            TextView tv =  (TextView)findViewById(R.id.tv1);
            EditText et = (EditText)findViewById(R.id.et1);
            double feet = Double.parseDouble(et.getText().toString());
            double meters = feet*0.305;
            tv.setText("in meters that is: " + meters);
        }


    }

