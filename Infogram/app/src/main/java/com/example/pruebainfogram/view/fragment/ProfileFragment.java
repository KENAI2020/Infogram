package com.example.pruebainfogram.view.fragment;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pruebainfogram.R;
import com.example.pruebainfogram.adapter.CardViewAdapter;
import com.example.pruebainfogram.model.Image;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ProfileFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProfileFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ProfileFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ProfileFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ProfileFragment newInstance(String param1, String param2) {
        ProfileFragment fragment = new ProfileFragment();
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
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        //toolbar
        showToolBar("", false, view);

        //recyclerView
        RecyclerView recyclerView = view.findViewById(R.id.recycler_view_profile);

        //Layout manager
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        //el adapter
        CardViewAdapter cardViewAdapter = new CardViewAdapter(buidImages(), R.layout.cardview_image, getActivity());
        recyclerView.setAdapter(cardViewAdapter);
        return view;
    }

    public void showToolBar(String titulo, boolean botonSubir, View view){
        Toolbar toolbar = view.findViewById(R.id.toolbar_profile);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);

        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(titulo);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(botonSubir);
    }

    //creamos la lista de imagenes
    public ArrayList<Image> buidImages(){
        ArrayList<Image> images = new ArrayList<>();

        images.add(new Image("https://9968c6ef49dc043599a5-e151928c3d69a5a4a2d07a8bf3efa90a.ssl.cf2.rackcdn.com/1130199.jpg", "Carlos Valdivia","2 dias", "1 me gusta"));
        images.add(new Image("https://landingwebimg.s3.amazonaws.com/uploads/landing_page_product_variant/image/194595/image-upload1606687503.jpeg", "Luis Peres","4 dias", "3 me gusta"));
        images.add(new Image("https://www.laregion.bo/wp-content/uploads/2019/07/coroico-parapente.jpeg", "Mauricio Quiroz","1 dias", "5 me gusta"));
        images.add(new Image("https://www.ibolivia.org/wp-content/uploads/2019/08/laguna-colorada-flamencos.jpg", "Danilo Salazar","6 dias", "7 me gusta"));
        images.add(new Image("https://www.eldiario.net/portal/wp-content/uploads/2021/10/pol-42-15.jpg", "Daniel Torres","9 dias", "2 me gusta"));
        images.add(new Image("https://miaventuraviajando.com/wp-content/uploads/2018/10/samaipata-mi-aventura-viajando-30.jpg", "Lorena Herrera","4 dias", "4 me gusta"));
        images.add(new Image("https://www.laregion.bo/wp-content/uploads/2015/10/cristo.jpg", "Maria Guzman","7 dias", "6 me gusta"));
        images.add(new Image("https://lh5.googleusercontent.com/-CINb2hHdBHc/VMfJjASBQDI/AAAAAAAAC0I/23gSET6uSaw/s640/blogger-image-979580039.jpg", "Rolando Morales","5 dias", "8 me gusta"));
        images.add(new Image("https://laicismo.org/wp-content/uploads/2017/02/Monumento-Virgen-de-Socavon-en-Oruro-Bolivia.jpg", "Fernando Castro","3 dias", "2 me gusta"));
        images.add(new Image("https://tipsparatuviaje.com/wp-content/uploads/2019/07/salar-de-uyuni.jpg", "Laura Rojas","1 dias", "3 me gusta"));


        return images;
    }
}