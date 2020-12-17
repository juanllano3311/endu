package com.example.endulsar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.squareup.picasso.Picasso;

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


        holder.nombre.setText(model.getNombre());
        holder.precio.setText(model.getPrecio());

        Picasso
                .get()
                .load(model.getImagen(position))
                .resize(200, 200)
                .placeholder(R.drawable.ic_launcher_background)  // precargado
                .error(R.drawable.ic_launcher_foreground)        // error de carga
                .into(holder.imagen);


    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itm_listar_minipersonal,null,false);
        return new ViewHolder(view);

    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView nombre,precio;
        ImageView imagen;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);


            nombre = itemView.findViewById(R.id.tvnombreminipersonal);
            precio = itemView.findViewById(R.id.tvpreciominipersonal);
           imagen = itemView.findViewById(R.id.etimagen);

        }
    }



}

