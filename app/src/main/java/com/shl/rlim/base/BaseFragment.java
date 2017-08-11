package com.shl.rlim.base;

import android.content.Context;
import android.support.v4.app.Fragment;

/**
 * Created by shl on 2017/5/2.
 */

public class BaseFragment extends Fragment {
    protected BaseActivity activity;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        activity = (BaseActivity) getActivity();
    }
}