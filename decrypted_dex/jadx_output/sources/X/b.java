package X;

import com.stub.StubApp;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Map f8221a;

    /* renamed from: b, reason: collision with root package name */
    public final F5.c f8222b;

    public b(Map preferencesMap, boolean z2) {
        Intrinsics.checkNotNullParameter(preferencesMap, "preferencesMap");
        this.f8221a = preferencesMap;
        this.f8222b = new F5.c(z2);
    }

    public final Map a() {
        Pair pair;
        Set<Map.Entry> entrySet = this.f8221a.entrySet();
        LinkedHashMap map = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.f(entrySet)), 16));
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
                pair = new Pair(key, copyOf);
            } else {
                pair = new Pair(entry.getKey(), entry.getValue());
            }
            map.put(pair.getFirst(), pair.getSecond());
        }
        Intrinsics.checkNotNullParameter(map, "map");
        Map unmodifiableMap = Collections.unmodifiableMap(map);
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(map)");
        return unmodifiableMap;
    }

    public final void b() {
        if (((AtomicBoolean) this.f8222b.f2238b).get()) {
            throw new IllegalStateException(StubApp.getString2(6944));
        }
    }

    public final Object c(g key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.f8221a.get(key);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    public final void d(g key, Object obj) {
        Set set;
        Intrinsics.checkNotNullParameter(key, "key");
        b();
        Map map = this.f8221a;
        if (obj == null) {
            Intrinsics.checkNotNullParameter(key, "key");
            b();
            map.remove(key);
            return;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            Intrinsics.checkNotNullParameter(set2, "set");
            set = CollectionsKt___CollectionsKt.toSet(set2);
            Set unmodifiableSet = Collections.unmodifiableSet(set);
            Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "unmodifiableSet(set.toSet())");
            map.put(key, unmodifiableSet);
            return;
        }
        if (!(obj instanceof byte[])) {
            map.put(key, obj);
            return;
        }
        byte[] bArr = (byte[]) obj;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        map.put(key, copyOf);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[LOOP:0: B:15:0x002c->B:30:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.b
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            X.b r7 = (X.b) r7
            java.util.Map r0 = r7.f8221a
            java.util.Map r2 = r6.f8221a
            r3 = 1
            if (r0 != r2) goto L10
            return r3
        L10:
            int r0 = r0.size()
            int r4 = r2.size()
            if (r0 == r4) goto L1b
            return r1
        L1b:
            java.util.Map r7 = r7.f8221a
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L24
            return r3
        L24:
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L2c:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L63
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r4 = r0.getKey()
            java.lang.Object r4 = r2.get(r4)
            if (r4 == 0) goto L5f
            java.lang.Object r0 = r0.getValue()
            boolean r5 = r0 instanceof byte[]
            if (r5 == 0) goto L5a
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L5f
            byte[] r0 = (byte[]) r0
            byte[] r4 = (byte[]) r4
            boolean r0 = java.util.Arrays.equals(r0, r4)
            if (r0 == 0) goto L5f
            r0 = r3
            goto L60
        L5a:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r4)
            goto L60
        L5f:
            r0 = r1
        L60:
            if (r0 != 0) goto L2c
            return r1
        L63:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = this.f8221a.entrySet().iterator();
        int i3 = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            i3 += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return i3;
    }

    public final String toString() {
        String joinToString$default;
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(this.f8221a.entrySet(), StubApp.getString2(6946), StubApp.getString2(6947), StubApp.getString2(6945), 0, null, a.f8220a, 24, null);
        return joinToString$default;
    }

    public /* synthetic */ b(boolean z2) {
        this(new LinkedHashMap(), z2);
    }
}
