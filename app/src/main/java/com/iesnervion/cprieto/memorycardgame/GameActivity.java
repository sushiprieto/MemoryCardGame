package com.iesnervion.cprieto.memorycardgame;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameActivity extends AppCompatActivity {

    Button btn4x4, btn6x6;

    FragmentManager manager;
    FragmentTransaction transaction;

    CuatroFragment frag4x4 = new CuatroFragment();
    SeisFragment frag6x6 = new SeisFragment();

    private final String tagfrag4x4 = "frag4x4";
    private final String tagfrag6x6 = "frag6x6";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_game);

        btn4x4 = (Button)findViewById(R.id.btn4x4);
        btn6x6 = (Button)findViewById(R.id.btn6x6);

        btn4x4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                manager = getSupportFragmentManager();
                transaction = manager.beginTransaction();

                transaction.replace(R.id.contenedor_fragment, frag4x4, tagfrag4x4);
                transaction.commit();

            }
        });

        btn6x6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                manager = getSupportFragmentManager();
                transaction = manager.beginTransaction();

                transaction.replace(R.id.contenedor_fragment, frag6x6, tagfrag6x6);
                transaction.commit();

            }
        });

    }

}
