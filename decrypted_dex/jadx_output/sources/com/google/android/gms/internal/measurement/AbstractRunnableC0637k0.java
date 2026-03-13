package com.google.android.gms.internal.measurement;

import android.os.SystemClock;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.k0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class AbstractRunnableC0637k0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final long f11597a;

    /* renamed from: b, reason: collision with root package name */
    public final long f11598b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11599c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0657o0 f11600d;

    public AbstractRunnableC0637k0(C0657o0 c0657o0, boolean z2) {
        Objects.requireNonNull(c0657o0);
        this.f11600d = c0657o0;
        this.f11597a = System.currentTimeMillis();
        this.f11598b = SystemClock.elapsedRealtime();
        this.f11599c = z2;
    }

    public abstract void a();

    public void b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0657o0 c0657o0 = this.f11600d;
        if (c0657o0.f11639e) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e10) {
            c0657o0.b(e10, false, this.f11599c);
            b();
        }
    }
}
