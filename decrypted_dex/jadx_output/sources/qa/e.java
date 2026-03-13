package qa;

import Xa.h;
import com.stub.StubApp;
import java.io.Closeable;
import java.io.IOException;
import java.util.BitSet;
import kotlin.jvm.internal.IntCompanionObject;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class e implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f20112a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public volatile int f20113b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final BitSet f20114c;

    /* renamed from: d, reason: collision with root package name */
    public volatile byte[][] f20115d;

    /* renamed from: e, reason: collision with root package name */
    public final int f20116e;

    /* renamed from: f, reason: collision with root package name */
    public final int f20117f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f20118g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f20119h;

    public e(R4.b bVar) {
        BitSet bitSet = new BitSet();
        this.f20114c = bitSet;
        this.f20119h = false;
        boolean z2 = bVar.f6177b;
        this.f20118g = !z2;
        int i3 = IntCompanionObject.MAX_VALUE;
        this.f20117f = IntCompanionObject.MAX_VALUE;
        i3 = z2 ? i3 : 0;
        this.f20116e = i3;
        this.f20115d = new byte[z2 ? 100000 : i3][];
        bitSet.set(0, this.f20115d.length);
    }

    public final void a() {
        if (this.f20119h) {
            throw new IOException(StubApp.getString2(22331));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f20112a) {
            try {
                if (this.f20119h) {
                    return;
                }
                this.f20119h = true;
                synchronized (this.f20114c) {
                    this.f20114c.clear();
                    this.f20113b = 0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        synchronized (this.f20112a) {
            try {
                a();
                if (this.f20113b >= this.f20117f) {
                    return;
                }
                if (!this.f20118g) {
                    int length = this.f20115d.length;
                    int min = (int) Math.min(length * 2, 2147483647L);
                    if (min > length) {
                        byte[][] bArr = new byte[min][];
                        System.arraycopy(this.f20115d, 0, bArr, 0, length);
                        this.f20115d = bArr;
                        this.f20114c.set(length, min);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final byte[] e(int i3) {
        String string2 = StubApp.getString2(22332);
        if (i3 < 0 || i3 >= this.f20113b) {
            a();
            StringBuilder u2 = h.u(i3, StubApp.getString2(22336), StubApp.getString2(22337));
            u2.append(this.f20113b - 1);
            throw new IOException(u2.toString());
        }
        if (i3 < this.f20116e) {
            byte[] bArr = this.f20115d[i3];
            if (bArr != null) {
                return bArr;
            }
            a();
            throw new IOException(h.g(i3, StubApp.getString2(22333), StubApp.getString2(22334)));
        }
        synchronized (this.f20112a) {
            a();
            throw new IOException(string2 + i3 + StubApp.getString2("22335"));
        }
    }

    public final void h(int i3, byte[] bArr) {
        if (i3 < 0 || i3 >= this.f20113b) {
            a();
            StringBuilder u2 = h.u(i3, StubApp.getString2(22336), StubApp.getString2(22337));
            u2.append(this.f20113b - 1);
            throw new IOException(u2.toString());
        }
        if (bArr.length != 4096) {
            throw new IOException(AbstractC1482f.f(bArr.length, StubApp.getString2(22339), new StringBuilder(StubApp.getString2(22338))));
        }
        if (i3 >= this.f20116e) {
            synchronized (this.f20112a) {
                a();
                throw null;
            }
        }
        if (this.f20118g) {
            this.f20115d[i3] = bArr;
        } else {
            synchronized (this.f20112a) {
                this.f20115d[i3] = bArr;
            }
        }
        a();
    }
}
