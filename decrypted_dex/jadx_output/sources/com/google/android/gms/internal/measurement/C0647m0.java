package com.google.android.gms.internal.measurement;

import android.app.Activity;

/* renamed from: com.google.android.gms.internal.measurement.m0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0647m0 extends AbstractRunnableC0637k0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11615e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Activity f11616f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0652n0 f11617g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0647m0(C0652n0 c0652n0, Activity activity, int i3) {
        super(c0652n0.f11627a, true);
        this.f11615e = i3;
        switch (i3) {
            case 1:
                this.f11616f = activity;
                this.f11617g = c0652n0;
                super(c0652n0.f11627a, true);
                break;
            case 2:
                this.f11616f = activity;
                this.f11617g = c0652n0;
                super(c0652n0.f11627a, true);
                break;
            case 3:
                this.f11616f = activity;
                this.f11617g = c0652n0;
                super(c0652n0.f11627a, true);
                break;
            case 4:
                this.f11616f = activity;
                this.f11617g = c0652n0;
                super(c0652n0.f11627a, true);
                break;
            default:
                this.f11616f = activity;
                this.f11617g = c0652n0;
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0637k0
    public final void a() {
        switch (this.f11615e) {
            case 0:
                J j = this.f11617g.f11627a.f11640f;
                S3.D.h(j);
                j.onActivityStartedByScionActivityInfo(W.d(this.f11616f), this.f11598b);
                break;
            case 1:
                J j3 = this.f11617g.f11627a.f11640f;
                S3.D.h(j3);
                j3.onActivityResumedByScionActivityInfo(W.d(this.f11616f), this.f11598b);
                break;
            case 2:
                J j10 = this.f11617g.f11627a.f11640f;
                S3.D.h(j10);
                j10.onActivityPausedByScionActivityInfo(W.d(this.f11616f), this.f11598b);
                break;
            case 3:
                J j11 = this.f11617g.f11627a.f11640f;
                S3.D.h(j11);
                j11.onActivityStoppedByScionActivityInfo(W.d(this.f11616f), this.f11598b);
                break;
            default:
                J j12 = this.f11617g.f11627a.f11640f;
                S3.D.h(j12);
                j12.onActivityDestroyedByScionActivityInfo(W.d(this.f11616f), this.f11598b);
                break;
        }
    }
}
