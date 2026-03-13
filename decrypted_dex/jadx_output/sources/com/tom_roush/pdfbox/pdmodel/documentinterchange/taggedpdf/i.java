package com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf;

import android.util.Log;
import com.stub.StubApp;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class i {

    /* renamed from: X, reason: collision with root package name */
    public static List<String> f12933X;

    /* renamed from: A, reason: collision with root package name */
    public static final String f12910A = StubApp.getString2(4560);

    /* renamed from: B, reason: collision with root package name */
    public static final String f12911B = StubApp.getString2(4562);

    /* renamed from: C, reason: collision with root package name */
    public static final String f12912C = StubApp.getString2(16334);

    /* renamed from: D, reason: collision with root package name */
    public static final String f12913D = StubApp.getString2(16335);

    /* renamed from: E, reason: collision with root package name */
    public static final String f12914E = StubApp.getString2(16336);

    /* renamed from: F, reason: collision with root package name */
    public static final String f12915F = StubApp.getString2(16337);

    /* renamed from: G, reason: collision with root package name */
    public static final String f12916G = StubApp.getString2(16338);

    /* renamed from: H, reason: collision with root package name */
    public static final String f12917H = StubApp.getString2(16339);

    /* renamed from: I, reason: collision with root package name */
    public static final String f12918I = StubApp.getString2(16340);

    /* renamed from: J, reason: collision with root package name */
    public static final String f12919J = StubApp.getString2(16341);

    /* renamed from: K, reason: collision with root package name */
    public static final String f12920K = StubApp.getString2(16342);

    /* renamed from: L, reason: collision with root package name */
    public static final String f12921L = StubApp.getString2(2198);

    /* renamed from: M, reason: collision with root package name */
    public static final String f12922M = StubApp.getString2(16343);

    /* renamed from: N, reason: collision with root package name */
    public static final String f12923N = StubApp.getString2(16344);

    /* renamed from: O, reason: collision with root package name */
    public static final String f12924O = StubApp.getString2(16345);

    /* renamed from: P, reason: collision with root package name */
    public static final String f12925P = StubApp.getString2(16346);

    /* renamed from: Q, reason: collision with root package name */
    public static final String f12926Q = StubApp.getString2(16347);

    /* renamed from: R, reason: collision with root package name */
    public static final String f12927R = StubApp.getString2(16300);

    /* renamed from: S, reason: collision with root package name */
    public static final String f12928S = StubApp.getString2(16348);

    /* renamed from: T, reason: collision with root package name */
    public static final String f12929T = StubApp.getString2(16349);

    /* renamed from: U, reason: collision with root package name */
    public static final String f12930U = StubApp.getString2(16350);

    /* renamed from: V, reason: collision with root package name */
    public static final String f12931V = StubApp.getString2(16351);

    /* renamed from: W, reason: collision with root package name */
    public static final String f12932W = StubApp.getString2(16352);

    /* renamed from: a, reason: collision with root package name */
    public static final String f12934a = StubApp.getString2(16353);

    /* renamed from: b, reason: collision with root package name */
    public static final String f12935b = StubApp.getString2(16354);

    /* renamed from: c, reason: collision with root package name */
    public static final String f12936c = StubApp.getString2(16355);

    /* renamed from: d, reason: collision with root package name */
    public static final String f12937d = StubApp.getString2(16356);

    /* renamed from: e, reason: collision with root package name */
    public static final String f12938e = StubApp.getString2(16357);

    /* renamed from: f, reason: collision with root package name */
    public static final String f12939f = StubApp.getString2(16358);

    /* renamed from: g, reason: collision with root package name */
    public static final String f12940g = StubApp.getString2(16359);

    /* renamed from: h, reason: collision with root package name */
    public static final String f12941h = StubApp.getString2(16360);

    /* renamed from: i, reason: collision with root package name */
    public static final String f12942i = StubApp.getString2(16361);
    public static final String j = StubApp.getString2(3221);

    /* renamed from: k, reason: collision with root package name */
    public static final String f12943k = StubApp.getString2(16362);

    /* renamed from: l, reason: collision with root package name */
    public static final String f12944l = StubApp.getString2(6520);

    /* renamed from: m, reason: collision with root package name */
    public static final String f12945m = StubApp.getString2(4920);

    /* renamed from: n, reason: collision with root package name */
    public static final String f12946n = StubApp.getString2(4912);

    /* renamed from: o, reason: collision with root package name */
    public static final String f12947o = StubApp.getString2(16363);

    /* renamed from: p, reason: collision with root package name */
    public static final String f12948p = StubApp.getString2(16364);

    /* renamed from: q, reason: collision with root package name */
    public static final String f12949q = StubApp.getString2(16365);

    /* renamed from: r, reason: collision with root package name */
    public static final String f12950r = StubApp.getString2(16366);

    /* renamed from: s, reason: collision with root package name */
    public static final String f12951s = StubApp.getString2(16367);

    /* renamed from: t, reason: collision with root package name */
    public static final String f12952t = StubApp.getString2(16368);

    /* renamed from: u, reason: collision with root package name */
    public static final String f12953u = StubApp.getString2(4916);

    /* renamed from: v, reason: collision with root package name */
    public static final String f12954v = StubApp.getString2(4646);

    /* renamed from: w, reason: collision with root package name */
    public static final String f12955w = StubApp.getString2(16369);

    /* renamed from: x, reason: collision with root package name */
    public static final String f12956x = StubApp.getString2(16370);

    /* renamed from: y, reason: collision with root package name */
    public static final String f12957y = StubApp.getString2(16178);

    /* renamed from: z, reason: collision with root package name */
    public static final String f12958z = StubApp.getString2(4554);

    static {
        String string2 = StubApp.getString2(948);
        f12933X = new ArrayList();
        for (Field field : i.class.getFields()) {
            if (Modifier.isFinal(field.getModifiers())) {
                try {
                    f12933X.add(field.get(null).toString());
                } catch (IllegalAccessException e10) {
                    Log.e(string2, e10.getMessage(), e10);
                } catch (IllegalArgumentException e11) {
                    Log.e(string2, e11.getMessage(), e11);
                }
            }
        }
        Collections.sort(f12933X);
    }

    private i() {
    }
}
