package wb;

import Sb.l;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.cbor.CBORFactory;
import com.stub.StubApp;
import i5.C1059c;
import kotlin.jvm.internal.Intrinsics;
import nc.C1401a;
import vb.C1847d;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22288a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f22289b;

    public /* synthetic */ d(int i3, f fVar) {
        this.f22288a = i3;
        this.f22289b = fVar;
    }

    public final void a(C1401a c1401a) {
        f fVar = this.f22289b;
        switch (this.f22288a) {
            case 0:
                fVar.getClass();
                String string2 = StubApp.getString2(24083);
                byte[] bArr = c1401a.f17893a;
                if (bArr == null || bArr.length <= 14) {
                    return;
                }
                try {
                    Ib.c cVar = (Ib.c) Hb.b.a(bArr, Ib.c.class);
                    if (fVar.a() <= 4) {
                        fVar.b(4, string2 + cVar.bufSize + StubApp.getString2("24084") + cVar.bufCount);
                    }
                    fVar.f22298l = cVar.bufSize;
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                String string22 = StubApp.getString2(22084);
                C1059c c1059c = fVar.f22301o;
                byte[] data = c1401a.f17893a;
                if (data == null || c1059c == null) {
                    return;
                }
                if (fVar.a() <= 4) {
                    try {
                        StringBuilder sb2 = new StringBuilder(string22);
                        sb2.append(C1847d.a(data));
                        sb2.append(StubApp.getString2("24081"));
                        CBORFactory cBORFactory = Ob.a.f5373a;
                        sb2.append(new ObjectMapper(Ob.a.f5373a).readTree(data, 8, data.length - 8).toString());
                        fVar.b(4, sb2.toString());
                    } catch (Exception unused2) {
                    }
                }
                Intrinsics.checkNotNullParameter(data, "data");
                if (((Sb.e) c1059c.f14845d).j(data) instanceof l) {
                    throw new IllegalStateException(StubApp.getString2(24082));
                }
                return;
        }
    }
}
