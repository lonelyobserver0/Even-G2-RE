package ca;

import com.stub.StubApp;
import i2.u;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import p0.AbstractC1482f;

/* renamed from: ca.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0582a {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f11052c = {1, 2, 1};

    /* renamed from: a, reason: collision with root package name */
    public byte[] f11053a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f11054b;

    public final void a(byte[] bArr) {
        if (bArr.length < 18) {
            throw new IOException(StubApp.getString2(9648));
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        this.f11053a = new byte[bArr.length - 18];
        this.f11054b = new int[3];
        int i3 = 0;
        for (int i10 = 0; i10 < 3; i10++) {
            if (byteArrayInputStream.read() != 128) {
                throw new IOException(StubApp.getString2(9647));
            }
            if (byteArrayInputStream.read() != f11052c[i10]) {
                throw new IOException(StubApp.getString2(9646));
            }
            int read = byteArrayInputStream.read() + (byteArrayInputStream.read() << 8) + (byteArrayInputStream.read() << 16) + (byteArrayInputStream.read() << 24);
            if (read < 0) {
                throw new IOException(u.p(read, StubApp.getString2(9645)));
            }
            this.f11054b[i10] = read;
            byte[] bArr2 = this.f11053a;
            if (i3 >= bArr2.length) {
                throw new EOFException(StubApp.getString2(9644));
            }
            if (read > bArr2.length - i3) {
                StringBuilder l9 = AbstractC1482f.l(read, StubApp.getString2(9639), i3, StubApp.getString2(9640), StubApp.getString2(9641));
                l9.append(this.f11053a.length);
                l9.append(StubApp.getString2(9642));
                l9.append(this.f11053a.length - i3);
                l9.append(StubApp.getString2(9643));
                throw new EOFException(l9.toString());
            }
            int read2 = byteArrayInputStream.read(bArr2, i3, read);
            if (read2 < 0) {
                throw new EOFException();
            }
            i3 += read2;
        }
    }
}
