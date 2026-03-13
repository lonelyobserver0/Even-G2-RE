package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.protobuf.d0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0722d0 extends LinkedHashMap {

    /* renamed from: b, reason: collision with root package name */
    public static final C0722d0 f12145b;

    /* renamed from: a, reason: collision with root package name */
    public boolean f12146a = true;

    static {
        C0722d0 c0722d0 = new C0722d0();
        f12145b = c0722d0;
        c0722d0.f12146a = false;
    }

    public static int a(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof J) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        Charset charset = Q.f12119a;
        int length = bArr.length;
        for (byte b2 : bArr) {
            length = (length * 31) + b2;
        }
        if (length == 0) {
            return 1;
        }
        return length;
    }

    public final void b() {
        if (!this.f12146a) {
            throw new UnsupportedOperationException();
        }
    }

    public final C0722d0 c() {
        if (isEmpty()) {
            return new C0722d0();
        }
        C0722d0 c0722d0 = new C0722d0(this);
        c0722d0.f12146a = true;
        return c0722d0;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x005d A[RETURN] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L5e
            java.util.Map r7 = (java.util.Map) r7
            r0 = 1
            if (r6 != r7) goto Lc
        La:
            r7 = r0
            goto L5b
        Lc:
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L18
        L16:
            r7 = r1
            goto L5b
        L18:
            java.util.Set r2 = r6.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L20:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto La
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r7.containsKey(r4)
            if (r4 != 0) goto L37
            goto L16
        L37:
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r7.get(r3)
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L54
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L54
            byte[] r4 = (byte[]) r4
            byte[] r3 = (byte[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L58
        L54:
            boolean r3 = r4.equals(r3)
        L58:
            if (r3 != 0) goto L20
            goto L16
        L5b:
            if (r7 == 0) goto L5e
            return r0
        L5e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C0722d0.equals(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i3 = 0;
        for (Map.Entry entry : entrySet()) {
            i3 += a(entry.getValue()) ^ a(entry.getKey());
        }
        return i3;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        b();
        Charset charset = Q.f12119a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        b();
        for (Object obj : map.keySet()) {
            Charset charset = Q.f12119a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        return super.remove(obj);
    }
}
