package tc;

import com.stub.StubApp;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import l4.C1223z;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: tc.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class EnumC1759e implements S9.t {

    /* renamed from: b, reason: collision with root package name */
    public static final C1223z f21298b;

    /* renamed from: c, reason: collision with root package name */
    public static final C1758d f21299c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1759e f21300d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC1759e f21301e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC1759e f21302f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC1759e f21303g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ EnumC1759e[] f21304h;
    public static final /* synthetic */ EnumEntries j;

    /* renamed from: a, reason: collision with root package name */
    public final int f21305a;

    static {
        EnumC1759e enumC1759e = new EnumC1759e(StubApp.getString2(442), 0, 0);
        f21300d = enumC1759e;
        EnumC1759e enumC1759e2 = new EnumC1759e(StubApp.getString2(443), 1, 1);
        f21301e = enumC1759e2;
        EnumC1759e enumC1759e3 = new EnumC1759e(StubApp.getString2(444), 2, 2);
        f21302f = enumC1759e3;
        EnumC1759e enumC1759e4 = new EnumC1759e(StubApp.getString2(35345), 3, 3);
        f21303g = enumC1759e4;
        EnumC1759e[] enumC1759eArr = {enumC1759e, enumC1759e2, enumC1759e3, enumC1759e4};
        f21304h = enumC1759eArr;
        j = EnumEntriesKt.enumEntries(enumC1759eArr);
        f21298b = new C1223z(25);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EnumC1759e.class);
        S9.s sVar = S9.s.f6665b;
        f21299c = new C1758d(orCreateKotlinClass, enumC1759e);
    }

    public EnumC1759e(String str, int i3, int i10) {
        this.f21305a = i10;
    }

    public static EnumC1759e valueOf(String str) {
        return (EnumC1759e) Enum.valueOf(EnumC1759e.class, str);
    }

    public static EnumC1759e[] values() {
        return (EnumC1759e[]) f21304h.clone();
    }

    @Override // S9.t
    public final int getValue() {
        return this.f21305a;
    }
}
