package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class X extends AbstractRunnableC0637k0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11402e = 2;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f11403f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f11404g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f11405h;
    public final /* synthetic */ C0657o0 j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f11406k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(C0657o0 c0657o0, String str, String str2, Bundle bundle, boolean z2) {
        super(c0657o0, true);
        this.f11403f = str;
        this.f11404g = str2;
        this.f11406k = bundle;
        this.f11405h = z2;
        Objects.requireNonNull(c0657o0);
        this.j = c0657o0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0637k0
    public final void a() {
        switch (this.f11402e) {
            case 0:
                J j = this.j.f11640f;
                S3.D.h(j);
                j.setUserProperty(this.f11403f, this.f11404g, new Z3.b(this.f11406k), this.f11405h, this.f11597a);
                break;
            case 1:
                J j3 = this.j.f11640f;
                S3.D.h(j3);
                j3.getUserProperties(this.f11403f, this.f11404g, this.f11405h, (G) this.f11406k);
                break;
            default:
                long j10 = this.f11597a;
                J j11 = this.j.f11640f;
                S3.D.h(j11);
                j11.logEvent(this.f11403f, this.f11404g, (Bundle) this.f11406k, this.f11405h, true, j10);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0637k0
    public void b() {
        switch (this.f11402e) {
            case 1:
                ((G) this.f11406k).y(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(C0657o0 c0657o0, String str, String str2, Object obj, boolean z2) {
        super(c0657o0, true);
        this.f11403f = str;
        this.f11404g = str2;
        this.f11406k = obj;
        this.f11405h = z2;
        Objects.requireNonNull(c0657o0);
        this.j = c0657o0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(C0657o0 c0657o0, String str, String str2, boolean z2, G g10) {
        super(c0657o0, true);
        this.f11403f = str;
        this.f11404g = str2;
        this.f11405h = z2;
        this.f11406k = g10;
        this.j = c0657o0;
    }
}
