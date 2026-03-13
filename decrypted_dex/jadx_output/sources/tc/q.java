package tc;

import com.stub.StubApp;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import l4.C1221y;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class q implements S9.t {

    /* renamed from: b, reason: collision with root package name */
    public static final C1221y f21339b;

    /* renamed from: c, reason: collision with root package name */
    public static final p f21340c;

    /* renamed from: d, reason: collision with root package name */
    public static final q f21341d;

    /* renamed from: e, reason: collision with root package name */
    public static final q f21342e;

    /* renamed from: f, reason: collision with root package name */
    public static final q f21343f;

    /* renamed from: g, reason: collision with root package name */
    public static final q f21344g;

    /* renamed from: h, reason: collision with root package name */
    public static final q f21345h;
    public static final q j;

    /* renamed from: k, reason: collision with root package name */
    public static final q f21346k;

    /* renamed from: l, reason: collision with root package name */
    public static final q f21347l;

    /* renamed from: m, reason: collision with root package name */
    public static final q f21348m;

    /* renamed from: n, reason: collision with root package name */
    public static final q f21349n;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ q[] f21350p;

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f21351q;

    /* renamed from: a, reason: collision with root package name */
    public final int f21352a;

    static {
        q qVar = new q(StubApp.getString2(35370), 0, 0);
        f21341d = qVar;
        q qVar2 = new q(StubApp.getString2(35371), 1, 1);
        f21342e = qVar2;
        q qVar3 = new q(StubApp.getString2(35372), 2, 2);
        f21343f = qVar3;
        q qVar4 = new q(StubApp.getString2(208), 3, 3);
        f21344g = qVar4;
        q qVar5 = new q(StubApp.getString2(35373), 4, 4);
        f21345h = qVar5;
        q qVar6 = new q(StubApp.getString2(13889), 5, 5);
        j = qVar6;
        q qVar7 = new q(StubApp.getString2(7608), 6, 6);
        f21346k = qVar7;
        q qVar8 = new q(StubApp.getString2(35374), 7, 7);
        f21347l = qVar8;
        q qVar9 = new q(StubApp.getString2(35375), 8, 8);
        f21348m = qVar9;
        q qVar10 = new q(StubApp.getString2(35376), 9, 9);
        f21349n = qVar10;
        q[] qVarArr = {qVar, qVar2, qVar3, qVar4, qVar5, qVar6, qVar7, qVar8, qVar9, qVar10};
        f21350p = qVarArr;
        f21351q = EnumEntriesKt.enumEntries(qVarArr);
        f21339b = new C1221y(26);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(q.class);
        S9.s sVar = S9.s.f6665b;
        f21340c = new p(orCreateKotlinClass, qVar);
    }

    public q(String str, int i3, int i10) {
        this.f21352a = i10;
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f21350p.clone();
    }

    @Override // S9.t
    public final int getValue() {
        return this.f21352a;
    }
}
