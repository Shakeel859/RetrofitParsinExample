package com.example.retrofitrecylcer;


import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Button;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainActivity extends Activity {


    RecyclerView recyclerView;
    public static MainActivity mainActivity;
    Button button ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainActivity = this;




        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);

      doPizzaParsing();



       //recyclerView.setAdapter(RecyclerViewAdapter);


    }

    private void doPizzaParsing() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://lolaspizza.qiriapp.com")
                .addConverterFactory(GsonConverterFactory.create()).build();
        PizzaRetrofitInterface api = retrofit.create(PizzaRetrofitInterface.class);
        Call<Example> call =   api.listRepos("food_item");
        call.enqueue(new Callback<Example>() {


            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {
                Log.e("ppppppppppppppppppp",""+response);
                Example b =  response.body();

                List<TableDatum> abc =    b.getTableData();

                Example obj = new Example();

                RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(MainActivity.this,abc);



                recyclerView.setAdapter(recyclerViewAdapter);
                //mLoadingView.stopNestedScroll();
                //    mLoadingView.setVisibility(View.GONE);





                // listview = (ListView) findViewById(R.id.listview);
                //listview.setAdapter(new PizzaListAdapter(MainActivity.this,abc));
                //  progressView.setVisibility(View.GONE);
            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {
                Log.e("FAILEDDDDDDDDDDD","TRUE");
            }


        });



    }
}
