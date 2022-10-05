package com.example.affirmation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.affirmation.adapter.ItemAdapter;
import com.example.affirmation.data.DataSource;
import com.example.affirmation.model.Affirmation;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DataSource myDataset = new DataSource(this);
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setAdapter(new ItemAdapter(this, myDataset.loadAffirmation()));




    }
}