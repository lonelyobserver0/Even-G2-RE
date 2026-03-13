package wc;

import com.stub.StubApp;
import f4.C0879c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class s implements Iterable, KMappedMarker {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f22417a;

    public s(String[] strArr) {
        this.f22417a = strArr;
    }

    public final String a(String name) {
        boolean equals;
        Intrinsics.checkNotNullParameter(name, "name");
        String[] strArr = this.f22417a;
        int length = strArr.length - 2;
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(length, 0, -2);
        if (progressionLastElement > length) {
            return null;
        }
        while (true) {
            int i3 = length - 2;
            equals = StringsKt__StringsJVMKt.equals(name, strArr[length], true);
            if (equals) {
                return strArr[length + 1];
            }
            if (length == progressionLastElement) {
                return null;
            }
            length = i3;
        }
    }

    public final String b(int i3) {
        return this.f22417a[i3 * 2];
    }

    public final C0879c c() {
        C0879c c0879c = new C0879c(22);
        CollectionsKt.addAll((ArrayList) c0879c.f13742a, this.f22417a);
        return c0879c;
    }

    public final String d(int i3) {
        return this.f22417a[(i3 * 2) + 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return Arrays.equals(this.f22417a, ((s) obj).f22417a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f22417a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i3 = 0; i3 < size; i3++) {
            pairArr[i3] = TuplesKt.to(b(i3), d(i3));
        }
        return ArrayIteratorKt.iterator(pairArr);
    }

    public final int size() {
        return this.f22417a.length / 2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        int i3 = 0;
        while (i3 < size) {
            int i10 = i3 + 1;
            String b2 = b(i3);
            String d8 = d(i3);
            sb2.append(b2);
            sb2.append(StubApp.getString2(994));
            if (xc.b.q(b2)) {
                d8 = StubApp.getString2(35573);
            }
            sb2.append(d8);
            sb2.append(StubApp.getString2(3692));
            i3 = i10;
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
