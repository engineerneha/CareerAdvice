package myapp.com.careeradvice;


import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import myapp.com.careeradvice.AdapterCareerAdviceCategoryView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class CareerAdviceHomeFragment extends Fragment {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    //NavController navController;
    private RecyclerView recyclerView1,recyclerView2,recyclerView3,recyclerView4,recyclerView5,recyclerView6,recyclerView7,recyclerView8,recyclerView9,recyclerView10,recyclerView11,recyclerView12;
    TextView textViewTitle;
    ImageView imageView;
    ArrayList<Model1> list=new ArrayList<>();
    String categoryList[]={"How to write Cover Letter","Resume Tips","Job Interviews","Finding Ytour Dream Company","Finding Your Passion","Self Empowerment","Enterpreneurship","Job Search","Careeer Advancement","Networking","Personal Branding","Employers Corner"};
    Integer img[]={R.drawable.msg,R.drawable.resumetip,R.drawable.jobinterviews,R.drawable.findcompany,R.drawable.findpassion,R.drawable.selfimprovement,R.drawable.entrepreneurship,R.drawable.jobsearch,R.drawable.careeradvancement,R.drawable.networking,R.drawable.brand,R.drawable.employee};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_career_advice_home, container, false);
        ButterKnife.bind(this, view);
        initviews(view);
        initviews1(view);
        initviews2(view);
        initviews3(view);
        initviews4(view);
        initviews5(view);
        initviews6(view);
        initviews7(view);
        initviews8(view);
        initviews9(view);
        initviews10(view);
        initviews11(view);
       // recyclerView2 = view.findViewById(R.id.cat2).findViewById(R.id.recyclerView);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //navController= Navigation.findNavController(view);
        toolbar.setTitleTextColor(ContextCompat.getColor(getActivity(), R.color.colorWhite));
        recyclerView1.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false));
        recyclerView2.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false));
        recyclerView3.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false));
        recyclerView4.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false));
        recyclerView5.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false));
        recyclerView6.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false));
        recyclerView7.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false));
        recyclerView8.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false));
        recyclerView9.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false));
        recyclerView10.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false));
        recyclerView11.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false));
        recyclerView12.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false));



        //recyclerView1.setAdapter(new AdapterCareerAdviceCategoryView());
        //recyclerView2.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false));
        //recyclerView2.setAdapter(new AdapterCareerAdviceCategoryView());
    }
    private void initviews1(View view)

    {
        Model1 model1=new Model1();
        model1.setImage(R.drawable.r1);
        model1.setTitle_Content("5 Easy Steps to Writing a Cover Letter");
        list.add(model1);

        Model1 model2=new Model1();
        model2.setImage(R.drawable.r2);
        model2.setTitle_Content("How To Write A Cover Letter\n");
        list.add(model2);

        Model1 model3=new Model1();
        model3.setImage(R.drawable.r3);
        model3.setTitle_Content("One Common Cover Letter Mistake to Avoid | My Secret Tip to Fix It");
        list.add(model3);

        recyclerView1 = view.findViewById(R.id.cat1).findViewById(R.id.recyclerView);
        imageView=view.findViewById(R.id.cat1).findViewById(R.id.image_category_icon);
        textViewTitle=view.findViewById(R.id.cat1).findViewById(R.id.textviewtitle);
        imageView.setBackgroundResource(img[0]);
        textViewTitle.setText(categoryList[0]);
        AdapterCareerAdviceCategoryView adapterCareerAdviceCategoryView=new AdapterCareerAdviceCategoryView(getActivity(),list);
        recyclerView1.setAdapter(adapterCareerAdviceCategoryView);
    }

    private void initviews(View view)

    {
        Model1 model1=new Model1();
        model1.setImage(R.drawable.r1);
        model1.setTitle_Content("30 Resume Tips to help you get hired");
        list.add(model1);

        Model1 model2=new Model1();
        model2.setImage(R.drawable.r2);
        model2.setTitle_Content("5 RESUME RED FLAGS TO AVOID");
        list.add(model2);

        Model1 model3=new Model1();
        model3.setImage(R.drawable.r3);
        model3.setTitle_Content(" 8 Resume Tips from a Former Hiring Manager — Jessica DW | Bright Space Coaching");
        list.add(model3);

        recyclerView2 = view.findViewById(R.id.cat2).findViewById(R.id.recyclerView);
        imageView=view.findViewById(R.id.cat2).findViewById(R.id.image_category_icon);
        textViewTitle=view.findViewById(R.id.cat2).findViewById(R.id.textviewtitle);
        imageView.setBackgroundResource(img[1]);
        textViewTitle.setText(categoryList[1]);
        AdapterCareerAdviceCategoryView adapterCareerAdviceCategoryView=new AdapterCareerAdviceCategoryView(getActivity(),list);
        recyclerView2.setAdapter(adapterCareerAdviceCategoryView);
    }

    private void initviews2(View view)

    {
        Model1 model1=new Model1();
        model1.setImage(R.drawable.r1);
        model1.setTitle_Content("30 Resume Tips to help you get hired");
        list.add(model1);

        Model1 model2=new Model1();
        model2.setImage(R.drawable.r1);
        model2.setTitle_Content("5 RESUME RED FLAGS TO AVOID");
        list.add(model2);

        Model1 model3=new Model1();
        model3.setImage(R.drawable.r1);
        model3.setTitle_Content(" 8 Resume Tips from a Former Hiring Manager — Jessica DW | Bright Space Coaching");
        list.add(model3);

        recyclerView3= view.findViewById(R.id.cat3).findViewById(R.id.recyclerView);
        imageView=view.findViewById(R.id.cat3).findViewById(R.id.image_category_icon);
        textViewTitle=view.findViewById(R.id.cat3).findViewById(R.id.textviewtitle);
        imageView.setBackgroundResource(img[2]);
        textViewTitle.setText(categoryList[2]);
        AdapterCareerAdviceCategoryView adapterCareerAdviceCategoryView=new AdapterCareerAdviceCategoryView(getActivity(),list);
        recyclerView3.setAdapter(adapterCareerAdviceCategoryView);
    }

    private void initviews3(View view)

    {
        Model1 model1=new Model1();
        model1.setImage(R.drawable.r1);
        model1.setTitle_Content("30 Resume Tips to help you get hired");
        list.add(model1);

        Model1 model2=new Model1();
        model2.setImage(R.drawable.r1);
        model2.setTitle_Content("5 RESUME RED FLAGS TO AVOID");
        list.add(model2);

        Model1 model3=new Model1();
        model3.setImage(R.drawable.r1);
        model3.setTitle_Content(" 8 Resume Tips from a Former Hiring Manager — Jessica DW | Bright Space Coaching");
        list.add(model3);

        recyclerView4 = view.findViewById(R.id.cat4).findViewById(R.id.recyclerView);
        imageView=view.findViewById(R.id.cat4).findViewById(R.id.image_category_icon);
        textViewTitle=view.findViewById(R.id.cat4).findViewById(R.id.textviewtitle);
        imageView.setBackgroundResource(img[3]);
        textViewTitle.setText(categoryList[3]);
        AdapterCareerAdviceCategoryView adapterCareerAdviceCategoryView=new AdapterCareerAdviceCategoryView(getActivity(),list);
        recyclerView4.setAdapter(adapterCareerAdviceCategoryView);
    }

    private void initviews4(View view)

    {
        Model1 model1=new Model1();
        model1.setImage(R.drawable.r1);
        model1.setTitle_Content("30 Resume Tips to help you get hired");
        list.add(model1);

        Model1 model2=new Model1();
        model2.setImage(R.drawable.r1);
        model2.setTitle_Content("5 RESUME RED FLAGS TO AVOID");
        list.add(model2);

        Model1 model3=new Model1();
        model3.setImage(R.drawable.r1);
        model3.setTitle_Content(" 8 Resume Tips from a Former Hiring Manager — Jessica DW | Bright Space Coaching");
        list.add(model3);

        recyclerView5 = view.findViewById(R.id.cat5).findViewById(R.id.recyclerView);
        imageView=view.findViewById(R.id.cat5).findViewById(R.id.image_category_icon);
        textViewTitle=view.findViewById(R.id.cat5).findViewById(R.id.textviewtitle);
        imageView.setBackgroundResource(img[4]);
        textViewTitle.setText(categoryList[4]);
        AdapterCareerAdviceCategoryView adapterCareerAdviceCategoryView=new AdapterCareerAdviceCategoryView(getActivity(),list);
        recyclerView5.setAdapter(adapterCareerAdviceCategoryView);
    }
    private void initviews5(View view)

    {
        Model1 model1=new Model1();
        model1.setImage(R.drawable.r1);
        model1.setTitle_Content("30 Resume Tips to help you get hired");
        list.add(model1);

        Model1 model2=new Model1();
        model2.setImage(R.drawable.r1);
        model2.setTitle_Content("5 RESUME RED FLAGS TO AVOID");
        list.add(model2);

        Model1 model3=new Model1();
        model3.setImage(R.drawable.r1);
        model3.setTitle_Content(" 8 Resume Tips from a Former Hiring Manager — Jessica DW | Bright Space Coaching");
        list.add(model3);

        recyclerView6 = view.findViewById(R.id.cat6).findViewById(R.id.recyclerView);
        imageView=view.findViewById(R.id.cat6).findViewById(R.id.image_category_icon);
        textViewTitle=view.findViewById(R.id.cat6).findViewById(R.id.textviewtitle);
        imageView.setBackgroundResource(img[5]);
        textViewTitle.setText(categoryList[5]);
        AdapterCareerAdviceCategoryView adapterCareerAdviceCategoryView=new AdapterCareerAdviceCategoryView(getActivity(),list);
        recyclerView6.setAdapter(adapterCareerAdviceCategoryView);
    }
    private void initviews6(View view)

    {
        Model1 model1=new Model1();
        model1.setImage(R.drawable.r1);
        model1.setTitle_Content("30 Resume Tips to help you get hired");
        list.add(model1);

        Model1 model2=new Model1();
        model2.setImage(R.drawable.r1);
        model2.setTitle_Content("5 RESUME RED FLAGS TO AVOID");
        list.add(model2);

        Model1 model3=new Model1();
        model3.setImage(R.drawable.r1);
        model3.setTitle_Content(" 8 Resume Tips from a Former Hiring Manager — Jessica DW | Bright Space Coaching");
        list.add(model3);

        recyclerView7 = view.findViewById(R.id.cat7).findViewById(R.id.recyclerView);
        imageView=view.findViewById(R.id.cat7).findViewById(R.id.image_category_icon);
        textViewTitle=view.findViewById(R.id.cat7).findViewById(R.id.textviewtitle);
        imageView.setBackgroundResource(img[6]);
        textViewTitle.setText(categoryList[6]);
        AdapterCareerAdviceCategoryView adapterCareerAdviceCategoryView=new AdapterCareerAdviceCategoryView(getActivity(),list);
        recyclerView7.setAdapter(adapterCareerAdviceCategoryView);
    }
    private void initviews7(View view)

    {
        Model1 model1=new Model1();
        model1.setImage(R.drawable.r1);
        model1.setTitle_Content("30 Resume Tips to help you get hired");
        list.add(model1);

        Model1 model2=new Model1();
        model2.setImage(R.drawable.r1);
        model2.setTitle_Content("5 RESUME RED FLAGS TO AVOID");
        list.add(model2);

        Model1 model3=new Model1();
        model3.setImage(R.drawable.r1);
        model3.setTitle_Content(" 8 Resume Tips from a Former Hiring Manager — Jessica DW | Bright Space Coaching");
        list.add(model3);

        recyclerView8 = view.findViewById(R.id.cat8).findViewById(R.id.recyclerView);
        imageView=view.findViewById(R.id.cat8).findViewById(R.id.image_category_icon);
        textViewTitle=view.findViewById(R.id.cat8).findViewById(R.id.textviewtitle);
        imageView.setBackgroundResource(img[7]);
        textViewTitle.setText(categoryList[7]);
        AdapterCareerAdviceCategoryView adapterCareerAdviceCategoryView=new AdapterCareerAdviceCategoryView(getActivity(),list);
        recyclerView8.setAdapter(adapterCareerAdviceCategoryView);
    }
    private void initviews8(View view)

    {
        Model1 model1=new Model1();
        model1.setImage(R.drawable.r1);
        model1.setTitle_Content("30 Resume Tips to help you get hired");
        list.add(model1);

        Model1 model2=new Model1();
        model2.setImage(R.drawable.r1);
        model2.setTitle_Content("5 RESUME RED FLAGS TO AVOID");
        list.add(model2);

        Model1 model3=new Model1();
        model3.setImage(R.drawable.r1);
        model3.setTitle_Content(" 8 Resume Tips from a Former Hiring Manager — Jessica DW | Bright Space Coaching");
        list.add(model3);

        recyclerView9 = view.findViewById(R.id.cat9).findViewById(R.id.recyclerView);
        imageView=view.findViewById(R.id.cat9).findViewById(R.id.image_category_icon);
        textViewTitle=view.findViewById(R.id.cat9).findViewById(R.id.textviewtitle);
        imageView.setBackgroundResource(img[8]);
        textViewTitle.setText(categoryList[8]);
        AdapterCareerAdviceCategoryView adapterCareerAdviceCategoryView=new AdapterCareerAdviceCategoryView(getActivity(),list);
        recyclerView9.setAdapter(adapterCareerAdviceCategoryView);
    }
    private void initviews9(View view)

    {
        Model1 model1=new Model1();
        model1.setImage(R.drawable.r1);
        model1.setTitle_Content("30 Resume Tips to help you get hired");
        list.add(model1);

        Model1 model2=new Model1();
        model2.setImage(R.drawable.r1);
        model2.setTitle_Content("5 RESUME RED FLAGS TO AVOID");
        list.add(model2);

        Model1 model3=new Model1();
        model3.setImage(R.drawable.r1);
        model3.setTitle_Content(" 8 Resume Tips from a Former Hiring Manager — Jessica DW | Bright Space Coaching");
        list.add(model3);

        recyclerView10 = view.findViewById(R.id.cat10).findViewById(R.id.recyclerView);
        imageView=view.findViewById(R.id.cat10).findViewById(R.id.image_category_icon);
        textViewTitle=view.findViewById(R.id.cat10).findViewById(R.id.textviewtitle);
        imageView.setBackgroundResource(img[9]);
        textViewTitle.setText(categoryList[9]);
        AdapterCareerAdviceCategoryView adapterCareerAdviceCategoryView=new AdapterCareerAdviceCategoryView(getActivity(),list);
        recyclerView10.setAdapter(adapterCareerAdviceCategoryView);
    }
    private void initviews10(View view)

    {
        Model1 model1=new Model1();
        model1.setImage(R.drawable.r1);
        model1.setTitle_Content("30 Resume Tips to help you get hired");
        list.add(model1);

        Model1 model2=new Model1();
        model2.setImage(R.drawable.r1);
        model2.setTitle_Content("5 RESUME RED FLAGS TO AVOID");
        list.add(model2);

        Model1 model3=new Model1();
        model3.setImage(R.drawable.r1);
        model3.setTitle_Content(" 8 Resume Tips from a Former Hiring Manager — Jessica DW | Bright Space Coaching");
        list.add(model3);

        recyclerView11= view.findViewById(R.id.cat11).findViewById(R.id.recyclerView);
        imageView=view.findViewById(R.id.cat11).findViewById(R.id.image_category_icon);
        textViewTitle=view.findViewById(R.id.cat11).findViewById(R.id.textviewtitle);
        imageView.setBackgroundResource(img[10]);
        textViewTitle.setText(categoryList[10]);
        AdapterCareerAdviceCategoryView adapterCareerAdviceCategoryView=new AdapterCareerAdviceCategoryView(getActivity(),list);
        recyclerView11.setAdapter(adapterCareerAdviceCategoryView);
    }
    private void initviews11(View view)

    {
        Model1 model1=new Model1();
        model1.setImage(R.drawable.r1);
        model1.setTitle_Content("30 Resume Tips to help you get hired");
        list.add(model1);

        Model1 model2=new Model1();
        model2.setImage(R.drawable.r1);
        model2.setTitle_Content("5 RESUME RED FLAGS TO AVOID");
        list.add(model2);

        Model1 model3=new Model1();
        model3.setImage(R.drawable.r1);
        model3.setTitle_Content(" 8 Resume Tips from a Former Hiring Manager — Jessica DW | Bright Space Coaching");
        list.add(model3);

        recyclerView12 = view.findViewById(R.id.cat12).findViewById(R.id.recyclerView);
        imageView=view.findViewById(R.id.cat12).findViewById(R.id.image_category_icon);
        textViewTitle=view.findViewById(R.id.cat12).findViewById(R.id.textviewtitle);
        imageView.setBackgroundResource(img[11]);
        textViewTitle.setText(categoryList[11]);
        AdapterCareerAdviceCategoryView adapterCareerAdviceCategoryView=new AdapterCareerAdviceCategoryView(getActivity(),list);
        recyclerView12.setAdapter(adapterCareerAdviceCategoryView);
    }

//    @Override
//    public void onItemClicked(int position) {
//        Log.d("positionis",String.valueOf(position));
//        switch (position){
//            case 0:
//                  navController.navigate(R.id.action_careerAdviceHomeFragment_to_careerAdviceSummaryFragments);
//                  break;
//            case 1:
//                navController.navigate(R.id.action_careerAdviceHomeFragment_to_careerAdviceSummaryFragments);
//                break;
//            case 2:
//                navController.navigate(R.id.action_careerAdviceHomeFragment_to_careerAdviceSummaryFragments);
//                break;
//        }

 //   }
}
