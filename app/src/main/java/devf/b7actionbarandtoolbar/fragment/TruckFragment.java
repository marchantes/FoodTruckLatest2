package devf.b7actionbarandtoolbar.fragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import devf.b7actionbarandtoolbar.R;
import devf.b7actionbarandtoolbar.adapters.TruckAdapter;
import devf.b7actionbarandtoolbar.model.TruckFood;

/**
 * Created by Luis Galvan on 11/29/2015.
 */
public class TruckFragment extends Fragment {



    private RecyclerView mRecyclerView2;

    private List<TruckFood> truckFoodList;



    public TruckFragment() {
    }

// COMMENTED DUPLICATE
    /*
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }
    */

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_foodtruck, container, false);

        mRecyclerView2 = (RecyclerView) rootView.findViewById(R.id.list_of_trucks);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initRecyclerView();

    }



    private void initRecyclerView() {

        truckFoodList = createTrucks();

        TruckAdapter truckAdapter = new TruckAdapter(getActivity(), truckFoodList);


        // ***** NULL POINT EXEPTION
        mRecyclerView2.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        mRecyclerView2.setAdapter(truckAdapter);




    }




    @Override
    public void onDetach() {
        super.onDetach();
    }




    // public TruckFood(String tcomment, int timage, String tname, int tstars, String ttypefood)

    private List<TruckFood> createTrucks() {

//        int[] nameTruck = {"Burger King", "Don Burger", "Pizza MIa", "KTC", "CUISINE"};

        List<TruckFood> foodTruckers = new ArrayList<>();

        for(int i=0; i<12; i++){

            foodTruckers.add(new TruckFood("Best", R.drawable.devf_small_black, "Jack in the Box", 8, "Fast Food"));
        }

        return foodTruckers;




    }


}
