package Aa;

import oa.AbstractC1469b;
import oa.j;
import ta.InterfaceC1743c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class b implements InterfaceC1743c {
    public abstract String a();

    public abstract int b();

    @Override // ta.InterfaceC1743c
    public final AbstractC1469b p() {
        return j.a(a());
    }

    public final String toString() {
        return a();
    }
}
