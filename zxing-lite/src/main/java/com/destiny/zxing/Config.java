package com.destiny.zxing;

import com.destiny.zxing.camera.FrontLightMode;

/**
 * Created by Admin on 2016/10/10.
 */

public class Config {
    // 条码类型设置
    /**
     * 是否支持一维码：商品
     */
    public static boolean isSupport1DProduct = true;

    /**
     * 是否支持一维码：工业
     */
    public static boolean isSupport1DIndustrial = true;

    /**
     * 是否支持二维码
     */
    public static boolean isSupportQR = true;

    /**
     * 是否支持Data Matrix
     */
    public static boolean isSupportDataMatrix = true;

    /**
     * 是否支持Aztec
     */
    public static boolean isSupportAztec = false;

    /**
     * 是否支持PDF417 (测试)
     */
    public static boolean isSupportPDF417 = false;

    // 扫描成功设置
    /**
     * 是否播放提示音
     */
    public static boolean isPlayBeep = true;

    /**
     * 是否振动
     */
    public static boolean isVibrate = false;

    // 扫描设置
    /**
     * 闪光灯模式
     */
    public static FrontLightMode frontLightMode = FrontLightMode.OFF;

    /**
     * 是否自动对焦
     */
    public static boolean isAutoFocus = true;

    /**
     * 是否扫描黑色背景上的白色条码，仅适用于部分设备
     */
    public static boolean isInvertScan = false;

    // 设备适配
    /**
     * 是否关闭持续对焦
     */
    public static boolean isDisableContinuous = true;

    /**
     * 是否关闭曝光
     */
    public static boolean isDisableExposure = true;

    /**
     * 是否关闭距离测量
     */
    public static boolean isDisableMetering = true;

    /**
     * 是否不进行条形码场景匹配
     */
    public static boolean isDisableBarcodeSceneMode = true;
}
