package androiddeveloper.eder.padilla.popupsample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ederpadilla on 10/08/17.
 */

public class VehicleImageFragment extends Fragment {

    @BindView(R.id.img_banner)
    ImageView imgBanner;

    public static Fragment newInstance(String image) {
        VehicleImageFragment myFragment = new VehicleImageFragment();
        Bundle args = new Bundle();
        args.putString("url", image);
        myFragment.setArguments(args);
        return myFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_vehicle_image, container, false);
        ButterKnife.bind(this,view);
        Glide.with(getActivity())
                .load(getArguments().getString("url"))
                .listener(new RequestListener<String, GlideDrawable>() {
                    @Override
                    public boolean onException(Exception e, String model, Target<GlideDrawable> target, boolean isFirstResource) {
                        return false;
                    }

                    @Override
                    public boolean onResourceReady(GlideDrawable resource, String model, Target<GlideDrawable> target, boolean isFromMemoryCache, boolean isFirstResource) {

                        return false;
                    }
                })
                .centerCrop()
                .into(imgBanner);


        return view;
    }
}