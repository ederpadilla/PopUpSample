package androiddeveloper.eder.padilla.popupsample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * Created by ederpadilla on 10/08/17.
 */

public class DinamicPagerAdapter extends FragmentStatePagerAdapter {

    private List<VehicleImageFragment> fragments;

    public DinamicPagerAdapter(FragmentManager fm, List<VehicleImageFragment> fragments) {
        super(fm);
        this.fragments = fragments;
    }


    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }


}
