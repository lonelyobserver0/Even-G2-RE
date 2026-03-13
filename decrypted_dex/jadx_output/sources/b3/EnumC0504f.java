package b3;

import com.stub.StubApp;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: b3.f, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class EnumC0504f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ EnumC0504f[] f10622a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f10623b;

    static {
        EnumC0504f[] enumC0504fArr = {new EnumC0504f(StubApp.getString2(9164), 0)};
        f10622a = enumC0504fArr;
        f10623b = EnumEntriesKt.enumEntries(enumC0504fArr);
    }

    public static EnumC0504f valueOf(String str) {
        return (EnumC0504f) Enum.valueOf(EnumC0504f.class, str);
    }

    public static EnumC0504f[] values() {
        return (EnumC0504f[]) f10622a.clone();
    }
}
