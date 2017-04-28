package com.example.sev.newbie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    ListView list;
    String[] valores = new String[]{"Holanda", "España", "Francia", "Italia", "Alemania", "Noruega", "Rusia", "Perú"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        list = (ListView)findViewById(R.id.list);
        //necesitamos un adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, valores);
        //colocamos el adaptador
        list.setAdapter(adapter);
        //cuando demos click a un elemento de la lista
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"posicion "+position, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
