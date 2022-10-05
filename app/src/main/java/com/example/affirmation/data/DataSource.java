package com.example.affirmation.data;


import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.example.affirmation.R;
import com.example.affirmation.model.Affirmation;
import java.util.ArrayList;
import java.util.List;

public class DataSource  {
    public Context context;

    public DataSource(Context context) {
        this.context = context;
//        String a = context.getString(R.string.affirmation1);
//        Log.d("DataSource", a);
    }

    public List<Affirmation> loadAffirmation() {

        List<Affirmation> listAffirmation = new ArrayList<Affirmation>();
        listAffirmation.add(getResource(context.getString(R.string.affirmation1), context.getDrawable(R.drawable.image1)));
        listAffirmation.add(getResource(context.getString(R.string.affirmation2), context.getDrawable(R.drawable.image2)));
        listAffirmation.add(getResource(context.getString(R.string.affirmation3), context.getDrawable(R.drawable.image3)));
        listAffirmation.add(getResource(context.getString(R.string.affirmation4), context.getDrawable(R.drawable.image4)));
        listAffirmation.add(getResource(context.getString(R.string.affirmation5), context.getDrawable(R.drawable.image5)));
        listAffirmation.add(getResource(context.getString(R.string.affirmation6), context.getDrawable(R.drawable.image6)));
        listAffirmation.add(getResource(context.getString(R.string.affirmation7), context.getDrawable(R.drawable.image7)));
        listAffirmation.add(getResource(context.getString(R.string.affirmation8), context.getDrawable(R.drawable.image8)));
        listAffirmation.add(getResource(context.getString(R.string.affirmation9), context.getDrawable(R.drawable.image9)));

        return  listAffirmation;
    }

    Affirmation getResource(String stringResourceId, Drawable imageResourceId) {
        return new Affirmation(stringResourceId, imageResourceId);
    }
}
