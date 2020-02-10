package myapp.com.careeradvice;

import androidx.core.content.ContextCompat;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashMap;

public class CareerAdviceListActivity extends AppCompatActivity  {
    RecyclerView recyclerView;
    //Context context;

    ArrayList<Model> objects=new ArrayList<>();;
    recyclerAdapter adapter;
    String categoryList[]={"How to write Cover Letter","Resume Tips","Job Interviews","Finding Ytour Dream Company","Finding Your Passion","Self Empowerment","Enterpreneurship","Job Search","Careeer Advancement","Networking","Personal Branding","Employers Corner"};
    Integer img[]={R.drawable.msg,R.drawable.resumetip,R.drawable.jobinterviews,R.drawable.findcompany,R.drawable.findpassion,R.drawable.selfimprovement,R.drawable.entrepreneurship,R.drawable.jobsearch,R.drawable.careeradvancement,R.drawable.networking,R.drawable.brand,R.drawable.employee};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        int[] rainbow= this.getResources().getIntArray(R.array.rainbow);
        for(int i=0;i<categoryList.length;i++){
            Model m=new Model();
            m.setTopic(categoryList[i]);
            m.setImage(img[i]);
            m.setColor(rainbow[i]);
            objects.add(m);
        }
        adapter=new recyclerAdapter(this,R.layout.career_list,objects);

        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);



    }



}
