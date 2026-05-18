package br.edu.ifsuldeminas.mch.constraintlayout;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class BlogPostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog_post);

        // Encontra a setinha de voltar do XML
        ImageView btnVoltar = findViewById(R.id.btnVoltarBlog);

        // Configura o clique para fechar a tela
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Fecha o Blog e volta para a MainActivity
            }
        });
    }
}