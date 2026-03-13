package t0;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* renamed from: t0.y, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1725y implements InterfaceC1708h {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1708h f21123a;

    /* renamed from: b, reason: collision with root package name */
    public long f21124b;

    /* renamed from: c, reason: collision with root package name */
    public Uri f21125c;

    /* renamed from: d, reason: collision with root package name */
    public Map f21126d;

    public C1725y(InterfaceC1708h interfaceC1708h) {
        interfaceC1708h.getClass();
        this.f21123a = interfaceC1708h;
        this.f21125c = Uri.EMPTY;
        this.f21126d = Collections.EMPTY_MAP;
    }

    @Override // t0.InterfaceC1708h
    public final void close() {
        this.f21123a.close();
    }

    @Override // t0.InterfaceC1708h
    public final long n(C1711k c1711k) {
        InterfaceC1708h interfaceC1708h = this.f21123a;
        this.f21125c = c1711k.f21077a;
        this.f21126d = Collections.EMPTY_MAP;
        try {
            return interfaceC1708h.n(c1711k);
        } finally {
            Uri z2 = interfaceC1708h.z();
            if (z2 != null) {
                this.f21125c = z2;
            }
            this.f21126d = interfaceC1708h.s();
        }
    }

    @Override // o0.InterfaceC1432g
    public final int read(byte[] bArr, int i3, int i10) {
        int read = this.f21123a.read(bArr, i3, i10);
        if (read != -1) {
            this.f21124b += read;
        }
        return read;
    }

    @Override // t0.InterfaceC1708h
    public final Map s() {
        return this.f21123a.s();
    }

    @Override // t0.InterfaceC1708h
    public final void y(InterfaceC1726z interfaceC1726z) {
        interfaceC1726z.getClass();
        this.f21123a.y(interfaceC1726z);
    }

    @Override // t0.InterfaceC1708h
    public final Uri z() {
        return this.f21123a.z();
    }
}
