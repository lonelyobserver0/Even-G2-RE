package q1;

import M4.F;
import M4.I;
import c5.B;
import r0.InterfaceC1542c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public interface l {
    default d g(int i3, int i10, byte[] bArr) {
        F l9 = I.l();
        n(bArr, 0, i10, k.f19903c, new B(l9, 24));
        return new b(l9.g());
    }

    void n(byte[] bArr, int i3, int i10, k kVar, InterfaceC1542c interfaceC1542c);

    int p();

    default void reset() {
    }
}
