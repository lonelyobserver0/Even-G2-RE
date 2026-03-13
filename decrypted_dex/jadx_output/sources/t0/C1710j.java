package t0;

import java.io.InputStream;
import kotlin.UByte;
import r0.AbstractC1550k;

/* renamed from: t0.j, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1710j extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1708h f21071a;

    /* renamed from: b, reason: collision with root package name */
    public final C1711k f21072b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f21074d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f21075e = false;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f21073c = new byte[1];

    public C1710j(InterfaceC1708h interfaceC1708h, C1711k c1711k) {
        this.f21071a = interfaceC1708h;
        this.f21072b = c1711k;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f21075e) {
            return;
        }
        this.f21071a.close();
        this.f21075e = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f21073c;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & UByte.MAX_VALUE;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i3, int i10) {
        AbstractC1550k.g(!this.f21075e);
        boolean z2 = this.f21074d;
        InterfaceC1708h interfaceC1708h = this.f21071a;
        if (!z2) {
            interfaceC1708h.n(this.f21072b);
            this.f21074d = true;
        }
        int read = interfaceC1708h.read(bArr, i3, i10);
        if (read == -1) {
            return -1;
        }
        return read;
    }
}
