package com.umang_rathod.webio;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment3#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment3 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment3() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment3.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment3 newInstance(String param1, String param2) {
        Fragment3 fragment = new Fragment3();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View parentHolder = inflater.inflate(R.layout.fragment_3, container, false);


        // Just for testing :) :) :) :) :)
        {
            TextView food = parentHolder.findViewById(R.id.food);
            String foodLink = "https://webio2022.github.io/Food/";
            food.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getActivity(), Browser.class);
                    intent.putExtra("URL", foodLink);
                    startActivity(intent);
                }
            });

            TextView ecommerce = parentHolder.findViewById(R.id.ecommerce);
            String ecommerceLink = "https://webio2022.github.io/Shop/";
            ecommerce.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getActivity(), Browser.class);
                    intent.putExtra("URL", ecommerceLink);
                    startActivity(intent);
                }
            });

            TextView fruitsAndVeg = parentHolder.findViewById(R.id.fruitandveg);
            String fruitsAndVegLink = "https://webio2022.github.io/Fruits-and-Veg/";
            fruitsAndVeg.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getActivity(), Browser.class);
                    intent.putExtra("URL", fruitsAndVegLink);
                    startActivity(intent);
                }
            });

            TextView groceryAndOrg = parentHolder.findViewById(R.id.groceryandorganic);
            String groceryAndOrgLink = "https://webio2022.github.io/Grocery-and-Organic/";
            groceryAndOrg.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getActivity(), Browser.class);
                    intent.putExtra("URL", groceryAndOrgLink);
                    startActivity(intent);
                }
            });
        }
        return parentHolder;
    }
}