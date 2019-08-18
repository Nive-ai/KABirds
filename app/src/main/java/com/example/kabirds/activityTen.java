package com.example.kabirds;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import com.bumptech.glide.Glide;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class activityTen extends AppCompatActivity {
    private TextView bird_name,description,sci_name;
    private String bird_nam,descriptio,sci_nam,imageV,videoV;
    private ImageView imageView;
    private VideoView videoView;
    private Button bPlay;
    private Button stop;
    private Button backbtn;
    private Button nextbtn;
    private Button playAgainBtn;
    private Button mapBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        // playAgainBtn = (Button) findViewById(R.id.playVideoBtn);

        backbtn = (Button) findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goBack();
            }
        });

      /* nextbtn = (Button) findViewById(R.id.nextBtn);
        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goNext();
            }
        }); */

        mapBtn = (Button) findViewById(R.id.map);
        mapBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goNext();
            }
        });

        bird_name = (TextView)findViewById(R.id.birdName);
        description= (TextView)findViewById(R.id.description);
        sci_name = (TextView)findViewById(R.id.sci_name);
        imageView= (ImageView)findViewById(R.id.imageView);

        videoView= (VideoView)findViewById(R.id.videoBox);
        bPlay = (Button) findViewById(R.id.play);
        stop = (Button) findViewById(R.id.pause);

       /* String str="https://firebasestorage.googleapis.com/v0/b/kabirds-a76b6.appspot.com/o/peacock_video.mp4?alt=media&token=f4d95802-44fd-4630-bc24-4649f8dc2e93";
        Uri uri = Uri.parse(str);

        videoView.setVideoURI(uri);
        videoView.requestFocus();

        bPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videoView.start();
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videoView.pause();
            }
        }); */




        FirebaseApp.initializeApp(this);

        DatabaseReference databaseReference= FirebaseDatabase.getInstance().getReference().getRoot();
        databaseReference.child("spurfowl").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                bird_nam= (String) dataSnapshot.child("name").getValue();
                descriptio= (String) dataSnapshot.child("description").getValue();
                sci_nam= (String) dataSnapshot.child("sci_name").getValue();
                imageV=(String) dataSnapshot.child("image").getValue();
                // videoV=(String) dataSnapshot.child("video").getValue();

                String str2=(String) dataSnapshot.child("video").getValue();

                Uri uri = Uri.parse(str2);

                videoView.setVideoURI(uri);
                videoView.requestFocus();

               /* playAgainBtn.setOnClickListener(new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        VideoView videoBox = (VideoView) findViewById(R.id.videoBox);

                        // String uriPath2 = "android.resource://com.example.user.grids/"+R.raw.peacock_video;
                        //Uri uri2 = Uri.parse(uriPath2);
                        videoBox.setVideoURI(uri);
                        videoBox.requestFocus();
                        videoBox.start();
                    }
                }); */

                bPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        videoView.start();
                    }
                });

                stop.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        videoView.pause();
                    }
                });





                // ColorGenerator generator = ColorGenerator.MATERIAL;
                // int color1 = generator.getRandomColor();
                // TextDrawable drawable1 = TextDrawable.builder()
                //   .buildRound(String.valueOf(us1.charAt(0)).toUpperCase(), color1); // radius in px

                bird_name.setText(bird_nam);
                description.setText(descriptio);
                sci_name.setText(sci_nam);
                Glide.with(getApplicationContext()).load(imageV).into(imageView);


            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });



        //  StorageReference mStorageRef;
        // mStorageRef = FirebaseStorage.getInstance().getReference();

        //firebase image link
        //String url="https://firebasestorage.googleapis.com/v0/b/kabirds-a76b6.appspot.com/o/uscar.jpg?alt=media&token=42bcb555-1b8d-4444-bba5-473696d8c178";

        // Glide.with(getApplicationContext()).load(url).into(imageView);
    }

    public void goBack(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void goNext(){
        Intent intent = new Intent(this, map_ten.class);
        startActivity(intent);
    }







}
