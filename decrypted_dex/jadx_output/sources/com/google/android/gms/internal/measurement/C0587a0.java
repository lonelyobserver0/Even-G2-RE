package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.a0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0587a0 extends AbstractRunnableC0637k0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11441e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f11442f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0657o0 f11443g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0587a0(C0657o0 c0657o0, String str, int i3) {
        super(c0657o0, true);
        this.f11441e = i3;
        this.f11442f = str;
        this.f11443g = c0657o0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0637k0
    public final void a() {
        switch (this.f11441e) {
            case 0:
                J j = this.f11443g.f11640f;
                S3.D.h(j);
                j.setUserId(this.f11442f, this.f11597a);
                break;
            case 1:
                J j3 = this.f11443g.f11640f;
                S3.D.h(j3);
                j3.beginAdUnitExposure(this.f11442f, this.f11598b);
                break;
            default:
                J j10 = this.f11443g.f11640f;
                S3.D.h(j10);
                j10.endAdUnitExposure(this.f11442f, this.f11598b);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0587a0(C0657o0 c0657o0, String str) {
        super(c0657o0, true);
        this.f11441e = 0;
        this.f11442f = str;
        Objects.requireNonNull(c0657o0);
        this.f11443g = c0657o0;
    }
}
