package M4;

import java.io.Serializable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class J extends AbstractC0145p implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final transient e0 f4550d;

    public J(e0 e0Var, int i3) {
        this.f4550d = e0Var;
    }

    @Override // M4.AbstractC0144o
    public final boolean b(Object obj) {
        return obj != null && super.b(obj);
    }

    @Override // M4.AbstractC0144o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public e0 a() {
        return this.f4550d;
    }

    public final I d(String str) {
        I i3 = (I) this.f4550d.get(str);
        if (i3 != null) {
            return i3;
        }
        G g10 = I.f4549b;
        return Z.f4578e;
    }
}
