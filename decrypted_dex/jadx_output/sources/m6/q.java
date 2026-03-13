package m6;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class q implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final int f17120a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17121b;

    public q(int i3, int i10) {
        this.f17120a = i3;
        this.f17121b = i10;
    }

    public final q a(q qVar) {
        int i3 = qVar.f17121b;
        int i10 = this.f17120a;
        int i11 = i10 * i3;
        int i12 = qVar.f17120a;
        int i13 = this.f17121b;
        return i11 <= i12 * i13 ? new q(i12, (i13 * i12) / i10) : new q((i10 * i3) / i13, i3);
    }

    public final q b(q qVar) {
        int i3 = qVar.f17121b;
        int i10 = this.f17120a;
        int i11 = i10 * i3;
        int i12 = qVar.f17120a;
        int i13 = this.f17121b;
        return i11 >= i12 * i13 ? new q(i12, (i13 * i12) / i10) : new q((i10 * i3) / i13, i3);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        q qVar = (q) obj;
        int i3 = this.f17121b * this.f17120a;
        int i10 = qVar.f17121b * qVar.f17120a;
        if (i10 < i3) {
            return 1;
        }
        return i10 > i3 ? -1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f17120a == qVar.f17120a && this.f17121b == qVar.f17121b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f17120a * 31) + this.f17121b;
    }

    public final String toString() {
        return this.f17120a + StubApp.getString2(925) + this.f17121b;
    }
}
