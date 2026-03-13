package gb;

import com.stub.StubApp;

/* renamed from: gb.w, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public enum EnumC0993w {
    f14373b(StubApp.getString2(18047)),
    /* JADX INFO: Fake field, exist only in values array */
    EF39(StubApp.getString2(18048));


    /* renamed from: a, reason: collision with root package name */
    public final String f14375a;

    EnumC0993w(String str) {
        this.f14375a = str;
    }

    public static EnumC0993w a(String str) {
        for (EnumC0993w enumC0993w : values()) {
            if (enumC0993w.f14375a.equals(str)) {
                return enumC0993w;
            }
        }
        throw new NoSuchFieldException(E1.a.j(StubApp.getString2(18050), str));
    }
}
