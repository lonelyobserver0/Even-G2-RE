package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class T2 {

    /* renamed from: a, reason: collision with root package name */
    public final Unsafe f11373a;

    public T2(Unsafe unsafe) {
        this.f11373a = unsafe;
    }

    public abstract void a(Object obj, long j, byte b2);

    public abstract boolean b(long j, Object obj);

    public abstract void c(Object obj, long j, boolean z2);

    public abstract float d(long j, Object obj);

    public abstract void e(Object obj, long j, float f10);

    public abstract double f(long j, Object obj);

    public abstract void g(Object obj, long j, double d8);
}
