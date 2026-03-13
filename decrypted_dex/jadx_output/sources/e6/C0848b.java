package e6;

import com.stub.StubApp;
import w.AbstractC1856e;

/* renamed from: e6.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0848b extends d {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13636c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0848b(T5.a aVar, int i3) {
        super(aVar);
        this.f13636c = i3;
    }

    @Override // ba.AbstractC0534b
    public final String j() {
        switch (this.f13636c) {
            case 0:
                if (((T5.a) this.f10727a).f7182b < 48) {
                    throw N5.i.a();
                }
                StringBuilder sb2 = new StringBuilder();
                l(sb2, 8);
                a5.c cVar = (a5.c) this.f10728b;
                int o5 = a5.c.o(48, 2, (T5.a) cVar.f9282b);
                sb2.append(StubApp.getString2(17328));
                sb2.append(o5);
                sb2.append(')');
                sb2.append(cVar.j(50, null).f13640c);
                return sb2.toString();
            case 1:
                if (((T5.a) this.f10727a).f7182b < 48) {
                    throw N5.i.a();
                }
                StringBuilder sb3 = new StringBuilder();
                l(sb3, 8);
                a5.c cVar2 = (a5.c) this.f10728b;
                int o10 = a5.c.o(48, 2, (T5.a) cVar2.f9282b);
                sb3.append(StubApp.getString2(17327));
                sb3.append(o10);
                sb3.append(')');
                int o11 = a5.c.o(50, 10, (T5.a) cVar2.f9282b);
                if (o11 / 100 == 0) {
                    sb3.append('0');
                }
                if (o11 / 10 == 0) {
                    sb3.append('0');
                }
                sb3.append(o11);
                sb3.append(cVar2.j(60, null).f13640c);
                return sb3.toString();
            default:
                StringBuilder b2 = AbstractC1856e.b(StubApp.getString2(17326));
                int length = b2.length();
                a5.c cVar3 = (a5.c) this.f10728b;
                b2.append(a5.c.o(4, 4, (T5.a) cVar3.f9282b));
                m(b2, 8, length);
                return cVar3.i(b2, 48);
        }
    }
}
