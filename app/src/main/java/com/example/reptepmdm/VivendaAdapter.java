package com.example.reptepmdm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class VivendaAdapter extends ArrayAdapter {

    private Vivenda[] vivendas;

    private static class ViewHolder
    {
        ImageView imgVivenda;
        TextView lblType;
        TextView lblLoc;
        TextView lblDir;
        TextView lblCash;
        TextView lblRooms;
        TextView lblRented;
    }

    public VivendaAdapter(Context context, Vivenda[] vivendas) {
        super(context, R.layout.vivenda_layout, vivendas);
        this.vivendas = vivendas;
    }
    @Override
    public View getView(int position, View currentview, ViewGroup parent)
    {
        View item = currentview;
        ViewHolder holder;

        if (item == null)
        {
            item = LayoutInflater.from(getContext()).
                    inflate(R.layout.vivenda_layout, parent, false);

            holder = new ViewHolder();
            holder.imgVivenda = item.findViewById(R.id.imgVivenda);
            holder.lblType = item.findViewById(R.id.lblType);
            holder.lblLoc = item.findViewById(R.id.lblLoc);
            holder.lblDir = item.findViewById(R.id.lblDir);
            holder.lblCash = item.findViewById(R.id.lblCash);
            holder.lblRooms = item.findViewById(R.id.lblRooms);
            holder.lblRented = item.findViewById(R.id.lblRented);

            item.setTag(holder);
        }
        else
        {
            holder = (ViewHolder) item.getTag();
        }

        //holder.imgVivenda.setImageResource(vivendas[position].getImagen());
        holder.lblType.setText(vivendas[position].getTipus());
        holder.lblLoc.setText(vivendas[position].getLocalitat());
        holder.lblDir.setText(vivendas[position].getDireccio());
        holder.lblCash.setText(vivendas[position].getAlquiler());
        holder.lblRooms.setText(vivendas[position].getHabitacions());
        holder.lblRented.setText(vivendas[position].getStatus());

        return item;
    }
}
