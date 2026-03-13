package S9;

import Kc.C0101h;
import Kc.C0104k;
import com.stub.StubApp;
import java.time.Duration;
import java.time.Instant;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import q8.AbstractC1526a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class i {

    /* renamed from: f, reason: collision with root package name */
    public static final b f6628f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f6629g;

    /* renamed from: h, reason: collision with root package name */
    public static final b f6630h;

    /* renamed from: i, reason: collision with root package name */
    public static final b f6631i;
    public static final b j;

    /* renamed from: k, reason: collision with root package name */
    public static final b f6632k;

    /* renamed from: l, reason: collision with root package name */
    public static final b f6633l;

    /* renamed from: m, reason: collision with root package name */
    public static final b f6634m;

    /* renamed from: n, reason: collision with root package name */
    public static final b f6635n;

    /* renamed from: o, reason: collision with root package name */
    public static final l f6636o;

    /* renamed from: p, reason: collision with root package name */
    public static final b f6637p;

    /* renamed from: q, reason: collision with root package name */
    public static final b f6638q;

    /* renamed from: r, reason: collision with root package name */
    public static final m f6639r;

    /* renamed from: a, reason: collision with root package name */
    public final d f6640a;

    /* renamed from: b, reason: collision with root package name */
    public final KClass f6641b;

    /* renamed from: c, reason: collision with root package name */
    public final s f6642c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f6643d;

    /* renamed from: e, reason: collision with root package name */
    public final p f6644e;

    static {
        d dVar = d.f6614b;
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Boolean.TYPE);
        s sVar = s.f6665b;
        b bVar = new b(dVar, orCreateKotlinClass, sVar, Boolean.FALSE, 0, 3);
        f6628f = bVar;
        Class cls = Integer.TYPE;
        b bVar2 = new b(dVar, Reflection.getOrCreateKotlinClass(cls), sVar, 0, 0, 8);
        f6629g = bVar2;
        new e(bVar2, 0);
        b bVar3 = new b(dVar, Reflection.getOrCreateKotlinClass(cls), sVar, 0, 0, 15);
        new e(bVar3, 0);
        new e(new b(dVar, Reflection.getOrCreateKotlinClass(cls), sVar, 0, 0, 10), 0);
        d dVar2 = d.f6617e;
        b bVar4 = new b(dVar2, Reflection.getOrCreateKotlinClass(cls), sVar, 0, 0, 6);
        f6630h = bVar4;
        new e(bVar4, 0);
        new e(new b(dVar2, Reflection.getOrCreateKotlinClass(cls), sVar, 0, 0, 6), 0);
        Class cls2 = Long.TYPE;
        b bVar5 = new b(dVar, Reflection.getOrCreateKotlinClass(cls2), sVar, 0L, 0, 9);
        f6631i = bVar5;
        new e(bVar5, 1);
        b bVar6 = new b(dVar, Reflection.getOrCreateKotlinClass(cls2), sVar, 0L, 0, 16);
        j = bVar6;
        new e(bVar6, 1);
        new e(new b(dVar, Reflection.getOrCreateKotlinClass(cls2), sVar, 0L, 0, 11), 1);
        d dVar3 = d.f6615c;
        b bVar7 = new b(dVar3, Reflection.getOrCreateKotlinClass(cls2), sVar, 0L, 0, 7);
        f6632k = bVar7;
        new e(bVar7, 1);
        new e(new b(dVar3, Reflection.getOrCreateKotlinClass(cls2), sVar, 0L, 0, 7), 1);
        b bVar8 = new b(dVar2, Reflection.getOrCreateKotlinClass(Float.TYPE), sVar, Float.valueOf(0.0f), 0, 1);
        new a(bVar8, (byte) 0);
        b bVar9 = new b(dVar3, Reflection.getOrCreateKotlinClass(Double.TYPE), sVar, Double.valueOf(0.0d), 0, 0);
        f6633l = bVar9;
        new a(bVar9);
        d dVar4 = d.f6616d;
        b bVar10 = new b(dVar4, Reflection.getOrCreateKotlinClass(C0104k.class), sVar, C0104k.f3820d, 0, 4);
        f6634m = bVar10;
        b bVar11 = new b(dVar4, Reflection.getOrCreateKotlinClass(String.class), sVar, "", 0, 12);
        f6635n = bVar11;
        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Unit.class);
        s sVar2 = s.f6666c;
        new b(dVar4, orCreateKotlinClass2, sVar2, 5);
        f6636o = new l(dVar4, Reflection.getOrCreateKotlinClass(Map.class), sVar2);
        f6637p = new b(dVar4, Reflection.getOrCreateKotlinClass(Map.class), sVar2, 13);
        f6638q = new b(dVar, Reflection.getOrCreateKotlinClass(Void.class), sVar2, 14);
        f6639r = new m(dVar4, Reflection.getOrCreateKotlinClass(Object.class), sVar2);
        AbstractC1526a.f(bVar9, StubApp.getString2(6036));
        AbstractC1526a.f(bVar8, StubApp.getString2(6037));
        AbstractC1526a.f(bVar5, StubApp.getString2(6038));
        AbstractC1526a.f(bVar6, StubApp.getString2(6039));
        AbstractC1526a.f(bVar2, StubApp.getString2(6040));
        AbstractC1526a.f(bVar3, StubApp.getString2(6041));
        AbstractC1526a.f(bVar, StubApp.getString2(6042));
        AbstractC1526a.f(bVar11, StubApp.getString2(6043));
        AbstractC1526a.f(bVar10, StubApp.getString2(6044));
        try {
            new j(dVar4, Reflection.getOrCreateKotlinClass(Duration.class), sVar2);
        } catch (NoClassDefFoundError unused) {
            new b();
        }
        try {
            new k(d.f6616d, Reflection.getOrCreateKotlinClass(Instant.class), s.f6666c);
        } catch (NoClassDefFoundError unused2) {
            new b();
        }
    }

    public i(d fieldEncoding, KClass kClass, s syntax, Object obj) {
        d dVar;
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        Intrinsics.checkNotNullParameter(syntax, "syntax");
        this.f6640a = fieldEncoding;
        this.f6641b = kClass;
        this.f6642c = syntax;
        this.f6643d = obj;
        boolean z2 = this instanceof g;
        if (!z2 && !(this instanceof p) && fieldEncoding != (dVar = d.f6616d)) {
            if (fieldEncoding == dVar) {
                throw new IllegalArgumentException(StubApp.getString2(6045));
            }
            new g(this);
        }
        this.f6644e = ((this instanceof p) || z2) ? null : new p(this);
    }

    public final p a() {
        p pVar = this.f6644e;
        if (pVar != null) {
            return pVar;
        }
        throw new UnsupportedOperationException(StubApp.getString2(6046));
    }

    public abstract Object b(o oVar);

    public final Object c(byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        C0101h source = new C0101h();
        source.O(bytes);
        Intrinsics.checkNotNullParameter(source, "source");
        return b(new o(source));
    }

    public abstract void d(r rVar, Object obj);

    public abstract void e(s2.d dVar, Object obj);

    public void f(r writer, int i3, Object obj) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (obj != null) {
            d dVar = d.f6616d;
            d dVar2 = this.f6640a;
            if (dVar2 == dVar) {
                int b2 = writer.b();
                d(writer, obj);
                writer.h(writer.b() - b2);
            } else {
                d(writer, obj);
            }
            writer.g(i3, dVar2);
        }
    }

    public void g(s2.d writer, int i3, Object obj) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (obj != null) {
            d dVar = this.f6640a;
            writer.D(i3, dVar);
            if (dVar == d.f6616d) {
                writer.E(h(obj));
            }
            e(writer, obj);
        }
    }

    public abstract int h(Object obj);

    public int i(int i3, Object obj) {
        if (obj == null) {
            return 0;
        }
        int h2 = h(obj);
        int i10 = 5;
        if (this.f6640a == d.f6616d) {
            h2 += (h2 & (-128)) == 0 ? 1 : (h2 & (-16384)) == 0 ? 2 : (h2 & (-2097152)) == 0 ? 3 : (h2 & (-268435456)) == 0 ? 4 : 5;
        }
        d fieldEncoding = d.f6614b;
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        int i11 = i3 << 3;
        if ((i11 & (-128)) == 0) {
            i10 = 1;
        } else if ((i11 & (-16384)) == 0) {
            i10 = 2;
        } else if ((i11 & (-2097152)) == 0) {
            i10 = 3;
        } else if ((i11 & (-268435456)) == 0) {
            i10 = 4;
        }
        return h2 + i10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(d fieldEncoding, KClass kClass, s syntax) {
        this(fieldEncoding, kClass, syntax, null, 0);
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        Intrinsics.checkNotNullParameter(syntax, "syntax");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(d fieldEncoding, KClass kClass, s syntax, Object obj, int i3) {
        this(fieldEncoding, kClass, syntax, obj);
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        Intrinsics.checkNotNullParameter(syntax, "syntax");
    }
}
