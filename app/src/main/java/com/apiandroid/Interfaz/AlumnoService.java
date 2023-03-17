package com.apiandroid.Interfaz;

import com.apiandroid.Entities.Alumno;
import com.apiandroid.Entities.Grupo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface AlumnoService {
      @GET("apiadmin/alumnes")
      Call<List<Alumno>> getAlumnos();

      @GET("apibalmes/grups")
      Call<List<Grupo>> getGrupos();
}
