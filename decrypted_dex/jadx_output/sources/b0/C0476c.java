package b0;

import com.stub.StubApp;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* renamed from: b0.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0476c extends FilterOutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final OutputStream f10409a;

    /* renamed from: b, reason: collision with root package name */
    public ByteOrder f10410b;

    public C0476c(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.f10409a = outputStream;
        this.f10410b = byteOrder;
    }

    public final void a(int i3) {
        this.f10409a.write(i3);
    }

    public final void d(int i3) {
        ByteOrder byteOrder = this.f10410b;
        ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
        OutputStream outputStream = this.f10409a;
        if (byteOrder == byteOrder2) {
            outputStream.write(i3 & 255);
            outputStream.write((i3 >>> 8) & 255);
            outputStream.write((i3 >>> 16) & 255);
            outputStream.write((i3 >>> 24) & 255);
            return;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            outputStream.write((i3 >>> 24) & 255);
            outputStream.write((i3 >>> 16) & 255);
            outputStream.write((i3 >>> 8) & 255);
            outputStream.write(i3 & 255);
        }
    }

    public final void e(short s10) {
        ByteOrder byteOrder = this.f10410b;
        ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
        OutputStream outputStream = this.f10409a;
        if (byteOrder == byteOrder2) {
            outputStream.write(s10 & 255);
            outputStream.write((s10 >>> 8) & 255);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            outputStream.write((s10 >>> 8) & 255);
            outputStream.write(s10 & 255);
        }
    }

    public final void h(long j) {
        if (j > BodyPartID.bodyIdMax) {
            throw new IllegalArgumentException(StubApp.getString2(8616));
        }
        d((int) j);
    }

    public final void k(int i3) {
        if (i3 > 65535) {
            throw new IllegalArgumentException(StubApp.getString2(8617));
        }
        e((short) i3);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f10409a.write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i3, int i10) {
        this.f10409a.write(bArr, i3, i10);
    }
}
