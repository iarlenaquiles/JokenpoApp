package com.tecnologia.aquiles.jokenpo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView jogador1;
    ImageView jogador2;

    ImageButton botaoPedra;
    ImageButton botaoPapel;
    ImageButton botaoTesoura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jogador1 = findViewById(R.id.jogador1);
        jogador2 = findViewById(R.id.jodagor2);

        botaoPedra = findViewById(R.id.botaoPedra);
        botaoPapel = findViewById(R.id.botaoPapel);
        botaoTesoura = findViewById(R.id.botaoTesoura);

    }

    public void tocouBotao(View view){
        jogador1.setScaleX(-1f);
        switch (view.getId()) {
            case(R.id.botaoPedra):
                jogador1.setImageResource(R.drawable.pedra);
                break;
            case(R.id.botaoPapel):
                jogador1.setImageResource(R.drawable.papel);
                break;
            case(R.id.botaoTesoura):
                jogador1.setImageResource(R.drawable.tesoura);
                break;
        }

    }
}
