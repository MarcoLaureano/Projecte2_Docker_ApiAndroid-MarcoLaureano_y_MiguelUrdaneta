package com.apiandroid.Adaptador;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.apiandroid.Entities.Alumno;
import com.apiandroid.R;

import java.util.List;

public class AlumnAdapter extends RecyclerView.Adapter<AlumnAdapter.Viewholder> {

    private List<Alumno> mAlumnos;

    public AlumnAdapter(List<Alumno> alumnos){
        mAlumnos = alumnos;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.alumno_item, parent, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        Alumno alumno = mAlumnos.get(position);
        holder.mNom.setText(alumno.getNom());
        holder.mCognom.setText(alumno.getCognoms());
        holder.mGrupNom.setText(alumno.getGrupNom());
        holder.mEmail.setText(alumno.getEmail());
    }

    @Override
    public int getItemCount() {
        return mAlumnos.size();
    }


    public static class Viewholder extends RecyclerView.ViewHolder {

        public TextView mNom;
        public TextView mCognom;
        public TextView mEmail;
        public TextView mGrupNom;

        public Viewholder(@NonNull View itemView) {
            super(itemView);

            mNom = itemView.findViewById(R.id.nom);
            mCognom = itemView.findViewById(R.id.cognom);
            mEmail = itemView.findViewById(R.id.email);
            mGrupNom = itemView.findViewById(R.id.grupNom);
        }
    }
}
