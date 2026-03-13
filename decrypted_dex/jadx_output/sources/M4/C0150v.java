package M4;

import f5.u0;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: M4.v, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0150v extends AbstractMap implements Serializable {

    /* renamed from: k, reason: collision with root package name */
    public static final Object f4656k = new Object();

    /* renamed from: a, reason: collision with root package name */
    public transient Object f4657a;

    /* renamed from: b, reason: collision with root package name */
    public transient int[] f4658b;

    /* renamed from: c, reason: collision with root package name */
    public transient Object[] f4659c;

    /* renamed from: d, reason: collision with root package name */
    public transient Object[] f4660d;

    /* renamed from: e, reason: collision with root package name */
    public transient int f4661e;

    /* renamed from: f, reason: collision with root package name */
    public transient int f4662f;

    /* renamed from: g, reason: collision with root package name */
    public transient C0148t f4663g;

    /* renamed from: h, reason: collision with root package name */
    public transient C0148t f4664h;
    public transient C0143n j;

    public static C0150v a() {
        C0150v c0150v = new C0150v();
        c0150v.f4661e = Math.min(Math.max(3, 1), 1073741823);
        return c0150v;
    }

    public static C0150v b(int i3) {
        C0150v c0150v = new C0150v();
        hc.b.h("Expected size must be >= 0", i3 >= 0);
        c0150v.f4661e = Math.min(Math.max(i3, 1), 1073741823);
        return c0150v;
    }

    public final Map c() {
        Object obj = this.f4657a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (g()) {
            return;
        }
        this.f4661e += 32;
        Map c10 = c();
        if (c10 != null) {
            this.f4661e = Math.min(Math.max(size(), 3), 1073741823);
            c10.clear();
            this.f4657a = null;
            this.f4662f = 0;
            return;
        }
        Arrays.fill(j(), 0, this.f4662f, (Object) null);
        Arrays.fill(k(), 0, this.f4662f, (Object) null);
        Object obj = this.f4657a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(i(), 0, this.f4662f, 0);
        this.f4662f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map c10 = c();
        return c10 != null ? c10.containsKey(obj) : e(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map c10 = c();
        if (c10 != null) {
            return c10.containsValue(obj);
        }
        for (int i3 = 0; i3 < this.f4662f; i3++) {
            if (u0.j(obj, k()[i3])) {
                return true;
            }
        }
        return false;
    }

    public final int d() {
        return (1 << (this.f4661e & 31)) - 1;
    }

    public final int e(Object obj) {
        if (g()) {
            return -1;
        }
        int r8 = r.r(obj);
        int d8 = d();
        Object obj2 = this.f4657a;
        Objects.requireNonNull(obj2);
        int s10 = r.s(r8 & d8, obj2);
        if (s10 == 0) {
            return -1;
        }
        int i3 = ~d8;
        int i10 = r8 & i3;
        do {
            int i11 = s10 - 1;
            int i12 = i()[i11];
            if ((i12 & i3) == i10 && u0.j(obj, j()[i11])) {
                return i11;
            }
            s10 = i12 & d8;
        } while (s10 != 0);
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C0148t c0148t = this.f4664h;
        if (c0148t != null) {
            return c0148t;
        }
        C0148t c0148t2 = new C0148t(this, 0);
        this.f4664h = c0148t2;
        return c0148t2;
    }

    public final void f(int i3, int i10) {
        Object obj = this.f4657a;
        Objects.requireNonNull(obj);
        int[] i11 = i();
        Object[] j = j();
        Object[] k3 = k();
        int size = size();
        int i12 = size - 1;
        if (i3 >= i12) {
            j[i3] = null;
            k3[i3] = null;
            i11[i3] = 0;
            return;
        }
        Object obj2 = j[i12];
        j[i3] = obj2;
        k3[i3] = k3[i12];
        j[i12] = null;
        k3[i12] = null;
        i11[i3] = i11[i12];
        i11[i12] = 0;
        int r8 = r.r(obj2) & i10;
        int s10 = r.s(r8, obj);
        if (s10 == size) {
            r.t(r8, i3 + 1, obj);
            return;
        }
        while (true) {
            int i13 = s10 - 1;
            int i14 = i11[i13];
            int i15 = i14 & i10;
            if (i15 == size) {
                i11[i13] = r.m(i14, i3 + 1, i10);
                return;
            }
            s10 = i15;
        }
    }

    public final boolean g() {
        return this.f4657a == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map c10 = c();
        if (c10 != null) {
            return c10.get(obj);
        }
        int e10 = e(obj);
        if (e10 == -1) {
            return null;
        }
        return k()[e10];
    }

    public final Object h(Object obj) {
        boolean g10 = g();
        Object obj2 = f4656k;
        if (!g10) {
            int d8 = d();
            Object obj3 = this.f4657a;
            Objects.requireNonNull(obj3);
            int o5 = r.o(obj, null, d8, obj3, i(), j(), null);
            if (o5 != -1) {
                Object obj4 = k()[o5];
                f(o5, d8);
                this.f4662f--;
                this.f4661e += 32;
                return obj4;
            }
        }
        return obj2;
    }

    public final int[] i() {
        int[] iArr = this.f4658b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object[] j() {
        Object[] objArr = this.f4659c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] k() {
        Object[] objArr = this.f4660d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C0148t c0148t = this.f4663g;
        if (c0148t != null) {
            return c0148t;
        }
        C0148t c0148t2 = new C0148t(this, 1);
        this.f4663g = c0148t2;
        return c0148t2;
    }

    public final int l(int i3, int i10, int i11, int i12) {
        Object e10 = r.e(i10);
        int i13 = i10 - 1;
        if (i12 != 0) {
            r.t(i11 & i13, i12 + 1, e10);
        }
        Object obj = this.f4657a;
        Objects.requireNonNull(obj);
        int[] i14 = i();
        for (int i15 = 0; i15 <= i3; i15++) {
            int s10 = r.s(i15, obj);
            while (s10 != 0) {
                int i16 = s10 - 1;
                int i17 = i14[i16];
                int i18 = ((~i3) & i17) | i15;
                int i19 = i18 & i13;
                int s11 = r.s(i19, e10);
                r.t(i19, s10, e10);
                i14[i16] = r.m(i18, s11, i13);
                s10 = i17 & i3;
            }
        }
        this.f4657a = e10;
        this.f4661e = r.m(this.f4661e, 32 - Integer.numberOfLeadingZeros(i13), 31);
        return i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00eb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00fe -> B:43:0x00e4). Please report as a decompilation issue!!! */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object put(java.lang.Object r23, java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M4.C0150v.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map c10 = c();
        if (c10 != null) {
            return c10.remove(obj);
        }
        Object h2 = h(obj);
        if (h2 == f4656k) {
            return null;
        }
        return h2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map c10 = c();
        return c10 != null ? c10.size() : this.f4662f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C0143n c0143n = this.j;
        if (c0143n != null) {
            return c0143n;
        }
        C0143n c0143n2 = new C0143n(1, this);
        this.j = c0143n2;
        return c0143n2;
    }
}
