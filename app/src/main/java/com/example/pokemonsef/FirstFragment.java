package com.example.pokemonsef;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.pokemonsef.databinding.FragmentFirstBinding;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        String [] pokemons = {
                "Pikachu",
                "Registeel",
                "Mew",
                "Lapras",
                "Umbreon",
                "Tyranitar",
                "Excadrill"
        };

        ArrayList<String> pokedex = new ArrayList<>(Arrays.asList(pokemons));

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                getContext(),
                R.layout.fila_pokemon,
                R.id.npokemon,
                pokedex
        );

       binding.lista.setAdapter(adapter);

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}