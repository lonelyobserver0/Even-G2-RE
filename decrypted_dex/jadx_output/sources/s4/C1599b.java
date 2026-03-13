package s4;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.stub.StubApp;
import java.util.ArrayList;
import t.C1697j;

/* renamed from: s4.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1599b {

    /* renamed from: a, reason: collision with root package name */
    public final C1697j f20750a = new C1697j(0);

    /* renamed from: b, reason: collision with root package name */
    public final C1697j f20751b = new C1697j(0);

    public static C1599b a(Context context, int i3) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i3);
            if (loadAnimator instanceof AnimatorSet) {
                return b(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return b(arrayList);
        } catch (Exception e10) {
            Log.w(StubApp.getString2(23121), StubApp.getString2(23120) + Integer.toHexString(i3), e10);
            return null;
        }
    }

    public static C1599b b(ArrayList arrayList) {
        C1599b c1599b = new C1599b();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            Animator animator = (Animator) arrayList.get(i3);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException(StubApp.getString2(23122) + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c1599b.f20751b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = AbstractC1598a.f20747b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = AbstractC1598a.f20748c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = AbstractC1598a.f20749d;
            }
            C1600c c1600c = new C1600c();
            c1600c.f20755d = 0;
            c1600c.f20756e = 1;
            c1600c.f20752a = startDelay;
            c1600c.f20753b = duration;
            c1600c.f20754c = interpolator;
            c1600c.f20755d = objectAnimator.getRepeatCount();
            c1600c.f20756e = objectAnimator.getRepeatMode();
            c1599b.f20750a.put(propertyName, c1600c);
        }
        return c1599b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1599b) {
            return this.f20750a.equals(((C1599b) obj).f20750a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20750a.hashCode();
    }

    public final String toString() {
        return StubApp.getString2(3692) + C1599b.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + StubApp.getString2(23123) + this.f20750a + StubApp.getString2(20170);
    }
}
