package com.andi.listviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myFriends = (ListView) findViewById(R.id.test);
        final List <String> myFriendsList = new ArrayList<>();
        myFriendsList.add("Martin");
        myFriendsList.add("Thomas");
        myFriendsList.add("Erich");

        ArrayAdapter<String> myFriendsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, myFriendsList);
        myFriends.setAdapter(myFriendsAdapter);

        myFriends.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), myFriendsList.get(position), Toast.LENGTH_SHORT).show();
            }
        });


    }
}
