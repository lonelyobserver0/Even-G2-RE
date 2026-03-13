package t;

import com.stub.StubApp;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableCollection;
import kotlin.jvm.internal.markers.KMutableSet;
import u.AbstractC1769a;

/* renamed from: t.f, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1693f implements Collection, Set, KMutableCollection, KMutableSet {

    /* renamed from: a, reason: collision with root package name */
    public int[] f21023a = AbstractC1769a.f21382a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f21024b = AbstractC1769a.f21383b;

    /* renamed from: c, reason: collision with root package name */
    public int f21025c;

    public C1693f(int i3) {
        if (i3 > 0) {
            AbstractC1695h.a(this, i3);
        }
    }

    public final Object a(int i3) {
        int i10 = this.f21025c;
        Object[] objArr = this.f21024b;
        Object obj = objArr[i3];
        if (i10 <= 1) {
            clear();
            return obj;
        }
        int i11 = i10 - 1;
        int[] iArr = this.f21023a;
        if (iArr.length <= 8 || i10 >= iArr.length / 3) {
            if (i3 < i11) {
                int i12 = i3 + 1;
                ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, i3, i12, i10);
                Object[] objArr2 = this.f21024b;
                ArraysKt___ArraysJvmKt.copyInto(objArr2, objArr2, i3, i12, i10);
            }
            this.f21024b[i11] = null;
        } else {
            AbstractC1695h.a(this, i10 > 8 ? i10 + (i10 >> 1) : 8);
            if (i3 > 0) {
                ArraysKt___ArraysJvmKt.copyInto$default(iArr, this.f21023a, 0, 0, i3, 6, (Object) null);
                ArraysKt___ArraysJvmKt.copyInto$default(objArr, this.f21024b, 0, 0, i3, 6, (Object) null);
            }
            if (i3 < i11) {
                int i13 = i3 + 1;
                ArraysKt___ArraysJvmKt.copyInto(iArr, this.f21023a, i3, i13, i10);
                ArraysKt___ArraysJvmKt.copyInto(objArr, this.f21024b, i3, i13, i10);
            }
        }
        if (i10 != this.f21025c) {
            throw new ConcurrentModificationException();
        }
        this.f21025c = i11;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i3;
        int b2;
        int i10 = this.f21025c;
        if (obj == null) {
            Intrinsics.checkNotNullParameter(this, "<this>");
            b2 = AbstractC1695h.b(this, null, 0);
            i3 = 0;
        } else {
            int hashCode = obj.hashCode();
            i3 = hashCode;
            b2 = AbstractC1695h.b(this, obj, hashCode);
        }
        if (b2 >= 0) {
            return false;
        }
        int i11 = ~b2;
        int[] iArr = this.f21023a;
        if (i10 >= iArr.length) {
            int i12 = 8;
            if (i10 >= 8) {
                i12 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i12 = 4;
            }
            Object[] objArr = this.f21024b;
            AbstractC1695h.a(this, i12);
            if (i10 != this.f21025c) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f21023a;
            if (iArr2.length != 0) {
                ArraysKt___ArraysJvmKt.copyInto$default(iArr, iArr2, 0, 0, iArr.length, 6, (Object) null);
                ArraysKt___ArraysJvmKt.copyInto$default(objArr, this.f21024b, 0, 0, objArr.length, 6, (Object) null);
            }
        }
        if (i11 < i10) {
            int[] iArr3 = this.f21023a;
            int i13 = i11 + 1;
            ArraysKt___ArraysJvmKt.copyInto(iArr3, iArr3, i13, i11, i10);
            Object[] objArr2 = this.f21024b;
            ArraysKt___ArraysJvmKt.copyInto(objArr2, objArr2, i13, i11, i10);
        }
        int i14 = this.f21025c;
        if (i10 == i14) {
            int[] iArr4 = this.f21023a;
            if (i11 < iArr4.length) {
                iArr4[i11] = i3;
                this.f21024b[i11] = obj;
                this.f21025c = i14 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int size = elements.size() + this.f21025c;
        int i3 = this.f21025c;
        int[] iArr = this.f21023a;
        if (iArr.length < size) {
            Object[] objArr = this.f21024b;
            AbstractC1695h.a(this, size);
            int i10 = this.f21025c;
            if (i10 > 0) {
                ArraysKt___ArraysJvmKt.copyInto$default(iArr, this.f21023a, 0, 0, i10, 6, (Object) null);
                ArraysKt___ArraysJvmKt.copyInto$default(objArr, this.f21024b, 0, 0, this.f21025c, 6, (Object) null);
            }
        }
        if (this.f21025c != i3) {
            throw new ConcurrentModificationException();
        }
        Iterator it = elements.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            z2 |= add(it.next());
        }
        return z2;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f21025c != 0) {
            int[] iArr = AbstractC1769a.f21382a;
            Intrinsics.checkNotNullParameter(iArr, "<set-?>");
            this.f21023a = iArr;
            Object[] objArr = AbstractC1769a.f21383b;
            Intrinsics.checkNotNullParameter(objArr, "<set-?>");
            this.f21024b = objArr;
            this.f21025c = 0;
        }
        if (this.f21025c != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int b2;
        if (obj == null) {
            Intrinsics.checkNotNullParameter(this, "<this>");
            b2 = AbstractC1695h.b(this, null, 0);
        } else {
            b2 = AbstractC1695h.b(this, obj, obj.hashCode());
        }
        return b2 >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f21025c != ((Set) obj).size()) {
            return false;
        }
        try {
            int i3 = this.f21025c;
            for (int i10 = 0; i10 < i3; i10++) {
                if (!((Set) obj).contains(this.f21024b[i10])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f21023a;
        int i3 = this.f21025c;
        int i10 = 0;
        for (int i11 = 0; i11 < i3; i11++) {
            i10 += iArr[i11];
        }
        return i10;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f21025c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C1688a(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int b2;
        if (obj == null) {
            Intrinsics.checkNotNullParameter(this, "<this>");
            b2 = AbstractC1695h.b(this, null, 0);
        } else {
            b2 = AbstractC1695h.b(this, obj, obj.hashCode());
        }
        if (b2 < 0) {
            return false;
        }
        a(b2);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it = elements.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            z2 |= remove(it.next());
        }
        return z2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        boolean contains;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z2 = false;
        for (int i3 = this.f21025c - 1; -1 < i3; i3--) {
            contains = CollectionsKt___CollectionsKt.contains(elements, this.f21024b[i3]);
            if (!contains) {
                a(i3);
                z2 = true;
            }
        }
        return z2;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f21025c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return ArraysKt.copyOfRange(this.f21024b, 0, this.f21025c);
    }

    public final String toString() {
        if (isEmpty()) {
            return StubApp.getString2(14007);
        }
        StringBuilder sb2 = new StringBuilder(this.f21025c * 14);
        sb2.append('{');
        int i3 = this.f21025c;
        for (int i10 = 0; i10 < i3; i10++) {
            if (i10 > 0) {
                sb2.append(StubApp.getString2(81));
            }
            Object obj = this.f21024b[i10];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append(StubApp.getString2(23373));
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] result) {
        Intrinsics.checkNotNullParameter(result, "array");
        int i3 = this.f21025c;
        if (result.length < i3) {
            result = (Object[]) Array.newInstance(result.getClass().getComponentType(), i3);
        } else if (result.length > i3) {
            result[i3] = null;
        }
        ArraysKt___ArraysJvmKt.copyInto(this.f21024b, result, 0, 0, this.f21025c);
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }
}
