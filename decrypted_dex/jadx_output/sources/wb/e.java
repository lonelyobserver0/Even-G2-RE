package wb;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.cbor.CBORFactory;
import com.stub.StubApp;
import no.nordicsemi.android.ble.y;
import vb.C1847d;
import vb.InterfaceC1845b;
import xb.C1954k;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte[] f22290a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Class f22291b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1845b f22292c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f22293d;

    public e(f fVar, byte[] bArr, Class cls, InterfaceC1845b interfaceC1845b) {
        this.f22293d = fVar;
        this.f22290a = bArr;
        this.f22291b = cls;
        this.f22292c = interfaceC1845b;
    }

    public final void a(Throwable th) {
        boolean z2 = th instanceof Db.c;
        InterfaceC1845b interfaceC1845b = this.f22292c;
        if (z2) {
            interfaceC1845b.i((Db.c) th);
        } else if (th instanceof C1954k) {
            interfaceC1845b.i(new Db.d(th));
        } else {
            interfaceC1845b.i(new Db.c(th));
        }
    }

    public final void b(byte[] bArr) {
        InterfaceC1845b interfaceC1845b = this.f22292c;
        try {
            Hb.b a3 = Hb.b.a(bArr, this.f22291b);
            if (a3.b()) {
                interfaceC1845b.m(a3);
            } else {
                interfaceC1845b.i(new Db.b(a3));
            }
        } catch (Exception e10) {
            interfaceC1845b.i(new Db.c(e10));
        }
    }

    public final void c() {
        String string2 = StubApp.getString2(24085);
        f fVar = this.f22293d;
        int a3 = fVar.a();
        byte[] bArr = this.f22290a;
        if (a3 <= 4) {
            try {
                StringBuilder sb2 = new StringBuilder(string2);
                sb2.append(bArr.length);
                sb2.append(StubApp.getString2("24086"));
                sb2.append(C1847d.a(bArr));
                sb2.append(StubApp.getString2("24081"));
                CBORFactory cBORFactory = Ob.a.f5373a;
                sb2.append(new ObjectMapper(Ob.a.f5373a).readTree(bArr, 8, bArr.length - 8).toString());
                fVar.b(4, sb2.toString());
            } catch (Exception unused) {
            }
        }
        y yVar = new y(fVar.f22295h, bArr, bArr != null ? bArr.length : 0);
        yVar.i(fVar.f17932b);
        yVar.f17998p = y.f17997w;
        yVar.a();
    }
}
