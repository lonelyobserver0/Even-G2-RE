package l4;

import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class Y0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ X0 f16326a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ X0 f16327b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f16328c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f16329d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1162a1 f16330e;

    public Y0(C1162a1 c1162a1, X0 x02, X0 x03, long j, boolean z2) {
        this.f16326a = x02;
        this.f16327b = x03;
        this.f16328c = j;
        this.f16329d = z2;
        Objects.requireNonNull(c1162a1);
        this.f16330e = c1162a1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16330e.u(this.f16326a, this.f16327b, this.f16328c, this.f16329d, null);
    }
}
