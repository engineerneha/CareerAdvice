
package myapp.com.careeradvice;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class recyclerAdapter extends RecyclerView.Adapter<recyclerAdapter.ViewHolder>{

    Context context;
    int resource;
    ArrayList<Model> objects;

    public recyclerAdapter(Context context, int resource, ArrayList<Model> objects) {
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(context).inflate(resource,parent,false);
        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Model mRef = objects.get(position);

        //3. To Set Data on View from Object
        holder.imageView.setBackgroundResource(mRef.getImage());
        holder.txtTopic.setText(mRef.getTopic());
        holder.txtView.setText(mRef.getView());
        holder.c1.setCardBackgroundColor(mRef.getColor());


    }

    @Override
    public int getItemCount() {
        return objects.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
         ImageView imageView;
         TextView txtTopic,txtView;
         CardView c1,c2,c3;
         private final Context context;

         public ViewHolder(@NonNull View itemView) {
             super(itemView);
             c1=itemView.findViewById(R.id.cardviewone);
             c2=itemView.findViewById(R.id.cardviewtwo);
             c3=itemView.findViewById(R.id.cardviewthree);
             imageView=itemView.findViewById(R.id.imageview);
             txtTopic=itemView.findViewById(R.id.txttopic);
             txtView=itemView.findViewById(R.id.txtview);
             context=itemView.getContext();
             itemView.setOnClickListener(this);

         }


        @Override
        public void onClick(View view) {
            final Intent intent;
            switch (getAdapterPosition()){
                case 0:
                    intent =  new Intent(context, ResumeTipsActivity.class);
                    //Toast.makeText(context,"item Selected"+getAdapterPosition(),Toast.LENGTH_LONG).show();
                    break;

                case 1:
                    intent =  new Intent(context, ResumeTipsActivity.class);
                    break;
                default:
                    intent =  new Intent(context, ResumeTipsActivity.class);
                    break;
            }
           context.startActivity(intent);
        }
    }



}