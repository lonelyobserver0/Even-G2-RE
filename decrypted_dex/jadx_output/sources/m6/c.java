package m6;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.journeyapps.barcodescanner.BarcodeView;
import com.stub.StubApp;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class c implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17060a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BarcodeView f17061b;

    public /* synthetic */ c(BarcodeView barcodeView, int i3) {
        this.f17060a = i3;
        this.f17061b = barcodeView;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        InterfaceC1273a interfaceC1273a;
        Bc.i iVar;
        BarcodeView barcodeView = this.f17061b;
        switch (this.f17060a) {
            case 0:
                int i3 = message.what;
                if (i3 != 2131231186) {
                    if (i3 == 2131231185) {
                        return true;
                    }
                    if (i3 != 2131231187) {
                        return false;
                    }
                    List list = (List) message.obj;
                    InterfaceC1273a interfaceC1273a2 = barcodeView.f12254F;
                    if (interfaceC1273a2 == null || barcodeView.f12253E == 1) {
                        return true;
                    }
                    interfaceC1273a2.f(list);
                    return true;
                }
                C1274b c1274b = (C1274b) message.obj;
                if (c1274b == null || (interfaceC1273a = barcodeView.f12254F) == null || barcodeView.f12253E == 1) {
                    return true;
                }
                interfaceC1273a.h(c1274b);
                if (barcodeView.f12253E != 2) {
                    return true;
                }
                barcodeView.f12253E = 1;
                barcodeView.f12254F = null;
                barcodeView.k();
                return true;
            default:
                int i10 = message.what;
                d dVar = barcodeView.f17067C;
                if (i10 != 2131231189) {
                    if (i10 == 2131231183) {
                        Exception exc = (Exception) message.obj;
                        if (barcodeView.f17068a != null) {
                            barcodeView.i();
                            dVar.c(exc);
                        }
                    } else if (i10 == 2131231182) {
                        dVar.a();
                    }
                    return false;
                }
                q qVar = (q) message.obj;
                barcodeView.f17080p = qVar;
                q qVar2 = barcodeView.f17079n;
                if (qVar2 == null) {
                    return true;
                }
                if (qVar == null || (iVar = barcodeView.f17077l) == null) {
                    barcodeView.f17084t = null;
                    barcodeView.f17083s = null;
                    barcodeView.f17081q = null;
                    throw new IllegalStateException(StubApp.getString2(21072));
                }
                Rect b2 = ((n6.l) iVar.f768d).b(qVar, (q) iVar.f767c);
                if (b2.width() > 0 && b2.height() > 0) {
                    barcodeView.f17081q = b2;
                    barcodeView.f17083s = barcodeView.b(new Rect(0, 0, qVar2.f17120a, qVar2.f17121b), barcodeView.f17081q);
                    Rect rect = new Rect(barcodeView.f17083s);
                    Rect rect2 = barcodeView.f17081q;
                    rect.offset(-rect2.left, -rect2.top);
                    int i11 = rect.left;
                    int i12 = qVar.f17120a;
                    int width = (i11 * i12) / barcodeView.f17081q.width();
                    int i13 = rect.top;
                    int i14 = qVar.f17121b;
                    Rect rect3 = new Rect(width, (i13 * i14) / barcodeView.f17081q.height(), (rect.right * i12) / barcodeView.f17081q.width(), (rect.bottom * i14) / barcodeView.f17081q.height());
                    barcodeView.f17084t = rect3;
                    if (rect3.width() <= 0 || barcodeView.f17084t.height() <= 0) {
                        barcodeView.f17084t = null;
                        barcodeView.f17083s = null;
                        Log.w(StubApp.getString2(1958), StubApp.getString2(21071));
                    } else {
                        dVar.e();
                    }
                }
                barcodeView.requestLayout();
                barcodeView.g();
                return true;
        }
    }
}
