package com.example.fletch.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * La classe nécessite un générique.
 * Dans ce cas-ci, nous lui passons MainAdapter.ViewHolder,
 */
public class MainAdapter extends Adapter<MainAdapter.ViewHolder> {
    private String[] dataSet;


    // Fournit une référence aux vues pour chaque élément de données
    // les éléments de données complexes peuvent nécessiter plus d'une vue par élément, et
    // vous donne accès à toutes les vues d'un élément de données dans un titulaire de vue
    public static class ViewHolder extends RecyclerView.ViewHolder {

        /* textView qui devra contenir la donnée "nom" */
        private final TextView name;

        public ViewHolder(View v) {
            super(v);
            name = v.findViewById(R.id.textView_Nom);
        }
    }

    // Constructeur
    public MainAdapter(String[] myDataset) {
        dataSet = myDataset;
    }

    // Génère ne nouvelles vues (invoqué par le layout manager)
    @Override
    public MainAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {

        //
        // Instancie un fichier XML de Layout dans les objets View correspondants.
        //
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_cell, parent, false);
        return new ViewHolder(view);
    }

    // Remplace le contenu d'une vue (invoqué par le layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // Remplace le texte de la vue
        holder.name.setText(dataSet[position]);

    }

    // Doit retourner la largeur(size) du dataset (invoqué par le layout manager)
    @Override
    public int getItemCount() {
        return dataSet.length;
    }


}
