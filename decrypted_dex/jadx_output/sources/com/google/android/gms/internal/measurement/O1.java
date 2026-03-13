package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.stub.StubApp;
import t.C1692e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class O1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1692e f11322a = new C1692e(0);

    public static synchronized Uri a() {
        synchronized (O1.class) {
            C1692e c1692e = f11322a;
            String string2 = StubApp.getString2("11775");
            Uri uri = (Uri) c1692e.get(string2);
            if (uri != null) {
                return uri;
            }
            Uri parse = Uri.parse(StubApp.getString2("11776").concat(String.valueOf(Uri.encode(string2))));
            c1692e.put(string2, parse);
            return parse;
        }
    }
}
