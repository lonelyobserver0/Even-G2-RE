package bc;

import com.stub.StubApp;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: bc.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class EnumC0537a {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0537a f10749a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC0537a[] f10750b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f10751c;

    static {
        EnumC0537a enumC0537a = new EnumC0537a(StubApp.getString2(207), 0);
        EnumC0537a enumC0537a2 = new EnumC0537a(StubApp.getString2(25985), 1);
        EnumC0537a enumC0537a3 = new EnumC0537a(StubApp.getString2(25986), 2);
        f10749a = enumC0537a3;
        EnumC0537a[] enumC0537aArr = {enumC0537a, enumC0537a2, enumC0537a3};
        f10750b = enumC0537aArr;
        f10751c = EnumEntriesKt.enumEntries(enumC0537aArr);
    }

    public static EnumC0537a valueOf(String str) {
        return (EnumC0537a) Enum.valueOf(EnumC0537a.class, str);
    }

    public static EnumC0537a[] values() {
        return (EnumC0537a[]) f10750b.clone();
    }
}
