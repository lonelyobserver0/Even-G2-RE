package ta;

import com.google.android.gms.internal.measurement.F1;
import java.io.ByteArrayOutputStream;
import oa.AbstractC1469b;
import oa.C1468a;
import oa.p;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class h implements InterfaceC1743c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21256a = 1;

    /* renamed from: b, reason: collision with root package name */
    public AbstractC1469b f21257b;

    public /* synthetic */ h() {
    }

    public byte[] a() {
        Throwable th;
        oa.h hVar;
        try {
            hVar = ((p) this.f21257b).Z();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                F1.i(hVar, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                hVar.close();
                return byteArray;
            } catch (Throwable th2) {
                th = th2;
                if (hVar != null) {
                    hVar.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            hVar = null;
        }
    }

    @Override // ta.InterfaceC1743c
    public final AbstractC1469b p() {
        switch (this.f21256a) {
            case 0:
                return (p) this.f21257b;
            default:
                return (C1468a) this.f21257b;
        }
    }

    public h(p pVar) {
        this.f21257b = pVar;
    }
}
