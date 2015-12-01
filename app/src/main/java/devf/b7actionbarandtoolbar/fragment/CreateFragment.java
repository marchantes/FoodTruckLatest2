package devf.b7actionbarandtoolbar.fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import devf.b7actionbarandtoolbar.R;
import devf.b7actionbarandtoolbar.favorites.favorites;
import devf.b7actionbarandtoolbar.interfaces.MyOwnListener;

/**
 * Created by Luis Galvan on 11/26/2015.
 */
public class CreateFragment extends Fragment implements View.OnClickListener{


    private ImageView dynImage;
    private Button myButt;
    private MyOwnListener myOwnListener2;
    private String TAG = "show ON CLICKER";

    public CreateFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_create, container, false);

        Button myButt2 = (Button) rootView.findViewById(R.id.button1CF);
        myButt2.setOnClickListener(this);

        ImageView image2 = (ImageView) rootView.findViewById(R.id.ImageFromDyn);
        image2.setOnClickListener(this);




        return rootView;
    }


    public void setMyOwnListener(MyOwnListener myOwnListener1){

        this.myOwnListener2 = myOwnListener1;
        Log.e(TAG, "setMyOwnListener: ");
    }

    @Override
    public void onClick(View v) {

//       myOwnListener2.onItemClick(v);
        /*
        Uri uri = Uri.parse("http://www.devf.mx/");
        Intent intentApplication = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intentApplication);
        */

        Intent intent = new Intent(getActivity(), favorites.class);
        startActivity(intent);


        Log.e(TAG, " &&&&&&&&&&&&&& onClick: ");

    }
}
