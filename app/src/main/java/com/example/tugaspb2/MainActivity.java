package com.example.tugaspb2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<User> usersList;
    private RecyclerView recyclerView;
    private recyclerAdapter.RecyclerViewClickListener listener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        usersList = new ArrayList<>();

        setUserInfo();
        setAdapter();
    }

    private void setAdapter() {
        setOnClickListener();
        recyclerAdapter adapter = new recyclerAdapter(usersList, listener);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }
    private void setOnClickListener() {
        listener = new recyclerAdapter.RecyclerViewClickListener() {
            @Override
            public void onCLick(View v, int position) {
                Intent intent = new Intent(getApplicationContext(), ProfileActivity.class);
                intent.putExtra("username", usersList.get(position).getUsername());
                intent.putExtra("pengaruh", usersList.get(position).getPengaruh());
                intent.putExtra("image", usersList.get(position).getImage());
                startActivity(intent);
            }
        };
    }

    private void setUserInfo() {
        usersList.add(new User("Facebook", "bapakibu", R.drawable.facebook));
        usersList.add(new User("Instagram", "anakmuda", R.drawable.instagram));
        usersList.add(new User("In", "boygrils", R.drawable.in));
        usersList.add(new User("Line", "anakcool", R.drawable.line));
        usersList.add(new User("Massenger", "gratisan", R.drawable.massenger));
        usersList.add(new User("Snapchat", "gabut", R.drawable.snapchat));
        usersList.add(new User("Talk", "memanggil", R.drawable.talk));
        usersList.add(new User("Telegram", "mahasiswa", R.drawable.telegram));
        usersList.add(new User("Twitwer", "kalanganatas", R.drawable.twitwer));
        usersList.add(new User("Whatsapp", "semuaorang", R.drawable.whatsapp));
        usersList.add(new User("Facebook", "bapakibu", R.drawable.facebook));
        usersList.add(new User("Instagram", "anakmuda", R.drawable.instagram));
        usersList.add(new User("In", "boygrils", R.drawable.in));
        usersList.add(new User("Line", "anakcool", R.drawable.line));
        usersList.add(new User("Messenger", "gratisan", R.drawable.massenger));
    }
}
