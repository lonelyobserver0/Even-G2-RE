package B6;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class f extends b {

    /* renamed from: i, reason: collision with root package name */
    public final float f697i;
    public float j;

    /* renamed from: k, reason: collision with root package name */
    public final u5.d f698k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f699l;

    /* renamed from: m, reason: collision with root package name */
    public final HashMap f700m;

    /* renamed from: n, reason: collision with root package name */
    public PointF f701n;

    /* renamed from: o, reason: collision with root package name */
    public DisplayMetrics f702o;

    public f(Context context, a aVar) {
        super(context, aVar);
        this.f698k = new u5.d(2);
        this.f699l = new ArrayList();
        this.f700m = new HashMap();
        this.f701n = new PointF();
        this.f697i = ViewConfiguration.get(context).getScaledEdgeSlop();
        f();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cf A[LOOP:1: B:28:0x00cd->B:29:0x00cf, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fa  */
    @Override // B6.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(android.view.MotionEvent r20) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B6.f.a(android.view.MotionEvent):boolean");
    }

    @Override // B6.b
    public boolean b(int i3) {
        return super.b(i3) && !e();
    }

    public boolean c() {
        return false;
    }

    public int d() {
        return 2;
    }

    public boolean e() {
        float f10 = this.f702o.widthPixels;
        float f11 = this.f697i;
        float f12 = f10 - f11;
        float f13 = r0.heightPixels - f11;
        Iterator it = this.f699l.iterator();
        while (it.hasNext()) {
            int findPointerIndex = this.f678d.findPointerIndex(((Integer) it.next()).intValue());
            MotionEvent motionEvent = this.f678d;
            float x7 = findPointerIndex < motionEvent.getPointerCount() ? motionEvent.getX(findPointerIndex) + (motionEvent.getRawX() - motionEvent.getX()) : 0.0f;
            MotionEvent motionEvent2 = this.f678d;
            float y10 = findPointerIndex < motionEvent2.getPointerCount() ? motionEvent2.getY(findPointerIndex) + (motionEvent2.getRawY() - motionEvent2.getY()) : 0.0f;
            if (x7 < f11 || y10 < f11 || x7 > f12 || y10 > f13) {
                return true;
            }
        }
        Iterator it2 = this.f700m.values().iterator();
        while (it2.hasNext()) {
            if (((e) it2.next()).f696e < this.j) {
                return true;
            }
        }
        return false;
    }

    public final void f() {
        WindowManager windowManager = this.f676b;
        if (windowManager == null) {
            this.f702o = this.f675a.getResources().getDisplayMetrics();
        } else {
            this.f702o = new DisplayMetrics();
            windowManager.getDefaultDisplay().getRealMetrics(this.f702o);
        }
    }

    public abstract void g();
}
