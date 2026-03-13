package Dc;

import Kc.C0101h;
import Kc.InterfaceC0102i;
import com.stub.StubApp;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class A implements Closeable {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f1533f = Logger.getLogger(g.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0102i f1534a;

    /* renamed from: b, reason: collision with root package name */
    public final C0101h f1535b;

    /* renamed from: c, reason: collision with root package name */
    public int f1536c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1537d;

    /* renamed from: e, reason: collision with root package name */
    public final C0056e f1538e;

    public A(InterfaceC0102i sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f1534a = sink;
        C0101h c0101h = new C0101h();
        this.f1535b = c0101h;
        this.f1536c = 16384;
        this.f1538e = new C0056e(c0101h);
    }

    public final synchronized void A(int i3, long j) {
        if (this.f1537d) {
            throw new IOException(StubApp.getString2("1551"));
        }
        if (j == 0 || j > 2147483647L) {
            throw new IllegalArgumentException(Intrinsics.stringPlus(StubApp.getString2("25088"), Long.valueOf(j)).toString());
        }
        e(i3, 4, 8, 0);
        this.f1534a.writeInt((int) j);
        this.f1534a.flush();
    }

    public final synchronized void a(E peerSettings) {
        try {
            Intrinsics.checkNotNullParameter(peerSettings, "peerSettings");
            if (this.f1537d) {
                throw new IOException(StubApp.getString2("1551"));
            }
            int i3 = this.f1536c;
            int i10 = peerSettings.f1546a;
            if ((i10 & 32) != 0) {
                i3 = peerSettings.f1547b[5];
            }
            this.f1536c = i3;
            if (((i10 & 2) != 0 ? peerSettings.f1547b[1] : -1) != -1) {
                C0056e c0056e = this.f1538e;
                int i11 = (i10 & 2) != 0 ? peerSettings.f1547b[1] : -1;
                c0056e.getClass();
                int min = Math.min(i11, 16384);
                int i12 = c0056e.f1576d;
                if (i12 != min) {
                    if (min < i12) {
                        c0056e.f1574b = Math.min(c0056e.f1574b, min);
                    }
                    c0056e.f1575c = true;
                    c0056e.f1576d = min;
                    int i13 = c0056e.f1580h;
                    if (min < i13) {
                        if (min == 0) {
                            ArraysKt___ArraysJvmKt.fill$default(c0056e.f1577e, (Object) null, 0, 0, 6, (Object) null);
                            c0056e.f1578f = c0056e.f1577e.length - 1;
                            c0056e.f1579g = 0;
                            c0056e.f1580h = 0;
                        } else {
                            c0056e.a(i13 - min);
                        }
                    }
                }
            }
            e(0, 0, 4, 1);
            this.f1534a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f1537d = true;
        this.f1534a.close();
    }

    public final synchronized void d(boolean z2, int i3, C0101h c0101h, int i10) {
        if (this.f1537d) {
            throw new IOException(StubApp.getString2("1551"));
        }
        e(i3, i10, 0, z2 ? 1 : 0);
        if (i10 > 0) {
            Intrinsics.checkNotNull(c0101h);
            this.f1534a.E(i10, c0101h);
        }
    }

    public final void e(int i3, int i10, int i11, int i12) {
        Level level = Level.FINE;
        Logger logger = f1533f;
        if (logger.isLoggable(level)) {
            logger.fine(g.a(i3, i10, i11, false, i12));
        }
        if (i10 > this.f1536c) {
            throw new IllegalArgumentException((StubApp.getString2(25089) + this.f1536c + StubApp.getString2(994) + i10).toString());
        }
        if ((Integer.MIN_VALUE & i3) != 0) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("reserved bit set: ", Integer.valueOf(i3)).toString());
        }
        byte[] bArr = xc.b.f23179a;
        InterfaceC0102i interfaceC0102i = this.f1534a;
        Intrinsics.checkNotNullParameter(interfaceC0102i, "<this>");
        interfaceC0102i.writeByte((i10 >>> 16) & 255);
        interfaceC0102i.writeByte((i10 >>> 8) & 255);
        interfaceC0102i.writeByte(i10 & 255);
        interfaceC0102i.writeByte(i11 & 255);
        interfaceC0102i.writeByte(i12 & 255);
        interfaceC0102i.writeInt(i3 & IntCompanionObject.MAX_VALUE);
    }

    public final synchronized void flush() {
        if (this.f1537d) {
            throw new IOException(StubApp.getString2("1551"));
        }
        this.f1534a.flush();
    }

    public final synchronized void h(int i3, EnumC0053b errorCode, byte[] debugData) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(debugData, "debugData");
        if (this.f1537d) {
            throw new IOException(StubApp.getString2("1551"));
        }
        if (errorCode.f1556a == -1) {
            throw new IllegalArgumentException(StubApp.getString2("25090"));
        }
        e(0, debugData.length + 8, 7, 0);
        this.f1534a.writeInt(i3);
        this.f1534a.writeInt(errorCode.f1556a);
        if (debugData.length != 0) {
            this.f1534a.write(debugData);
        }
        this.f1534a.flush();
    }

    public final synchronized void k(boolean z2, int i3, ArrayList headerBlock) {
        Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
        if (this.f1537d) {
            throw new IOException(StubApp.getString2("1551"));
        }
        this.f1538e.d(headerBlock);
        long j = this.f1535b.f3819b;
        long min = Math.min(this.f1536c, j);
        int i10 = j == min ? 4 : 0;
        if (z2) {
            i10 |= 1;
        }
        e(i3, (int) min, 1, i10);
        this.f1534a.E(min, this.f1535b);
        if (j > min) {
            long j3 = j - min;
            while (j3 > 0) {
                long min2 = Math.min(this.f1536c, j3);
                j3 -= min2;
                e(i3, (int) min2, 9, j3 == 0 ? 4 : 0);
                this.f1534a.E(min2, this.f1535b);
            }
        }
    }

    public final synchronized void p(int i3, int i10, boolean z2) {
        if (this.f1537d) {
            throw new IOException(StubApp.getString2("1551"));
        }
        e(0, 8, 6, z2 ? 1 : 0);
        this.f1534a.writeInt(i3);
        this.f1534a.writeInt(i10);
        this.f1534a.flush();
    }

    public final synchronized void v(int i3, EnumC0053b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (this.f1537d) {
            throw new IOException(StubApp.getString2("1551"));
        }
        if (errorCode.f1556a == -1) {
            throw new IllegalArgumentException(StubApp.getString2("353"));
        }
        e(i3, 4, 3, 0);
        this.f1534a.writeInt(errorCode.f1556a);
        this.f1534a.flush();
    }
}
