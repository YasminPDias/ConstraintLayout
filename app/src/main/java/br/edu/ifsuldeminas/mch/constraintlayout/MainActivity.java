package br.edu.ifsuldeminas.mch.constraintlayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnBlogPost = findViewById(R.id.btnBlogPost);
        Button btnSerie = findViewById(R.id.btnSerie);
        Button btnConcurso = findViewById(R.id.btnConcurso);

        btnBlogPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, BlogPostActivity.class));
            }
        });

        btnSerie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SerieActivity.class));
            }
        });

        btnConcurso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ConcursoTextosActivity.class));
            }
        });
    }
}