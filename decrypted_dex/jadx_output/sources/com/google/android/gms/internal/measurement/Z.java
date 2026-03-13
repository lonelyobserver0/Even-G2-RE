package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class Z extends AbstractRunnableC0637k0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11432e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f11433f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f11434g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0657o0 f11435h;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Z(C0657o0 c0657o0, String str, String str2, Object obj, int i3) {
        super(c0657o0, true);
        this.f11432e = i3;
        this.f11433f = str;
        this.f11434g = str2;
        this.j = obj;
        this.f11435h = c0657o0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0637k0
    public final void a() {
        switch (this.f11432e) {
            case 0:
                J j = this.f11435h.f11640f;
                S3.D.h(j);
                j.clearConditionalUserProperty(this.f11433f, this.f11434g, (Bundle) this.j);
                break;
            case 1:
                J j3 = this.f11435h.f11640f;
                S3.D.h(j3);
                j3.getConditionalUserProperties(this.f11433f, this.f11434g, (G) this.j);
                break;
            default:
                J j10 = this.f11435h.f11640f;
                S3.D.h(j10);
                j10.setCurrentScreenByScionActivityInfo((W) this.j, this.f11433f, this.f11434g, this.f11597a);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0637k0
    public void b() {
        switch (this.f11432e) {
            case 1:
                ((G) this.j).y(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(C0657o0 c0657o0, W w10, String str, String str2) {
        super(c0657o0, true);
        this.f11432e = 2;
        this.j = w10;
        this.f11433f = str;
        this.f11434g = str2;
        Objects.requireNonNull(c0657o0);
        this.f11435h = c0657o0;
    }
}
