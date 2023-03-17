package com.apiandroid;

import static android.content.ContentValues.TAG;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.apiandroid.Adaptador.AlumnAdapter;
import com.apiandroid.Client.ApiClient;
import com.apiandroid.Entities.Alumno;
import com.apiandroid.Interfaz.AlumnoService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ArrayList<Alumno> alumnos;
    private RecyclerView recyclerView;
    private AlumnAdapter adapter;
    TextView data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.listaAlumnes);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new AlumnAdapter(new ArrayList<>());
        recyclerView.setAdapter(adapter);


        AlumnoService alumnoService = ApiClient.getService();
        Call<List<Alumno>> call = alumnoService.getAlumnos();

        call.enqueue(new Callback<List<Alumno>>() {
            @Override
            public void onResponse(Call<List<Alumno>> call, Response<List<Alumno>> response) {
                if (response.isSuccessful()){
                    List<Alumno> alumnos = response.body();

                    for(Alumno alumno : alumnos){
                        System.out.printf(alumno.toString());
                    }

                    recyclerView = findViewById(R.id.listaAlumnes);
                    recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                    recyclerView.setAdapter(new AlumnAdapter(alumnos));

                } else {
                    System.out.printf("Response no es Succesful");

                }
            }

            @Override
            public void onFailure(Call<List<Alumno>> call, Throwable t) {
                Log.e(TAG,"Error: " + t.getMessage());
            }
        });
    }
}