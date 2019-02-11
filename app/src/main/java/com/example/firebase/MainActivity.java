package com.example.firebase;

import android.graphics.PostProcessor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    EditText edt1, edt2;
    Button btnPost;
    RecyclerView recyclerView;

    //firebase
    FirebaseDatabase firebaseDatabase;
   DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1 = (EditText) findViewById(R.id.et_userName);
        edt2  = (EditText) findViewById(R.id.et_content);
        btnPost = (Button) findViewById(R.id.btn_Post);
        recyclerView = (RecyclerView) findViewById(R.id.recycller);

        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference("EDMT_FIREBASE");

        btnPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                postComment();

            }
        });


    }

    private void postComment() {

        String title = edt1.getText().toString();
        String content = edt2.getText().toString();

       post postP = new post(title, content);

       databaseReference.push()// creates unique ID of the comment;
        .setValue(postP);
    }
}
