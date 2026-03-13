package com.google.protobuf;

import com.stub.StubApp;

/* renamed from: com.google.protobuf.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class AbstractC0723e {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f12147a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f12148b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName(StubApp.getString2(12641));
        } catch (Throwable unused) {
            cls = null;
        }
        f12147a = cls;
        try {
            cls2 = Class.forName(StubApp.getString2(12642));
        } catch (Throwable unused2) {
        }
        f12148b = cls2 != null;
    }

    public static boolean a() {
        return (f12147a == null || f12148b) ? false : true;
    }
}
