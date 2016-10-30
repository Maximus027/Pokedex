package nyc.c4q.maxrosado.pokedex;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by maxrosado on 10/29/16.
 */

public class CustomText extends TextView {
    public CustomText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(attrs);
    }

    public CustomText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);

    }

    public CustomText(Context context) {
        super(context);
        init(null);
    }

    private void init(AttributeSet attrs) {
        // Just Change your font name
        Typeface myTypeface = Typeface.createFromAsset(getContext().getAssets(), "fonts/PokemonGB.ttf");
        setTypeface(myTypeface);
    }
}
