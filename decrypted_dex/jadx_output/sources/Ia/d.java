package Ia;

import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d implements Map {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f3247a;

    public final int a(Object obj) {
        if (!isEmpty() && obj != null) {
            int i3 = 0;
            while (true) {
                Object[] objArr = this.f3247a;
                if (i3 >= objArr.length) {
                    break;
                }
                if (obj.equals(objArr[i3])) {
                    return i3;
                }
                i3 += 2;
            }
        }
        return -1;
    }

    @Override // java.util.Map
    public final void clear() {
        this.f3247a = null;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return a(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        int i3 = -1;
        if (!isEmpty() && obj != null) {
            int i10 = 1;
            while (true) {
                Object[] objArr = this.f3247a;
                if (i10 >= objArr.length) {
                    break;
                }
                if (obj.equals(objArr[i10])) {
                    i3 = i10;
                    break;
                }
                i10 += 2;
            }
        }
        return i3 >= 0;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        if (isEmpty()) {
            return Collections.EMPTY_SET;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i3 = 0; i3 < this.f3247a.length; i3 += 2) {
            linkedHashSet.add(new c(this, i3));
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int a3 = a(obj);
        if (a3 < 0) {
            return null;
        }
        return this.f3247a[a3 + 1];
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        Object[] objArr = this.f3247a;
        return objArr == null || objArr.length == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (isEmpty()) {
            return Collections.EMPTY_SET;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i3 = 0;
        while (true) {
            Object[] objArr = this.f3247a;
            if (i3 >= objArr.length) {
                return Collections.unmodifiableSet(linkedHashSet);
            }
            linkedHashSet.add(objArr[i3]);
            i3 += 2;
        }
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            throw new NullPointerException(StubApp.getString2(2885));
        }
        if (this.f3247a == null) {
            this.f3247a = new Object[]{obj, obj2};
            return null;
        }
        int a3 = a(obj);
        if (a3 >= 0) {
            Object[] objArr = this.f3247a;
            int i3 = a3 + 1;
            Object obj3 = objArr[i3];
            objArr[i3] = obj2;
            return obj3;
        }
        Object[] objArr2 = this.f3247a;
        int length = objArr2.length;
        Object[] objArr3 = new Object[length + 2];
        System.arraycopy(objArr2, 0, objArr3, 0, length);
        objArr3[length] = obj;
        objArr3[length + 1] = obj2;
        this.f3247a = objArr3;
        return null;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        Object[] objArr = this.f3247a;
        String string2 = StubApp.getString2(2885);
        int i3 = 0;
        if (objArr == null || objArr.length == 0) {
            this.f3247a = new Object[map.size() << 1];
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getKey() == null || entry.getValue() == null) {
                    throw new NullPointerException(string2);
                }
                int i10 = i3 + 1;
                this.f3247a[i3] = entry.getKey();
                i3 += 2;
                this.f3247a[i10] = entry.getValue();
            }
            return;
        }
        int length = objArr.length;
        int size = (map.size() << 1) + length;
        Object[] objArr2 = new Object[size];
        System.arraycopy(this.f3247a, 0, objArr2, 0, length);
        for (Map.Entry entry2 : map.entrySet()) {
            if (entry2.getKey() == null || entry2.getValue() == null) {
                throw new NullPointerException(string2);
            }
            int a3 = a(entry2.getKey());
            if (a3 >= 0) {
                objArr2[a3 + 1] = entry2.getValue();
            } else {
                int i11 = length + 1;
                objArr2[length] = entry2.getKey();
                length += 2;
                objArr2[i11] = entry2.getValue();
            }
        }
        if (length < size) {
            Object[] objArr3 = new Object[length];
            System.arraycopy(objArr2, 0, objArr3, 0, length);
            objArr2 = objArr3;
        }
        this.f3247a = objArr2;
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        int a3 = a(obj);
        if (a3 < 0) {
            return null;
        }
        Object[] objArr = this.f3247a;
        Object obj2 = objArr[a3 + 1];
        int length = objArr.length;
        if (length == 2) {
            this.f3247a = null;
            return obj2;
        }
        Object[] objArr2 = new Object[length - 2];
        System.arraycopy(objArr, 0, objArr2, 0, a3);
        System.arraycopy(this.f3247a, a3 + 2, objArr2, a3, (length - a3) - 2);
        this.f3247a = objArr2;
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        Object[] objArr = this.f3247a;
        if (objArr == null) {
            return 0;
        }
        return objArr.length >> 1;
    }

    @Override // java.util.Map
    public final Collection values() {
        if (isEmpty()) {
            return Collections.EMPTY_SET;
        }
        int i3 = 1;
        ArrayList arrayList = new ArrayList(this.f3247a.length >> 1);
        while (true) {
            Object[] objArr = this.f3247a;
            if (i3 >= objArr.length) {
                return Collections.unmodifiableList(arrayList);
            }
            arrayList.add(objArr[i3]);
            i3 += 2;
        }
    }
}
