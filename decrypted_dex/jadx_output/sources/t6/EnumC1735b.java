package t6;

import com.stub.StubApp;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: t6.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class EnumC1735b {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC1735b f21176a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC1735b f21177b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC1735b f21178c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC1735b[] f21179d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f21180e;

    static {
        EnumC1735b enumC1735b = new EnumC1735b(StubApp.getString2(207), 0);
        f21176a = enumC1735b;
        EnumC1735b enumC1735b2 = new EnumC1735b(StubApp.getString2(2343), 1);
        f21177b = enumC1735b2;
        EnumC1735b enumC1735b3 = new EnumC1735b(StubApp.getString2(23465), 2);
        f21178c = enumC1735b3;
        EnumC1735b[] enumC1735bArr = {enumC1735b, enumC1735b2, enumC1735b3};
        f21179d = enumC1735bArr;
        f21180e = EnumEntriesKt.enumEntries(enumC1735bArr);
    }

    public static EnumC1735b valueOf(String str) {
        return (EnumC1735b) Enum.valueOf(EnumC1735b.class, str);
    }

    public static EnumC1735b[] values() {
        return (EnumC1735b[]) f21179d.clone();
    }
}
