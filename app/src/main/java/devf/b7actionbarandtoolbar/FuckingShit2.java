package devf.b7actionbarandtoolbar;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import devf.b7actionbarandtoolbar.adapters.TruckCommentAdapter;
import devf.b7actionbarandtoolbar.model.TruckComment;

public class FuckingShit2 extends AppCompatActivity implements View.OnClickListener {


    private RecyclerView recyclerView2;
    private CollapsingToolbarLayout collapsingToolbarLayout;


    private String fdComment = " Best food ever";
    private String fdNameUser = "Peter Pan";
    private String fdDate = "2-Dec-2015";
    private int fdLikes;


    private String TAG = " ************  TAG, F**** S** 2.class  ";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comments_truck2);

        Intent intent = getIntent();
        String textSome = intent.getStringExtra("my_key");
        int ImageSome = intent.getIntExtra("my_keyz", 0);
        fdLikes = intent.getIntExtra("my_keyz2", 0);
        String FinalGrade = String.valueOf(fdLikes);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.Truck_self_toolbar2);
        myToolbar.setTitle(textSome);
        setSupportActionBar(myToolbar);

        ImageView ImageViewSecondAct = (ImageView) findViewById(R.id.imageViewbackdrop);
        ImageViewSecondAct.setImageResource(ImageSome);

//        TextView textViewSecondActivity2 = (TextView) findViewById(R.id.likes_comment);
//        textViewSecondActivity2.setText(FinalGrade);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_keyboard_backspace_white_24dp);

        setUpRecyclerView();
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);


    }




    private void setUpRecyclerView() {

        recyclerView2 = (RecyclerView) findViewById(R.id.list_of_comments2);
        LinearLayoutManager layoutManager2 = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);
        recyclerView2.setLayoutManager(layoutManager2);

        TruckCommentAdapter truckCommentAdapter = new TruckCommentAdapter(this, createComments());
        recyclerView2.setAdapter(truckCommentAdapter);
//        truckCommentAdapter.setMyVeryOwnListener(this);


    }

    private List<TruckComment> createComments() {


        List<TruckComment> comments = new ArrayList<>();


        for(int i=0; i<10; i++){



//            public TruckComment(String tcomment, String tdate, int tlikes, String tnameUser, int tuserImage) {
            comments.add(new TruckComment(fdComment,fdDate, fdLikes, fdNameUser, R.drawable.myself));


        }

        return comments;

    }


    @Override
    public void onClick(View v) {

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        switch (item.getItemId()) {
            case android.R.id.home:

                Toast.makeText(this, " THIS IS SUPER HOME ", Toast.LENGTH_SHORT).show();
                Log.e(TAG, "onOptionsItemSelected: ");

                onBackPressed();
                return true;

            default:
                break;


        }





        return super.onOptionsItemSelected(item);
    }
}
