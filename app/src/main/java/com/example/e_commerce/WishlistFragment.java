package com.example.e_commerce;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.e_commerce.adapter.ProductWishlistAdapter;


/**
 * A simple {@link Fragment} subclass.
 */
public class WishlistFragment extends Fragment {

    private RecyclerView rcProductWishlist;
    public WishlistFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_wishlist, container, false);
        rcProductWishlist = view.findViewById(R.id.rc_wishlist);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(container.getContext());
        rcProductWishlist.setLayoutManager(linearLayoutManager);
        rcProductWishlist.setAdapter(new ProductWishlistAdapter());

        return view;
    }

}
