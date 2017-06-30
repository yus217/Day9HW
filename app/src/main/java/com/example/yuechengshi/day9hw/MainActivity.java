package com.example.yuechengshi.day9hw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    int start = 1;
    int end = 12;

    int start_pos = 1;
    final int discrete = 1;
    int value [] = {1,2,3,4,5,6,7,8,9,10,11,12};
    int result[];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lView = (ListView) findViewById(R.id.listView1);  
        final ArrayList<String> classRoster = new ArrayList<String>(); 
        classRoster.add("1"); 
        classRoster.add("2"); 
        classRoster.add("3"); 
        classRoster.add("4");  
        classRoster.add("5"); 
        classRoster.add("6"); 
        classRoster.add("7"); 
        classRoster.add("8");  
        classRoster.add("9"); 
        classRoster.add("10"); 
        classRoster.add("11"); 
        classRoster.add("12");  
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, classRoster);  
        lView.setAdapter(adapter);  

        lView.setOnItemClickListener(new AdapterView.OnItemClickListener() { 

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int j, long l) {  

                for (j = 0; j < 12; j++) {

                    //Log.i("Hello ", classRoster.get(i)); 
                    final SeekBar sb = (SeekBar) findViewById(R.id.seekBar1);
                    sb.setMax(12);



                    sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                        @Override
                        public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                        }

                        @Override
                        public void onStartTrackingTouch(SeekBar seekBar) {


                        }

                        @Override
                        public void onStopTrackingTouch(SeekBar seekBar) {
                            seekBar.getProgress();

                        }
                    });
                    int result = sb.getProgress()* j;
                    String msg = Integer.toString(result);
                    Toast.makeText(MainActivity.this, msg, Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
