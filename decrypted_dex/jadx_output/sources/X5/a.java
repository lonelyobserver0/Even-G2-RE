package X5;

import com.stub.StubApp;
import java.io.EOFException;
import java.io.IOException;
import kotlin.UByte;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f8408a;

    /* renamed from: b, reason: collision with root package name */
    public int f8409b;

    public /* synthetic */ a(int i3, byte[] bArr) {
        this.f8409b = i3;
        this.f8408a = bArr;
    }

    public int a(int i3) {
        int i10;
        try {
            i10 = this.f8408a[this.f8409b + i3] & UByte.MAX_VALUE;
        } catch (RuntimeException unused) {
            i10 = -1;
        }
        if (i10 >= 0) {
            return i10;
        }
        throw new EOFException();
    }

    public int b() {
        try {
            byte[] bArr = this.f8408a;
            int i3 = this.f8409b;
            int i10 = bArr[i3] & UByte.MAX_VALUE;
            this.f8409b = i3 + 1;
            return i10;
        } catch (RuntimeException unused) {
            return -1;
        }
    }

    public void c() {
        try {
            byte[] bArr = this.f8408a;
            int i3 = this.f8409b;
            byte b2 = bArr[i3];
            this.f8409b = i3 + 1;
        } catch (RuntimeException unused) {
        }
    }

    public byte[] d(int i3) {
        if (i3 < 0) {
            throw new IOException(StubApp.getString2(7245));
        }
        byte[] bArr = this.f8408a;
        int length = bArr.length;
        int i10 = this.f8409b;
        if (length - i10 < i3) {
            throw new EOFException();
        }
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i10, bArr2, 0, i3);
        this.f8409b += i3;
        return bArr2;
    }

    public int e() {
        int b2 = b();
        int b10 = b();
        int b11 = b();
        int b12 = b();
        if ((b2 | b10 | b11 | b12) >= 0) {
            return (b2 << 24) | (b10 << 16) | (b11 << 8) | b12;
        }
        throw new EOFException();
    }

    public int f() {
        int b2 = b();
        if (b2 >= 0) {
            return b2;
        }
        throw new EOFException();
    }

    public int g() {
        int b2 = b();
        int b10 = b();
        if ((b2 | b10) >= 0) {
            return (b2 << 8) | b10;
        }
        throw new EOFException();
    }

    public a(byte[] bArr, int i3) {
        this.f8408a = bArr;
        this.f8409b = i3;
    }

    public a(byte[] bArr) {
        this.f8409b = 0;
        this.f8408a = bArr;
    }
}
