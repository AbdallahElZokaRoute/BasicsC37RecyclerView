package com.route.basicsrecyclerview;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SettingsAdapter extends RecyclerView.Adapter<SettingsAdapter.SettingsViewHolder> {
    ArrayList<SettingsItem> data;//null

    public SettingsAdapter(ArrayList<SettingsItem> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public SettingsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.settings_item, parent, false);
        return new SettingsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SettingsViewHolder holder, int position) {
        holder.settingsTitle.setText(data.get(position).getTitle());
        holder.settingsDescription.setText(data.get(position).getDescription());
        holder.settingsIcon.setImageResource(data.get(position).getImageResource());
        /*

            SOLID ->
            S->  'S'ingle Responsipility Principle "Fatma"
            O->  'O'pen/Closed principle "Fatma"
            L->  'L'iskov Substituation Principle "Shady"
            I -> 'I'nterface Segregation "Shady"
            D -> 'D'ependency Inversion "Dalia"

         */
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class SettingsViewHolder extends RecyclerView.ViewHolder {

        TextView settingsTitle, settingsDescription;
        ImageView settingsIcon;

        public SettingsViewHolder(@NonNull View itemView) {
            super(itemView);
            settingsTitle = itemView.findViewById(R.id.settings_title);
            settingsDescription = itemView.findViewById(R.id.settings_description);
            settingsIcon = itemView.findViewById(R.id.settings_icon);
        }
    }

}
