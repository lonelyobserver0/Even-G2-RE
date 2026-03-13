package B6;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import com.mapbox.maps.PlatformEventInfo;
import com.mapbox.maps.PlatformEventType;
import com.mapbox.maps.ScreenCoordinate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d extends i {

    /* renamed from: y, reason: collision with root package name */
    public static final HashSet f688y;

    /* renamed from: v, reason: collision with root package name */
    public PointF f689v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f690w;

    /* renamed from: x, reason: collision with root package name */
    public final HashMap f691x;

    static {
        HashSet hashSet = new HashSet();
        f688y = hashSet;
        hashSet.add(13);
    }

    public d(Context context, a aVar) {
        super(context, aVar);
        this.f691x = new HashMap();
    }

    @Override // B6.i, B6.f, B6.b
    public final boolean a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        HashMap hashMap = this.f691x;
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                hashMap.clear();
            } else if (actionMasked == 3) {
                hashMap.clear();
            } else if (actionMasked != 5) {
                if (actionMasked == 6) {
                    this.f690w = true;
                    hashMap.remove(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())));
                }
            }
            return super.a(motionEvent);
        }
        this.f690w = true;
        hashMap.put(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())), new c(motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex())));
        return super.a(motionEvent);
    }

    @Override // B6.f, B6.b
    public final boolean b(int i3) {
        if (!super.b(13)) {
            return false;
        }
        Iterator it = this.f691x.values().iterator();
        if (!it.hasNext()) {
            return false;
        }
        c cVar = (c) it.next();
        return Math.abs(cVar.f686d) >= 0.0f || Math.abs(cVar.f687e) >= 0.0f;
    }

    @Override // B6.f
    public final boolean c() {
        Iterator it = this.f699l.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int intValue = num.intValue();
            c cVar = (c) this.f691x.get(num);
            MotionEvent motionEvent = this.f678d;
            float x7 = motionEvent.getX(motionEvent.findPointerIndex(intValue));
            MotionEvent motionEvent2 = this.f678d;
            float y10 = motionEvent2.getY(motionEvent2.findPointerIndex(intValue));
            float f10 = cVar.f685c;
            cVar.f685c = x7;
            cVar.f686d = cVar.f683a - x7;
            cVar.f687e = cVar.f684b - y10;
        }
        if (this.f709q) {
            PointF pointF = this.f701n;
            PointF pointF2 = this.f689v;
            float f11 = pointF2.x - pointF.x;
            float f12 = pointF2.y - pointF.y;
            this.f689v = pointF;
            if (!this.f690w) {
                ((i7.e) this.f682h).a(this, f11, f12);
                return false;
            }
            this.f690w = false;
            ((i7.e) this.f682h).a(this, 0.0f, 0.0f);
            return false;
        }
        if (b(13)) {
            i7.e eVar = (i7.e) this.f682h;
            eVar.getClass();
            Intrinsics.checkNotNullParameter(this, "detector");
            d dVar = eVar.f14861a;
            if (dVar == null || dVar != this) {
                Intrinsics.checkNotNullParameter(this, "<set-?>");
                eVar.f14861a = this;
            }
            i7.o oVar = eVar.f14862b;
            if (oVar.f14919r0.f15360c) {
                g7.c L10 = oVar.L();
                PlatformEventType platformEventType = PlatformEventType.DRAG_BEGIN;
                PointF pointF3 = this.f701n;
                L10.dispatch(new PlatformEventInfo(platformEventType, new ScreenCoordinate(pointF3.x, pointF3.y)));
                h();
                this.f689v = this.f701n;
                this.f690w = false;
                return true;
            }
        }
        return false;
    }

    @Override // B6.f
    public final int d() {
        return 1;
    }

    @Override // B6.f
    public final void g() {
    }

    @Override // B6.i
    public final void i() {
        super.i();
        i7.e eVar = (i7.e) this.f682h;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(this, "detector");
        g7.c L10 = eVar.f14862b.L();
        PlatformEventType platformEventType = PlatformEventType.DRAG_END;
        PointF pointF = this.f701n;
        L10.dispatch(new PlatformEventInfo(platformEventType, new ScreenCoordinate(pointF.x, pointF.y)));
    }

    @Override // B6.i
    public final HashSet j() {
        return f688y;
    }
}
