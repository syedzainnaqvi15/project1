package com.syedzain.myburger2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.syedzain.myburger2.Adapters.RecipeAdapter;
import com.syedzain.myburger2.Classes.RecyclerItemClickListener;
import com.syedzain.myburger2.Models.RecipeModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView  recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recylarview);
        ArrayList<RecipeModel>list=new ArrayList<>();
        list.add(new RecipeModel(R.drawable.bur1, "Brger" ));
        list.add(new RecipeModel(R.drawable.bur2, "Brger" ));
        list.add(new RecipeModel(R.drawable.bur3, "Brger" ));
        list.add(new RecipeModel(R.drawable.bur4, "Brger" ));
        list.add(new RecipeModel(R.drawable.bur5, "Brger" ));
        list.add(new RecipeModel(R.drawable.bur6, "Brger" ));
        list.add(new RecipeModel(R.drawable.bur7, "Brger" ));
        list.add(new RecipeModel(R.drawable.bur8, "Brger" ));
        list.add(new RecipeModel(R.drawable.bur9, "Brger" ));
        list.add(new RecipeModel(R.drawable.bur10, "Brger" ));

        RecipeAdapter adapter=new RecipeAdapter(list , this );
        recyclerView.setAdapter(adapter);
     //   StaggeredGridLayoutManager staggeredGridLayoutManager=new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
      // recyclerView.setLayoutManager(staggeredGridLayoutManager);
        //GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
       //recyclerView.setLayoutManager(gridLayoutManager);
    LinearLayoutManager linearLayoutManager = new LinearLayoutManager (this);
       recyclerView.setLayoutManager(linearLayoutManager);
   //    LinearLayoutManager LayoutManager = new LinearLayoutManager (this,LinearLayoutManager.HORIZONTAL,false);
    //  recyclerView.setLayoutManager(LayoutManager);

recyclerView.addOnItemTouchListener(new RecyclerItemClickListener
        (this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                switch (position){
                    case 0:
                    case 11:
                    case 10:
                    case 9:

                    case 8:

                    case 7:

                    case 6:

                    case 5:

                    case 4:

                    case 3:

                    case 2:
                    case 1:
                        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                       startActivity(intent);
                        break;

                    default:
                }
            }

            @Override
            public void onLongItemClick(View view, int position) {
                switch (position){
                case 0:
                Toast.makeText(MainActivity.this, "Get discount 10%", Toast.LENGTH_SHORT).show();
                break;
             }
            }
        }

        ));


    }
}