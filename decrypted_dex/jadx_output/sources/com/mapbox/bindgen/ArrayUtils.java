package com.mapbox.bindgen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class ArrayUtils {
    private ArrayUtils() {
    }

    public static List<Boolean> convert(boolean[] zArr) {
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z2 : zArr) {
            arrayList.add(Boolean.valueOf(z2));
        }
        return arrayList;
    }

    public static Object[] convertListToArray(List<Object> list) {
        return list.toArray();
    }

    public static List<Byte> convert(byte[] bArr) {
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b2 : bArr) {
            arrayList.add(Byte.valueOf(b2));
        }
        return arrayList;
    }

    public static List<Character> convert(char[] cArr) {
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c10 : cArr) {
            arrayList.add(Character.valueOf(c10));
        }
        return arrayList;
    }

    public static List<Short> convert(short[] sArr) {
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s10 : sArr) {
            arrayList.add(Short.valueOf(s10));
        }
        return arrayList;
    }

    public static List<Integer> convert(int[] iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i3 : iArr) {
            arrayList.add(Integer.valueOf(i3));
        }
        return arrayList;
    }

    public static List<Long> convert(long[] jArr) {
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static List<Float> convert(float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f10 : fArr) {
            arrayList.add(Float.valueOf(f10));
        }
        return arrayList;
    }

    public static List<Double> convert(double[] dArr) {
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d8 : dArr) {
            arrayList.add(Double.valueOf(d8));
        }
        return arrayList;
    }

    public static List<Object> convert(Object[] objArr) {
        return Arrays.asList(objArr);
    }
}
