package com.catchoom.craftar;

//
// CraftARPluginManager.java
//
// Created by Daniel Cabrera a on 2016.
// Infinity Source S.L.
//

import android.content.Context;

import com.craftar.CraftARActivity;
import com.craftar.CraftARSDK;
import com.craftar.SearchController;

import java.util.ArrayList;
import java.util.HashMap;

public class CraftARPluginManager {
    ArrayList<CatchoomPluginInterface> catchoomPlugins;
    public CraftARPlugin plugin;

    private static CraftARPluginManager ourInstance = new CraftARPluginManager();

    public static CraftARPluginManager getInstance() {
        return ourInstance;
    }

    private CraftARPluginManager() {
    }

    public void init(HashMap<String, Object> objects, CraftARActivity act, CraftARPlugin plugin){
        catchoomPlugins = new ArrayList<CatchoomPluginInterface>();
        catchoomPlugins.add(new CraftARFinderPlugin(objects, act));
        catchoomPlugins.add(new CraftARCloudIRPlugin(objects));
        this.plugin = plugin;
    }

    ArrayList<CatchoomPluginInterface> getPlugins(){
        return catchoomPlugins;
    }

    public void initSDK(Context context, CraftARActivity activity){
        CraftARSDK.Instance().init(context);
    }
    
    public void startCapture(CraftARActivity activity){
        CraftARSDK.Instance().startCapture(activity);
    }

    public void setSearchController(SearchController searchController) {
        CraftARSDK.Instance().setSearchController(searchController);
    }
}
