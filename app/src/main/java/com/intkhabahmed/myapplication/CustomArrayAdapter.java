package com.intkhabahmed.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class CustomArrayAdapter extends RecyclerView.Adapter<CustomArrayAdapter.PersonViewHolder> {

    private List<Person> persons;

    public CustomArrayAdapter(List<Person> persons) {
        this.persons = persons;
    }

    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new PersonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder viewHolder, int position) {
        Person person = persons.get(position);
        viewHolder.name.setText(person.getName());
        viewHolder.age.setText(String.valueOf(person.getAge()));
    }

    @Override
    public int getItemCount() {
        if (persons == null) {
            return 0;
        }
        return persons.size();
    }

    public class PersonViewHolder extends RecyclerView.ViewHolder {

        TextView name;
        TextView age;
        public PersonViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.item_name);
            age = itemView.findViewById(R.id.item_age);
        }
    }
}
