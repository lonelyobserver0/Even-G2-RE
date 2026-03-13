package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.d0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0602d0 extends AbstractRunnableC0637k0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f11471e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0657o0 f11472f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0602d0(C0657o0 c0657o0, long j) {
        super(c0657o0, true);
        this.f11471e = j;
        Objects.requireNonNull(c0657o0);
        this.f11472f = c0657o0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0637k0
    public final void a() {
        J j = this.f11472f.f11640f;
        S3.D.h(j);
        j.setSessionTimeoutDuration(this.f11471e);
    }
}
