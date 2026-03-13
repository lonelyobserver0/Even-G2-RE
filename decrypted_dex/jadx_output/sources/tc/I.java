package tc;

import com.stub.StubApp;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import l4.C1145A;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class I implements S9.t {

    /* renamed from: b, reason: collision with root package name */
    public static final C1145A f21269b;

    /* renamed from: c, reason: collision with root package name */
    public static final H f21270c;

    /* renamed from: d, reason: collision with root package name */
    public static final I f21271d;

    /* renamed from: e, reason: collision with root package name */
    public static final I f21272e;

    /* renamed from: f, reason: collision with root package name */
    public static final I f21273f;

    /* renamed from: g, reason: collision with root package name */
    public static final I f21274g;

    /* renamed from: h, reason: collision with root package name */
    public static final I f21275h;
    public static final I j;

    /* renamed from: k, reason: collision with root package name */
    public static final I f21276k;

    /* renamed from: l, reason: collision with root package name */
    public static final I f21277l;

    /* renamed from: m, reason: collision with root package name */
    public static final I f21278m;

    /* renamed from: n, reason: collision with root package name */
    public static final I f21279n;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ I[] f21280p;

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f21281q;

    /* renamed from: a, reason: collision with root package name */
    public final int f21282a;

    static {
        I i3 = new I(StubApp.getString2(207), 0, 0);
        f21271d = i3;
        I i10 = new I(StubApp.getString2(451), 1, 1);
        f21272e = i10;
        I i11 = new I(StubApp.getString2(452), 2, 2);
        f21273f = i11;
        I i12 = new I(StubApp.getString2(453), 3, 3);
        f21274g = i12;
        I i13 = new I(StubApp.getString2(454), 4, 4);
        f21275h = i13;
        I i14 = new I(StubApp.getString2(455), 5, 5);
        j = i14;
        I i15 = new I(StubApp.getString2(5759), 6, 6);
        f21276k = i15;
        I i16 = new I(StubApp.getString2(35330), 7, 7);
        f21277l = i16;
        I i17 = new I(StubApp.getString2(35331), 8, 8);
        f21278m = i17;
        I i18 = new I(StubApp.getString2(35332), 9, 9);
        f21279n = i18;
        I[] iArr = {i3, i10, i11, i12, i13, i14, i15, i16, i17, i18};
        f21280p = iArr;
        f21281q = EnumEntriesKt.enumEntries(iArr);
        f21269b = new C1145A(26);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(I.class);
        S9.s sVar = S9.s.f6665b;
        f21270c = new H(orCreateKotlinClass, i3);
    }

    public I(String str, int i3, int i10) {
        this.f21282a = i10;
    }

    public static I valueOf(String str) {
        return (I) Enum.valueOf(I.class, str);
    }

    public static I[] values() {
        return (I[]) f21280p.clone();
    }

    @Override // S9.t
    public final int getValue() {
        return this.f21282a;
    }
}
