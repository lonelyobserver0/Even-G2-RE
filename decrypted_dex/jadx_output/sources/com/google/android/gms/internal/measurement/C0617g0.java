package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.g0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0617g0 extends AbstractRunnableC0637k0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11567e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ G f11568f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0657o0 f11569g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0617g0(C0657o0 c0657o0, G g10, int i3, boolean z2) {
        super(c0657o0, true);
        this.f11567e = i3;
        this.f11568f = g10;
        this.f11569g = c0657o0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0637k0
    public final void a() {
        switch (this.f11567e) {
            case 0:
                J j = this.f11569g.f11640f;
                S3.D.h(j);
                j.getGmpAppId(this.f11568f);
                break;
            case 1:
                J j3 = this.f11569g.f11640f;
                S3.D.h(j3);
                j3.getCachedAppInstanceId(this.f11568f);
                break;
            case 2:
                J j10 = this.f11569g.f11640f;
                S3.D.h(j10);
                j10.generateEventId(this.f11568f);
                break;
            case 3:
                J j11 = this.f11569g.f11640f;
                S3.D.h(j11);
                j11.getCurrentScreenName(this.f11568f);
                break;
            case 4:
                J j12 = this.f11569g.f11640f;
                S3.D.h(j12);
                j12.getCurrentScreenClass(this.f11568f);
                break;
            case 5:
                J j13 = this.f11569g.f11640f;
                S3.D.h(j13);
                j13.getAppInstanceId(this.f11568f);
                break;
            default:
                J j14 = this.f11569g.f11640f;
                S3.D.h(j14);
                j14.getSessionId(this.f11568f);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0637k0
    public final void b() {
        switch (this.f11567e) {
            case 0:
                this.f11568f.y(null);
                break;
            case 1:
                this.f11568f.y(null);
                break;
            case 2:
                this.f11568f.y(null);
                break;
            case 3:
                this.f11568f.y(null);
                break;
            case 4:
                this.f11568f.y(null);
                break;
            case 5:
                this.f11568f.y(null);
                break;
            default:
                this.f11568f.y(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0617g0(C0657o0 c0657o0, G g10, int i3) {
        super(c0657o0, true);
        this.f11567e = i3;
        switch (i3) {
            case 6:
                this.f11568f = g10;
                Objects.requireNonNull(c0657o0);
                this.f11569g = c0657o0;
                super(c0657o0, true);
                break;
            default:
                this.f11568f = g10;
                Objects.requireNonNull(c0657o0);
                this.f11569g = c0657o0;
                break;
        }
    }
}
