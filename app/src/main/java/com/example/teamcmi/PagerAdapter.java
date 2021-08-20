package com.example.teamcmi;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class PagerAdapter extends FragmentStateAdapter {
    public PagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch (position)
        {
            //If position is 0
            case 0 : {
                return new AllRooms();
            }

            //If position is 1
            case 1 : {
                return new AddFriends();
            }
        }
        return new AllRooms();
    }

    @Override
    public int getItemCount() {
        //Number of fragments
        return 2;
    }
}
