package J1;

import android.app.ActivityManager;
import android.content.Context;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import o.C1402a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3344a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f3345b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3346c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f3347d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3348e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f3349f;

    /* renamed from: g, reason: collision with root package name */
    public Executor f3350g;

    /* renamed from: h, reason: collision with root package name */
    public Executor f3351h;

    /* renamed from: i, reason: collision with root package name */
    public B8.a f3352i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final q f3353k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3354l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3355m;

    /* renamed from: n, reason: collision with root package name */
    public final long f3356n;

    /* renamed from: o, reason: collision with root package name */
    public final A0.c f3357o;

    /* renamed from: p, reason: collision with root package name */
    public final LinkedHashSet f3358p;

    /* renamed from: q, reason: collision with root package name */
    public HashSet f3359q;

    public p(Context context, Class klass, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(klass, "klass");
        this.f3344a = context;
        this.f3345b = klass;
        this.f3346c = str;
        this.f3347d = new ArrayList();
        this.f3348e = new ArrayList();
        this.f3349f = new ArrayList();
        this.f3353k = q.f3360a;
        this.f3354l = true;
        this.f3356n = -1L;
        this.f3357o = new A0.c(7);
        this.f3358p = new LinkedHashSet();
    }

    public final void a(K1.a... migrations) {
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        if (this.f3359q == null) {
            this.f3359q = new HashSet();
        }
        for (K1.a aVar : migrations) {
            HashSet hashSet = this.f3359q;
            Intrinsics.checkNotNull(hashSet);
            hashSet.add(Integer.valueOf(aVar.f3629a));
            HashSet hashSet2 = this.f3359q;
            Intrinsics.checkNotNull(hashSet2);
            hashSet2.add(Integer.valueOf(aVar.f3630b));
        }
        this.f3357o.d((K1.a[]) Arrays.copyOf(migrations, migrations.length));
    }

    public final r b() {
        String replace$default;
        boolean z2;
        Executor executor = this.f3350g;
        if (executor == null && this.f3351h == null) {
            G1.c cVar = C1402a.f18012e;
            this.f3351h = cVar;
            this.f3350g = cVar;
        } else if (executor != null && this.f3351h == null) {
            this.f3351h = executor;
        } else if (executor == null) {
            this.f3350g = this.f3351h;
        }
        HashSet hashSet = this.f3359q;
        LinkedHashSet linkedHashSet = this.f3358p;
        if (hashSet != null) {
            Intrinsics.checkNotNull(hashSet);
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (linkedHashSet.contains(Integer.valueOf(intValue))) {
                    throw new IllegalArgumentException(i2.u.p(intValue, StubApp.getString2(2924)).toString());
                }
            }
        }
        O1.b bVar = this.f3352i;
        if (bVar == null) {
            bVar = new C2.i();
        }
        O1.b bVar2 = bVar;
        long j = this.f3356n;
        String string2 = StubApp.getString2(2906);
        if (j > 0) {
            if (this.f3346c != null) {
                throw new IllegalArgumentException(string2);
            }
            throw new IllegalArgumentException(StubApp.getString2(2925));
        }
        ArrayList arrayList = this.f3347d;
        boolean z10 = this.j;
        q qVar = this.f3353k;
        qVar.getClass();
        String string22 = StubApp.getString2(354);
        Context context = this.f3344a;
        Intrinsics.checkNotNullParameter(context, string22);
        q qVar2 = q.f3360a;
        q qVar3 = q.f3362c;
        if (qVar == qVar2) {
            Object systemService = context.getSystemService(StubApp.getString2(2680));
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            if (activityManager != null) {
                Intrinsics.checkNotNullParameter(activityManager, "activityManager");
                if (!activityManager.isLowRamDevice()) {
                    qVar = qVar3;
                }
            }
            qVar = q.f3361b;
        }
        Executor executor2 = this.f3350g;
        if (executor2 == null) {
            throw new IllegalArgumentException(string2);
        }
        Executor executor3 = this.f3351h;
        if (executor3 == null) {
            throw new IllegalArgumentException(string2);
        }
        d configuration = new d(context, this.f3346c, bVar2, this.f3357o, arrayList, z10, qVar, executor2, executor3, this.f3354l, this.f3355m, linkedHashSet, this.f3348e, this.f3349f);
        Class klass = this.f3345b;
        Intrinsics.checkNotNullParameter(klass, "klass");
        String suffix = StubApp.getString2(2926);
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        Package r52 = klass.getPackage();
        Intrinsics.checkNotNull(r52);
        String fullPackage = r52.getName();
        String canonicalName = klass.getCanonicalName();
        Intrinsics.checkNotNull(canonicalName);
        Intrinsics.checkNotNullExpressionValue(fullPackage, "fullPackage");
        if (fullPackage.length() != 0) {
            canonicalName = canonicalName.substring(fullPackage.length() + 1);
            Intrinsics.checkNotNullExpressionValue(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        StringBuilder sb2 = new StringBuilder();
        replace$default = StringsKt__StringsJVMKt.replace$default(canonicalName, '.', '_', false, 4, (Object) null);
        sb2.append(replace$default);
        sb2.append(suffix);
        String sb3 = sb2.toString();
        try {
            Class<?> cls = Class.forName(fullPackage.length() == 0 ? sb3 : fullPackage + '.' + sb3, true, klass.getClassLoader());
            Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            r rVar = (r) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            rVar.getClass();
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            rVar.f3367d = rVar.e(configuration);
            Set h2 = rVar.h();
            BitSet bitSet = new BitSet();
            Iterator it2 = h2.iterator();
            while (true) {
                boolean hasNext = it2.hasNext();
                LinkedHashMap linkedHashMap = rVar.f3371h;
                ArrayList arrayList2 = configuration.f3320n;
                int i3 = -1;
                if (hasNext) {
                    Class cls2 = (Class) it2.next();
                    int size = arrayList2.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i10 = size - 1;
                            if (cls2.isAssignableFrom(arrayList2.get(size).getClass())) {
                                bitSet.set(size);
                                i3 = size;
                                break;
                            }
                            if (i10 < 0) {
                                break;
                            }
                            size = i10;
                        }
                    }
                    if (i3 < 0) {
                        throw new IllegalArgumentException((StubApp.getString2(2927) + cls2.getCanonicalName() + StubApp.getString2(2928)).toString());
                    }
                    linkedHashMap.put(cls2, arrayList2.get(i3));
                } else {
                    int size2 = arrayList2.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i11 = size2 - 1;
                            if (!bitSet.get(size2)) {
                                throw new IllegalArgumentException(StubApp.getString2(2929));
                            }
                            if (i11 < 0) {
                                break;
                            }
                            size2 = i11;
                        }
                    }
                    for (K1.a aVar : rVar.f(linkedHashMap)) {
                        int i12 = aVar.f3629a;
                        A0.c cVar2 = configuration.f3311d;
                        LinkedHashMap linkedHashMap2 = (LinkedHashMap) cVar2.f29a;
                        if (linkedHashMap2.containsKey(Integer.valueOf(i12))) {
                            Map map = (Map) linkedHashMap2.get(Integer.valueOf(i12));
                            if (map == null) {
                                map = MapsKt.emptyMap();
                            }
                            z2 = map.containsKey(Integer.valueOf(aVar.f3630b));
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            cVar2.d(aVar);
                        }
                    }
                    rVar.g().setWriteAheadLoggingEnabled(configuration.f3314g == qVar3);
                    rVar.f3370g = configuration.f3312e;
                    rVar.f3365b = configuration.f3315h;
                    rVar.f3366c = new A(configuration.f3316i);
                    rVar.f3369f = configuration.f3313f;
                    Map i13 = rVar.i();
                    BitSet bitSet2 = new BitSet();
                    Iterator it3 = i13.entrySet().iterator();
                    while (true) {
                        boolean hasNext2 = it3.hasNext();
                        ArrayList arrayList3 = configuration.f3319m;
                        if (!hasNext2) {
                            int size3 = arrayList3.size() - 1;
                            if (size3 >= 0) {
                                while (true) {
                                    int i14 = size3 - 1;
                                    if (!bitSet2.get(size3)) {
                                        throw new IllegalArgumentException(StubApp.getString2(2933) + arrayList3.get(size3) + StubApp.getString2(2934));
                                    }
                                    if (i14 < 0) {
                                        break;
                                    }
                                    size3 = i14;
                                }
                            }
                            return rVar;
                        }
                        Map.Entry entry = (Map.Entry) it3.next();
                        Class cls3 = (Class) entry.getKey();
                        for (Class cls4 : (List) entry.getValue()) {
                            int size4 = arrayList3.size() - 1;
                            if (size4 >= 0) {
                                while (true) {
                                    int i15 = size4 - 1;
                                    if (cls4.isAssignableFrom(arrayList3.get(size4).getClass())) {
                                        bitSet2.set(size4);
                                        break;
                                    }
                                    if (i15 < 0) {
                                        break;
                                    }
                                    size4 = i15;
                                }
                            }
                            size4 = -1;
                            if (!(size4 >= 0)) {
                                throw new IllegalArgumentException((StubApp.getString2(2930) + cls4 + StubApp.getString2(2931) + cls3.getCanonicalName() + StubApp.getString2(2932)).toString());
                            }
                            rVar.f3374l.put(cls4, arrayList3.get(size4));
                        }
                    }
                }
            }
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException(StubApp.getString2(2937) + klass.getCanonicalName() + StubApp.getString2(2938) + sb3 + StubApp.getString2(2939));
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException(StubApp.getString2(2936) + klass.getCanonicalName());
        } catch (InstantiationException unused3) {
            throw new RuntimeException(StubApp.getString2(2935) + klass.getCanonicalName());
        }
    }
}
