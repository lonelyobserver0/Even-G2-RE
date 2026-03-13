package sb;

import com.stub.StubApp;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import l4.C1145A;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: sb.k, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class EnumC1655k {

    /* renamed from: b, reason: collision with root package name */
    public static final C1145A f20961b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC1655k f20962c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1655k f20963d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC1655k f20964e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC1655k f20965f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC1655k f20966g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC1655k f20967h;
    public static final /* synthetic */ EnumC1655k[] j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f20968k;

    /* renamed from: a, reason: collision with root package name */
    public final int f20969a;

    static {
        EnumC1655k enumC1655k = new EnumC1655k(StubApp.getString2(13364), 0, 0);
        f20962c = enumC1655k;
        EnumC1655k enumC1655k2 = new EnumC1655k(StubApp.getString2(3789), 1, 1);
        f20963d = enumC1655k2;
        EnumC1655k enumC1655k3 = new EnumC1655k(StubApp.getString2(7608), 2, 2);
        f20964e = enumC1655k3;
        EnumC1655k enumC1655k4 = new EnumC1655k(StubApp.getString2(23313), 3, 3);
        f20965f = enumC1655k4;
        EnumC1655k enumC1655k5 = new EnumC1655k(StubApp.getString2(13368), 4, 4);
        f20966g = enumC1655k5;
        EnumC1655k enumC1655k6 = new EnumC1655k(StubApp.getString2(343), 5, 5);
        f20967h = enumC1655k6;
        EnumC1655k[] enumC1655kArr = {enumC1655k, enumC1655k2, enumC1655k3, enumC1655k4, enumC1655k5, enumC1655k6};
        j = enumC1655kArr;
        f20968k = EnumEntriesKt.enumEntries(enumC1655kArr);
        f20961b = new C1145A(23);
    }

    public EnumC1655k(String str, int i3, int i10) {
        this.f20969a = i10;
    }

    public static EnumC1655k valueOf(String str) {
        return (EnumC1655k) Enum.valueOf(EnumC1655k.class, str);
    }

    public static EnumC1655k[] values() {
        return (EnumC1655k[]) j.clone();
    }
}
