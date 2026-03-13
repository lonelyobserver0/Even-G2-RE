package Ea;

import oa.AbstractC1469b;
import oa.C1471d;
import oa.j;
import oa.l;
import ta.InterfaceC1743c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements InterfaceC1743c {

    /* renamed from: a, reason: collision with root package name */
    public final C1471d f2117a;

    public a(C1471d c1471d) {
        this.f2117a = c1471d;
    }

    public final Float a(j jVar) {
        AbstractC1469b J10 = this.f2117a.J(jVar);
        if (J10 instanceof l) {
            return Float.valueOf(((l) J10).a());
        }
        return null;
    }

    @Override // ta.InterfaceC1743c
    public final AbstractC1469b p() {
        return this.f2117a;
    }
}
