package com.example.zz.screendetailinfo;

import android.app.Activity;
import android.os.Bundle;
/**
 * 类描述：关于屏幕适配的一些知识
 * 创建人：zz
 * 创建时间：2017/7/14 13:27
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getScreenInfo();
    }

    /**
     * 获取屏幕的信息
     */
    private void getScreenInfo() {
        /**
         *    1.  屏幕密度dpi:   1dpi = 254厘米    dpi的算法为： 屏幕的分辨率平方和然后开方/除于尺寸
         *        如：1920 * 1080   5.0 的尺寸        此时dpi = （1920 * 1920 + 1080 * 1080） √2  / 5.0 = 440.58
         *    2.  屏幕尺寸，一般指的是屏幕对角线的长度如（5.0寸）
         *       dip  密度无关像素
         *    3.以160dpi作为基准： 1px = 1dip(dp等同于dip)
         *    4.sp   对字体进行放缩  （不推荐使用奇数或者小数，会失精，，google推荐12 14 18 22）
         *
         *    不同分辨率对应的像素密度：
         *     mdpi                    120-160dpi
         *     hdpi                    160-240dpi
         *     xhdpi                   240-320dpi
         *     xxhdpi                  320-480dpi
         *     xxxhdpi                 480-640dpi
         *
         *  5.在Android 3.2 之前提供res/layout_larger   来控制大屏幕的展示
         *    在Android 3.2之后又提供了res/layout_sw600dp  ，来实现大屏幕的XML
         *                               (Small width   长或宽最小的那个在600dp以下，就判定为平板设备，此时就使用双面板布局)
         *
         * 6. .9图片拉伸的是左侧和上侧的区域    右边和下边是间隔区域
         */
    }
}
