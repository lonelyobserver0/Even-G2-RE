package tc;

import com.stub.StubApp;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import l4.C1145A;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: tc.g, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class EnumC1761g implements S9.t {

    /* renamed from: b, reason: collision with root package name */
    public static final C1145A f21306b;

    /* renamed from: c, reason: collision with root package name */
    public static final C1760f f21307c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1761g f21308d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC1761g f21309e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC1761g f21310f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC1761g f21311g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC1761g f21312h;
    public static final /* synthetic */ EnumC1761g[] j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f21313k;

    /* renamed from: a, reason: collision with root package name */
    public final int f21314a;

    static {
        EnumC1761g enumC1761g = new EnumC1761g(StubApp.getString2(8429), 0, 0);
        f21308d = enumC1761g;
        EnumC1761g enumC1761g2 = new EnumC1761g(StubApp.getString2(35346), 1, 1);
        f21309e = enumC1761g2;
        EnumC1761g enumC1761g3 = new EnumC1761g(StubApp.getString2(35347), 2, 2);
        f21310f = enumC1761g3;
        EnumC1761g enumC1761g4 = new EnumC1761g(StubApp.getString2(35348), 3, 3);
        f21311g = enumC1761g4;
        EnumC1761g enumC1761g5 = new EnumC1761g(StubApp.getString2(35349), 4, 4);
        f21312h = enumC1761g5;
        EnumC1761g[] enumC1761gArr = {enumC1761g, enumC1761g2, enumC1761g3, enumC1761g4, enumC1761g5};
        j = enumC1761gArr;
        f21313k = EnumEntriesKt.enumEntries(enumC1761gArr);
        f21306b = new C1145A(25);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EnumC1761g.class);
        S9.s sVar = S9.s.f6665b;
        f21307c = new C1760f(orCreateKotlinClass, enumC1761g);
    }

    public EnumC1761g(String str, int i3, int i10) {
        this.f21314a = i10;
    }

    public static EnumC1761g valueOf(String str) {
        return (EnumC1761g) Enum.valueOf(EnumC1761g.class, str);
    }

    public static EnumC1761g[] values() {
        return (EnumC1761g[]) j.clone();
    }

    @Override // S9.t
    public final int getValue() {
        return this.f21314a;
    }
}
