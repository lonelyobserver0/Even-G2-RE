package sb;

import com.stub.StubApp;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import l4.C1221y;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: sb.s, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class EnumC1671s {

    /* renamed from: b, reason: collision with root package name */
    public static final C1221y f20988b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC1671s f20989c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1671s f20990d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC1671s f20991e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC1671s f20992f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumC1671s[] f20993g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f20994h;

    /* renamed from: a, reason: collision with root package name */
    public final int f20995a;

    static {
        EnumC1671s enumC1671s = new EnumC1671s(StubApp.getString2(23337), 0, 0);
        f20989c = enumC1671s;
        EnumC1671s enumC1671s2 = new EnumC1671s(StubApp.getString2(23338), 1, 1);
        f20990d = enumC1671s2;
        EnumC1671s enumC1671s3 = new EnumC1671s(StubApp.getString2(23339), 2, 2);
        f20991e = enumC1671s3;
        EnumC1671s enumC1671s4 = new EnumC1671s(StubApp.getString2(343), 3, 3);
        f20992f = enumC1671s4;
        EnumC1671s[] enumC1671sArr = {enumC1671s, enumC1671s2, enumC1671s3, enumC1671s4};
        f20993g = enumC1671sArr;
        f20994h = EnumEntriesKt.enumEntries(enumC1671sArr);
        f20988b = new C1221y(24);
    }

    public EnumC1671s(String str, int i3, int i10) {
        this.f20995a = i10;
    }

    public static EnumC1671s valueOf(String str) {
        return (EnumC1671s) Enum.valueOf(EnumC1671s.class, str);
    }

    public static EnumC1671s[] values() {
        return (EnumC1671s[]) f20993g.clone();
    }
}
