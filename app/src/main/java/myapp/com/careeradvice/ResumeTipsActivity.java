package myapp.com.careeradvice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ResumeTipsActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    ArrayList<String> mainContent=new ArrayList<>();
    ArrayList<Integer> iconImage=new ArrayList<>();
    ArrayList<String> titleContent=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume_tips);

        recyclerView=findViewById(R.id.recyclerView_ResumeTips);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);

        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(linearLayoutManager);

        titleContent.add("30 RESUME TIPS TO HELP YOU GET HIRED");
        titleContent.add("5 RESUME RED FLAGS TO AVOID");
        titleContent.add("8 Resume Tips from a Former Hiring Manager — Jessica DW | Bright Space Coaching");

        mainContent.add(" \"RESUME TIPS TO HELP YOU GET HIRED View Source 18-Oct-2019 Quick Summary 30 Resume Tips to Help You Get Hired - Advice from a fortune 500 recruiter and career coach\");\n" +
                "        .");
        mainContent.add("Your resume is your first impression with an employer, so it better be a good one. Recruiters are trained to scan your resume in a matter of seconds looking for any potential red flags before they decide to put you in the “yes”, “no”, or “maybe” file. In order to make sure they are sending the very best candidates through the application process, they have to make sure they can quickly spot unsuitable candidates.");
        mainContent.add("As a former hiring manager, I’ve combed through hundreds of resumes and cover letters. I’m also the go-to person in my friends and family circle when someone needs help updating theirs. I’ll let you in on a little secret: your resume is one of the most important documents you will ever own! It’s true – your resume can be the one thing standing between you and a job you love and your key to a prosperous and exciting future. That’s why it’s so important to spend time crafting a concise, yet powerful resume that is tailored for the job you want. Let’s start with the basics.");

        iconImage.add(R.drawable.r1);
        iconImage.add(R.drawable.r2);
        iconImage.add(R.drawable.r3);


        ArrayList<Model1> models=new ArrayList<>();


        for(int i=0;i<mainContent.size();i++)
        {
            Model1 model1=new Model1();
            models.add(model1);
            model1.setText_Content(mainContent.get(i));
            model1.setContent_Image(iconImage.get(i));
            model1.setTitle_Content(titleContent.get(i));

        }


        recyclerAdapter1 resumeTipsAdapter=new recyclerAdapter1(ResumeTipsActivity.this,models);
        recyclerView.setAdapter(resumeTipsAdapter);
    }
























































}
