package sb;

import com.stub.StubApp;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import l4.C1145A;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: sb.B, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class EnumC1612B {

    /* renamed from: b, reason: collision with root package name */
    public static final C1145A f20848b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC1612B f20849c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC1612B[] f20850d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f20851e;

    /* renamed from: a, reason: collision with root package name */
    public final int f20852a;

    static {
        EnumC1612B enumC1612B = new EnumC1612B(StubApp.getString2(10195), 0, 0);
        EnumC1612B enumC1612B2 = new EnumC1612B(StubApp.getString2(23164), 1, 1);
        EnumC1612B enumC1612B3 = new EnumC1612B(StubApp.getString2(212), 2, 2);
        EnumC1612B enumC1612B4 = new EnumC1612B(StubApp.getString2(343), 3, 3);
        f20849c = enumC1612B4;
        EnumC1612B[] enumC1612BArr = {enumC1612B, enumC1612B2, enumC1612B3, enumC1612B4};
        f20850d = enumC1612BArr;
        f20851e = EnumEntriesKt.enumEntries(enumC1612BArr);
        f20848b = new C1145A(24);
    }

    public EnumC1612B(String str, int i3, int i10) {
        this.f20852a = i10;
    }

    public static EnumC1612B valueOf(String str) {
        return (EnumC1612B) Enum.valueOf(EnumC1612B.class, str);
    }

    public static EnumC1612B[] values() {
        return (EnumC1612B[]) f20850d.clone();
    }
}
