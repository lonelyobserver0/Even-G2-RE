package S;

import N.I;
import Z9.q;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.WeakHashMap;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import z4.C2008b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a extends q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f6406d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(13);
        this.f6406d = bVar;
    }

    @Override // Z9.q
    public final boolean D(int i3, int i10, Bundle bundle) {
        int i11;
        b bVar = this.f6406d;
        Chip chip = bVar.f6415i;
        if (i3 == -1) {
            WeakHashMap weakHashMap = I.f4732a;
            return chip.performAccessibilityAction(i10, bundle);
        }
        if (i10 == 1) {
            return bVar.p(i3);
        }
        if (i10 == 2) {
            return bVar.j(i3);
        }
        boolean z2 = false;
        if (i10 == 64) {
            AccessibilityManager accessibilityManager = bVar.f6414h;
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i11 = bVar.f6416k) == i3) {
                return false;
            }
            if (i11 != Integer.MIN_VALUE) {
                bVar.f6416k = Integer.MIN_VALUE;
                bVar.f6415i.invalidate();
                bVar.q(i11, PKIFailureInfo.notAuthorized);
            }
            bVar.f6416k = i3;
            chip.invalidate();
            bVar.q(i3, 32768);
            return true;
        }
        if (i10 == 128) {
            if (bVar.f6416k != i3) {
                return false;
            }
            bVar.f6416k = Integer.MIN_VALUE;
            chip.invalidate();
            bVar.q(i3, PKIFailureInfo.notAuthorized);
            return true;
        }
        C2008b c2008b = (C2008b) bVar;
        if (i10 == 16) {
            Chip chip2 = c2008b.f24044q;
            if (i3 == 0) {
                return chip2.performClick();
            }
            if (i3 == 1) {
                chip2.playSoundEffect(0);
                View.OnClickListener onClickListener = chip2.f11874h;
                if (onClickListener != null) {
                    onClickListener.onClick(chip2);
                    z2 = true;
                }
                chip2.f11882s.q(1, 1);
            }
        }
        return z2;
    }

    @Override // Z9.q
    public final O.e g(int i3) {
        return new O.e(AccessibilityNodeInfo.obtain(this.f6406d.n(i3).f5069a));
    }

    @Override // Z9.q
    public final O.e k(int i3) {
        b bVar = this.f6406d;
        int i10 = i3 == 2 ? bVar.f6416k : bVar.f6417l;
        if (i10 == Integer.MIN_VALUE) {
            return null;
        }
        return g(i10);
    }
}
