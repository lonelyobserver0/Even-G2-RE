package Kc;

import com.stub.StubApp;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class q implements H {

    /* renamed from: a, reason: collision with root package name */
    public byte f3839a;

    /* renamed from: b, reason: collision with root package name */
    public final B f3840b;

    /* renamed from: c, reason: collision with root package name */
    public final Inflater f3841c;

    /* renamed from: d, reason: collision with root package name */
    public final r f3842d;

    /* renamed from: e, reason: collision with root package name */
    public final CRC32 f3843e;

    public q(H source) {
        Intrinsics.checkNotNullParameter(source, "source");
        B b2 = new B(source);
        this.f3840b = b2;
        Inflater inflater = new Inflater(true);
        this.f3841c = inflater;
        this.f3842d = new r(b2, inflater);
        this.f3843e = new CRC32();
    }

    public static void a(int i3, int i10, String str) {
        if (i10 == i3) {
            return;
        }
        String format = String.format(StubApp.getString2(25375), Arrays.copyOf(new Object[]{str, Integer.valueOf(i10), Integer.valueOf(i3)}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)");
        throw new IOException(format);
    }

    @Override // Kc.H
    public final J b() {
        return this.f3840b.f3773a.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3842d.close();
    }

    public final void d(C0101h c0101h, long j, long j3) {
        C c10 = c0101h.f3818a;
        Intrinsics.checkNotNull(c10);
        while (true) {
            int i3 = c10.f3778c;
            int i10 = c10.f3777b;
            if (j < i3 - i10) {
                break;
            }
            j -= i3 - i10;
            c10 = c10.f3781f;
            Intrinsics.checkNotNull(c10);
        }
        while (j3 > 0) {
            int min = (int) Math.min(c10.f3778c - r6, j3);
            this.f3843e.update(c10.f3776a, (int) (c10.f3777b + j), min);
            j3 -= min;
            c10 = c10.f3781f;
            Intrinsics.checkNotNull(c10);
            j = 0;
        }
    }

    @Override // Kc.H
    public final long n(long j, C0101h sink) {
        q qVar = this;
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(Xa.h.h(j, StubApp.getString2(25206)).toString());
        }
        if (j == 0) {
            return 0L;
        }
        byte b2 = qVar.f3839a;
        CRC32 crc32 = qVar.f3843e;
        B b10 = qVar.f3840b;
        if (b2 == 0) {
            b10.D(10L);
            C0101h c0101h = b10.f3774b;
            byte h2 = c0101h.h(3L);
            boolean z2 = ((h2 >> 1) & 1) == 1;
            if (z2) {
                qVar.d(c0101h, 0L, 10L);
            }
            a(8075, b10.readShort(), StubApp.getString2(25376));
            b10.skip(8L);
            if (((h2 >> 2) & 1) == 1) {
                b10.D(2L);
                if (z2) {
                    d(c0101h, 0L, 2L);
                }
                long I10 = c0101h.I() & UShort.MAX_VALUE;
                b10.D(I10);
                if (z2) {
                    d(c0101h, 0L, I10);
                }
                b10.skip(I10);
            }
            if (((h2 >> 3) & 1) == 1) {
                long d8 = b10.d((byte) 0, 0L, LongCompanionObject.MAX_VALUE);
                if (d8 == -1) {
                    throw new EOFException();
                }
                if (z2) {
                    d(c0101h, 0L, d8 + 1);
                }
                b10.skip(d8 + 1);
            }
            if (((h2 >> 4) & 1) == 1) {
                long d10 = b10.d((byte) 0, 0L, LongCompanionObject.MAX_VALUE);
                if (d10 == -1) {
                    throw new EOFException();
                }
                if (z2) {
                    qVar = this;
                    qVar.d(c0101h, 0L, d10 + 1);
                } else {
                    qVar = this;
                }
                b10.skip(d10 + 1);
            } else {
                qVar = this;
            }
            if (z2) {
                a(b10.v(), (short) crc32.getValue(), StubApp.getString2(25377));
                crc32.reset();
            }
            qVar.f3839a = (byte) 1;
        }
        if (qVar.f3839a == 1) {
            long j3 = sink.f3819b;
            long n10 = qVar.f3842d.n(j, sink);
            if (n10 != -1) {
                qVar.d(sink, j3, n10);
                return n10;
            }
            qVar.f3839a = (byte) 2;
        }
        if (qVar.f3839a == 2) {
            a(b10.k(), (int) crc32.getValue(), StubApp.getString2(25378));
            a(b10.k(), (int) qVar.f3841c.getBytesWritten(), StubApp.getString2(25379));
            qVar.f3839a = (byte) 3;
            if (!b10.a()) {
                throw new IOException(StubApp.getString2(25380));
            }
        }
        return -1L;
    }
}
