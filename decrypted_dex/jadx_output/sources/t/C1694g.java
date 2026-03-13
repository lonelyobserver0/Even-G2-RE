package t;

import com.stub.StubApp;
import i2.u;
import java.util.Arrays;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import u.AbstractC1769a;

/* renamed from: t.g, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1694g implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f21026a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ long[] f21027b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f21028c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f21029d;

    public C1694g() {
        int i3;
        int i10 = 4;
        while (true) {
            i3 = 80;
            if (i10 >= 32) {
                break;
            }
            int i11 = (1 << i10) - 12;
            if (80 <= i11) {
                i3 = i11;
                break;
            }
            i10++;
        }
        int i12 = i3 / 8;
        this.f21027b = new long[i12];
        this.f21028c = new Object[i12];
    }

    public final void a() {
        int i3 = this.f21029d;
        Object[] objArr = this.f21028c;
        for (int i10 = 0; i10 < i3; i10++) {
            objArr[i10] = null;
        }
        this.f21029d = 0;
        this.f21026a = false;
    }

    public final Object b(long j) {
        Object obj;
        int b2 = AbstractC1769a.b(this.f21027b, this.f21029d, j);
        if (b2 < 0 || (obj = this.f21028c[b2]) == AbstractC1695h.f21030a) {
            return null;
        }
        return obj;
    }

    public final long c(int i3) {
        int i10;
        if (i3 < 0 || i3 >= (i10 = this.f21029d)) {
            throw new IllegalArgumentException(u.p(i3, StubApp.getString2(23374)).toString());
        }
        if (this.f21026a) {
            long[] jArr = this.f21027b;
            Object[] objArr = this.f21028c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != AbstractC1695h.f21030a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f21026a = false;
            this.f21029d = i11;
        }
        return this.f21027b[i3];
    }

    public final Object clone() {
        Object clone = super.clone();
        Intrinsics.checkNotNull(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        C1694g c1694g = (C1694g) clone;
        c1694g.f21027b = (long[]) this.f21027b.clone();
        c1694g.f21028c = (Object[]) this.f21028c.clone();
        return c1694g;
    }

    public final void d(long j, Object obj) {
        int b2 = AbstractC1769a.b(this.f21027b, this.f21029d, j);
        if (b2 >= 0) {
            this.f21028c[b2] = obj;
            return;
        }
        int i3 = ~b2;
        int i10 = this.f21029d;
        Object obj2 = AbstractC1695h.f21030a;
        if (i3 < i10) {
            Object[] objArr = this.f21028c;
            if (objArr[i3] == obj2) {
                this.f21027b[i3] = j;
                objArr[i3] = obj;
                return;
            }
        }
        if (this.f21026a) {
            long[] jArr = this.f21027b;
            if (i10 >= jArr.length) {
                Object[] objArr2 = this.f21028c;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj3 = objArr2[i12];
                    if (obj3 != obj2) {
                        if (i12 != i11) {
                            jArr[i11] = jArr[i12];
                            objArr2[i11] = obj3;
                            objArr2[i12] = null;
                        }
                        i11++;
                    }
                }
                this.f21026a = false;
                this.f21029d = i11;
                i3 = ~AbstractC1769a.b(this.f21027b, i11, j);
            }
        }
        int i13 = this.f21029d;
        if (i13 >= this.f21027b.length) {
            int i14 = (i13 + 1) * 8;
            int i15 = 4;
            while (true) {
                if (i15 >= 32) {
                    break;
                }
                int i16 = (1 << i15) - 12;
                if (i14 <= i16) {
                    i14 = i16;
                    break;
                }
                i15++;
            }
            int i17 = i14 / 8;
            long[] copyOf = Arrays.copyOf(this.f21027b, i17);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f21027b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f21028c, i17);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f21028c = copyOf2;
        }
        int i18 = this.f21029d;
        if (i18 - i3 != 0) {
            long[] jArr2 = this.f21027b;
            int i19 = i3 + 1;
            ArraysKt___ArraysJvmKt.copyInto(jArr2, jArr2, i19, i3, i18);
            Object[] objArr3 = this.f21028c;
            ArraysKt___ArraysJvmKt.copyInto(objArr3, objArr3, i19, i3, this.f21029d);
        }
        this.f21027b[i3] = j;
        this.f21028c[i3] = obj;
        this.f21029d++;
    }

    public final int e() {
        if (this.f21026a) {
            int i3 = this.f21029d;
            long[] jArr = this.f21027b;
            Object[] objArr = this.f21028c;
            int i10 = 0;
            for (int i11 = 0; i11 < i3; i11++) {
                Object obj = objArr[i11];
                if (obj != AbstractC1695h.f21030a) {
                    if (i11 != i10) {
                        jArr[i10] = jArr[i11];
                        objArr[i10] = obj;
                        objArr[i11] = null;
                    }
                    i10++;
                }
            }
            this.f21026a = false;
            this.f21029d = i10;
        }
        return this.f21029d;
    }

    public final Object f(int i3) {
        int i10;
        if (i3 < 0 || i3 >= (i10 = this.f21029d)) {
            throw new IllegalArgumentException(u.p(i3, StubApp.getString2(23374)).toString());
        }
        if (this.f21026a) {
            long[] jArr = this.f21027b;
            Object[] objArr = this.f21028c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != AbstractC1695h.f21030a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f21026a = false;
            this.f21029d = i11;
        }
        return this.f21028c[i3];
    }

    public final String toString() {
        if (e() <= 0) {
            return StubApp.getString2(14007);
        }
        StringBuilder sb2 = new StringBuilder(this.f21029d * 28);
        sb2.append('{');
        int i3 = this.f21029d;
        for (int i10 = 0; i10 < i3; i10++) {
            if (i10 > 0) {
                sb2.append(StubApp.getString2(81));
            }
            sb2.append(c(i10));
            sb2.append('=');
            Object f10 = f(i10);
            if (f10 != sb2) {
                sb2.append(f10);
            } else {
                sb2.append(StubApp.getString2(23375));
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
