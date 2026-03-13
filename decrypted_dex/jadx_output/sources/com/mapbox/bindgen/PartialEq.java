package com.mapbox.bindgen;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class PartialEq {
    private static double epsilonD = Math.ulp(1.0d);
    private static float epsilonF = Math.ulp(1.0f);

    public static boolean compare(double d8, double d10) {
        return Math.abs(d8 - d10) <= epsilonD * Math.max(1.0d, Math.max(Math.abs(d8), Math.abs(d10)));
    }

    public static boolean compare(float f10, float f11) {
        return Math.abs(f10 - f11) <= epsilonF * Math.max(1.0f, Math.max(Math.abs(f10), Math.abs(f11)));
    }
}
