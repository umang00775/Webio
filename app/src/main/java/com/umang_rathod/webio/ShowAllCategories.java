//package com.umang_rathod.webio;
//
//import android.app.Activity;
//import android.os.Bundle;
//
//import androidx.fragment.app.Fragment;
//
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ArrayAdapter;
//import android.widget.ImageView;
//import android.widget.ListView;
//import android.widget.TextView;
//
///**
// * A simple {@link Fragment} subclass.
// * Use the {@link ShowAllCategories#newInstance} factory method to
// * create an instance of this fragment.
// */
//public class ShowAllCategories extends Fragment {
//
//    ListView listView;
//
//
//    // TODO: Rename parameter arguments, choose names that match
//    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//    private static final String ARG_PARAM1 = "param1";
//    private static final String ARG_PARAM2 = "param2";
//
//    // TODO: Rename and change types of parameters
//    private String mParam1;
//    private String mParam2;
//
//    public ShowAllCategories() {
//        // Required empty public constructor
//    }
//
//    /**
//     * Use this factory method to create a new instance of
//     * this fragment using the provided parameters.
//     *
//     * @param param1 Parameter 1.
//     * @param param2 Parameter 2.
//     * @return A new instance of fragment ShowAllCategories.
//     */
//    // TODO: Rename and change types and number of parameters
//    public static ShowAllCategories newInstance(String param1, String param2) {
//        ShowAllCategories fragment = new ShowAllCategories();
//        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
//        fragment.setArguments(args);
//        return fragment;
//    }
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        if (getArguments() != null) {
//            mParam1 = getArguments().getString(ARG_PARAM1);
//            mParam2 = getArguments().getString(ARG_PARAM2);
//        }
//    }
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        View parentHodler  = inflater.inflate(R.layout.fragment_show_all_categories, container, false);
//
//        listView = parentHodler.findViewById(R.id.showlisthere);
//        String[] data = {"Apparel & Accessories", "Food & Beverage", "Toys", "Crafts & Hobbies", "Electronics & Computers",
//                "Fruits & Veg", "Jewelery", "Health & Beauty", "Footwear", "Home & Furniture","Books, Music & Video", "Art &amp; Photography", "Gifts & Flowers",
//                "Pet Products", "Sports, Fitness & Outdoors", "Grocery & Organic Foods"};
//        Integer[] imgid = new Integer[15];
//        for(int i=0;i<=14; i++){
//            imgid[i] = R.drawable.temporary_image;
//        }
//
//        CustomAdapter adapter = new CustomAdapter(this, data, imgid);
//        listView.setAdapter(adapter);
//        return parentHodler;
//    }
//
//    public class CustomAdapter extends ArrayAdapter<String> {
//
//        private final ShowAllCategories context;
//        private final String[] data;
//        private final Integer[] imgid;
//
//
//        public CustomAdapter(ShowAllCategories context, String[] data, Integer[] imgid) {
//            super(context, R.layout.template_viewer_list, data);
//
//            this.context = context;
//            this.data = data;
//            this.imgid = imgid;
//        }
//
//        public View getView(int i, View view, ViewGroup parent){
//            LayoutInflater inflater = context.getLayoutInflater();
//            View v1 = inflater.inflate(R.layout.template_viewer_list,null,true);
//            ImageView img = v1.findViewById(R.id.imageoftemplate);
//            TextView name = v1.findViewById(R.id.templatecategory);
//            img.setImageResource(imgid[i]);
//            name.setText(data[i]);
//            return v1;
//        }
//    }
//}