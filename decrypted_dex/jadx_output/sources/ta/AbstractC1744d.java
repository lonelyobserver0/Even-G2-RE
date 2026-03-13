package ta;

import oa.C1471d;

/* renamed from: ta.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC1744d implements InterfaceC1743c {

    /* renamed from: a, reason: collision with root package name */
    private final C1471d f21251a;

    public AbstractC1744d() {
        this.f21251a = new C1471d();
    }

    @Override // ta.InterfaceC1743c
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1471d p() {
        return this.f21251a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AbstractC1744d) {
            return this.f21251a.equals(((AbstractC1744d) obj).f21251a);
        }
        return false;
    }

    public int hashCode() {
        return this.f21251a.hashCode();
    }

    public AbstractC1744d(C1471d c1471d) {
        this.f21251a = c1471d;
    }
}
