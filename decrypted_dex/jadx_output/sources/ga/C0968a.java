package ga;

import com.stub.StubApp;
import f5.u0;

/* renamed from: ga.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0968a extends u0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f14242e;

    public /* synthetic */ C0968a(int i3) {
        this.f14242e = i3;
    }

    @Override // f5.u0
    public final String[] o() {
        switch (this.f14242e) {
            case 0:
                return new String[]{StubApp.getString2(17826)};
            case 1:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(System.getProperty(StubApp.getString2(17816)));
                String string2 = StubApp.getString2(17823);
                sb2.append(string2);
                return new String[]{sb2.toString(), string2, StubApp.getString2(17824), StubApp.getString2(17825)};
            case 2:
                return new String[]{System.getProperty(StubApp.getString2(17816)) + StubApp.getString2(17817), StubApp.getString2(17822)};
            default:
                return new String[]{System.getProperty(StubApp.getString2(17816)) + StubApp.getString2(17817), StubApp.getString2(17820), StubApp.getString2(17821), StubApp.getString2(17818), StubApp.getString2(17819)};
        }
    }
}
