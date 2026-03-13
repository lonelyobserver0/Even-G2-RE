package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.c0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0597c0 extends AbstractRunnableC0637k0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0657o0 f11461e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0597c0(C0657o0 c0657o0) {
        super(c0657o0, true);
        Objects.requireNonNull(c0657o0);
        this.f11461e = c0657o0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0637k0
    public final void a() {
        J j = this.f11461e.f11640f;
        S3.D.h(j);
        j.resetAnalyticsData(this.f11597a);
    }
}
