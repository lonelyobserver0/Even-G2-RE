package Jc;

import Kc.AbstractC0095b;
import Kc.C0101h;
import Kc.r;
import java.io.Closeable;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class a implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3473a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3474b;

    /* renamed from: c, reason: collision with root package name */
    public final C0101h f3475c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3476d;

    /* renamed from: e, reason: collision with root package name */
    public final Closeable f3477e;

    public a(boolean z2, int i3) {
        this.f3473a = i3;
        switch (i3) {
            case 1:
                this.f3474b = z2;
                C0101h source = new C0101h();
                this.f3475c = source;
                Inflater inflater = new Inflater(true);
                this.f3476d = inflater;
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(inflater, "inflater");
                this.f3477e = new r(AbstractC0095b.d(source), inflater);
                break;
            default:
                this.f3474b = z2;
                C0101h c0101h = new C0101h();
                this.f3475c = c0101h;
                Deflater deflater = new Deflater(-1, true);
                this.f3476d = deflater;
                this.f3477e = new Cc.f(c0101h, deflater);
                break;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f3473a) {
            case 0:
                ((Cc.f) this.f3477e).close();
                break;
            default:
                ((r) this.f3477e).close();
                break;
        }
    }
}
