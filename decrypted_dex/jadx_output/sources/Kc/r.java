package Kc;

import com.stub.StubApp;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class r implements H {

    /* renamed from: a, reason: collision with root package name */
    public final B f3844a;

    /* renamed from: b, reason: collision with root package name */
    public final Inflater f3845b;

    /* renamed from: c, reason: collision with root package name */
    public int f3846c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3847d;

    public r(B source, Inflater inflater) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f3844a = source;
        this.f3845b = inflater;
    }

    public final long a(long j, C0101h sink) {
        Inflater inflater = this.f3845b;
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(Xa.h.h(j, StubApp.getString2(25206)).toString());
        }
        if (this.f3847d) {
            throw new IllegalStateException(StubApp.getString2(1551));
        }
        if (j != 0) {
            try {
                C M5 = sink.M(1);
                int min = (int) Math.min(j, 8192 - M5.f3778c);
                boolean needsInput = inflater.needsInput();
                B b2 = this.f3844a;
                if (needsInput && !b2.a()) {
                    C c10 = b2.f3774b.f3818a;
                    Intrinsics.checkNotNull(c10);
                    int i3 = c10.f3778c;
                    int i10 = c10.f3777b;
                    int i11 = i3 - i10;
                    this.f3846c = i11;
                    inflater.setInput(c10.f3776a, i10, i11);
                }
                int inflate = inflater.inflate(M5.f3776a, M5.f3778c, min);
                int i12 = this.f3846c;
                if (i12 != 0) {
                    int remaining = i12 - inflater.getRemaining();
                    this.f3846c -= remaining;
                    b2.skip(remaining);
                }
                if (inflate > 0) {
                    M5.f3778c += inflate;
                    long j3 = inflate;
                    sink.f3819b += j3;
                    return j3;
                }
                if (M5.f3777b == M5.f3778c) {
                    sink.f3818a = M5.a();
                    D.a(M5);
                }
            } catch (DataFormatException e10) {
                throw new IOException(e10);
            }
        }
        return 0L;
    }

    @Override // Kc.H
    public final J b() {
        return this.f3844a.f3773a.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3847d) {
            return;
        }
        this.f3845b.end();
        this.f3847d = true;
        this.f3844a.close();
    }

    @Override // Kc.H
    public final long n(long j, C0101h sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        do {
            long a3 = a(j, sink);
            if (a3 > 0) {
                return a3;
            }
            Inflater inflater = this.f3845b;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.f3844a.a());
        throw new EOFException(StubApp.getString2(25381));
    }
}
