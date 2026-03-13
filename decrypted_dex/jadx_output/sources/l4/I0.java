package l4;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class I0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f16106a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f16107b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f16108c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f16109d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f16110e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f16111f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f16112g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ P0 f16113h;

    public I0(P0 p02, String str, String str2, long j, Bundle bundle, boolean z2, boolean z10, boolean z11) {
        this.f16106a = str;
        this.f16107b = str2;
        this.f16108c = j;
        this.f16109d = bundle;
        this.f16110e = z2;
        this.f16111f = z10;
        this.f16112g = z11;
        Objects.requireNonNull(p02);
        this.f16113h = p02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16113h.t(this.f16106a, this.f16107b, this.f16108c, this.f16109d, this.f16110e, this.f16111f, this.f16112g);
    }
}
