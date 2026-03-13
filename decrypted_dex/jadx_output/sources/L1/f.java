package L1;

import com.stub.StubApp;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f4171a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f4172b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f4173c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f4174d;

    public f(String name, Map columns, Set foreignKeys, Set set) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(foreignKeys, "foreignKeys");
        this.f4171a = name;
        this.f4172b = columns;
        this.f4173c = foreignKeys;
        this.f4174d = set;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0231, code lost:
    
        r0 = kotlin.collections.SetsKt.build(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0235, code lost:
    
        kotlin.io.CloseableKt.closeFinally(r3, null);
        r9 = r0;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final L1.f a(P1.c r26, java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L1.f.a(P1.c, java.lang.String):L1.f");
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!Intrinsics.areEqual(this.f4171a, fVar.f4171a) || !Intrinsics.areEqual(this.f4172b, fVar.f4172b) || !Intrinsics.areEqual(this.f4173c, fVar.f4173c)) {
            return false;
        }
        Set set2 = this.f4174d;
        if (set2 == null || (set = fVar.f4174d) == null) {
            return true;
        }
        return Intrinsics.areEqual(set2, set);
    }

    public final int hashCode() {
        return this.f4173c.hashCode() + ((this.f4172b.hashCode() + (this.f4171a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return StubApp.getString2(3355) + this.f4171a + StubApp.getString2(3356) + this.f4172b + StubApp.getString2(3357) + this.f4173c + StubApp.getString2(3358) + this.f4174d + '}';
    }
}
