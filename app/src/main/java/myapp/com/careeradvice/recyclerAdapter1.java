package myapp.com.careeradvice;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class recyclerAdapter1 extends RecyclerView.Adapter<recyclerAdapter1.ViewHolder> {
    ArrayList<Model1> resumeModels=new ArrayList<>();
    public View.OnClickListener mOnClickListener = new MyOnClickListener();;
    Context context;


    public recyclerAdapter1(Context context,ArrayList<Model1> resumeModels)
    {
        this.context=context;
        this.resumeModels=resumeModels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View vie= LayoutInflater.from(parent.getContext()).inflate(R.layout.resume,parent,false);
        return new ViewHolder(vie);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {


        Model1 model=resumeModels.get(position);
        //  int img=model.getMain_Image();
        //   String main_Topic=model.getText_Main();
        int imge=model.getContent_Image();
        String title_Content=model.getTitle_Content();
        String text_content=model.getText_Content();

        holder.setData(imge,text_content,title_Content);

    }

    @Override
    public int getItemCount() {
        return resumeModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView imageView,imageView_C;
        TextView textView,textView_C;

        public ViewHolder(@NonNull View itemView) {

            super(itemView);

            imageView_C=itemView.findViewById(R.id.imageView_content);
            textView=itemView.findViewById(R.id.textView_content);
            textView_C=itemView.findViewById(R.id.textView_title);

        }
        private void setData(int imge,String text_Contents,String title_Content)
        {
            imageView_C.setImageResource(imge);
            textView.setText(text_Contents);
            textView_C.setText(title_Content);
        }
    }
    private class MyOnClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {


        }
    }

}
