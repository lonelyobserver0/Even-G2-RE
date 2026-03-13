package Jc;

import Ac.n;
import Kc.B;
import Kc.C0101h;
import Kc.C0104k;
import Kc.H;
import com.stub.StubApp;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.UShort;
import kotlin.Unit;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.math.ec.Tnaf;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class h implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final B f3513a;

    /* renamed from: b, reason: collision with root package name */
    public final f f3514b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3515c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3516d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3517e;

    /* renamed from: f, reason: collision with root package name */
    public int f3518f;

    /* renamed from: g, reason: collision with root package name */
    public long f3519g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3520h;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3521k;

    /* renamed from: l, reason: collision with root package name */
    public final C0101h f3522l;

    /* renamed from: m, reason: collision with root package name */
    public final C0101h f3523m;

    /* renamed from: n, reason: collision with root package name */
    public a f3524n;

    /* renamed from: p, reason: collision with root package name */
    public final byte[] f3525p;

    public h(B source, f frameCallback, boolean z2, boolean z10) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(frameCallback, "frameCallback");
        this.f3513a = source;
        this.f3514b = frameCallback;
        this.f3515c = z2;
        this.f3516d = z10;
        this.f3522l = new C0101h();
        this.f3523m = new C0101h();
        this.f3525p = null;
    }

    public final void a() {
        String reason;
        short s10;
        h hVar;
        i iVar;
        long j = this.f3519g;
        if (j > 0) {
            this.f3513a.e(j, this.f3522l);
        }
        switch (this.f3518f) {
            case 8:
                C0101h c0101h = this.f3522l;
                long j3 = c0101h.f3819b;
                if (j3 == 1) {
                    throw new ProtocolException(StubApp.getString2(25310));
                }
                n nVar = null;
                if (j3 != 0) {
                    s10 = c0101h.readShort();
                    reason = this.f3522l.K();
                    String stringPlus = (s10 < 1000 || s10 >= 5000) ? Intrinsics.stringPlus("Code must be in range [1000,5000): ", Integer.valueOf(s10)) : ((1004 > s10 || s10 >= 1007) && (1015 > s10 || s10 >= 3000)) ? null : Xa.h.g(s10, StubApp.getString2(25299), StubApp.getString2(25300));
                    if (stringPlus != null) {
                        throw new ProtocolException(stringPlus);
                    }
                } else {
                    reason = "";
                    s10 = 1005;
                }
                f fVar = this.f3514b;
                Intrinsics.checkNotNullParameter(reason, "reason");
                if (s10 == -1) {
                    throw new IllegalArgumentException(StubApp.getString2(353));
                }
                synchronized (fVar) {
                    try {
                        if (fVar.f3502r != -1) {
                            throw new IllegalStateException(StubApp.getString2("25309"));
                        }
                        fVar.f3502r = s10;
                        fVar.f3503s = reason;
                        if (fVar.f3501q && fVar.f3499o.isEmpty()) {
                            n nVar2 = fVar.f3497m;
                            fVar.f3497m = null;
                            hVar = fVar.f3494i;
                            fVar.f3494i = null;
                            iVar = fVar.j;
                            fVar.j = null;
                            fVar.f3495k.e();
                            nVar = nVar2;
                        } else {
                            hVar = null;
                            iVar = null;
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                try {
                    fVar.f3486a.onClosing(fVar, s10, reason);
                    if (nVar != null) {
                        fVar.f3486a.onClosed(fVar, s10, reason);
                    }
                    this.f3517e = true;
                    return;
                } finally {
                    if (nVar != null) {
                        xc.b.c(nVar);
                    }
                    if (hVar != null) {
                        xc.b.c(hVar);
                    }
                    if (iVar != null) {
                        xc.b.c(iVar);
                    }
                }
            case 9:
                f fVar2 = this.f3514b;
                C0101h c0101h2 = this.f3522l;
                C0104k payload = c0101h2.f(c0101h2.f3819b);
                synchronized (fVar2) {
                    try {
                        Intrinsics.checkNotNullParameter(payload, "payload");
                        if (!fVar2.f3504t && (!fVar2.f3501q || !fVar2.f3499o.isEmpty())) {
                            fVar2.f3498n.add(payload);
                            fVar2.f();
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 10:
                f fVar3 = this.f3514b;
                C0101h c0101h3 = this.f3522l;
                C0104k payload2 = c0101h3.f(c0101h3.f3819b);
                synchronized (fVar3) {
                    Intrinsics.checkNotNullParameter(payload2, "payload");
                    fVar3.f3506v = false;
                }
                return;
            default:
                String string2 = StubApp.getString2(25308);
                int i3 = this.f3518f;
                byte[] bArr = xc.b.f23179a;
                String hexString = Integer.toHexString(i3);
                Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(this)");
                throw new ProtocolException(Intrinsics.stringPlus(string2, hexString));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a aVar = this.f3524n;
        if (aVar == null) {
            return;
        }
        aVar.close();
    }

    public final void d() {
        boolean z2;
        if (this.f3517e) {
            throw new IOException(StubApp.getString2(1551));
        }
        B b2 = this.f3513a;
        long h2 = b2.f3773a.b().h();
        H h4 = b2.f3773a;
        h4.b().b();
        try {
            byte readByte = b2.readByte();
            byte[] bArr = xc.b.f23179a;
            h4.b().g(h2, TimeUnit.NANOSECONDS);
            int i3 = readByte & 15;
            this.f3518f = i3;
            int i10 = 0;
            boolean z10 = (readByte & ByteCompanionObject.MIN_VALUE) != 0;
            this.f3520h = z10;
            boolean z11 = (readByte & 8) != 0;
            this.j = z11;
            if (z11 && !z10) {
                throw new ProtocolException(StubApp.getString2(25311));
            }
            boolean z12 = (readByte & 64) != 0;
            String string2 = StubApp.getString2(25312);
            if (i3 == 1 || i3 == 2) {
                if (!z12) {
                    z2 = false;
                } else {
                    if (!this.f3515c) {
                        throw new ProtocolException(string2);
                    }
                    z2 = true;
                }
                this.f3521k = z2;
            } else if (z12) {
                throw new ProtocolException(string2);
            }
            if ((readByte & 32) != 0) {
                throw new ProtocolException(StubApp.getString2(25318));
            }
            if ((readByte & Tnaf.POW_2_WIDTH) != 0) {
                throw new ProtocolException(StubApp.getString2(25317));
            }
            byte readByte2 = b2.readByte();
            boolean z13 = (readByte2 & ByteCompanionObject.MIN_VALUE) != 0;
            if (z13) {
                throw new ProtocolException(StubApp.getString2(25316));
            }
            long j = readByte2 & ByteCompanionObject.MAX_VALUE;
            this.f3519g = j;
            C0101h c0101h = b2.f3774b;
            if (j == 126) {
                this.f3519g = b2.readShort() & UShort.MAX_VALUE;
            } else if (j == 127) {
                b2.D(8L);
                long G4 = c0101h.G();
                this.f3519g = G4;
                if (G4 < 0) {
                    StringBuilder sb2 = new StringBuilder(StubApp.getString2(25313));
                    String hexString = Long.toHexString(this.f3519g);
                    Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(this)");
                    sb2.append(hexString);
                    sb2.append(StubApp.getString2(25314));
                    throw new ProtocolException(sb2.toString());
                }
            }
            if (this.j && this.f3519g > 125) {
                throw new ProtocolException(StubApp.getString2(25315));
            }
            if (!z13) {
                return;
            }
            byte[] sink = this.f3525p;
            Intrinsics.checkNotNull(sink);
            Intrinsics.checkNotNullParameter(sink, "sink");
            try {
                b2.D(sink.length);
                c0101h.C(sink);
            } catch (EOFException e10) {
                while (true) {
                    long j3 = c0101h.f3819b;
                    if (j3 <= 0) {
                        throw e10;
                    }
                    int read = c0101h.read(sink, i10, (int) j3);
                    if (read == -1) {
                        throw new AssertionError();
                    }
                    i10 += read;
                }
            }
        } catch (Throwable th) {
            h4.b().g(h2, TimeUnit.NANOSECONDS);
            throw th;
        }
    }
}
