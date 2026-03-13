package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class Y extends AbstractRunnableC0637k0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11414e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Bundle f11415f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0657o0 f11416g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(C0657o0 c0657o0, Bundle bundle, int i3) {
        super(c0657o0, true);
        this.f11414e = i3;
        switch (i3) {
            case 1:
                this.f11415f = bundle;
                Objects.requireNonNull(c0657o0);
                this.f11416g = c0657o0;
                super(c0657o0, true);
                break;
            case 2:
                this.f11415f = bundle;
                Objects.requireNonNull(c0657o0);
                this.f11416g = c0657o0;
                super(c0657o0, true);
                break;
            default:
                this.f11415f = bundle;
                this.f11416g = c0657o0;
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0637k0
    public final void a() {
        switch (this.f11414e) {
            case 0:
                J j = this.f11416g.f11640f;
                S3.D.h(j);
                j.setConditionalUserProperty(this.f11415f, this.f11597a);
                break;
            case 1:
                J j3 = this.f11416g.f11640f;
                S3.D.h(j3);
                j3.setConsentThirdParty(this.f11415f, this.f11597a);
                break;
            default:
                J j10 = this.f11416g.f11640f;
                S3.D.h(j10);
                j10.setDefaultEventParameters(this.f11415f);
                break;
        }
    }
}
