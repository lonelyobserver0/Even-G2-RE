package H0;

import android.net.Uri;
import com.stub.StubApp;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import t0.AbstractC1703c;
import t0.C1711k;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class I extends AbstractC1703c implements InterfaceC0062e {

    /* renamed from: e, reason: collision with root package name */
    public final LinkedBlockingQueue f2515e;

    /* renamed from: f, reason: collision with root package name */
    public final long f2516f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f2517g;

    /* renamed from: h, reason: collision with root package name */
    public int f2518h;

    public I() {
        super(true);
        this.f2516f = 8000L;
        this.f2515e = new LinkedBlockingQueue();
        this.f2517g = new byte[0];
        this.f2518h = -1;
    }

    @Override // H0.InterfaceC0062e
    public final String c() {
        AbstractC1550k.g(this.f2518h != -1);
        int i3 = this.f2518h;
        int i10 = this.f2518h + 1;
        int i11 = AbstractC1560u.f20190a;
        Locale locale = Locale.US;
        return Xa.h.o(StubApp.getString2(2384), i3, i10, StubApp.getString2(999));
    }

    @Override // t0.InterfaceC1708h
    public final void close() {
    }

    @Override // H0.InterfaceC0062e
    public final int f() {
        return this.f2518h;
    }

    @Override // H0.InterfaceC0062e
    public final boolean h() {
        return false;
    }

    @Override // H0.InterfaceC0062e
    public final I m() {
        return this;
    }

    @Override // t0.InterfaceC1708h
    public final long n(C1711k c1711k) {
        this.f2518h = c1711k.f21077a.getPort();
        return -1L;
    }

    @Override // o0.InterfaceC1432g
    public final int read(byte[] bArr, int i3, int i10) {
        if (i10 == 0) {
            return 0;
        }
        int min = Math.min(i10, this.f2517g.length);
        System.arraycopy(this.f2517g, 0, bArr, i3, min);
        byte[] bArr2 = this.f2517g;
        this.f2517g = Arrays.copyOfRange(bArr2, min, bArr2.length);
        if (min == i10) {
            return min;
        }
        try {
            byte[] bArr3 = (byte[]) this.f2515e.poll(this.f2516f, TimeUnit.MILLISECONDS);
            if (bArr3 == null) {
                return -1;
            }
            int min2 = Math.min(i10 - min, bArr3.length);
            System.arraycopy(bArr3, 0, bArr, i3 + min, min2);
            if (min2 < bArr3.length) {
                this.f2517g = Arrays.copyOfRange(bArr3, min2, bArr3.length);
            }
            return min + min2;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return -1;
        }
    }

    @Override // t0.InterfaceC1708h
    public final Uri z() {
        return null;
    }
}
