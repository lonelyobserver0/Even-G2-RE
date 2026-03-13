package b3;

import com.stub.StubApp;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: b3.g, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class EnumC0505g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ EnumC0505g[] f10624a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f10625b;

    static {
        EnumC0505g[] enumC0505gArr = {new EnumC0505g(StubApp.getString2(9165), 0)};
        f10624a = enumC0505gArr;
        f10625b = EnumEntriesKt.enumEntries(enumC0505gArr);
    }

    public static EnumC0505g valueOf(String str) {
        return (EnumC0505g) Enum.valueOf(EnumC0505g.class, str);
    }

    public static EnumC0505g[] values() {
        return (EnumC0505g[]) f10624a.clone();
    }
}
