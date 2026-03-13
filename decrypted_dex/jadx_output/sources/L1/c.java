package L1;

import com.stub.StubApp;
import i2.u;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f4158a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4159b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4160c;

    /* renamed from: d, reason: collision with root package name */
    public final List f4161d;

    /* renamed from: e, reason: collision with root package name */
    public final List f4162e;

    public c(String referenceTable, String onDelete, String onUpdate, List columnNames, List referenceColumnNames) {
        Intrinsics.checkNotNullParameter(referenceTable, "referenceTable");
        Intrinsics.checkNotNullParameter(onDelete, "onDelete");
        Intrinsics.checkNotNullParameter(onUpdate, "onUpdate");
        Intrinsics.checkNotNullParameter(columnNames, "columnNames");
        Intrinsics.checkNotNullParameter(referenceColumnNames, "referenceColumnNames");
        this.f4158a = referenceTable;
        this.f4159b = onDelete;
        this.f4160c = onUpdate;
        this.f4161d = columnNames;
        this.f4162e = referenceColumnNames;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (Intrinsics.areEqual(this.f4158a, cVar.f4158a) && Intrinsics.areEqual(this.f4159b, cVar.f4159b) && Intrinsics.areEqual(this.f4160c, cVar.f4160c) && Intrinsics.areEqual(this.f4161d, cVar.f4161d)) {
            return Intrinsics.areEqual(this.f4162e, cVar.f4162e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4162e.hashCode() + E1.a.g(u.d(u.d(this.f4158a.hashCode() * 31, 31, this.f4159b), 31, this.f4160c), 31, this.f4161d);
    }

    public final String toString() {
        return StubApp.getString2(3332) + this.f4158a + StubApp.getString2(3333) + this.f4159b + StubApp.getString2(3334) + this.f4160c + StubApp.getString2(3335) + this.f4161d + StubApp.getString2(3336) + this.f4162e + '}';
    }
}
