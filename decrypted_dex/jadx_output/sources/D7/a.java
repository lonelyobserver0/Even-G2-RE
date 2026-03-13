package D7;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Float f1489a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1490b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1491c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f1492d;

    public a(Float f10, String str, boolean z2, Integer num) {
        this.f1489a = f10;
        this.f1490b = str;
        this.f1491c = z2;
        this.f1492d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual((Object) this.f1489a, (Object) aVar.f1489a) && Intrinsics.areEqual(this.f1490b, aVar.f1490b) && this.f1491c == aVar.f1491c && Intrinsics.areEqual(this.f1492d, aVar.f1492d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        Float f10 = this.f1489a;
        int hashCode = (f10 == null ? 0 : f10.hashCode()) * 31;
        String str = this.f1490b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z2 = this.f1491c;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i10 = (hashCode2 + i3) * 31;
        Integer num = this.f1492d;
        return i10 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return StubApp.getString2(1521) + this.f1489a + StubApp.getString2(1522) + this.f1490b + StubApp.getString2(1523) + this.f1491c + StubApp.getString2(1524) + this.f1492d + ')';
    }
}
