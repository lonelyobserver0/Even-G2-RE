package T1;

import N.I;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import java.util.WeakHashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7089a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i3, Class cls, String str) {
        super(cls, str);
        this.f7089a = i3;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f7089a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return Float.valueOf(t.f7149a.m((View) obj));
            case 6:
                WeakHashMap weakHashMap = I.f4732a;
                return ((View) obj).getClipBounds();
            default:
                return Float.valueOf(((SwitchCompat) obj).f9522C);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f7089a) {
            case 0:
                f fVar = (f) obj;
                PointF pointF = (PointF) obj2;
                fVar.getClass();
                fVar.f7092a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                fVar.f7093b = round;
                int i3 = fVar.f7097f + 1;
                fVar.f7097f = i3;
                if (i3 == fVar.f7098g) {
                    t.a(fVar.f7096e, fVar.f7092a, round, fVar.f7094c, fVar.f7095d);
                    fVar.f7097f = 0;
                    fVar.f7098g = 0;
                    break;
                }
                break;
            case 1:
                f fVar2 = (f) obj;
                PointF pointF2 = (PointF) obj2;
                fVar2.getClass();
                fVar2.f7094c = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                fVar2.f7095d = round2;
                int i10 = fVar2.f7098g + 1;
                fVar2.f7098g = i10;
                if (fVar2.f7097f == i10) {
                    t.a(fVar2.f7096e, fVar2.f7092a, fVar2.f7093b, fVar2.f7094c, round2);
                    fVar2.f7097f = 0;
                    fVar2.f7098g = 0;
                    break;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                t.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                t.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int round3 = Math.round(pointF5.x);
                int round4 = Math.round(pointF5.y);
                t.a(view3, round3, round4, view3.getWidth() + round3, view3.getHeight() + round4);
                break;
            case 5:
                float floatValue = ((Float) obj2).floatValue();
                t.f7149a.y((View) obj, floatValue);
                break;
            case 6:
                WeakHashMap weakHashMap = I.f4732a;
                ((View) obj).setClipBounds((Rect) obj2);
                break;
            default:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                break;
        }
    }
}
