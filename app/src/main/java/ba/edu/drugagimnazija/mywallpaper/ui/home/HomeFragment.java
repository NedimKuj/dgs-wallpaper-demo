package ba.edu.drugagimnazija.mywallpaper.ui.home;

import android.annotation.SuppressLint;
import android.app.WallpaperManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.snackbar.Snackbar;

import java.io.IOException;

import ba.edu.drugagimnazija.mywallpaper.R;

public class HomeFragment extends Fragment {

    private Button promjeniPozadinu;
    private WallpaperManager wpmgr;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        promjeniPozadinu = view.findViewById(R.id.setBackground);

        promjeniPozadinu.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View v) {
                wpmgr = WallpaperManager.getInstance(getActivity());
                try {
                    wpmgr.setResource(R.drawable.wallpaper1);
                    Snackbar.make(view, "Wallpaper successfully set!", Snackbar.LENGTH_LONG).show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}