package E0;

import com.stub.StubApp;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class k implements y {

    /* renamed from: a, reason: collision with root package name */
    public static final k f1774a = new k();

    /* renamed from: b, reason: collision with root package name */
    public static final k f1775b = new k();

    @Override // E0.y
    public int b(Object obj) {
        String str = ((p) obj).f1777a;
        if (str.startsWith(StubApp.getString2(1596)) || str.startsWith(StubApp.getString2(1597))) {
            return 1;
        }
        return (AbstractC1560u.f20190a >= 26 || !str.equals(StubApp.getString2(1598))) ? 0 : -1;
    }
}
