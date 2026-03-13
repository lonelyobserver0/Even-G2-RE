package q3;

import B3.s;
import Z9.q;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.AsyncTask;
import android.os.HandlerThread;
import android.util.Log;
import com.shockwave.pdfium.PdfiumCore;
import com.shockwave.pdfium.util.Size;
import com.stub.StubApp;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import w3.InterfaceC1861b;

/* renamed from: q3.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class AsyncTaskC1511d extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public boolean f19940a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f19941b;

    /* renamed from: c, reason: collision with root package name */
    public PdfiumCore f19942c;

    /* renamed from: d, reason: collision with root package name */
    public String f19943d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC1861b f19944e;

    /* renamed from: f, reason: collision with root package name */
    public C1517j f19945f;

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        try {
            C1514g c1514g = (C1514g) this.f19941b.get();
            if (c1514g == null) {
                return new NullPointerException(StubApp.getString2("22204"));
            }
            this.f19945f = new C1517j(this.f19942c, this.f19944e.b(c1514g.getContext(), this.f19942c, this.f19943d), c1514g.getPageFitPolicy(), new Size(c1514g.getWidth(), c1514g.getHeight()), c1514g.f20005y, c1514g.getSpacingPx(), c1514g.f19980L, c1514g.f20003w);
            return null;
        } catch (Throwable th) {
            return th;
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        this.f19940a = true;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Throwable th = (Throwable) obj;
        C1514g c1514g = (C1514g) this.f19941b.get();
        if (c1514g != null) {
            if (th != null) {
                c1514g.h0 = 4;
                q qVar = (q) c1514g.f20000s.f651c;
                c1514g.p();
                c1514g.invalidate();
                if (qVar == null) {
                    Log.e(StubApp.getString2(22205), StubApp.getString2(22206), th);
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put(StubApp.getString2(435), th.toString());
                ((Va.a) qVar.f9143b).f7914b.invokeMethod(StubApp.getString2(6253), hashMap);
                return;
            }
            if (this.f19940a) {
                return;
            }
            C1517j c1517j = this.f19945f;
            c1514g.h0 = 2;
            c1514g.f19991g = c1517j;
            HandlerThread handlerThread = c1514g.f19997p;
            if (handlerThread == null) {
                return;
            }
            if (!handlerThread.isAlive()) {
                c1514g.f19997p.start();
            }
            HandlerC1519l handlerC1519l = new HandlerC1519l(c1514g.f19997p.getLooper());
            handlerC1519l.f20047b = new RectF();
            handlerC1519l.f20048c = new Rect();
            handlerC1519l.f20049d = new Matrix();
            handlerC1519l.f20046a = c1514g;
            c1514g.f19998q = handlerC1519l;
            handlerC1519l.f20050e = true;
            c1514g.f19990f.f19952g = true;
            s sVar = c1514g.f20000s;
            int i3 = c1517j.f20023c;
            sVar.getClass();
            c1514g.k(c1514g.f20004x);
        }
    }
}
