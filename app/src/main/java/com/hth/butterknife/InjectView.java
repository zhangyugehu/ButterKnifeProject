package com.hth.butterknife;

import android.app.Activity;

/**
 * Created by hth on 2017/6/27.
 */

public class InjectView{
    public static void bind(Activity activity){
        String className = activity.getClass().getName();
        try {
            Class<?> viewClass = Class.forName(className + "$ViewBinder");
            ViewBinder viewBinder = (ViewBinder) viewClass.newInstance();
            viewBinder.bind(activity);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

}
