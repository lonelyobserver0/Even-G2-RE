package Dc;

import Kc.C0101h;
import Kc.C0104k;
import Kc.H;
import Kc.InterfaceC0103j;
import Kc.J;
import com.stub.StubApp;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.UByte;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class u implements H {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0103j f1648a;

    /* renamed from: b, reason: collision with root package name */
    public int f1649b;

    /* renamed from: c, reason: collision with root package name */
    public int f1650c;

    /* renamed from: d, reason: collision with root package name */
    public int f1651d;

    /* renamed from: e, reason: collision with root package name */
    public int f1652e;

    /* renamed from: f, reason: collision with root package name */
    public int f1653f;

    public u(InterfaceC0103j source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f1648a = source;
    }

    @Override // Kc.H
    public final J b() {
        return this.f1648a.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // Kc.H
    public final long n(long j, C0101h sink) {
        int i3;
        int readInt;
        Intrinsics.checkNotNullParameter(sink, "sink");
        do {
            int i10 = this.f1652e;
            InterfaceC0103j interfaceC0103j = this.f1648a;
            if (i10 == 0) {
                interfaceC0103j.skip(this.f1653f);
                this.f1653f = 0;
                if ((this.f1650c & 4) == 0) {
                    i3 = this.f1651d;
                    int s10 = xc.b.s(interfaceC0103j);
                    this.f1652e = s10;
                    this.f1649b = s10;
                    int readByte = interfaceC0103j.readByte() & UByte.MAX_VALUE;
                    this.f1650c = interfaceC0103j.readByte() & UByte.MAX_VALUE;
                    Logger logger = v.f1654d;
                    if (logger.isLoggable(Level.FINE)) {
                        C0104k c0104k = g.f1583a;
                        logger.fine(g.a(this.f1651d, this.f1649b, readByte, true, this.f1650c));
                    }
                    readInt = interfaceC0103j.readInt() & IntCompanionObject.MAX_VALUE;
                    this.f1651d = readInt;
                    if (readByte != 9) {
                        throw new IOException(readByte + StubApp.getString2(25175));
                    }
                }
            } else {
                long n10 = interfaceC0103j.n(Math.min(j, i10), sink);
                if (n10 != -1) {
                    this.f1652e -= (int) n10;
                    return n10;
                }
            }
            return -1L;
        } while (readInt == i3);
        throw new IOException(StubApp.getString2(25174));
    }
}
