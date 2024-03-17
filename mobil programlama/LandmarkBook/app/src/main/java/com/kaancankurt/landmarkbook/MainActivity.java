package com.kaancankurt.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.kaancankurt.landmarkbook.databinding.ActivityDetailsBinding;
import com.kaancankurt.landmarkbook.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    ArrayList<Landmark> landmarkArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        landmarkArrayList = new ArrayList<>();

        Landmark pisa = new Landmark("Pisa","Italy",R.drawable.pisa);
        Landmark eifell = new Landmark("Eifell","France",R.drawable.eyfel);
        Landmark colosseum = new Landmark("Colosseum","Italy",R.drawable.colosseum);
        Landmark londoneye = new Landmark("London Eye","UK",R.drawable.londoneye);

        landmarkArrayList.add(pisa);
        landmarkArrayList.add(eifell);
        landmarkArrayList.add(colosseum);
        landmarkArrayList.add(londoneye);
        /*
        //Adapter veri kaynağıyla xml 'i ve listview'i birbirine bağlayan yapı
        //Listview

        //Mapping ------ Bir şeyi bir şeye dönüştürmekte kullanıyoruz
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                landmarkArrayList.stream().map(landmark -> landmark.name).collect(Collectors.toList())
                //landmark'ı landmark.name'e dönüştürdük
        );
        binding.listview.setAdapter(arrayAdapter);

        binding.listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(MainActivity.this,landmarkArrayList.get(i).name,Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this,DetailsActivity.class);
                intent.putExtra("landmark",landmarkArrayList.get(i));
                startActivity(intent);
            }
        });*/



    }
}