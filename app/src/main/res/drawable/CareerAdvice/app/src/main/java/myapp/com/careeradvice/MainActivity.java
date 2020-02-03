package myapp.com.careeradvice;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
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
       m1.setColor();
       Model m2=new Model();
        m2.setTopic("Res");
        m2.setView("View");
        m2.setImage(R.drawable.msg);
        m2.setColor();
       Model m3=new Model();
        m3.setTopic("How to Write Cover Letters");
        m3.setView("View");
        m3.setImage(R.drawable.msg);
        m3.setColor();
       Model m4=new Model();
        m4.setTopic("How to Write Cover Letters");
        m4.setView("View");
        m4.setImage(R.drawable.msg);
        m4.setColor();
       Model m5=new Model();
        m5.setTopic("How to Write Cover Letters");
        m5.setView("View");
        m5.setImage(R.drawable.msg);
        m5.setColor();
       Model m6=new Model();
        m6.setTopic("How to Write Cover Letters");
        m6.setView("View");
        m6.setImage(R.drawable.msg);
        m6.setColor();
       Model m7=new Model();
        m7.setTopic("How to Write Cover Letters");
        m7.setView("View");
        m7.setImage(R.drawable.msg);
        m7.setColor();

        objects=new ArrayList<>();
        objects.add(m1);
        objects.add(m2);
        objects.add(m3);
        objects.add(m4);
        objects.add(m5);
        objects.add(m6);
        objects.add(m7);
        adapter=new recyclerAdapter(this,R.layout.career_list,objects);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Model mRef = objects.get(i);
        Toast.makeText(this,"You Selected: "+mRef.topic,Toast.LENGTH_LONG).show();
    }
}
