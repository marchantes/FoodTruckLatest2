package devf.b7actionbarandtoolbar.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;

import java.util.List;

import devf.b7actionbarandtoolbar.R;
import devf.b7actionbarandtoolbar.model.TruckFood;

/**
 * Created by Luis Galvan on 11/29/2015.
 */
public class TruckAdapter extends RecyclerView.Adapter<TruckAdapter.TruckViewHolder>{


    private List<TruckFood> mFoodTruck;
    private LayoutInflater mInflater;

    private String TAG = " *************** THIS IS IT = ";


    private ImageView imageView;

    public TruckAdapter(Context context, List<TruckFood> truckFoods) {
        mInflater = LayoutInflater.from(context);
        this.mFoodTruck = truckFoods;
    }


    @Override
    public TruckViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemVIew = mInflater.inflate(R.layout.item_truck, parent, false);

        TruckViewHolder viewHolder = new TruckViewHolder(itemVIew);

        return viewHolder;
    }



    @Override
    public void onBindViewHolder(TruckViewHolder holder, int position) {
        TruckFood truck = mFoodTruck.get(position);
//        holder.setViewPosition(position);



       // STUFF MISSING
        holder.setTcomment(truck.getTcomment());
        holder.setTimage(truck.getTimage());
        holder.setTname(truck.getTname());
        Log.e(TAG, "onBindViewHolder: " + truck.getTname() );
        holder.setTstars(truck.getTstars());
        holder.setTtypefood(truck.getTtypefood());




    }

    @Override
    public int getItemCount() {
        return mFoodTruck.size();
    }

    public class TruckViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{


        private String Tname;
        private int Tstars;
        private String Ttypefood;
        private int Timage;
        private String Tcomment;

        public TruckViewHolder(View itemView) {
            super(itemView);
        }



        @Override
        public void onClick(View v) {

        }


        public void setTcomment(String tcomment) {
            this.Tcomment = tcomment;
        }

        public void setTimage(int timage) {
            this.Timage = timage;
        }

        public void setTname(String tname) {
            this.Tname = tname;
        }

        public void setTstars(int tstars) {
            Tstars = tstars;
        }

        public void setTtypefood(String ttypefood) {
            this.Ttypefood = ttypefood;
        }
    }
}
