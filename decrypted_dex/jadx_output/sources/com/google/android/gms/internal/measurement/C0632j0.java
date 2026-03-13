package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.j0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0632j0 extends AbstractRunnableC0637k0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f11590e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0657o0 f11591f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0632j0(C0657o0 c0657o0, boolean z2) {
        super(c0657o0, true);
        this.f11590e = z2;
        Objects.requireNonNull(c0657o0);
        this.f11591f = c0657o0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0637k0
    public final void a() {
        J j = this.f11591f.f11640f;
        S3.D.h(j);
        j.setDataCollectionEnabled(this.f11590e);
    }
}
