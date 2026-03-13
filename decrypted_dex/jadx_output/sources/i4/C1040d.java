package i4;

import S3.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* renamed from: i4.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1040d extends T3.a {
    public static final Parcelable.Creator<C1040d> CREATOR = new h1.n(21);

    /* renamed from: e, reason: collision with root package name */
    public static final A.i f14759e = new A.i(5);

    /* renamed from: a, reason: collision with root package name */
    public final List f14760a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14761b;

    /* renamed from: c, reason: collision with root package name */
    public final List f14762c;

    /* renamed from: d, reason: collision with root package name */
    public String f14763d;

    public C1040d(List list, String str, ArrayList arrayList, String str2) {
        D.i(list, StubApp.getString2(18493));
        D.a(StubApp.getString2(18494), !list.isEmpty());
        TreeSet treeSet = new TreeSet(f14759e);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1038b c1038b = (C1038b) it.next();
            D.a(StubApp.getString2(18495) + c1038b + StubApp.getString2(1), treeSet.add(c1038b));
        }
        this.f14760a = Collections.unmodifiableList(list);
        this.f14761b = str;
        this.f14762c = arrayList == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList);
        this.f14763d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1040d.class == obj.getClass()) {
            C1040d c1040d = (C1040d) obj;
            if (D.k(this.f14760a, c1040d.f14760a) && D.k(this.f14761b, c1040d.f14761b) && D.k(this.f14763d, c1040d.f14763d) && D.k(this.f14762c, c1040d.f14762c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f14760a.hashCode() * 31;
        String str = this.f14761b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.f14762c;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.f14763d;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f14760a);
        String valueOf2 = String.valueOf(this.f14762c);
        String str = this.f14763d;
        int length = valueOf.length();
        String str2 = this.f14761b;
        int length2 = String.valueOf(str2).length();
        StringBuilder sb2 = new StringBuilder(length + 48 + length2 + 12 + valueOf2.length() + 18 + String.valueOf(str).length() + 1);
        E1.a.v(sb2, StubApp.getString2(18496), valueOf, StubApp.getString2(18497), str2);
        E1.a.v(sb2, StubApp.getString2(18498), valueOf2, StubApp.getString2(18499), str);
        sb2.append(StubApp.getString2(511));
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        D.h(parcel);
        int I10 = a4.f.I(parcel, 20293);
        a4.f.H(parcel, 1, this.f14760a);
        a4.f.F(parcel, 2, this.f14761b);
        a4.f.H(parcel, 3, this.f14762c);
        a4.f.F(parcel, 4, this.f14763d);
        a4.f.N(parcel, I10);
    }
}
