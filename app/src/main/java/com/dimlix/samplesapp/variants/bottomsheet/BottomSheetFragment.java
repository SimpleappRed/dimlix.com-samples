package com.dimlix.samplesapp.variants.bottomsheet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.dimlix.samplesapp.R;

public class BottomSheetFragment extends Fragment {

    private View imgArrow;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_bottom_sheet, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        imgArrow = view.findViewById(R.id.imgArrow);
    }

    public void setOpenProgress(float progress) {
        imgArrow.setRotation(Math.min(180 * progress * 3, 180));
    }
}
