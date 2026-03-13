package t;

import com.stub.StubApp;
import i2.u;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import u.AbstractC1769a;

/* renamed from: t.j, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class C1697j {

    /* renamed from: a, reason: collision with root package name */
    public int[] f21038a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f21039b;

    /* renamed from: c, reason: collision with root package name */
    public int f21040c;

    public C1697j(int i3) {
        this.f21038a = i3 == 0 ? AbstractC1769a.f21382a : new int[i3];
        this.f21039b = i3 == 0 ? AbstractC1769a.f21383b : new Object[i3 << 1];
    }

    public final int a(Object obj) {
        int i3 = this.f21040c * 2;
        Object[] objArr = this.f21039b;
        if (obj == null) {
            for (int i10 = 1; i10 < i3; i10 += 2) {
                if (objArr[i10] == null) {
                    return i10 >> 1;
                }
            }
            return -1;
        }
        for (int i11 = 1; i11 < i3; i11 += 2) {
            if (Intrinsics.areEqual(obj, objArr[i11])) {
                return i11 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i3) {
        int i10 = this.f21040c;
        int[] iArr = this.f21038a;
        if (iArr.length < i3) {
            int[] copyOf = Arrays.copyOf(iArr, i3);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f21038a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f21039b, i3 * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f21039b = copyOf2;
        }
        if (this.f21040c != i10) {
            throw new ConcurrentModificationException();
        }
    }

    public final int c(int i3, Object obj) {
        int i10 = this.f21040c;
        if (i10 == 0) {
            return -1;
        }
        int a3 = AbstractC1769a.a(i10, i3, this.f21038a);
        if (a3 < 0 || Intrinsics.areEqual(obj, this.f21039b[a3 << 1])) {
            return a3;
        }
        int i11 = a3 + 1;
        while (i11 < i10 && this.f21038a[i11] == i3) {
            if (Intrinsics.areEqual(obj, this.f21039b[i11 << 1])) {
                return i11;
            }
            i11++;
        }
        for (int i12 = a3 - 1; i12 >= 0 && this.f21038a[i12] == i3; i12--) {
            if (Intrinsics.areEqual(obj, this.f21039b[i12 << 1])) {
                return i12;
            }
        }
        return ~i11;
    }

    public final void clear() {
        if (this.f21040c > 0) {
            this.f21038a = AbstractC1769a.f21382a;
            this.f21039b = AbstractC1769a.f21383b;
            this.f21040c = 0;
        }
        if (this.f21040c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return d(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d(Object obj) {
        return obj == null ? e() : c(obj.hashCode(), obj);
    }

    public final int e() {
        int i3 = this.f21040c;
        if (i3 == 0) {
            return -1;
        }
        int a3 = AbstractC1769a.a(i3, 0, this.f21038a);
        if (a3 < 0 || this.f21039b[a3 << 1] == null) {
            return a3;
        }
        int i10 = a3 + 1;
        while (i10 < i3 && this.f21038a[i10] == 0) {
            if (this.f21039b[i10 << 1] == null) {
                return i10;
            }
            i10++;
        }
        for (int i11 = a3 - 1; i11 >= 0 && this.f21038a[i11] == 0; i11--) {
            if (this.f21039b[i11 << 1] == null) {
                return i11;
            }
        }
        return ~i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof C1697j) {
                int i3 = this.f21040c;
                if (i3 != ((C1697j) obj).f21040c) {
                    return false;
                }
                C1697j c1697j = (C1697j) obj;
                for (int i10 = 0; i10 < i3; i10++) {
                    Object f10 = f(i10);
                    Object i11 = i(i10);
                    Object obj2 = c1697j.get(f10);
                    if (i11 == null) {
                        if (obj2 != null || !c1697j.containsKey(f10)) {
                            return false;
                        }
                    } else if (!Intrinsics.areEqual(i11, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f21040c != ((Map) obj).size()) {
                return false;
            }
            int i12 = this.f21040c;
            for (int i13 = 0; i13 < i12; i13++) {
                Object f11 = f(i13);
                Object i14 = i(i13);
                Object obj3 = ((Map) obj).get(f11);
                if (i14 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(f11)) {
                        return false;
                    }
                } else if (!Intrinsics.areEqual(i14, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i3) {
        if (i3 < 0 || i3 >= this.f21040c) {
            throw new IllegalArgumentException(u.p(i3, StubApp.getString2(23374)).toString());
        }
        return this.f21039b[i3 << 1];
    }

    public final Object g(int i3) {
        int i10;
        if (i3 < 0 || i3 >= (i10 = this.f21040c)) {
            throw new IllegalArgumentException(u.p(i3, StubApp.getString2(23374)).toString());
        }
        Object[] objArr = this.f21039b;
        int i11 = i3 << 1;
        Object obj = objArr[i11 + 1];
        if (i10 <= 1) {
            clear();
            return obj;
        }
        int i12 = i10 - 1;
        int[] iArr = this.f21038a;
        if (iArr.length <= 8 || i10 >= iArr.length / 3) {
            if (i3 < i12) {
                int i13 = i3 + 1;
                ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, i3, i13, i10);
                Object[] objArr2 = this.f21039b;
                ArraysKt___ArraysJvmKt.copyInto(objArr2, objArr2, i11, i13 << 1, i10 << 1);
            }
            Object[] objArr3 = this.f21039b;
            int i14 = i12 << 1;
            objArr3[i14] = null;
            objArr3[i14 + 1] = null;
        } else {
            int i15 = i10 > 8 ? i10 + (i10 >> 1) : 8;
            int[] copyOf = Arrays.copyOf(iArr, i15);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f21038a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f21039b, i15 << 1);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f21039b = copyOf2;
            if (i10 != this.f21040c) {
                throw new ConcurrentModificationException();
            }
            if (i3 > 0) {
                ArraysKt___ArraysJvmKt.copyInto(iArr, this.f21038a, 0, 0, i3);
                ArraysKt___ArraysJvmKt.copyInto(objArr, this.f21039b, 0, 0, i11);
            }
            if (i3 < i12) {
                int i16 = i3 + 1;
                ArraysKt___ArraysJvmKt.copyInto(iArr, this.f21038a, i3, i16, i10);
                ArraysKt___ArraysJvmKt.copyInto(objArr, this.f21039b, i11, i16 << 1, i10 << 1);
            }
        }
        if (i10 != this.f21040c) {
            throw new ConcurrentModificationException();
        }
        this.f21040c = i12;
        return obj;
    }

    public Object get(Object obj) {
        int d8 = d(obj);
        if (d8 >= 0) {
            return this.f21039b[(d8 << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int d8 = d(obj);
        return d8 >= 0 ? this.f21039b[(d8 << 1) + 1] : obj2;
    }

    public final Object h(int i3, Object obj) {
        if (i3 < 0 || i3 >= this.f21040c) {
            throw new IllegalArgumentException(u.p(i3, StubApp.getString2(23374)).toString());
        }
        int i10 = (i3 << 1) + 1;
        Object[] objArr = this.f21039b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    public final int hashCode() {
        int[] iArr = this.f21038a;
        Object[] objArr = this.f21039b;
        int i3 = this.f21040c;
        int i10 = 1;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i3) {
            Object obj = objArr[i10];
            i12 += (obj != null ? obj.hashCode() : 0) ^ iArr[i11];
            i11++;
            i10 += 2;
        }
        return i12;
    }

    public final Object i(int i3) {
        if (i3 < 0 || i3 >= this.f21040c) {
            throw new IllegalArgumentException(u.p(i3, StubApp.getString2(23374)).toString());
        }
        return this.f21039b[(i3 << 1) + 1];
    }

    public final boolean isEmpty() {
        return this.f21040c <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i3 = this.f21040c;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int c10 = obj != null ? c(hashCode, obj) : e();
        if (c10 >= 0) {
            int i10 = (c10 << 1) + 1;
            Object[] objArr = this.f21039b;
            Object obj3 = objArr[i10];
            objArr[i10] = obj2;
            return obj3;
        }
        int i11 = ~c10;
        int[] iArr = this.f21038a;
        if (i3 >= iArr.length) {
            int i12 = 8;
            if (i3 >= 8) {
                i12 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i12 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i12);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f21038a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f21039b, i12 << 1);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f21039b = copyOf2;
            if (i3 != this.f21040c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i11 < i3) {
            int[] iArr2 = this.f21038a;
            int i13 = i11 + 1;
            ArraysKt___ArraysJvmKt.copyInto(iArr2, iArr2, i13, i11, i3);
            Object[] objArr2 = this.f21039b;
            ArraysKt___ArraysJvmKt.copyInto(objArr2, objArr2, i13 << 1, i11 << 1, this.f21040c << 1);
        }
        int i14 = this.f21040c;
        if (i3 == i14) {
            int[] iArr3 = this.f21038a;
            if (i11 < iArr3.length) {
                iArr3[i11] = hashCode;
                Object[] objArr3 = this.f21039b;
                int i15 = i11 << 1;
                objArr3[i15] = obj;
                objArr3[i15 + 1] = obj2;
                this.f21040c = i14 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int d8 = d(obj);
        if (d8 >= 0) {
            return g(d8);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int d8 = d(obj);
        if (d8 >= 0) {
            return h(d8, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f21040c;
    }

    public final String toString() {
        if (isEmpty()) {
            return StubApp.getString2(14007);
        }
        StringBuilder sb2 = new StringBuilder(this.f21040c * 28);
        sb2.append('{');
        int i3 = this.f21040c;
        for (int i10 = 0; i10 < i3; i10++) {
            if (i10 > 0) {
                sb2.append(StubApp.getString2(81));
            }
            Object f10 = f(i10);
            String string2 = StubApp.getString2(23375);
            if (f10 != sb2) {
                sb2.append(f10);
            } else {
                sb2.append(string2);
            }
            sb2.append('=');
            Object i11 = i(i10);
            if (i11 != sb2) {
                sb2.append(i11);
            } else {
                sb2.append(string2);
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }

    public final boolean remove(Object obj, Object obj2) {
        int d8 = d(obj);
        if (d8 < 0 || !Intrinsics.areEqual(obj2, i(d8))) {
            return false;
        }
        g(d8);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int d8 = d(obj);
        if (d8 < 0 || !Intrinsics.areEqual(obj2, i(d8))) {
            return false;
        }
        h(d8, obj3);
        return true;
    }
}
