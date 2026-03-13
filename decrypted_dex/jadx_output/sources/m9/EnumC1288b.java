package m9;

import com.stub.StubApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: m9.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class EnumC1288b {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC1288b f17265a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC1288b[] f17266b;

    static {
        EnumC1288b enumC1288b = new EnumC1288b(StubApp.getString2(21170), 0);
        f17265a = enumC1288b;
        f17266b = new EnumC1288b[]{enumC1288b, new EnumC1288b(StubApp.getString2(21171), 1)};
    }

    public static EnumC1288b valueOf(String str) {
        return (EnumC1288b) Enum.valueOf(EnumC1288b.class, str);
    }

    public static EnumC1288b[] values() {
        return (EnumC1288b[]) f17266b.clone();
    }
}
