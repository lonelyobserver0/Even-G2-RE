package D9;

import Kc.AbstractC0095b;
import Kc.B;
import Kc.C0101h;
import com.stub.StubApp;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.UByte;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1508a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1509b;

    public c(ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.f1509b = buffer;
        buffer.position(0);
    }

    @Override // java.io.InputStream
    public final int available() {
        switch (this.f1508a) {
            case 0:
                return ((ByteBuffer) this.f1509b).remaining();
            default:
                B b2 = (B) this.f1509b;
                if (b2.f3775c) {
                    throw new IOException(StubApp.getString2(1551));
                }
                return (int) Math.min(b2.f3774b.f3819b, IntCompanionObject.MAX_VALUE);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        switch (this.f1508a) {
            case 1:
                ((B) this.f1509b).close();
                break;
            default:
                super.close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        switch (this.f1508a) {
            case 0:
                ByteBuffer byteBuffer = (ByteBuffer) this.f1509b;
                if (byteBuffer.hasRemaining()) {
                    return byteBuffer.get();
                }
                return -1;
            default:
                B b2 = (B) this.f1509b;
                if (b2.f3775c) {
                    throw new IOException(StubApp.getString2(1551));
                }
                C0101h c0101h = b2.f3774b;
                if (c0101h.f3819b == 0 && b2.f3773a.n(8192L, c0101h) == -1) {
                    return -1;
                }
                return c0101h.readByte() & UByte.MAX_VALUE;
        }
    }

    public String toString() {
        switch (this.f1508a) {
            case 1:
                return ((B) this.f1509b) + StubApp.getString2(1552);
            default:
                return super.toString();
        }
    }

    public c(B b2) {
        this.f1509b = b2;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bytes, int i3, int i10) {
        switch (this.f1508a) {
            case 0:
                Intrinsics.checkNotNullParameter(bytes, "bytes");
                ByteBuffer byteBuffer = (ByteBuffer) this.f1509b;
                if (!byteBuffer.hasRemaining()) {
                    return -1;
                }
                int coerceAtMost = RangesKt.coerceAtMost(i10, byteBuffer.remaining());
                byteBuffer.get(bytes, i3, coerceAtMost);
                return coerceAtMost;
            default:
                Intrinsics.checkNotNullParameter(bytes, "data");
                B b2 = (B) this.f1509b;
                if (!b2.f3775c) {
                    AbstractC0095b.f(bytes.length, i3, i10);
                    C0101h c0101h = b2.f3774b;
                    if (c0101h.f3819b == 0 && b2.f3773a.n(8192L, c0101h) == -1) {
                        return -1;
                    }
                    return c0101h.read(bytes, i3, i10);
                }
                throw new IOException(StubApp.getString2(1551));
        }
    }
}
