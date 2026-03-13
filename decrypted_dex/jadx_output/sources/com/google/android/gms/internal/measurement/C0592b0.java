package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.b0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0592b0 extends AbstractRunnableC0637k0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11450e = 2;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0657o0 f11451f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f11452g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0592b0(C0657o0 c0657o0, BinderC0642l0 binderC0642l0) {
        super(c0657o0, true);
        this.f11452g = binderC0642l0;
        Objects.requireNonNull(c0657o0);
        this.f11451f = c0657o0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0637k0
    public final void a() {
        switch (this.f11450e) {
            case 0:
                J j = this.f11451f.f11640f;
                S3.D.h(j);
                j.setMeasurementEnabled(((Boolean) this.f11452g).booleanValue(), this.f11597a);
                break;
            case 1:
                J j3 = this.f11451f.f11640f;
                S3.D.h(j3);
                j3.retrieveAndUploadBatches(new BinderC0612f0(this, (l4.O0) this.f11452g));
                break;
            default:
                J j10 = this.f11451f.f11640f;
                S3.D.h(j10);
                j10.registerOnMeasurementEventListener((BinderC0642l0) this.f11452g);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0592b0(C0657o0 c0657o0, Boolean bool) {
        super(c0657o0, true);
        this.f11452g = bool;
        Objects.requireNonNull(c0657o0);
        this.f11451f = c0657o0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0592b0(C0657o0 c0657o0, l4.O0 o02) {
        super(c0657o0, true);
        this.f11452g = o02;
        this.f11451f = c0657o0;
    }
}
