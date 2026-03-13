package Cc;

import Kc.A;
import Kc.AbstractC0095b;
import Kc.C;
import Kc.C0101h;
import Kc.D;
import Kc.F;
import Kc.J;
import Kc.p;
import com.stub.StubApp;
import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class f implements F {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1202a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1203b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1204c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1205d;

    public f(C0101h sink, Deflater deflater) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(deflater, "deflater");
        A sink2 = AbstractC0095b.c(sink);
        Intrinsics.checkNotNullParameter(sink2, "sink");
        Intrinsics.checkNotNullParameter(deflater, "deflater");
        this.f1204c = sink2;
        this.f1205d = deflater;
    }

    @Override // Kc.F
    public final void E(long j, C0101h c0101h) {
        Object obj = this.f1205d;
        String string2 = StubApp.getString2(376);
        switch (this.f1202a) {
            case 0:
                Intrinsics.checkNotNullParameter(c0101h, string2);
                if (this.f1203b) {
                    throw new IllegalStateException(StubApp.getString2(1551));
                }
                long j3 = c0101h.f3819b;
                byte[] bArr = xc.b.f23179a;
                if (j < 0 || 0 > j3 || j3 < j) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                ((A) ((h) obj).f1208b).E(j, c0101h);
                return;
            default:
                Intrinsics.checkNotNullParameter(c0101h, string2);
                AbstractC0095b.f(c0101h.f3819b, 0L, j);
                while (j > 0) {
                    C c10 = c0101h.f3818a;
                    Intrinsics.checkNotNull(c10);
                    int min = (int) Math.min(j, c10.f3778c - c10.f3777b);
                    ((Deflater) obj).setInput(c10.f3776a, c10.f3777b, min);
                    a(false);
                    long j10 = min;
                    c0101h.f3819b -= j10;
                    int i3 = c10.f3777b + min;
                    c10.f3777b = i3;
                    if (i3 == c10.f3778c) {
                        c0101h.f3818a = c10.a();
                        D.a(c10);
                    }
                    j -= j10;
                }
                return;
        }
    }

    public void a(boolean z2) {
        C M5;
        int deflate;
        A a3 = (A) this.f1204c;
        C0101h c0101h = a3.f3771b;
        while (true) {
            M5 = c0101h.M(1);
            Deflater deflater = (Deflater) this.f1205d;
            byte[] bArr = M5.f3776a;
            if (z2) {
                try {
                    int i3 = M5.f3778c;
                    deflate = deflater.deflate(bArr, i3, 8192 - i3, 2);
                } catch (NullPointerException e10) {
                    throw new IOException(StubApp.getString2(25081), e10);
                }
            } else {
                int i10 = M5.f3778c;
                deflate = deflater.deflate(bArr, i10, 8192 - i10);
            }
            if (deflate > 0) {
                M5.f3778c += deflate;
                c0101h.f3819b += deflate;
                a3.a();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (M5.f3777b == M5.f3778c) {
            c0101h.f3818a = M5.a();
            D.a(M5);
        }
    }

    @Override // Kc.F
    public final J b() {
        switch (this.f1202a) {
            case 0:
                return (p) this.f1204c;
            default:
                return ((A) this.f1204c).f3770a.b();
        }
    }

    @Override // Kc.F, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f1202a) {
            case 0:
                if (this.f1203b) {
                    return;
                }
                this.f1203b = true;
                h hVar = (h) this.f1205d;
                h.i(hVar, (p) this.f1204c);
                hVar.f1209c = 3;
                return;
            default:
                Deflater deflater = (Deflater) this.f1205d;
                if (this.f1203b) {
                    return;
                }
                try {
                    deflater.finish();
                    a(false);
                    th = null;
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    deflater.end();
                } catch (Throwable th2) {
                    if (th == null) {
                        th = th2;
                    }
                }
                try {
                    ((A) this.f1204c).close();
                } catch (Throwable th3) {
                    if (th == null) {
                        th = th3;
                    }
                }
                this.f1203b = true;
                if (th != null) {
                    throw th;
                }
                return;
        }
    }

    @Override // Kc.F, java.io.Flushable
    public final void flush() {
        switch (this.f1202a) {
            case 0:
                if (!this.f1203b) {
                    ((A) ((h) this.f1205d).f1208b).flush();
                    break;
                }
                break;
            default:
                a(true);
                ((A) this.f1204c).flush();
                break;
        }
    }

    public String toString() {
        switch (this.f1202a) {
            case 1:
                return StubApp.getString2(25082) + ((A) this.f1204c) + ')';
            default:
                return super.toString();
        }
    }

    public f(h this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this.f1205d = this$0;
        this.f1204c = new p(((A) this$0.f1208b).f3770a.b());
    }
}
