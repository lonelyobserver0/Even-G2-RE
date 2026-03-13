package B6;

import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class l extends i {

    /* renamed from: y, reason: collision with root package name */
    public static final HashSet f722y;

    /* renamed from: v, reason: collision with root package name */
    public float f723v;

    /* renamed from: w, reason: collision with root package name */
    public float f724w;

    /* renamed from: x, reason: collision with root package name */
    public float f725x;

    static {
        HashSet hashSet = new HashSet();
        f722y = hashSet;
        hashSet.add(14);
    }

    @Override // B6.f, B6.b
    public final boolean b(int i3) {
        return Math.abs(this.f725x) >= this.f724w && super.b(14);
    }

    @Override // B6.f
    public final boolean c() {
        MotionEvent motionEvent = this.f679e;
        ArrayList arrayList = this.f699l;
        float x7 = motionEvent.getX(motionEvent.findPointerIndex(((Integer) arrayList.get(0)).intValue()));
        MotionEvent motionEvent2 = this.f679e;
        float x10 = (motionEvent2.getX(motionEvent2.findPointerIndex(((Integer) arrayList.get(1)).intValue())) + x7) / 2.0f;
        MotionEvent motionEvent3 = this.f678d;
        float x11 = motionEvent3.getX(motionEvent3.findPointerIndex(((Integer) arrayList.get(0)).intValue()));
        MotionEvent motionEvent4 = this.f678d;
        float x12 = ((motionEvent4.getX(motionEvent4.findPointerIndex(((Integer) arrayList.get(1)).intValue())) + x11) / 2.0f) - x10;
        this.f725x += x12;
        if (this.f709q && x12 != 0.0f) {
            throw com.mapbox.common.b.d(this.f682h);
        }
        if (b(14)) {
            throw com.mapbox.common.b.d(this.f682h);
        }
        return false;
    }

    @Override // B6.f
    public final boolean e() {
        if (!super.e()) {
            HashMap hashMap = this.f700m;
            ArrayList arrayList = this.f699l;
            e eVar = (e) hashMap.get(new h((Integer) arrayList.get(0), (Integer) arrayList.get(1)));
            if (Math.abs(Math.toDegrees(Math.abs(Math.atan2(eVar.f695d, eVar.f694c))) - 90.0d) <= this.f723v) {
                return false;
            }
        }
        return true;
    }

    @Override // B6.f
    public final void g() {
        this.f725x = 0.0f;
    }

    @Override // B6.i
    public final void i() {
        super.i();
        throw com.mapbox.common.b.d(this.f682h);
    }

    @Override // B6.i
    public final HashSet j() {
        return f722y;
    }
}
