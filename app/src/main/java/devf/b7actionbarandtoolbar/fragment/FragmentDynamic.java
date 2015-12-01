package devf.b7actionbarandtoolbar.fragment;


        import android.os.Bundle;
        import android.support.annotation.Nullable;
        import android.support.v4.app.Fragment;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ImageView;
        import android.widget.TextView;

        import devf.b7actionbarandtoolbar.R;
        import devf.b7actionbarandtoolbar.model.Truck;


/**
 * Created by celeron on 11/9/15.
 */
public class FragmentDynamic extends Fragment {

    public static final String KEY_NAME = "name";
    public static final String KEY_IMAGE = "image_id";

    private ImageView mImage;
    private TextView mName;

    private int Temp;

    public FragmentDynamic() {
    }

    /*
    public FragmentDynamic(String name, int imageId) {
        Bundle argz = new Bundle();
        argz.putInt(KEY_IMAGE, imageId);
        argz.putString(KEY_NAME, name);
        FragmentDynamic frog = new FragmentDynamic();
        frog.setArguments(argz);
        return frog;
    }
    */

    public static FragmentDynamic newInstance(String name, int imageId){
        Bundle argz = new Bundle();
        argz.putInt(KEY_IMAGE, imageId);
        argz.putString(KEY_NAME, name);
        FragmentDynamic frog = new FragmentDynamic();
        frog.setArguments(argz);
        return frog;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View z = inflater.inflate(R.layout.frag_background, container, false);

        mImage = (ImageView) z.findViewById(R.id.image_dynamic);
        mName = (TextView) z.findViewById(R.id.text_dynamic);

        // mImage.setImageResource(getArguments().getInt(KEY_IMAGE));
//        mName.setText(getArguments().getString(KEY_NAME));
        return z;

        //return super.onCreateView(inflater, container, savedInstanceState);
    }

    public void updateView(Truck card){
        Bundle args = getArguments();
        args.putString(KEY_NAME, card.getmName());
        args.putInt(KEY_IMAGE, card.getmImageId());
        mImage.setImageResource(card.getmImageId());
        mName.setText(card.getmName());

    }


}

