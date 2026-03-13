package Ea;

import com.stub.StubApp;
import oa.AbstractC1469b;
import oa.C1471d;
import oa.j;
import ta.InterfaceC1743c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c implements InterfaceC1743c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2124a;

    /* renamed from: b, reason: collision with root package name */
    public C1471d f2125b;

    public String a() {
        return this.f2125b.Q(j.f18620y2);
    }

    @Override // ta.InterfaceC1743c
    public final AbstractC1469b p() {
        switch (this.f2124a) {
        }
        return this.f2125b;
    }

    public String toString() {
        switch (this.f2124a) {
            case 2:
                StringBuilder sb2 = new StringBuilder();
                j jVar = j.f18489P2;
                C1471d c1471d = this.f2125b;
                sb2.append(c1471d.Q(jVar));
                String string2 = StubApp.getString2(999);
                sb2.append(string2);
                sb2.append(a());
                sb2.append(string2);
                sb2.append(c1471d.N(j.f18580p3, null, -1));
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ c(C1471d c1471d, int i3) {
        this.f2124a = i3;
        this.f2125b = c1471d;
    }
}
