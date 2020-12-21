package ba.edu.drugagimnazija.mywallpaper;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.WallpaperManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private Button promjeniPozadinu;
    private WallpaperManager wpmgr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        promjeniPozadinu = findViewById(R.id.setBackground);

        promjeniPozadinu.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View v) {
                wpmgr = WallpaperManager.getInstance(MainActivity.this);
                try {
                    wpmgr.setResource(R.drawable.wallpaper1);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}