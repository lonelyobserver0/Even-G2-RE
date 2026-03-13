package Z1;

import Ac.m;
import com.stub.StubApp;
import java.math.BigInteger;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class i implements Comparable {

    /* renamed from: f, reason: collision with root package name */
    public static final i f8964f;

    /* renamed from: a, reason: collision with root package name */
    public final int f8965a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8966b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8967c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8968d;

    /* renamed from: e, reason: collision with root package name */
    public final Lazy f8969e = LazyKt.lazy(new m(this, 15));

    static {
        new i(0, 0, 0, "");
        f8964f = new i(0, 1, 0, "");
        new i(1, 0, 0, "");
    }

    public i(int i3, int i10, int i11, String str) {
        this.f8965a = i3;
        this.f8966b = i10;
        this.f8967c = i11;
        this.f8968d = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        i other = (i) obj;
        Intrinsics.checkNotNullParameter(other, "other");
        Object value = this.f8969e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-bigInteger>(...)");
        Object value2 = other.f8969e.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "<get-bigInteger>(...)");
        return ((BigInteger) value).compareTo((BigInteger) value2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f8965a == iVar.f8965a && this.f8966b == iVar.f8966b && this.f8967c == iVar.f8967c;
    }

    public final int hashCode() {
        return ((((527 + this.f8965a) * 31) + this.f8966b) * 31) + this.f8967c;
    }

    public final String toString() {
        String str = this.f8968d;
        String j = !StringsKt.isBlank(str) ? E1.a.j(StubApp.getString2(999), str) : "";
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f8965a);
        sb2.append('.');
        sb2.append(this.f8966b);
        sb2.append('.');
        return AbstractC1482f.f(this.f8967c, j, sb2);
    }
}
