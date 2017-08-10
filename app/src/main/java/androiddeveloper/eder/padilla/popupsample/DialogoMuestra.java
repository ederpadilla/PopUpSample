package androiddeveloper.eder.padilla.popupsample;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import com.rd.PageIndicatorView;
import com.rd.animation.type.AnimationType;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ederpadilla on 10/08/17.
 */

public class DialogoMuestra extends DialogFragment {

    //ImageButton cerrar;


    @BindView(R.id.viewPager)
    ViewPager viewPager;

    @BindView(R.id.pageIndicatorView)
    PageIndicatorView pageIndicatorView;

    DinamicPagerAdapter dinamicPagerAdapter;

    List<VehicleImageFragment> fragments = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dialogo_muestra, container);
        ButterKnife.bind(this,view);
        initViewPager();
        return view;
    }


    private void initViewPager() {
        fragments.add((VehicleImageFragment) VehicleImageFragment.newInstance("http://app.driveapp.mx/drive/valet/images/image_1_55_2017_08_08_18_10_33.jpg"));
        fragments.add((VehicleImageFragment) VehicleImageFragment.newInstance("http://app.driveapp.mx/drive/valet/images/image_1_55_2017_08_08_18_10_33.jpg"));
        fragments.add((VehicleImageFragment) VehicleImageFragment.newInstance("http://app.driveapp.mx/drive/valet/images/image_1_55_2017_08_08_18_10_33.jpg"));
        dinamicPagerAdapter = new DinamicPagerAdapter(getChildFragmentManager(),fragments);
        viewPager.setAdapter(dinamicPagerAdapter);
        pageIndicatorView.setViewPager(viewPager);
    }


}
