package com.apiandroid;

import static android.content.ContentValues.TAG;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.apiandroid.Adaptador.GrupAdapter;
import com.apiandroid.Client.ApiClient;
import com.apiandroid.Entities.Grupo;
import com.apiandroid.Interfaz.AlumnoService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Grupos extends AppCompatActivity {


    private RecyclerView recyclerView;
    private GrupAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupos);

        recyclerView = findViewById(R.id.listaGrupos);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new GrupAdapter (new ArrayList<>());
        recyclerView.setAdapter(adapter);


        AlumnoService grupoService = ApiClient.getService();
        Call<List<Grupo>> call = grupoService.getGrupos();

        call.enqueue(new Callback<List<Grupo>>() {
            @Override
            public void onResponse(Call<List<Grupo>> call, Response<List<Grupo>> response) {
                if (response.isSuccessful()){
                    List<Grupo> grupos = response.body();

                    for(Grupo grupo : grupos){
                        System.out.printf(grupo.toString());
                    }

                    recyclerView = findViewById(R.id.listaGrupos);
                    recyclerView.setLayoutManager(new LinearLayoutManager(Grupos.this));
                    recyclerView.setAdapter(new GrupAdapter(grupos));

                } else {
                    System.out.printf("Response no es Succesful");

                }
            }

            @Override
            public void onFailure(Call<List<Grupo>> call, Throwable t) {
                Log.e(TAG,"Error: " + t.getMessage());
            }
        });
    }
}