package t6;

import com.stub.StubApp;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: t6.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class EnumC1738e {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC1738e f21204b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC1738e f21205c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1738e f21206d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC1738e[] f21207e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f21208f;

    /* renamed from: a, reason: collision with root package name */
    public final int f21209a;

    static {
        EnumC1738e enumC1738e = new EnumC1738e(StubApp.getString2(2343), 0, 0);
        f21204b = enumC1738e;
        EnumC1738e enumC1738e2 = new EnumC1738e(StubApp.getString2(2351), 1, 1);
        f21205c = enumC1738e2;
        EnumC1738e enumC1738e3 = new EnumC1738e(StubApp.getString2(23487), 2, 2);
        f21206d = enumC1738e3;
        EnumC1738e[] enumC1738eArr = {enumC1738e, enumC1738e2, enumC1738e3};
        f21207e = enumC1738eArr;
        f21208f = EnumEntriesKt.enumEntries(enumC1738eArr);
    }

    public EnumC1738e(String str, int i3, int i10) {
        this.f21209a = i10;
    }

    public static EnumC1738e valueOf(String str) {
        return (EnumC1738e) Enum.valueOf(EnumC1738e.class, str);
    }

    public static EnumC1738e[] values() {
        return (EnumC1738e[]) f21207e.clone();
    }
}
