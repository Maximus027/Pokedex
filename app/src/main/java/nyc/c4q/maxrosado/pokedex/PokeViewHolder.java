package nyc.c4q.maxrosado.pokedex;

import android.app.FragmentManager;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by maxrosado on 10/27/16.
 */
public class PokeViewHolder extends RecyclerView.ViewHolder {
    private final View mView;
    private TextView pokemonNumber;
    private ImageView pokemonImage;
    private TextView pokemonName;
    private FragmentManager fragmentManager;

    public PokeViewHolder(ViewGroup parent, FragmentManager fm) {
        super(inflateView(parent));
        mView = itemView;
        fragmentManager = fm;
        pokemonNumber = (TextView) mView.findViewById(R.id.pokemon_number);
        pokemonImage = (ImageView) mView.findViewById(R.id.pokemon_image);
        pokemonName = (TextView) mView.findViewById(R.id.pokemon_name);
    }

    private static View inflateView(ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return inflater.inflate(R.layout.pokedex_itemview, parent, false);
    }

    public void bind(Pokemon pokemon) {
        pokemonNumber.setText(String.valueOf(pokemon.getPokemonNumber()));
        pokemonImage.setImageResource(pokemon.getImageid());
        pokemonName.setText(pokemon.getPokemonName());
        setClickListener(mView);
    }

    private void setClickListener(final View mView) {
        mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
            }
        });
    }
}
