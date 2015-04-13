package com.ml.cd.maker;

import android.util.DisplayMetrics;

import com.ml.bigshow.BaseApplication;

public class BaseViewMaker {
	
	static int mHeight;
	static int mWidth;
	
	public BaseViewMaker(){
		DisplayMetrics metric = BaseApplication.getInstance().getResources().getDisplayMetrics();
		mHeight = metric.heightPixels;
		mWidth = metric.widthPixels;
	}
	
	
	/** 
     * 根据手机的分辨率从 dp 的单位 转成为 px(像素) 
     */  
    public static int dp2px(float dpValue) {  
        final float scale = BaseApplication.getInstance().getResources().getDisplayMetrics().density;  
        return (int) (dpValue * scale + 0.5f);  
    } 
	

}