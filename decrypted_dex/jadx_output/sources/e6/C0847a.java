package e6;

import com.stub.StubApp;

/* renamed from: e6.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0847a extends e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13635c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0847a(T5.a aVar, int i3) {
        super(aVar);
        this.f13635c = i3;
    }

    @Override // ba.AbstractC0534b
    public final String j() {
        if (((T5.a) this.f10727a).f7182b != 60) {
            throw N5.i.a();
        }
        StringBuilder sb2 = new StringBuilder();
        l(sb2, 5);
        p(sb2, 45, 15);
        return sb2.toString();
    }

    @Override // e6.e
    public final void n(StringBuilder sb2, int i3) {
        switch (this.f13635c) {
            case 0:
                sb2.append(StubApp.getString2(17325));
                break;
            default:
                if (i3 >= 10000) {
                    sb2.append(StubApp.getString2(17324));
                    break;
                } else {
                    sb2.append(StubApp.getString2(17323));
                    break;
                }
        }
    }

    @Override // e6.e
    public final int o(int i3) {
        switch (this.f13635c) {
            case 0:
                return i3;
            default:
                return i3 < 10000 ? i3 : i3 - 10000;
        }
    }
}
