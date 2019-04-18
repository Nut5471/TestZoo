package sdu.cs.wikrom.testzoo;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    //Explicit
    ImageView imageView;
    ImageButton elephantImageButton, horseImageButton, lionImageButton, imageButton4, imageButton5;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        elephantImageButton = findViewById(R.id.elephantButton);
        horseImageButton = findViewById(R.id.horseButton);
        lionImageButton = findViewById(R.id.lionButton);


    }

    public void clickCall(View view) {
        Intent mobileIntent = new Intent(Intent.ACTION_DIAL);
        mobileIntent.setData(Uri.parse("tel:085555555"));
        startActivity(mobileIntent);
    }

    public void sound(View view) {
        mediaPlayer = MediaPlayer.create(this, R.raw.elephant);
        mediaPlayer.start();
    }

    public void soun2(View view) {
        mediaPlayer = MediaPlayer.create(this, R.raw.horse);
        mediaPlayer.start();

    }

    public void soun3(View view) {
        mediaPlayer = MediaPlayer.create(this, R.raw.lion);
        mediaPlayer.start();
    }

    public void go(View view) {
        Uri location = Uri.parse("http://maps.google.com/maps?z=10&q=loc:(สวนสัตว์เปิดเขาเขียว)  13.216298, 101.056642");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        startActivity(mapIntent);
    }
}