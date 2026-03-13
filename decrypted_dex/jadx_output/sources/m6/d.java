package m6;

import android.graphics.Rect;
import android.util.Log;
import com.journeyapps.barcodescanner.BarcodeView;
import com.journeyapps.barcodescanner.ViewfinderView;
import com.stub.StubApp;
import java.util.Iterator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17062a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17063b;

    public /* synthetic */ d(Object obj, int i3) {
        this.f17062a = i3;
        this.f17063b = obj;
    }

    private final void b() {
    }

    private final void d(Exception exc) {
    }

    private final void f() {
    }

    private final void h() {
    }

    private final void i() {
    }

    private final void k() {
    }

    private final void l() {
    }

    public final void a() {
        Object obj = this.f17063b;
        switch (this.f17062a) {
            case 0:
                Iterator it = ((BarcodeView) obj).f17076k.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).a();
                }
                break;
            case 1:
                h hVar = (h) obj;
                if (hVar.f17103k) {
                    Log.d(StubApp.getString2(4933), StubApp.getString2(21073));
                    hVar.f17094a.finish();
                    break;
                }
                break;
        }
    }

    public final void c(Exception exc) {
        switch (this.f17062a) {
            case 0:
                Iterator it = ((BarcodeView) this.f17063b).f17076k.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).c(exc);
                }
                break;
            case 1:
                h hVar = (h) this.f17063b;
                hVar.b(hVar.f17094a.getString(2131755243));
                break;
        }
    }

    public final void e() {
        switch (this.f17062a) {
            case 0:
                Iterator it = ((BarcodeView) this.f17063b).f17076k.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).e();
                }
                break;
            case 1:
                break;
            default:
                ViewfinderView viewfinderView = (ViewfinderView) this.f17063b;
                e eVar = viewfinderView.j;
                if (eVar != null) {
                    Rect framingRect = eVar.getFramingRect();
                    q previewSize = viewfinderView.j.getPreviewSize();
                    if (framingRect != null && previewSize != null) {
                        viewfinderView.f12272k = framingRect;
                        viewfinderView.f12273l = previewSize;
                    }
                }
                viewfinderView.invalidate();
                break;
        }
    }

    public final void g() {
        switch (this.f17062a) {
            case 0:
                Iterator it = ((BarcodeView) this.f17063b).f17076k.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).g();
                }
                break;
        }
    }

    public final void j() {
        switch (this.f17062a) {
            case 0:
                Iterator it = ((BarcodeView) this.f17063b).f17076k.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).j();
                }
                break;
        }
    }
}
