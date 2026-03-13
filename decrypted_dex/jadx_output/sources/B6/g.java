package B6;

import android.graphics.PointF;
import android.view.MotionEvent;
import com.mapbox.maps.ScreenCoordinate;
import com.stub.StubApp;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class g extends f {

    /* renamed from: p, reason: collision with root package name */
    public long f703p;

    /* renamed from: q, reason: collision with root package name */
    public float f704q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f705r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f706s;

    /* renamed from: t, reason: collision with root package name */
    public int f707t;

    @Override // B6.f, B6.b
    public final boolean a(MotionEvent motionEvent) {
        super.a(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        boolean z2 = false;
        boolean z10 = true;
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked == 5) {
                    if (this.f706s) {
                        this.f705r = true;
                    }
                    this.f707t = this.f699l.size();
                    return false;
                }
                if (actionMasked == 6) {
                    this.f706s = true;
                    return false;
                }
            } else if (!this.f705r) {
                Iterator it = this.f700m.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = false;
                        break;
                    }
                    e eVar = (e) it.next();
                    float abs = Math.abs(eVar.f694c - eVar.f692a);
                    float abs2 = Math.abs(eVar.f695d - eVar.f693b);
                    float f10 = this.f704q;
                    boolean z11 = abs > f10 || abs2 > f10;
                    this.f705r = z11;
                    if (z11) {
                        break;
                    }
                }
                this.f705r = z10;
                return false;
            }
            return false;
        }
        if (b(4)) {
            i7.j jVar = (i7.j) this.f682h;
            int i3 = this.f707t;
            jVar.getClass();
            Intrinsics.checkNotNullParameter(this, "detector");
            i7.o oVar = jVar.f14868a;
            if (oVar.f14919r0.f15365h && i3 == 2) {
                Y6.a aVar = oVar.f14914p;
                if (aVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cameraAnimationsPlugin");
                    aVar = null;
                }
                ((Y6.j) aVar).b(CollectionsKt.toList(oVar.f14916q));
                ScreenCoordinate screenCoordinate = oVar.f14919r0.f15366k;
                String string2 = StubApp.getString2(684);
                if (screenCoordinate != null) {
                    Intrinsics.checkNotNullParameter(screenCoordinate, string2);
                    oVar.M(false, screenCoordinate);
                } else {
                    PointF pointF = this.f701n;
                    ScreenCoordinate screenCoordinate2 = new ScreenCoordinate(pointF.x, pointF.y);
                    Intrinsics.checkNotNullParameter(screenCoordinate2, string2);
                    oVar.M(false, screenCoordinate2);
                }
                z2 = true;
            }
        }
        g();
        return z2;
    }

    @Override // B6.f, B6.b
    public final boolean b(int i3) {
        return this.f707t > 1 && !this.f705r && this.f680f < this.f703p && super.b(4);
    }

    @Override // B6.f
    public final void g() {
        this.f707t = 0;
        this.f705r = false;
        this.f706s = false;
    }
}
