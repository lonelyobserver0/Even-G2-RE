package gb;

import com.stub.StubApp;

/* renamed from: gb.u, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public enum EnumC0991u {
    /* JADX INFO: Fake field, exist only in values array */
    EF11(null),
    /* JADX INFO: Fake field, exist only in values array */
    EF31(StubApp.getString2(18038)),
    /* JADX INFO: Fake field, exist only in values array */
    EF51(StubApp.getString2(18040)),
    /* JADX INFO: Fake field, exist only in values array */
    EF71(StubApp.getString2(18042)),
    /* JADX INFO: Fake field, exist only in values array */
    EF91(StubApp.getString2(18044));


    /* renamed from: a, reason: collision with root package name */
    public final String f14372a;

    EnumC0991u(String str) {
        this.f14372a = str;
    }

    public static EnumC0991u a(String str) {
        for (EnumC0991u enumC0991u : values()) {
            String str2 = enumC0991u.f14372a;
            if ((str2 == null && str == null) || (str2 != null && str2.equals(str))) {
                return enumC0991u;
            }
        }
        throw new NoSuchFieldException(E1.a.j(StubApp.getString2(18046), str));
    }
}
