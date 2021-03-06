package myapp.com.careeradvice;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnItemClick;

public class AdapterCareerAdviceCategoryView extends RecyclerView.Adapter<AdapterCareerAdviceCategoryView.ViewHolder> {

    ArrayList<Model1> resumeModels;
    Context context,contexts;
    //OnItemClick onItemClick;
    NavController navController;

    public AdapterCareerAdviceCategoryView(Context context,ArrayList<Model1> resumeModels)
    {
        this.context=context;
        this.resumeModels=resumeModels;

    }

   /* public AdapterCareerAdviceCategoryView(Context context,ArrayList<Model1> resumeModels,OnItemClick onItemClick)
    {
        this.context=context;
        this.resumeModels=resumeModels;
        this.onItemClick=onItemClick;

    }*/

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_career_advice_category_view,
                parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        if (position!=3){
            //holder.txtDescription.setText(model.getText_Content());
           // holder.buttonRead.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    context.startActivity(new Intent(context, ResumeTipsHireActivity.class));
//                }
//            });
            Model1 model = resumeModels.get(position);
            holder.imageView.setBackgroundResource(model.getImage());
            holder.textTitle.setText(model.getTitle_Content());
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    navController=Navigation.findNavController(view);
                    navController.navigate(R.id.action_careerAdviceHomeFragment_to_careerAdviceSummaryFragments);
                }
            });



        }
        if (position == 3){
            holder.containerView.setVisibility(View.INVISIBLE);
            holder.viewAllView.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.image_view)
        ImageView imageView;
        @BindView(R.id.text_title)
        TextView textTitle;
        @BindView(R.id.button_read)
        TextView buttonRead;
        @BindView(R.id.container_view)
        ConstraintLayout containerView;
        @BindView(R.id.cardViewAll)
        CardView cardViewAll;
        @BindView(R.id.viewAllView)
        RelativeLayout viewAllView;
        @BindView(R.id.text_description)
        TextView txtDescription;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
//            itemView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    onItemClick.onItemClicked(getAdapterPosition());
//                }
//            });
        }
    }
   /* public interface OnItemClick
    {
        void onItemClicked(int position);
    }*/
}
