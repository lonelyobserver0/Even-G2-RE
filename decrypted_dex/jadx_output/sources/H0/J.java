package H0;

import android.net.Uri;
import com.stub.StubApp;
import java.net.DatagramSocket;
import java.util.Locale;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import t0.C1699A;
import t0.C1700B;
import t0.C1711k;
import t0.InterfaceC1726z;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class J implements InterfaceC0062e {

    /* renamed from: a, reason: collision with root package name */
    public final C1700B f2519a = new C1700B(android.support.v4.media.session.b.h(8000));

    /* renamed from: b, reason: collision with root package name */
    public J f2520b;

    @Override // H0.InterfaceC0062e
    public final String c() {
        int f10 = f();
        AbstractC1550k.g(f10 != -1);
        int i3 = AbstractC1560u.f20190a;
        Locale locale = Locale.US;
        return Xa.h.o(StubApp.getString2(2385), f10, 1 + f10, StubApp.getString2(999));
    }

    @Override // t0.InterfaceC1708h
    public final void close() {
        this.f2519a.close();
        J j = this.f2520b;
        if (j != null) {
            j.close();
        }
    }

    @Override // H0.InterfaceC0062e
    public final int f() {
        DatagramSocket datagramSocket = this.f2519a.j;
        int localPort = datagramSocket == null ? -1 : datagramSocket.getLocalPort();
        if (localPort == -1) {
            return -1;
        }
        return localPort;
    }

    @Override // H0.InterfaceC0062e
    public final boolean h() {
        return true;
    }

    @Override // H0.InterfaceC0062e
    public final I m() {
        return null;
    }

    @Override // t0.InterfaceC1708h
    public final long n(C1711k c1711k) {
        this.f2519a.n(c1711k);
        return -1L;
    }

    @Override // o0.InterfaceC1432g
    public final int read(byte[] bArr, int i3, int i10) {
        try {
            return this.f2519a.read(bArr, i3, i10);
        } catch (C1699A e10) {
            if (e10.f21070a == 2002) {
                return -1;
            }
            throw e10;
        }
    }

    @Override // t0.InterfaceC1708h
    public final void y(InterfaceC1726z interfaceC1726z) {
        this.f2519a.y(interfaceC1726z);
    }

    @Override // t0.InterfaceC1708h
    public final Uri z() {
        return this.f2519a.f21047h;
    }
}
