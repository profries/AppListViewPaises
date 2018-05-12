package com.example.iossenac.applistviewpaises;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    List<String> listaPaises;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        listaPaises = new ArrayList<>();
        listaPaises.add("Alemanha");
        listaPaises.add("Brasil");
        listaPaises.add("Coreia");
        listaPaises.add("Dinamarca");
        listaPaises.add("Espanha");

        ListView listViewPaises = (ListView) findViewById(R.id.listViewPaises);

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,listaPaises);

        listViewPaises.setAdapter(adapter);

        listViewPaises.setOnItemClickListener(this);

    }

    public void adicionaPais(View v){
        EditText textoPais = (EditText) findViewById(R.id.textoPais);
        listaPaises.add(textoPais.getText().toString());
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, listaPaises.get(position),Toast.LENGTH_SHORT).show();




    }
}
