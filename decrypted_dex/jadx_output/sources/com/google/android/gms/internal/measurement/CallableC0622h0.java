package com.google.android.gms.internal.measurement;

import com.stub.StubApp;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.measurement.h0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class CallableC0622h0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CallableC0622h0 f11578a = new CallableC0622h0();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C0703x2 c0703x2 = new C0703x2(StubApp.getString2(1301), 4);
        HashMap hashMap = c0703x2.f11577b;
        String string2 = StubApp.getString2(12070);
        hashMap.put(string2, new C0703x2(string2, 3));
        return c0703x2;
    }
}
