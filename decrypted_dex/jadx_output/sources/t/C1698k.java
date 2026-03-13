package t;

import com.stub.StubApp;
import java.util.Arrays;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import u.AbstractC1769a;

/* renamed from: t.k, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1698k implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ int[] f21041a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object[] f21042b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ int f21043c;

    public C1698k() {
        int i3;
        int i10 = 4;
        while (true) {
            i3 = 40;
            if (i10 >= 32) {
                break;
            }
            int i11 = (1 << i10) - 12;
            if (40 <= i11) {
                i3 = i11;
                break;
            }
            i10++;
        }
        int i12 = i3 / 4;
        this.f21041a = new int[i12];
        this.f21042b = new Object[i12];
    }

    public final void a(int i3, Object obj) {
        int i10 = this.f21043c;
        if (i10 != 0 && i3 <= this.f21041a[i10 - 1]) {
            c(i3, obj);
            return;
        }
        if (i10 >= this.f21041a.length) {
            int i11 = (i10 + 1) * 4;
            int i12 = 4;
            while (true) {
                if (i12 >= 32) {
                    break;
                }
                int i13 = (1 << i12) - 12;
                if (i11 <= i13) {
                    i11 = i13;
                    break;
                }
                i12++;
            }
            int i14 = i11 / 4;
            int[] copyOf = Arrays.copyOf(this.f21041a, i14);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f21041a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f21042b, i14);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f21042b = copyOf2;
        }
        this.f21041a[i10] = i3;
        this.f21042b[i10] = obj;
        this.f21043c = i10 + 1;
    }

    public final Object b(int i3) {
        Object obj;
        Intrinsics.checkNotNullParameter(this, "<this>");
        int a3 = AbstractC1769a.a(this.f21043c, i3, this.f21041a);
        if (a3 < 0 || (obj = this.f21042b[a3]) == AbstractC1695h.f21031b) {
            return null;
        }
        return obj;
    }

    public final void c(int i3, Object obj) {
        int a3 = AbstractC1769a.a(this.f21043c, i3, this.f21041a);
        if (a3 >= 0) {
            this.f21042b[a3] = obj;
            return;
        }
        int i10 = ~a3;
        int i11 = this.f21043c;
        if (i10 < i11) {
            Object[] objArr = this.f21042b;
            if (objArr[i10] == AbstractC1695h.f21031b) {
                this.f21041a[i10] = i3;
                objArr[i10] = obj;
                return;
            }
        }
        if (i11 >= this.f21041a.length) {
            int i12 = (i11 + 1) * 4;
            int i13 = 4;
            while (true) {
                if (i13 >= 32) {
                    break;
                }
                int i14 = (1 << i13) - 12;
                if (i12 <= i14) {
                    i12 = i14;
                    break;
                }
                i13++;
            }
            int i15 = i12 / 4;
            int[] copyOf = Arrays.copyOf(this.f21041a, i15);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f21041a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f21042b, i15);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f21042b = copyOf2;
        }
        int i16 = this.f21043c;
        if (i16 - i10 != 0) {
            int[] iArr = this.f21041a;
            int i17 = i10 + 1;
            ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, i17, i10, i16);
            Object[] objArr2 = this.f21042b;
            ArraysKt___ArraysJvmKt.copyInto(objArr2, objArr2, i17, i10, this.f21043c);
        }
        this.f21041a[i10] = i3;
        this.f21042b[i10] = obj;
        this.f21043c++;
    }

    public final Object clone() {
        Object clone = super.clone();
        Intrinsics.checkNotNull(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        C1698k c1698k = (C1698k) clone;
        c1698k.f21041a = (int[]) this.f21041a.clone();
        c1698k.f21042b = (Object[]) this.f21042b.clone();
        return c1698k;
    }

    public final String toString() {
        int i3 = this.f21043c;
        if (i3 <= 0) {
            return StubApp.getString2(14007);
        }
        StringBuilder sb2 = new StringBuilder(i3 * 28);
        sb2.append('{');
        int i10 = this.f21043c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(StubApp.getString2(81));
            }
            sb2.append(this.f21041a[i11]);
            sb2.append('=');
            Object obj = this.f21042b[i11];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append(StubApp.getString2(23375));
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "buffer.toString()");
        return sb3;
    }
}
