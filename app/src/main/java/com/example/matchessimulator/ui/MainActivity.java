//Activity criada com Java :(
package com.example.matchessimulator.ui;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.matchessimulator.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setupMatchesList();
        setupMatchesRefresh();
        setupFloatingActionButton();
    }


    private void setupMatchesList() {
    //TODO Listar partidas consumindo a nossa API
    }

    private void setupMatchesRefresh() {
//        TODO Atualizar as partidas na ação do swipe.
    }

    private void setupFloatingActionButton() {
//        TODO Criar evento de click e simulação de partidas.
    }
}
