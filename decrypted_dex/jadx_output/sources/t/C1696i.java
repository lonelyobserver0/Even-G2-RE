package t;

import com.stub.StubApp;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l4.C1221y;

/* renamed from: t.i, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class C1696i {

    /* renamed from: a, reason: collision with root package name */
    public final int f21032a;

    /* renamed from: b, reason: collision with root package name */
    public final u.b f21033b;

    /* renamed from: c, reason: collision with root package name */
    public final C1221y f21034c;

    /* renamed from: d, reason: collision with root package name */
    public int f21035d;

    /* renamed from: e, reason: collision with root package name */
    public int f21036e;

    /* renamed from: f, reason: collision with root package name */
    public int f21037f;

    public C1696i(int i3) {
        this.f21032a = i3;
        if (i3 <= 0) {
            throw new IllegalArgumentException(StubApp.getString2(23376));
        }
        this.f21033b = new u.b(0);
        this.f21034c = new C1221y(27);
    }

    public static void d(Object key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
    }

    public Object a(Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return null;
    }

    public final Object b(Object key) {
        Object value;
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.f21034c) {
            u.b bVar = this.f21033b;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(key, "key");
            Object obj = bVar.f21384a.get(key);
            if (obj != null) {
                this.f21036e++;
                return obj;
            }
            this.f21037f++;
            Object oldValue = a(key);
            if (oldValue == null) {
                return null;
            }
            synchronized (this.f21034c) {
                try {
                    u.b bVar2 = this.f21033b;
                    bVar2.getClass();
                    Intrinsics.checkNotNullParameter(key, "key");
                    Intrinsics.checkNotNullParameter(oldValue, "value");
                    value = bVar2.f21384a.put(key, oldValue);
                    if (value != null) {
                        u.b bVar3 = this.f21033b;
                        bVar3.getClass();
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(value, "value");
                        bVar3.f21384a.put(key, value);
                    } else {
                        int i3 = this.f21035d;
                        d(key, oldValue);
                        this.f21035d = i3 + 1;
                        Unit unit = Unit.INSTANCE;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (value == null) {
                e(this.f21032a);
                return oldValue;
            }
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(oldValue, "oldValue");
            return value;
        }
    }

    public final Object c(Object key, Object value) {
        Object oldValue;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        synchronized (this.f21034c) {
            try {
                int i3 = this.f21035d;
                d(key, value);
                this.f21035d = i3 + 1;
                u.b bVar = this.f21033b;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(value, "value");
                oldValue = bVar.f21384a.put(key, value);
                if (oldValue != null) {
                    int i10 = this.f21035d;
                    d(key, oldValue);
                    this.f21035d = i10 - 1;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (oldValue != null) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        }
        e(this.f21032a);
        return oldValue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0077, code lost:
    
        throw new java.lang.IllegalStateException(com.stub.StubApp.getString2("23377"));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(int r6) {
        /*
            r5 = this;
        L0:
            l4.y r0 = r5.f21034c
            monitor-enter(r0)
            int r1 = r5.f21035d     // Catch: java.lang.Throwable -> L16
            if (r1 < 0) goto L6c
            u.b r1 = r5.f21033b     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashMap r1 = r1.f21384a     // Catch: java.lang.Throwable -> L16
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L18
            int r1 = r5.f21035d     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L6c
            goto L18
        L16:
            r6 = move-exception
            goto L78
        L18:
            int r1 = r5.f21035d     // Catch: java.lang.Throwable -> L16
            if (r1 <= r6) goto L6a
            u.b r1 = r5.f21033b     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashMap r1 = r1.f21384a     // Catch: java.lang.Throwable -> L16
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L27
            goto L6a
        L27:
            u.b r1 = r5.f21033b     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashMap r1 = r1.f21384a     // Catch: java.lang.Throwable -> L16
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = "map.entries"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)     // Catch: java.lang.Throwable -> L16
            java.lang.Object r1 = kotlin.collections.CollectionsKt.k(r1)     // Catch: java.lang.Throwable -> L16
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L3e
            monitor-exit(r0)
            return
        L3e:
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L16
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L16
            u.b r3 = r5.f21033b     // Catch: java.lang.Throwable -> L16
            r3.getClass()     // Catch: java.lang.Throwable -> L16
            java.lang.String r4 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashMap r3 = r3.f21384a     // Catch: java.lang.Throwable -> L16
            r3.remove(r2)     // Catch: java.lang.Throwable -> L16
            int r3 = r5.f21035d     // Catch: java.lang.Throwable -> L16
            d(r2, r1)     // Catch: java.lang.Throwable -> L16
            int r3 = r3 + (-1)
            r5.f21035d = r3     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "oldValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            goto L0
        L6a:
            monitor-exit(r0)
            return
        L6c:
            java.lang.String r6 = "23377"
            java.lang.String r6 = com.stub.StubApp.getString2(r6)     // Catch: java.lang.Throwable -> L16
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L16
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L16
            throw r1     // Catch: java.lang.Throwable -> L16
        L78:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t.C1696i.e(int):void");
    }

    public final String toString() {
        String str;
        String string2 = StubApp.getString2(23378);
        synchronized (this.f21034c) {
            try {
                int i3 = this.f21036e;
                int i10 = this.f21037f + i3;
                str = string2 + this.f21032a + StubApp.getString2("23379") + this.f21036e + StubApp.getString2("23380") + this.f21037f + StubApp.getString2("23381") + (i10 != 0 ? (i3 * 100) / i10 : 0) + StubApp.getString2("23382");
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
