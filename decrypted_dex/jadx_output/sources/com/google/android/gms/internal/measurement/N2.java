package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class N2 extends AbstractMap {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f11316a;

    /* renamed from: b, reason: collision with root package name */
    public int f11317b;

    /* renamed from: c, reason: collision with root package name */
    public Map f11318c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11319d;

    /* renamed from: e, reason: collision with root package name */
    public volatile androidx.datastore.preferences.protobuf.Z f11320e;

    /* renamed from: f, reason: collision with root package name */
    public Map f11321f;

    public N2() {
        Map map = Collections.EMPTY_MAP;
        this.f11318c = map;
        this.f11321f = map;
    }

    public final O2 a(int i3) {
        if (i3 < this.f11317b) {
            return (O2) this.f11316a[i3];
        }
        throw new ArrayIndexOutOfBoundsException(i3);
    }

    public final Set b() {
        return this.f11318c.isEmpty() ? Collections.EMPTY_SET : this.f11318c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        f();
        int e10 = e(comparable);
        if (e10 >= 0) {
            return ((O2) this.f11316a[e10]).setValue(obj);
        }
        f();
        if (this.f11316a == null) {
            this.f11316a = new Object[16];
        }
        int i3 = -(e10 + 1);
        if (i3 >= 16) {
            return g().put(comparable, obj);
        }
        if (this.f11317b == 16) {
            O2 o22 = (O2) this.f11316a[15];
            this.f11317b = 15;
            g().put(o22.f11323a, o22.f11324b);
        }
        Object[] objArr = this.f11316a;
        int length = objArr.length;
        System.arraycopy(objArr, i3, objArr, i3 + 1, 15 - i3);
        this.f11316a[i3] = new O2(this, comparable, obj);
        this.f11317b++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        f();
        if (this.f11317b != 0) {
            this.f11316a = null;
            this.f11317b = 0;
        }
        if (this.f11318c.isEmpty()) {
            return;
        }
        this.f11318c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return e(comparable) >= 0 || this.f11318c.containsKey(comparable);
    }

    public final Object d(int i3) {
        f();
        Object[] objArr = this.f11316a;
        Object obj = ((O2) objArr[i3]).f11324b;
        System.arraycopy(objArr, i3 + 1, objArr, i3, (this.f11317b - i3) - 1);
        this.f11317b--;
        if (!this.f11318c.isEmpty()) {
            Iterator it = g().entrySet().iterator();
            Object[] objArr2 = this.f11316a;
            int i10 = this.f11317b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i10] = new O2(this, (Comparable) entry.getKey(), entry.getValue());
            this.f11317b++;
            it.remove();
        }
        return obj;
    }

    public final int e(Comparable comparable) {
        int i3 = this.f11317b;
        int i10 = i3 - 1;
        int i11 = 0;
        if (i10 >= 0) {
            int compareTo = comparable.compareTo(((O2) this.f11316a[i10]).f11323a);
            if (compareTo > 0) {
                return -(i3 + 1);
            }
            if (compareTo == 0) {
                return i10;
            }
        }
        while (i11 <= i10) {
            int i12 = (i11 + i10) / 2;
            int compareTo2 = comparable.compareTo(((O2) this.f11316a[i12]).f11323a);
            if (compareTo2 < 0) {
                i10 = i12 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i12;
                }
                i11 = i12 + 1;
            }
        }
        return -(i11 + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f11320e == null) {
            this.f11320e = new androidx.datastore.preferences.protobuf.Z(this, 1);
        }
        return this.f11320e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N2)) {
            return super.equals(obj);
        }
        N2 n22 = (N2) obj;
        int size = size();
        if (size == n22.size()) {
            int i3 = this.f11317b;
            if (i3 != n22.f11317b) {
                return entrySet().equals(n22.entrySet());
            }
            for (int i10 = 0; i10 < i3; i10++) {
                if (a(i10).equals(n22.a(i10))) {
                }
            }
            if (i3 != size) {
                return this.f11318c.equals(n22.f11318c);
            }
            return true;
        }
        return false;
    }

    public final void f() {
        if (this.f11319d) {
            throw new UnsupportedOperationException();
        }
    }

    public final SortedMap g() {
        f();
        if (this.f11318c.isEmpty() && !(this.f11318c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f11318c = treeMap;
            this.f11321f = treeMap.descendingMap();
        }
        return (SortedMap) this.f11318c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int e10 = e(comparable);
        return e10 >= 0 ? ((O2) this.f11316a[e10]).f11324b : this.f11318c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i3 = this.f11317b;
        int i10 = 0;
        for (int i11 = 0; i11 < i3; i11++) {
            i10 += this.f11316a[i11].hashCode();
        }
        return this.f11318c.size() > 0 ? this.f11318c.hashCode() + i10 : i10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        f();
        Comparable comparable = (Comparable) obj;
        int e10 = e(comparable);
        if (e10 >= 0) {
            return d(e10);
        }
        if (this.f11318c.isEmpty()) {
            return null;
        }
        return this.f11318c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f11318c.size() + this.f11317b;
    }
}
