package oa;

import com.stub.StubApp;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class n implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final long f18633a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18634b;

    public n(long j, int i3) {
        this.f18633a = j;
        this.f18634b = i3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        n nVar = (n) obj;
        long j = nVar.f18633a;
        long j3 = this.f18633a;
        if (j3 < j) {
            return -1;
        }
        if (j3 > j) {
            return 1;
        }
        int i3 = this.f18634b;
        int i10 = nVar.f18634b;
        if (i3 < i10) {
            return -1;
        }
        return i3 > i10 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        n nVar = obj instanceof n ? (n) obj : null;
        return nVar != null && nVar.f18633a == this.f18633a && nVar.f18634b == this.f18634b;
    }

    public final int hashCode() {
        return Long.valueOf((this.f18633a << 4) + this.f18634b).hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f18633a);
        sb2.append(StubApp.getString2(397));
        return AbstractC1482f.f(this.f18634b, StubApp.getString2(22050), sb2);
    }
}
