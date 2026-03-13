package T0;

import com.stub.StubApp;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import o0.AbstractC1448w;
import o0.InterfaceC1432g;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class l implements p {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1432g f7028b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7029c;

    /* renamed from: d, reason: collision with root package name */
    public long f7030d;

    /* renamed from: f, reason: collision with root package name */
    public int f7032f;

    /* renamed from: g, reason: collision with root package name */
    public int f7033g;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f7031e = new byte[PKIFailureInfo.notAuthorized];

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f7027a = new byte[4096];

    static {
        AbstractC1448w.a(StubApp.getString2(6120));
    }

    public l(InterfaceC1432g interfaceC1432g, long j, long j3) {
        this.f7028b = interfaceC1432g;
        this.f7030d = j;
        this.f7029c = j3;
    }

    public final boolean a(int i3, boolean z2) {
        d(i3);
        int i10 = this.f7033g - this.f7032f;
        while (i10 < i3) {
            int i11 = i3;
            boolean z10 = z2;
            i10 = j(z10, this.f7032f, this.f7031e, i11, i10);
            if (i10 == -1) {
                return false;
            }
            this.f7033g = this.f7032f + i10;
            z2 = z10;
            i3 = i11;
        }
        this.f7032f += i3;
        return true;
    }

    @Override // T0.p
    public final void b(int i3, int i10, byte[] bArr) {
        i(bArr, i3, i10, false);
    }

    public final void d(int i3) {
        int i10 = this.f7032f + i3;
        byte[] bArr = this.f7031e;
        if (i10 > bArr.length) {
            this.f7031e = Arrays.copyOf(this.f7031e, AbstractC1560u.i(bArr.length * 2, PKIFailureInfo.notAuthorized + i10, i10 + PKIFailureInfo.signerNotTrusted));
        }
    }

    @Override // T0.p
    public final boolean e(byte[] bArr, int i3, int i10, boolean z2) {
        int min;
        int i11 = this.f7033g;
        if (i11 == 0) {
            min = 0;
        } else {
            min = Math.min(i11, i10);
            System.arraycopy(this.f7031e, 0, bArr, i3, min);
            p(min);
        }
        int i12 = min;
        while (i12 < i10 && i12 != -1) {
            i12 = j(z2, i3, bArr, i10, i12);
        }
        if (i12 != -1) {
            this.f7030d += i12;
        }
        return i12 != -1;
    }

    public final int g(int i3, int i10, byte[] bArr) {
        l lVar;
        int min;
        d(i10);
        int i11 = this.f7033g;
        int i12 = this.f7032f;
        int i13 = i11 - i12;
        if (i13 == 0) {
            lVar = this;
            min = lVar.j(true, i12, this.f7031e, i10, 0);
            if (min == -1) {
                return -1;
            }
            lVar.f7033g += min;
        } else {
            lVar = this;
            min = Math.min(i10, i13);
        }
        System.arraycopy(lVar.f7031e, lVar.f7032f, bArr, i3, min);
        lVar.f7032f += min;
        return min;
    }

    @Override // T0.p
    public final long getPosition() {
        return this.f7030d;
    }

    @Override // T0.p
    public final boolean i(byte[] bArr, int i3, int i10, boolean z2) {
        if (!a(i10, z2)) {
            return false;
        }
        System.arraycopy(this.f7031e, this.f7032f - i10, bArr, i3, i10);
        return true;
    }

    public final int j(boolean z2, int i3, byte[] bArr, int i10, int i11) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int read = this.f7028b.read(bArr, i3 + i11, i10 - i11);
        if (read != -1) {
            return i11 + read;
        }
        if (i11 == 0 && z2) {
            return -1;
        }
        throw new EOFException();
    }

    public final int k(int i3) {
        l lVar;
        int min = Math.min(this.f7033g, i3);
        p(min);
        if (min == 0) {
            byte[] bArr = this.f7027a;
            lVar = this;
            min = lVar.j(true, 0, bArr, Math.min(i3, bArr.length), 0);
        } else {
            lVar = this;
        }
        if (min != -1) {
            lVar.f7030d += min;
        }
        return min;
    }

    @Override // T0.p
    public final long l() {
        return this.f7030d + this.f7032f;
    }

    @Override // T0.p
    public final void o(int i3) {
        a(i3, false);
    }

    public final void p(int i3) {
        int i10 = this.f7033g - i3;
        this.f7033g = i10;
        this.f7032f = 0;
        byte[] bArr = this.f7031e;
        byte[] bArr2 = i10 < bArr.length - PKIFailureInfo.signerNotTrusted ? new byte[PKIFailureInfo.notAuthorized + i10] : bArr;
        System.arraycopy(bArr, i3, bArr2, 0, i10);
        this.f7031e = bArr2;
    }

    @Override // T0.p
    public final long r() {
        return this.f7029c;
    }

    @Override // o0.InterfaceC1432g
    public final int read(byte[] bArr, int i3, int i10) {
        l lVar;
        int i11 = this.f7033g;
        int i12 = 0;
        if (i11 != 0) {
            int min = Math.min(i11, i10);
            System.arraycopy(this.f7031e, 0, bArr, i3, min);
            p(min);
            i12 = min;
        }
        if (i12 == 0) {
            lVar = this;
            i12 = lVar.j(true, i3, bArr, i10, 0);
        } else {
            lVar = this;
        }
        if (i12 != -1) {
            lVar.f7030d += i12;
        }
        return i12;
    }

    @Override // T0.p
    public final void readFully(byte[] bArr, int i3, int i10) {
        e(bArr, i3, i10, false);
    }

    @Override // T0.p
    public final void t() {
        this.f7032f = 0;
    }

    @Override // T0.p
    public final void u(int i3) {
        int min = Math.min(this.f7033g, i3);
        p(min);
        int i10 = min;
        while (i10 < i3 && i10 != -1) {
            byte[] bArr = this.f7027a;
            i10 = j(false, -i10, bArr, Math.min(i3, bArr.length + i10), i10);
        }
        if (i10 != -1) {
            this.f7030d += i10;
        }
    }
}
