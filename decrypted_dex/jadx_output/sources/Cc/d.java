package Cc;

import Ac.o;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import wc.t;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class d extends b {

    /* renamed from: d, reason: collision with root package name */
    public final t f1196d;

    /* renamed from: e, reason: collision with root package name */
    public long f1197e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1198f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h f1199g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h this$0, t url) {
        super(this$0);
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f1199g = this$0;
        this.f1196d = url;
        this.f1197e = -1L;
        this.f1198f = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f1191b) {
            return;
        }
        if (this.f1198f) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (!xc.b.h(this)) {
                ((o) this.f1199g.f1211e).k();
                a();
            }
        }
        this.f1191b = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a1, code lost:
    
        if (r10.f1198f == false) goto L30;
     */
    @Override // Cc.b, Kc.H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long n(long r11, Kc.C0101h r13) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Cc.d.n(long, Kc.h):long");
    }
}
