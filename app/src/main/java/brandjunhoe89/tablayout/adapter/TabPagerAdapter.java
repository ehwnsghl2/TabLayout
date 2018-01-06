package brandjunhoe89.tablayout.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import brandjunhoe89.tablayout.ui.TabFragment1;
import brandjunhoe89.tablayout.ui.TabFragment2;
import brandjunhoe89.tablayout.ui.TabFragment3;

/**
 * Created by jh on 2018-01-06.
 */

public class TabPagerAdapter extends FragmentStatePagerAdapter {

    private int tabCount;

    public TabPagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                TabFragment1 tabFragment1 = new TabFragment1();
                return tabFragment1;
            case 1:
                TabFragment2 tabFragment2 = new TabFragment2();
                return tabFragment2;
            case 2:
                TabFragment3 tabFragment3 = new TabFragment3();
                return tabFragment3;
            default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
