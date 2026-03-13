package M4;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e0 implements Map, Serializable {

    /* renamed from: g, reason: collision with root package name */
    public static final e0 f4606g = new e0(null, new Object[0], 0);

    /* renamed from: a, reason: collision with root package name */
    public transient b0 f4607a;

    /* renamed from: b, reason: collision with root package name */
    public transient c0 f4608b;

    /* renamed from: c, reason: collision with root package name */
    public transient d0 f4609c;

    /* renamed from: d, reason: collision with root package name */
    public final transient Object f4610d;

    /* renamed from: e, reason: collision with root package name */
    public final transient Object[] f4611e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f4612f;

    public e0(Object obj, Object[] objArr, int i3) {
        this.f4610d = obj;
        this.f4611e = objArr;
        this.f4612f = i3;
    }

    public static e0 a(Map map) {
        if ((map instanceof e0) && !(map instanceof SortedMap)) {
            e0 e0Var = (e0) map;
            e0Var.getClass();
            return e0Var;
        }
        Set entrySet = map.entrySet();
        Bc.i iVar = new Bc.i(entrySet != null ? entrySet.size() : 4, 5);
        iVar.p(entrySet);
        return iVar.h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0199  */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static M4.e0 b(int r19, java.lang.Object[] r20, Bc.i r21) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M4.e0.b(int, java.lang.Object[], Bc.i):M4.e0");
    }

    @Override // java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final M entrySet() {
        b0 b0Var = this.f4607a;
        if (b0Var != null) {
            return b0Var;
        }
        b0 b0Var2 = new b0(this, this.f4611e, this.f4612f);
        this.f4607a = b0Var2;
        return b0Var2;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final M keySet() {
        c0 c0Var = this.f4608b;
        if (c0Var != null) {
            return c0Var;
        }
        c0 c0Var2 = new c0(this, new d0(this.f4611e, 0, this.f4612f));
        this.f4608b = c0Var2;
        return c0Var2;
    }

    @Override // java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final D values() {
        d0 d0Var = this.f4609c;
        if (d0Var != null) {
            return d0Var;
        }
        d0 d0Var2 = new d0(this.f4611e, 1, this.f4612f);
        this.f4609c = d0Var2;
        return d0Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return r.f(this, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L6
        L3:
            r9 = r0
            goto L9c
        L6:
            r1 = 1
            java.lang.Object[] r2 = r8.f4611e
            int r3 = r8.f4612f
            if (r3 != r1) goto L20
            r3 = 0
            r3 = r2[r3]
            java.util.Objects.requireNonNull(r3)
            boolean r9 = r3.equals(r9)
            if (r9 == 0) goto L3
            r9 = r2[r1]
            java.util.Objects.requireNonNull(r9)
            goto L9c
        L20:
            java.lang.Object r3 = r8.f4610d
            if (r3 != 0) goto L25
            goto L3
        L25:
            boolean r4 = r3 instanceof byte[]
            if (r4 == 0) goto L50
            r4 = r3
            byte[] r4 = (byte[]) r4
            int r3 = r4.length
            int r5 = r3 + (-1)
            int r3 = r9.hashCode()
            int r3 = M4.r.q(r3)
        L37:
            r3 = r3 & r5
            r6 = r4[r3]
            r7 = 255(0xff, float:3.57E-43)
            r6 = r6 & r7
            if (r6 != r7) goto L40
            goto L3
        L40:
            r7 = r2[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L4d
            r9 = r6 ^ 1
            r9 = r2[r9]
            goto L9c
        L4d:
            int r3 = r3 + 1
            goto L37
        L50:
            boolean r4 = r3 instanceof short[]
            if (r4 == 0) goto L7c
            r4 = r3
            short[] r4 = (short[]) r4
            int r3 = r4.length
            int r5 = r3 + (-1)
            int r3 = r9.hashCode()
            int r3 = M4.r.q(r3)
        L62:
            r3 = r3 & r5
            short r6 = r4[r3]
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            if (r6 != r7) goto L6c
            goto L3
        L6c:
            r7 = r2[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L79
            r9 = r6 ^ 1
            r9 = r2[r9]
            goto L9c
        L79:
            int r3 = r3 + 1
            goto L62
        L7c:
            int[] r3 = (int[]) r3
            int r4 = r3.length
            int r4 = r4 - r1
            int r5 = r9.hashCode()
            int r5 = M4.r.q(r5)
        L88:
            r5 = r5 & r4
            r6 = r3[r5]
            r7 = -1
            if (r6 != r7) goto L90
            goto L3
        L90:
            r7 = r2[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto La0
            r9 = r6 ^ 1
            r9 = r2[r9]
        L9c:
            if (r9 != 0) goto L9f
            return r0
        L9f:
            return r9
        La0:
            int r5 = r5 + 1
            goto L88
        */
        throw new UnsupportedOperationException("Method not decompiled: M4.e0.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return r.k(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f4612f;
    }

    public final String toString() {
        int i3 = this.f4612f;
        r.d(i3, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(i3 * 8, 1073741824L));
        sb2.append('{');
        n0 it = ((b0) entrySet()).iterator();
        boolean z2 = true;
        while (true) {
            G g10 = (G) it;
            if (!g10.hasNext()) {
                sb2.append('}');
                return sb2.toString();
            }
            Map.Entry entry = (Map.Entry) g10.next();
            if (!z2) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z2 = false;
        }
    }
}
