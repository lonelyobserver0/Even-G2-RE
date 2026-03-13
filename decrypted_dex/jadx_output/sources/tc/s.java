package tc;

import com.stub.StubApp;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import l4.C1223z;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class s implements S9.t {

    /* renamed from: b, reason: collision with root package name */
    public static final C1223z f21353b;

    /* renamed from: c, reason: collision with root package name */
    public static final r f21354c;

    /* renamed from: d, reason: collision with root package name */
    public static final s f21355d;

    /* renamed from: e, reason: collision with root package name */
    public static final s f21356e;

    /* renamed from: f, reason: collision with root package name */
    public static final s f21357f;

    /* renamed from: g, reason: collision with root package name */
    public static final s f21358g;

    /* renamed from: h, reason: collision with root package name */
    public static final s f21359h;
    public static final s j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ s[] f21360k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f21361l;

    /* renamed from: a, reason: collision with root package name */
    public final int f21362a;

    static {
        s sVar = new s(StubApp.getString2(13364), 0, 0);
        f21355d = sVar;
        s sVar2 = new s(StubApp.getString2(35377), 1, 1);
        f21356e = sVar2;
        s sVar3 = new s(StubApp.getString2(13366), 2, 2);
        f21357f = sVar3;
        s sVar4 = new s(StubApp.getString2(35378), 3, 3);
        f21358g = sVar4;
        s sVar5 = new s(StubApp.getString2(13368), 4, 4);
        f21359h = sVar5;
        s sVar6 = new s(StubApp.getString2(3789), 5, 5);
        j = sVar6;
        s[] sVarArr = {sVar, sVar2, sVar3, sVar4, sVar5, sVar6};
        f21360k = sVarArr;
        f21361l = EnumEntriesKt.enumEntries(sVarArr);
        f21353b = new C1223z(26);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(s.class);
        S9.s sVar7 = S9.s.f6665b;
        f21354c = new r(orCreateKotlinClass, sVar);
    }

    public s(String str, int i3, int i10) {
        this.f21362a = i10;
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f21360k.clone();
    }

    @Override // S9.t
    public final int getValue() {
        return this.f21362a;
    }
}
