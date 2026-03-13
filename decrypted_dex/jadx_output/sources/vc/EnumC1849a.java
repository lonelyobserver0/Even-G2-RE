package vc;

import com.stub.StubApp;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import l4.C1223z;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: vc.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class EnumC1849a {

    /* renamed from: a, reason: collision with root package name */
    public static final C1223z f21937a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC1849a[] f21938b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f21939c;

    static {
        EnumC1849a[] enumC1849aArr = {new EnumC1849a(StubApp.getString2(6414), 0), new EnumC1849a(StubApp.getString2(35395), 1), new EnumC1849a(StubApp.getString2(35396), 2), new EnumC1849a(StubApp.getString2(22725), 3), new EnumC1849a(StubApp.getString2(11739), 4), new EnumC1849a(StubApp.getString2(22727), 5), new EnumC1849a(StubApp.getString2(35397), 6), new EnumC1849a(StubApp.getString2(6385), 7), new EnumC1849a(StubApp.getString2(35398), 8), new EnumC1849a(StubApp.getString2(35399), 9), new EnumC1849a(StubApp.getString2(35400), 10), new EnumC1849a(StubApp.getString2(35401), 11)};
        f21938b = enumC1849aArr;
        f21939c = EnumEntriesKt.enumEntries(enumC1849aArr);
        f21937a = new C1223z(28);
    }

    public static EnumC1849a valueOf(String str) {
        return (EnumC1849a) Enum.valueOf(EnumC1849a.class, str);
    }

    public static EnumC1849a[] values() {
        return (EnumC1849a[]) f21938b.clone();
    }
}
