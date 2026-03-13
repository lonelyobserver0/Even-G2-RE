package da;

import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.stub.StubApp;
import fa.AbstractC0936b;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class G {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13467a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f13468b;

    public G(boolean z2, boolean z10) {
        this.f13467a = z2;
        this.f13468b = z10;
    }

    public J a(F f10) {
        return new J(f10);
    }

    public J b(F f10) {
        String string2;
        String string22;
        String string23;
        String string24;
        String string25;
        String string26;
        String string27;
        H h2;
        J a3 = a(f10);
        a3.K(f10.k());
        int G4 = f10.G();
        f10.G();
        f10.G();
        f10.G();
        int i3 = 0;
        while (true) {
            string2 = StubApp.getString2(1154);
            string22 = StubApp.getString2(ModuleDescriptor.MODULE_VERSION);
            string23 = StubApp.getString2(17128);
            string24 = StubApp.getString2(17129);
            string25 = StubApp.getString2(17130);
            string26 = StubApp.getString2(17131);
            string27 = StubApp.getString2(17132);
            if (i3 >= G4) {
                break;
            }
            String C10 = f10.C(4, AbstractC0936b.f14188a);
            boolean equals = C10.equals(string27);
            int i10 = i3;
            String string28 = StubApp.getString2(17133);
            if (equals) {
                h2 = new C0816f(a3);
            } else if (C10.equals(string28)) {
                h2 = new o(a3);
            } else if (C10.equals(StubApp.getString2(17134))) {
                h2 = new p(a3);
            } else if (C10.equals(string26)) {
                h2 = new q(a3);
            } else if (C10.equals(string25)) {
                h2 = new r(a3);
            } else if (C10.equals(string24)) {
                h2 = new s(a3);
            } else if (C10.equals(string23)) {
                h2 = new u(a3);
            } else if (C10.equals(string22)) {
                x xVar = new x(a3);
                xVar.f13547h = null;
                h2 = xVar;
            } else if (C10.equals(StubApp.getString2(17135))) {
                y yVar = new y(a3);
                yVar.f13551i = new byte[10];
                yVar.j = 0L;
                yVar.f13552k = 0L;
                h2 = yVar;
            } else if (C10.equals(string2)) {
                C c10 = new C(a3);
                c10.f13463g = null;
                h2 = c10;
            } else {
                h2 = C10.equals(StubApp.getString2(17136)) ? new C0817g(a3) : C10.equals(StubApp.getString2(17137)) ? new t(a3, 0) : C10.equals(StubApp.getString2(17138)) ? new K(a3) : C10.equals(StubApp.getString2(17139)) ? new L(a3) : C10.equals(StubApp.getString2(17140)) ? new t(a3, 1) : C10.equals(StubApp.getString2(17141)) ? new n(a3) : e(a3, C10);
            }
            h2.f13469a = C10;
            f10.F();
            h2.f13470b = f10.F();
            long F3 = f10.F();
            h2.f13471c = F3;
            H h4 = (F3 != 0 || C10.equals(string28)) ? h2 : null;
            if (h4 != null) {
                if (h4.f13470b + h4.f13471c > a3.f13480d.e()) {
                    Log.w(StubApp.getString2(948), StubApp.getString2(17142) + h4.f13469a + StubApp.getString2(17143) + h4.f13470b + StubApp.getString2(9163) + h4.f13471c + StubApp.getString2(17144) + a3.f13480d.e());
                } else {
                    a3.f13479c.put(h4.f13469a, h4);
                }
            }
            i3 = i10 + 1;
        }
        if (!this.f13468b) {
            for (H h5 : a3.f13479c.values()) {
                if (!h5.f13472d) {
                    a3.J(h5);
                }
            }
            boolean containsKey = a3.f13479c.containsKey(StubApp.getString2(7708));
            boolean z2 = (this instanceof z) && containsKey;
            if (a3.v() == null) {
                throw new IOException(StubApp.getString2(17154));
            }
            if (((q) a3.C(string26)) == null) {
                throw new IOException(StubApp.getString2(17153));
            }
            if (((u) a3.C(string23)) == null) {
                throw new IOException(StubApp.getString2(17152));
            }
            if (((C) a3.C(string2)) == null && !this.f13467a) {
                throw new IOException(StubApp.getString2(17145));
            }
            if (!z2) {
                String string29 = containsKey ? StubApp.getString2(17146) : "";
                if (((s) a3.C(string24)) == null) {
                    throw new IOException(StubApp.getString2(17148).concat(string29));
                }
                if (a3.p() == null) {
                    throw new IOException(StubApp.getString2(17147).concat(string29));
                }
            }
            if (((x) a3.C(string22)) == null && !this.f13467a) {
                throw new IOException(StubApp.getString2(17149));
            }
            if (((r) a3.C(string25)) == null) {
                throw new IOException(StubApp.getString2(17151));
            }
            if (!this.f13467a && ((C0816f) a3.C(string27)) == null) {
                throw new IOException(StubApp.getString2(17150));
            }
        }
        return a3;
    }

    public J c(File file) {
        D d8 = new D(file);
        try {
            return b(d8);
        } catch (IOException e10) {
            d8.close();
            throw e10;
        }
    }

    public J d(InputStream inputStream) {
        v vVar = new v();
        vVar.f13536a = null;
        vVar.f13537b = 0;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(inputStream.available());
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    vVar.f13536a = byteArrayOutputStream.toByteArray();
                    inputStream.close();
                    return b(vVar);
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (Throwable th) {
            inputStream.close();
            throw th;
        }
    }

    public H e(J j, String str) {
        return new H(j);
    }
}
