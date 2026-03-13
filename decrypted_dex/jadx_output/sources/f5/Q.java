package f5;

import com.stub.StubApp;
import java.util.List;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class Q extends E0 {

    /* renamed from: a, reason: collision with root package name */
    public final S f13908a;

    /* renamed from: b, reason: collision with root package name */
    public final List f13909b;

    /* renamed from: c, reason: collision with root package name */
    public final List f13910c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f13911d;

    /* renamed from: e, reason: collision with root package name */
    public final D0 f13912e;

    /* renamed from: f, reason: collision with root package name */
    public final List f13913f;

    /* renamed from: g, reason: collision with root package name */
    public final int f13914g;

    public Q(S s10, List list, List list2, Boolean bool, D0 d02, List list3, int i3) {
        this.f13908a = s10;
        this.f13909b = list;
        this.f13910c = list2;
        this.f13911d = bool;
        this.f13912e = d02;
        this.f13913f = list3;
        this.f13914g = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof E0)) {
            return false;
        }
        Q q10 = (Q) ((E0) obj);
        if (!this.f13908a.equals(q10.f13908a)) {
            return false;
        }
        List list = this.f13909b;
        if (list == null) {
            if (q10.f13909b != null) {
                return false;
            }
        } else if (!list.equals(q10.f13909b)) {
            return false;
        }
        List list2 = this.f13910c;
        if (list2 == null) {
            if (q10.f13910c != null) {
                return false;
            }
        } else if (!list2.equals(q10.f13910c)) {
            return false;
        }
        Boolean bool = this.f13911d;
        if (bool == null) {
            if (q10.f13911d != null) {
                return false;
            }
        } else if (!bool.equals(q10.f13911d)) {
            return false;
        }
        D0 d02 = this.f13912e;
        if (d02 == null) {
            if (q10.f13912e != null) {
                return false;
            }
        } else if (!d02.equals(q10.f13912e)) {
            return false;
        }
        List list3 = this.f13913f;
        if (list3 == null) {
            if (q10.f13913f != null) {
                return false;
            }
        } else if (!list3.equals(q10.f13913f)) {
            return false;
        }
        return this.f13914g == q10.f13914g;
    }

    public final int hashCode() {
        int hashCode = (this.f13908a.hashCode() ^ 1000003) * 1000003;
        List list = this.f13909b;
        int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.f13910c;
        int hashCode3 = (hashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.f13911d;
        int hashCode4 = (hashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        D0 d02 = this.f13912e;
        int hashCode5 = (hashCode4 ^ (d02 == null ? 0 : d02.hashCode())) * 1000003;
        List list3 = this.f13913f;
        return ((hashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.f13914g;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(17581));
        sb2.append(this.f13908a);
        sb2.append(StubApp.getString2(17582));
        sb2.append(this.f13909b);
        sb2.append(StubApp.getString2(17583));
        sb2.append(this.f13910c);
        sb2.append(StubApp.getString2(17584));
        sb2.append(this.f13911d);
        sb2.append(StubApp.getString2(2602));
        sb2.append(this.f13912e);
        sb2.append(StubApp.getString2(2603));
        sb2.append(this.f13913f);
        sb2.append(StubApp.getString2(17585));
        return AbstractC1482f.f(this.f13914g, StubApp.getString2(265), sb2);
    }
}
