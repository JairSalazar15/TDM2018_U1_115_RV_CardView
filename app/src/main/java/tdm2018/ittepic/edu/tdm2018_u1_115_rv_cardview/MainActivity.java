package tdm2018.ittepic.edu.tdm2018_u1_115_rv_cardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ProductAdapter adapter;

    List<DataProvider> productList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        productList = new ArrayList<>();

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Aquí va la adición de elementos a la lista
        productList.add(
                new DataProvider("ACÚSTICO", "Gitarra Romantica", 1,R.drawable.acustico_opt)
        );
        productList.add(
                new DataProvider("FOLKLOR", "Son de Jalisco", 4.3,R.drawable.folklor_opt)
        );
        productList.add(
                new DataProvider("ROCK", "Las piedras", 3,R.drawable.rock_opt)
        );
        productList.add(
                new DataProvider("RAP", "Con el coco rapado", 2,R.drawable.rap_opt)
        );
        productList.add(
                new DataProvider("CRISTIANO", "Levanto mis manos", 1,R.drawable.cristiano_opt)
        );
        productList.add(
                new DataProvider("REGETON", "Las piedras", 5,R.drawable.regeton_opt)
        );


        adapter = new ProductAdapter(this,productList);
        recyclerView.setAdapter(adapter);

    }
}
