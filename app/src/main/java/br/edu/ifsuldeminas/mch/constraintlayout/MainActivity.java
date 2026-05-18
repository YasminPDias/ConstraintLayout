package br.edu.ifsuldeminas.mch.constraintlayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnBlogPost).setOnClickListener(this);
        findViewById(R.id.btnSerie).setOnClickListener(this);
        findViewById(R.id.btnConcurso).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;

        if (v.getId() == R.id.btnBlogPost) {
            intent = new Intent(this, BlogPostActivity.class);
        } else if (v.getId() == R.id.btnSerie) {
            intent = new Intent(this, SerieActivity.class);
        } else if (v.getId() == R.id.btnConcurso) {
            intent = new Intent(this, ConcursoTextosActivity.class);
        }

        if (intent != null) {
            startActivity(intent);
        }
    }
}