package com.example.fs;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.MyHolder>
{

    List<com.example.fs.Listdata> noteslist;
    private Context context;
    public  NotesAdapter(List<com.example.fs.Listdata> noteslist, Context context)
    {
        this.context=context;
        this.noteslist=noteslist;
    }


    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item,viewGroup,false);

        MyHolder myHolder=new MyHolder(view);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, int position) {
        com.example.fs.Listdata data=noteslist.get(position);
        myHolder.title.setText(data.getTitle());
        myHolder.desc.setText(data.getDesc());
    }

    @Override
    public int getItemCount() {
        return noteslist.size();
    }

    class  MyHolder extends RecyclerView.ViewHolder  {
        TextView title,desc;

        public MyHolder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.title);
            desc=itemView.findViewById(R.id.desc);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    com.example.fs.Listdata listdata=noteslist.get(getAdapterPosition());
                    Intent i=new Intent(context, EditActivity.class);
                    i.putExtra("id",listdata.id);
                    i.putExtra("title",listdata.title);
                    i.putExtra("desc",listdata.desc);
                    context.startActivity(i);
                }
            });

        }


    }
}