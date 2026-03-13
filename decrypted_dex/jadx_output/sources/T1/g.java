package T1;

import N.I;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.stub.StubApp;
import java.util.HashMap;
import java.util.WeakHashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class g extends n {

    /* renamed from: A, reason: collision with root package name */
    public static final c f7099A;

    /* renamed from: B, reason: collision with root package name */
    public static final c f7100B;

    /* renamed from: C, reason: collision with root package name */
    public static final c f7101C;

    /* renamed from: D, reason: collision with root package name */
    public static final c f7102D;

    /* renamed from: y, reason: collision with root package name */
    public static final String[] f7103y = {StubApp.getString2(6130), StubApp.getString2(6128), StubApp.getString2(6129), StubApp.getString2(6131), StubApp.getString2(6132)};

    /* renamed from: z, reason: collision with root package name */
    public static final c f7104z;

    static {
        new b(PointF.class, StubApp.getString2(6133)).f7088a = new Rect();
        String string2 = StubApp.getString2(6134);
        f7104z = new c(0, PointF.class, string2);
        String string22 = StubApp.getString2(6135);
        f7099A = new c(1, PointF.class, string22);
        f7100B = new c(2, PointF.class, string22);
        f7101C = new c(3, PointF.class, string2);
        f7102D = new c(4, PointF.class, StubApp.getString2(665));
    }

    public static void G(s sVar) {
        View view = sVar.f7147b;
        WeakHashMap weakHashMap = I.f4732a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap hashMap = sVar.f7146a;
        hashMap.put(StubApp.getString2(6130), new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        hashMap.put(StubApp.getString2(6129), sVar.f7147b.getParent());
    }

    @Override // T1.n
    public final void d(s sVar) {
        G(sVar);
    }

    @Override // T1.n
    public final void g(s sVar) {
        G(sVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // T1.n
    public final Animator k(ViewGroup viewGroup, s sVar, s sVar2) {
        int i3;
        g gVar;
        ObjectAnimator ofObject;
        if (sVar != null && sVar2 != null) {
            HashMap hashMap = sVar.f7146a;
            HashMap hashMap2 = sVar2.f7146a;
            String string2 = StubApp.getString2(6129);
            ViewGroup viewGroup2 = (ViewGroup) hashMap.get(string2);
            ViewGroup viewGroup3 = (ViewGroup) hashMap2.get(string2);
            if (viewGroup2 != null && viewGroup3 != null) {
                String string22 = StubApp.getString2(6130);
                Rect rect = (Rect) hashMap.get(string22);
                Rect rect2 = (Rect) hashMap2.get(string22);
                int i10 = rect.left;
                int i11 = rect2.left;
                int i12 = rect.top;
                int i13 = rect2.top;
                int i14 = rect.right;
                int i15 = rect2.right;
                int i16 = rect.bottom;
                int i17 = rect2.bottom;
                int i18 = i14 - i10;
                int i19 = i16 - i12;
                int i20 = i15 - i11;
                int i21 = i17 - i13;
                String string23 = StubApp.getString2(6128);
                Rect rect3 = (Rect) hashMap.get(string23);
                Rect rect4 = (Rect) hashMap2.get(string23);
                if ((i18 == 0 || i19 == 0) && (i20 == 0 || i21 == 0)) {
                    i3 = 0;
                } else {
                    i3 = (i10 == i11 && i12 == i13) ? 0 : 1;
                    if (i14 != i15 || i16 != i17) {
                        i3++;
                    }
                }
                if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                    i3++;
                }
                if (i3 > 0) {
                    View view = sVar2.f7147b;
                    t.a(view, i10, i12, i14, i16);
                    if (i3 != 2) {
                        gVar = this;
                        if (i10 == i11 && i12 == i13) {
                            gVar.f7138t.getClass();
                            ofObject = ObjectAnimator.ofObject(view, f7100B, (TypeConverter) null, C2.i.x(i14, i16, i15, i17));
                        } else {
                            gVar.f7138t.getClass();
                            ofObject = ObjectAnimator.ofObject(view, f7101C, (TypeConverter) null, C2.i.x(i10, i12, i11, i13));
                        }
                    } else if (i18 == i20 && i19 == i21) {
                        gVar = this;
                        gVar.f7138t.getClass();
                        ofObject = ObjectAnimator.ofObject(view, f7102D, (TypeConverter) null, C2.i.x(i10, i12, i11, i13));
                    } else {
                        gVar = this;
                        f fVar = new f();
                        fVar.f7096e = view;
                        gVar.f7138t.getClass();
                        ObjectAnimator ofObject2 = ObjectAnimator.ofObject(fVar, f7104z, (TypeConverter) null, C2.i.x(i10, i12, i11, i13));
                        gVar.f7138t.getClass();
                        ObjectAnimator ofObject3 = ObjectAnimator.ofObject(fVar, f7099A, (TypeConverter) null, C2.i.x(i14, i16, i15, i17));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ofObject2, ofObject3);
                        animatorSet.addListener(new d(fVar));
                        ofObject = animatorSet;
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                        W.a.y(viewGroup4, true);
                        gVar.a(new e(viewGroup4));
                    }
                    return ofObject;
                }
            }
        }
        return null;
    }

    @Override // T1.n
    public final String[] p() {
        return f7103y;
    }
}
