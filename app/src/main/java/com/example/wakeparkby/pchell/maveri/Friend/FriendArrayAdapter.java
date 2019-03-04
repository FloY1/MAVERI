package com.example.wakeparkby.pchell.maveri.Friend;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.wakeparkby.pchell.maveri.R;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FriendArrayAdapter extends ArrayAdapter<Profile> {

    private Context mContext;
    private ArrayList<Profile> profileList= new ArrayList<>();
    public FriendArrayAdapter(@NonNull Context context, ArrayList<Profile> profileArrayList) {
        super(context, 0,profileArrayList);
        mContext=context;
        profileList=profileArrayList;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from(mContext).inflate(R.layout.friend_list_row,parent,false);

        Profile currentProfile= profileList.get(position);


        TextView name = (TextView) listItem.findViewById(R.id.name_list_friend_row);
        name.setText(currentProfile.getName());

        return listItem;
    }
}
