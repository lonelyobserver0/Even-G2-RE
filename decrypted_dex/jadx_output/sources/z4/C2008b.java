package z4;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;

/* renamed from: z4.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C2008b extends S.b {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Chip f24044q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2008b(Chip chip, Chip chip2) {
        super(chip2);
        this.f24044q = chip;
    }

    @Override // S.b
    public final void l(ArrayList arrayList) {
        Object obj = null;
        arrayList.add(0);
        Rect rect = Chip.f11868x;
        d dVar = this.f24044q.f11871e;
        if (dVar != null) {
            Object obj2 = dVar.f24077R;
            if (obj2 != null) {
                if (obj2 instanceof G.b) {
                } else {
                    obj = obj2;
                }
            }
            if (obj == null || !dVar.f24074P) {
                return;
            }
            arrayList.add(1);
        }
    }

    @Override // S.b
    public final void o(int i3, O.e eVar) {
        Rect closeIconTouchBoundsInt;
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f5069a;
        if (i3 != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.f11868x);
            return;
        }
        Chip chip = this.f24044q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(2131755183, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        closeIconTouchBoundsInt = chip.getCloseIconTouchBoundsInt();
        accessibilityNodeInfo.setBoundsInParent(closeIconTouchBoundsInt);
        eVar.b(O.d.f5058e);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
    }
}
