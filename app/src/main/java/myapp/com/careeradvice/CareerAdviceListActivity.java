package myapp.com.careeradvice;

import androidx.core.content.ContextCompat;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CareerAdviceListActivity extends AppCompatActivity  {
    RecyclerView recyclerView;
    ArrayList<Model> objects;
    recyclerAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);



       Model m1=new Model();
       m1.setTopic("How to Write Cover Letters");
       m1.setView("View");
       m1.setImage(R.drawable.msg);
       m1.setColor(ContextCompat.getColor(this,R.color.colorSkyBlue));
       Model m2=new Model();
        m2.setTopic("Resume Tips");
        m2.setView("View");
        m2.setImage(R.drawable.resumetip);
        m2.setColor(ContextCompat.getColor(this,R.color.colorAccent));
       Model m3=new Model();
        m3.setTopic("Job Interviews");
        m3.setView("View");
        m3.setImage(R.drawable.jobinterviews);
        m3.setColor(ContextCompat.getColor(this,R.color.colorYellow));
       Model m4=new Model();
        m4.setTopic("Finding Your Dream Company");
        m4.setView("View");
        m4.setImage(R.drawable.findcompany);
        m4.setColor(ContextCompat.getColor(this,R.color.colorPurple));
       Model m5=new Model();
        m5.setTopic("Finding your Passion");
        m5.setView("View");
        m5.setImage(R.drawable.findpassion);
        m5.setColor(ContextCompat.getColor(this,R.color.colorMaroon));
       Model m6=new Model();
        m6.setTopic("Self Improvement");
        m6.setView("View");
        m6.setImage(R.drawable.selfimprovement);
        m6.setColor(ContextCompat.getColor(this,R.color.colorGreen));
       Model m7=new Model();
        m7.setTopic("Enterpreneurship");
        m7.setView("View");
        m7.setImage(R.drawable.entrepreneurship);
        m7.setColor(ContextCompat.getColor(this,R.color.colorSkyBlue));
        Model m8=new Model();
        m8.setTopic("Job Search");
        m8.setView("View");
        m8.setImage(R.drawable.jobsearch);
        m8.setColor(ContextCompat.getColor(this,R.color.colorMaroon));
        Model m9=new Model();
        m9.setTopic("Career Advancement");
        m9.setView("View");
        m9.setImage(R.drawable.careeradvancement);
        m9.setColor(ContextCompat.getColor(this,R.color.colorYellow));
        Model m10=new Model();
        m10.setTopic("Networking");
        m10.setView("View");
        m10.setImage(R.drawable.networking);
        m10.setColor(ContextCompat.getColor(this,R.color.colorPurple));
        Model m11=new Model();
        m11.setTopic("Personal Branding");
        m11.setView("View");
        m11.setImage(R.drawable.brand);
        m11.setColor(ContextCompat.getColor(this,R.color.colorAccent));
        Model m12=new Model();
        m12.setTopic("Employers Corner");
        m12.setView("View");
        m12.setImage(R.drawable.employee);
        m12.setColor(ContextCompat.getColor(this,R.color.colorGreen));

        objects=new ArrayList<>();
        objects.add(m1);
        objects.add(m2);
        objects.add(m3);
        objects.add(m4);
        objects.add(m5);
        objects.add(m6);
        objects.add(m7);
        objects.add(m8);
        objects.add(m9);
        objects.add(m10);
        objects.add(m11);
        objects.add(m12);
        adapter=new recyclerAdapter(this,R.layout.career_list,objects);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);



    }



}
