package Dc;

import Kc.C0101h;
import Kc.InterfaceC0103j;
import com.stub.StubApp;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;
import kotlin.UByte;
import kotlin.Unit;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class v implements Closeable {

    /* renamed from: d, reason: collision with root package name */
    public static final Logger f1654d;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0103j f1655a;

    /* renamed from: b, reason: collision with root package name */
    public final u f1656b;

    /* renamed from: c, reason: collision with root package name */
    public final C0055d f1657c;

    static {
        Logger logger = Logger.getLogger(g.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(Http2::class.java.name)");
        f1654d = logger;
    }

    public v(InterfaceC0103j source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f1655a = source;
        u uVar = new u(source);
        this.f1656b = uVar;
        this.f1657c = new C0055d(uVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:160:0x028f, code lost:
    
        throw new java.io.IOException(kotlin.jvm.internal.Intrinsics.stringPlus("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", java.lang.Integer.valueOf(r9)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(boolean r20, Dc.l r21) {
        /*
            Method dump skipped, instructions count: 1038
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Dc.v.a(boolean, Dc.l):boolean");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f1655a.close();
    }

    public final void d(l lVar, int i3, int i10, int i11) {
        int i12;
        boolean z2;
        boolean z10;
        long j;
        if (i11 == 0) {
            throw new IOException(StubApp.getString2(25199));
        }
        boolean z11 = (i10 & 1) != 0;
        if ((i10 & 32) != 0) {
            throw new IOException(StubApp.getString2(25198));
        }
        if ((i10 & 8) != 0) {
            byte readByte = this.f1655a.readByte();
            byte[] bArr = xc.b.f23179a;
            i12 = readByte & UByte.MAX_VALUE;
        } else {
            i12 = 0;
        }
        int a3 = t.a(i3, i10, i12);
        InterfaceC0103j source = this.f1655a;
        Intrinsics.checkNotNullParameter(source, "source");
        lVar.f1595b.getClass();
        if (i11 != 0 && (i11 & 1) == 0) {
            r rVar = lVar.f1595b;
            rVar.getClass();
            Intrinsics.checkNotNullParameter(source, "source");
            C0101h c0101h = new C0101h();
            long j3 = a3;
            source.D(j3);
            source.n(j3, c0101h);
            rVar.j.c(new m(rVar.f1620c + '[' + i11 + StubApp.getString2(25197), rVar, i11, c0101h, a3, z11), 0L);
        } else {
            z e10 = lVar.f1595b.e(i11);
            if (e10 == null) {
                lVar.f1595b.A(i11, EnumC0053b.f1550c);
                long j10 = a3;
                lVar.f1595b.p(j10);
                source.skip(j10);
            } else {
                Intrinsics.checkNotNullParameter(source, "source");
                byte[] bArr2 = xc.b.f23179a;
                x xVar = e10.f1677i;
                long j11 = a3;
                xVar.getClass();
                Intrinsics.checkNotNullParameter(source, "source");
                while (true) {
                    if (j11 <= 0) {
                        break;
                    }
                    synchronized (xVar.f1667f) {
                        z2 = xVar.f1663b;
                        z10 = xVar.f1665d.f3819b + j11 > xVar.f1662a;
                        Unit unit = Unit.INSTANCE;
                    }
                    if (z10) {
                        source.skip(j11);
                        xVar.f1667f.e(EnumC0053b.f1552e);
                        break;
                    }
                    if (z2) {
                        source.skip(j11);
                        break;
                    }
                    long n10 = source.n(j11, xVar.f1664c);
                    if (n10 == -1) {
                        throw new EOFException();
                    }
                    j11 -= n10;
                    z zVar = xVar.f1667f;
                    synchronized (zVar) {
                        if (xVar.f1666e) {
                            C0101h c0101h2 = xVar.f1664c;
                            j = c0101h2.f3819b;
                            c0101h2.skip(j);
                        } else {
                            C0101h c0101h3 = xVar.f1665d;
                            boolean z12 = c0101h3.f3819b == 0;
                            c0101h3.t(xVar.f1664c);
                            if (z12) {
                                zVar.notifyAll();
                            }
                            j = 0;
                        }
                    }
                    if (j > 0) {
                        xVar.a(j);
                    }
                }
                if (z11) {
                    e10.j(xc.b.f23180b, true);
                }
            }
        }
        this.f1655a.skip(i12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e3, code lost:
    
        throw new java.io.IOException(kotlin.jvm.internal.Intrinsics.stringPlus("Invalid dynamic table size update ", java.lang.Integer.valueOf(r6.f1566a)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List e(int r6, int r7, int r8, int r9) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Dc.v.e(int, int, int, int):java.util.List");
    }

    public final void h(l lVar, int i3, int i10, int i11) {
        int i12;
        int i13 = 1;
        if (i11 == 0) {
            throw new IOException(StubApp.getString2(25203));
        }
        boolean z2 = false;
        boolean z10 = (i10 & 1) != 0;
        if ((i10 & 8) != 0) {
            byte readByte = this.f1655a.readByte();
            byte[] bArr = xc.b.f23179a;
            i12 = readByte & UByte.MAX_VALUE;
        } else {
            i12 = 0;
        }
        if ((i10 & 32) != 0) {
            InterfaceC0103j interfaceC0103j = this.f1655a;
            interfaceC0103j.readInt();
            interfaceC0103j.readByte();
            byte[] bArr2 = xc.b.f23179a;
            i3 -= 5;
        }
        List requestHeaders = e(t.a(i3, i10, i12), i12, i10, i11);
        Intrinsics.checkNotNullParameter(requestHeaders, "headerBlock");
        lVar.f1595b.getClass();
        if (i11 != 0 && (i11 & 1) == 0) {
            z2 = true;
        }
        if (z2) {
            r rVar = lVar.f1595b;
            rVar.getClass();
            Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
            rVar.j.c(new n(rVar.f1620c + '[' + i11 + StubApp.getString2(25201), rVar, i11, requestHeaders, z10), 0L);
            return;
        }
        r rVar2 = lVar.f1595b;
        synchronized (rVar2) {
            z e10 = rVar2.e(i11);
            if (e10 != null) {
                Unit unit = Unit.INSTANCE;
                e10.j(xc.b.u(requestHeaders), z10);
                return;
            }
            if (rVar2.f1623f) {
                return;
            }
            if (i11 <= rVar2.f1621d) {
                return;
            }
            if (i11 % 2 == rVar2.f1622e % 2) {
                return;
            }
            z zVar = new z(i11, rVar2, false, z10, xc.b.u(requestHeaders));
            rVar2.f1621d = i11;
            rVar2.f1619b.put(Integer.valueOf(i11), zVar);
            rVar2.f1624g.e().c(new j(rVar2.f1620c + '[' + i11 + StubApp.getString2("25202"), rVar2, zVar, i13), 0L);
        }
    }

    public final void k(l lVar, int i3, int i10, int i11) {
        int i12;
        if (i11 == 0) {
            throw new IOException(StubApp.getString2(25205));
        }
        if ((i10 & 8) != 0) {
            byte readByte = this.f1655a.readByte();
            byte[] bArr = xc.b.f23179a;
            i12 = readByte & UByte.MAX_VALUE;
        } else {
            i12 = 0;
        }
        int readInt = this.f1655a.readInt() & IntCompanionObject.MAX_VALUE;
        List requestHeaders = e(t.a(i3 - 4, i10, i12), i12, i10, i11);
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        r rVar = lVar.f1595b;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        synchronized (rVar) {
            if (rVar.f1617C.contains(Integer.valueOf(readInt))) {
                rVar.A(readInt, EnumC0053b.f1550c);
                return;
            }
            rVar.f1617C.add(Integer.valueOf(readInt));
            rVar.j.c(new n(rVar.f1620c + '[' + readInt + StubApp.getString2(25204), rVar, readInt, requestHeaders), 0L);
        }
    }
}
