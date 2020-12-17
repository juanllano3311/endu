package com.example.endulsar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;

public class adapterMinipersonal extends FirestoreRecyclerAdapter <Minipersonal, adapterMinipersonal.ViewHolder>{

    /**
     * Create a new RecyclerView adapter that listens to a Firestore Query.  See {@link
     * FirestoreRecyclerOptions} for configuration options.
     *
     * @param options
     */
    public adapterMinipersonal(@NonNull FirestoreRecyclerOptions <Minipersonal> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull ViewHolder holder, int position, @NonNull Minipersonal model) {

        holder.id.setText(model.getId());
        holder.nombre.setText(model.getNombre());
        holder.precio.setText(model.getPrecio());
        holder.capacidad.setText(model.getCapacidad());

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itm_listar_minipersonal,null,false);
        return new ViewHolder(view);

    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView id,nombre,precio,capacidad;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            id = itemView.findViewById(R.id.tvidminipersonal);
            nombre = itemView.findViewById(R.id.tvnombreminipersonal);
            precio = itemView.findViewById(R.id.tvpreciominipersonal);
            capacidad = itemView.findViewById(R.id.tvcapaciddminipersonal);

        }
    }



}

