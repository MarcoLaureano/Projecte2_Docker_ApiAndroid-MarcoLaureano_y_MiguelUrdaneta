package com.apiandroid.Adaptador;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.apiandroid.Entities.Grupo;
import com.apiandroid.R;

import java.util.List;

public class GrupAdapter extends RecyclerView.Adapter<GrupAdapter.Viewholder>{
    private List<Grupo> mGrupos;

    public GrupAdapter(List<Grupo> grupos){
        mGrupos = grupos;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grupo_item, parent, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        Grupo grupo = mGrupos.get(position);
        holder.mGrupId.setText(String.valueOf(grupo.getGrupId()));
        holder.mGrup.setText(grupo.getGrup());
        holder.mCicle.setText(grupo.getCicle());
        holder.mCurs.setText(String.valueOf(grupo.getCurs()));
        holder.mAula.setText(String.valueOf(grupo.getAula()));

    }

    @Override
    public int getItemCount() {
        return mGrupos.size();
    }


    public static class Viewholder extends RecyclerView.ViewHolder {

        public TextView mGrupId;
        public TextView mGrup;
        public TextView mCicle;
        public TextView mAula;
        public TextView mCurs;

        public Viewholder(@NonNull View itemView) {
            super(itemView);

            mGrupId = itemView.findViewById(R.id.grupid);
            mGrup = itemView.findViewById(R.id.grup);
            mCicle = itemView.findViewById(R.id.ciclo);
            mCurs = itemView.findViewById(R.id.curs);
            mAula = itemView.findViewById(R.id.aula);
        }
    }
}
