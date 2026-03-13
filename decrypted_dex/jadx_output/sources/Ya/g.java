package Ya;

import com.stub.StubApp;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static volatile g f8892b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f8893a;

    public g(int i3) {
        switch (i3) {
            case 1:
                this.f8893a = new HashMap();
                break;
            default:
                this.f8893a = new HashMap();
                break;
        }
    }

    public void a(HashMap hashMap) {
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            HashMap hashMap2 = this.f8893a;
            if (value == null) {
                hashMap2.put(str, null);
            } else {
                Class<?> cls = value.getClass();
                if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    hashMap2.put(str, value);
                } else {
                    int i3 = 0;
                    if (cls == boolean[].class) {
                        boolean[] zArr = (boolean[]) value;
                        String str2 = i2.g.f14735b;
                        Boolean[] boolArr = new Boolean[zArr.length];
                        while (i3 < zArr.length) {
                            boolArr[i3] = Boolean.valueOf(zArr[i3]);
                            i3++;
                        }
                        hashMap2.put(str, boolArr);
                    } else if (cls == byte[].class) {
                        byte[] bArr = (byte[]) value;
                        String str3 = i2.g.f14735b;
                        Byte[] bArr2 = new Byte[bArr.length];
                        while (i3 < bArr.length) {
                            bArr2[i3] = Byte.valueOf(bArr[i3]);
                            i3++;
                        }
                        hashMap2.put(str, bArr2);
                    } else if (cls == int[].class) {
                        int[] iArr = (int[]) value;
                        String str4 = i2.g.f14735b;
                        Integer[] numArr = new Integer[iArr.length];
                        while (i3 < iArr.length) {
                            numArr[i3] = Integer.valueOf(iArr[i3]);
                            i3++;
                        }
                        hashMap2.put(str, numArr);
                    } else if (cls == long[].class) {
                        long[] jArr = (long[]) value;
                        String str5 = i2.g.f14735b;
                        Long[] lArr = new Long[jArr.length];
                        while (i3 < jArr.length) {
                            lArr[i3] = Long.valueOf(jArr[i3]);
                            i3++;
                        }
                        hashMap2.put(str, lArr);
                    } else if (cls == float[].class) {
                        float[] fArr = (float[]) value;
                        String str6 = i2.g.f14735b;
                        Float[] fArr2 = new Float[fArr.length];
                        while (i3 < fArr.length) {
                            fArr2[i3] = Float.valueOf(fArr[i3]);
                            i3++;
                        }
                        hashMap2.put(str, fArr2);
                    } else {
                        if (cls != double[].class) {
                            throw new IllegalArgumentException(StubApp.getString2(7590) + str + StubApp.getString2(7591) + cls);
                        }
                        double[] dArr = (double[]) value;
                        String str7 = i2.g.f14735b;
                        Double[] dArr2 = new Double[dArr.length];
                        while (i3 < dArr.length) {
                            dArr2[i3] = Double.valueOf(dArr[i3]);
                            i3++;
                        }
                        hashMap2.put(str, dArr2);
                    }
                }
            }
        }
    }

    public void b(String str, String str2) {
        this.f8893a.put(str, str2);
    }
}
