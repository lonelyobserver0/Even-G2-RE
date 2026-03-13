package com.google.protobuf;

import com.stub.StubApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public static final E f12085a;

    /* renamed from: b, reason: collision with root package name */
    public static final E f12086b;

    /* renamed from: c, reason: collision with root package name */
    public static final E f12087c;

    /* renamed from: d, reason: collision with root package name */
    public static final E f12088d;

    /* renamed from: e, reason: collision with root package name */
    public static final E f12089e;

    /* renamed from: f, reason: collision with root package name */
    public static final E f12090f;

    /* renamed from: g, reason: collision with root package name */
    public static final E f12091g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ E[] f12092h;

    static {
        E e10 = new E(StubApp.getString2(12617), 0);
        f12085a = e10;
        E e11 = new E(StubApp.getString2(12618), 1);
        f12086b = e11;
        E e12 = new E(StubApp.getString2(12619), 2);
        f12087c = e12;
        E e13 = new E(StubApp.getString2(12620), 3);
        f12088d = e13;
        E e14 = new E(StubApp.getString2(12621), 4);
        f12089e = e14;
        E e15 = new E(StubApp.getString2(12622), 5);
        f12090f = e15;
        E e16 = new E(StubApp.getString2(12623), 6);
        f12091g = e16;
        f12092h = new E[]{e10, e11, e12, e13, e14, e15, e16};
    }

    public static E valueOf(String str) {
        return (E) Enum.valueOf(E.class, str);
    }

    public static E[] values() {
        return (E[]) f12092h.clone();
    }
}
