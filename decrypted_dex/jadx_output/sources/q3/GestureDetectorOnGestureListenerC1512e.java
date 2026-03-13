package q3;

import B3.s;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;
import com.shockwave.pdfium.util.SizeF;
import java.util.Iterator;
import s3.InterfaceC1597b;
import u3.C1772a;

/* renamed from: q3.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class GestureDetectorOnGestureListenerC1512e implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener, View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public C1514g f19946a;

    /* renamed from: b, reason: collision with root package name */
    public C1510c f19947b;

    /* renamed from: c, reason: collision with root package name */
    public GestureDetector f19948c;

    /* renamed from: d, reason: collision with root package name */
    public ScaleGestureDetector f19949d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f19950e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f19951f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f19952g;

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        C1514g c1514g = this.f19946a;
        if (!c1514g.f19970A) {
            return false;
        }
        if (c1514g.getZoom() < c1514g.getMidZoom()) {
            c1514g.f19989e.d(motionEvent.getX(), motionEvent.getY(), c1514g.f19994l, c1514g.getMidZoom());
            return true;
        }
        if (c1514g.getZoom() < c1514g.getMaxZoom()) {
            c1514g.f19989e.d(motionEvent.getX(), motionEvent.getY(), c1514g.f19994l, c1514g.getMaxZoom());
            return true;
        }
        c1514g.f19989e.d(c1514g.getWidth() / 2, c1514g.getHeight() / 2, c1514g.f19994l, c1514g.f19985a);
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        C1510c c1510c = this.f19947b;
        c1510c.f19938d = false;
        c1510c.f19937c.forceFinished(true);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        if (r7 < (r8 - r3.getHeight())) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        r11 = (int) r3.getCurrentXOffset();
        r12 = (int) r3.getCurrentYOffset();
        r4 = r3.f19991g;
        r5 = -r4.e(r3.getZoom(), r3.getCurrentPage());
        r7 = r5 - r4.d(r3.getZoom(), r3.getCurrentPage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0079, code lost:
    
        if (r3.f20005y == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007b, code lost:
    
        r4 = -((r4.b().f12764a * r3.f19994l) - r3.getWidth());
        r7 = r7 + r3.getHeight();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ad, code lost:
    
        r4 = r19.f19947b;
        r4.e();
        r4.f19938d = true;
        r4.f19937c.fling(r11, r12, (int) r22, (int) r23, (int) r4, (int) r9, (int) r7, (int) r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c5, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0092, code lost:
    
        r7 = r7 + r3.getWidth();
        r3 = -((r4.b().f12765b * r3.f19994l) - r3.getHeight());
        r9 = r5;
        r5 = 0.0f;
        r4 = r7;
        r7 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x004e, code lost:
    
        if (r7 < (r8 - r3.getWidth())) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e5  */
    @Override // android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onFling(android.view.MotionEvent r20, android.view.MotionEvent r21, float r22, float r23) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.GestureDetectorOnGestureListenerC1512e.onFling(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        this.f19946a.f20000s.getClass();
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        C1514g c1514g = this.f19946a;
        float zoom = c1514g.getZoom() * scaleFactor;
        float min = Math.min(1.0f, c1514g.getMinZoom());
        float min2 = Math.min(10.0f, c1514g.getMaxZoom());
        if (zoom < min) {
            scaleFactor = min / c1514g.getZoom();
        } else if (zoom > min2) {
            scaleFactor = min2 / c1514g.getZoom();
        }
        c1514g.s(c1514g.f19994l * scaleFactor, new PointF(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY()));
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.f19951f = true;
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.f19946a.m();
        this.f19946a.getScrollHandle();
        this.f19951f = false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        this.f19950e = true;
        C1514g c1514g = this.f19946a;
        if (c1514g.f19994l != c1514g.f19985a || c1514g.f20006z) {
            c1514g.n(c1514g.j + (-f10), c1514g.f19993k + (-f11));
        }
        if (this.f19951f && !c1514g.f19976G) {
            return true;
        }
        c1514g.l();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        int h2;
        int e10;
        C1514g c1514g = this.f19946a;
        c1514g.f20000s.getClass();
        float x7 = motionEvent.getX();
        float y10 = motionEvent.getY();
        C1517j c1517j = c1514g.f19991g;
        if (c1517j != null) {
            float f10 = (-c1514g.getCurrentXOffset()) + x7;
            float f11 = (-c1514g.getCurrentYOffset()) + y10;
            int c10 = c1517j.c(c1514g.f20005y ? f11 : f10, c1514g.getZoom());
            SizeF g10 = c1517j.g(c1514g.getZoom(), c10);
            if (c1514g.f20005y) {
                e10 = (int) c1517j.h(c1514g.getZoom(), c10);
                h2 = (int) c1517j.e(c1514g.getZoom(), c10);
            } else {
                h2 = (int) c1517j.h(c1514g.getZoom(), c10);
                e10 = (int) c1517j.e(c1514g.getZoom(), c10);
            }
            int i3 = e10;
            int i10 = h2;
            int a3 = c1517j.a(c10);
            PdfDocument pdfDocument = c1517j.f20021a;
            PdfiumCore pdfiumCore = c1517j.f20022b;
            Iterator it = pdfiumCore.d(pdfDocument, a3).iterator();
            while (it.hasNext()) {
                PdfDocument.Link link = (PdfDocument.Link) it.next();
                int i11 = (int) g10.f12764a;
                int i12 = (int) g10.f12765b;
                RectF rectF = link.f12756a;
                int a9 = c1517j.a(c10);
                PdfDocument pdfDocument2 = c1517j.f20021a;
                int i13 = c10;
                C1517j c1517j2 = c1517j;
                Point g11 = pdfiumCore.g(pdfDocument2, a9, i3, i10, i11, i12, rectF.left, rectF.top);
                SizeF sizeF = g10;
                Iterator it2 = it;
                Point g12 = pdfiumCore.g(pdfDocument2, a9, i3, i10, i11, i12, rectF.right, rectF.bottom);
                RectF rectF2 = new RectF(g11.x, g11.y, g12.x, g12.y);
                rectF2.sort();
                if (rectF2.contains(f10, f11)) {
                    s sVar = c1514g.f20000s;
                    C1772a c1772a = new C1772a();
                    c1772a.f21432a = link;
                    InterfaceC1597b interfaceC1597b = (InterfaceC1597b) sVar.f654f;
                    if (interfaceC1597b != null) {
                        interfaceC1597b.a(c1772a);
                    }
                    c1514g.performClick();
                    return true;
                }
                c1517j = c1517j2;
                c10 = i13;
                g10 = sizeF;
                it = it2;
            }
        }
        c1514g.getScrollHandle();
        c1514g.performClick();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f19952g) {
            return false;
        }
        boolean z2 = this.f19948c.onTouchEvent(motionEvent) || this.f19949d.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 1 && this.f19950e) {
            this.f19950e = false;
            C1514g c1514g = this.f19946a;
            c1514g.m();
            this.f19946a.getScrollHandle();
            C1510c c1510c = this.f19947b;
            if (!c1510c.f19938d && !c1510c.f19939e) {
                c1514g.o();
            }
        }
        return z2;
    }
}
