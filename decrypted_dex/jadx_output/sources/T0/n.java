package T0;

import java.io.EOFException;
import o0.C1438m;
import o0.InterfaceC1432g;
import r0.C1553n;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class n implements H {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f7041a = new byte[4096];

    @Override // T0.H
    public final void a(C1553n c1553n, int i3, int i10) {
        c1553n.H(i3);
    }

    @Override // T0.H
    public final int b(InterfaceC1432g interfaceC1432g, int i3, boolean z2) {
        byte[] bArr = this.f7041a;
        int read = interfaceC1432g.read(bArr, 0, Math.min(bArr.length, i3));
        if (read != -1) {
            return read;
        }
        if (z2) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // T0.H
    public final void c(long j, int i3, int i10, int i11, G g10) {
    }

    @Override // T0.H
    public final void d(C1438m c1438m) {
    }
}
