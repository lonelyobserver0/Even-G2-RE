package X2;

import com.stub.StubApp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f8297a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8298b;

    /* renamed from: c, reason: collision with root package name */
    public final double f8299c;

    /* renamed from: d, reason: collision with root package name */
    public final double f8300d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8301e;

    /* renamed from: f, reason: collision with root package name */
    public final Long f8302f;

    /* renamed from: g, reason: collision with root package name */
    public final List f8303g;

    /* renamed from: h, reason: collision with root package name */
    public final String f8304h;

    public l(String id, String name, double d8, double d10, String address, Long l9, List list, String str) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(address, "address");
        this.f8297a = id;
        this.f8298b = name;
        this.f8299c = d8;
        this.f8300d = d10;
        this.f8301e = address;
        this.f8302f = l9;
        this.f8303g = list;
        this.f8304h = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.areEqual(this.f8297a, lVar.f8297a) && Intrinsics.areEqual(this.f8298b, lVar.f8298b) && Double.compare(this.f8299c, lVar.f8299c) == 0 && Double.compare(this.f8300d, lVar.f8300d) == 0 && Intrinsics.areEqual(this.f8301e, lVar.f8301e) && Intrinsics.areEqual(this.f8302f, lVar.f8302f) && Intrinsics.areEqual(this.f8303g, lVar.f8303g) && Intrinsics.areEqual(this.f8304h, lVar.f8304h);
    }

    public final int hashCode() {
        int d8 = i2.u.d(E1.a.d(this.f8300d, E1.a.d(this.f8299c, i2.u.d(this.f8297a.hashCode() * 31, 31, this.f8298b), 31), 31), 31, this.f8301e);
        Long l9 = this.f8302f;
        int hashCode = (d8 + (l9 == null ? 0 : l9.hashCode())) * 31;
        List list = this.f8303g;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f8304h;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(7086));
        sb2.append(this.f8297a);
        sb2.append(StubApp.getString2(1065));
        sb2.append(this.f8298b);
        sb2.append(StubApp.getString2(7087));
        sb2.append(this.f8299c);
        sb2.append(StubApp.getString2(7065));
        sb2.append(this.f8300d);
        sb2.append(StubApp.getString2(2245));
        sb2.append(this.f8301e);
        sb2.append(StubApp.getString2(5059));
        sb2.append(this.f8302f);
        sb2.append(StubApp.getString2(7088));
        sb2.append(this.f8303g);
        sb2.append(StubApp.getString2(7089));
        return AbstractC1482f.k(sb2, this.f8304h, StubApp.getString2(74));
    }
}
