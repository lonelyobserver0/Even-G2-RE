package z4;

import android.widget.CompoundButton;
import com.google.android.material.chip.ChipGroup;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class e implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ChipGroup f24104a;

    public e(ChipGroup chipGroup) {
        this.f24104a = chipGroup;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
        ChipGroup chipGroup = this.f24104a;
        if (chipGroup.f11891k) {
            return;
        }
        int id = compoundButton.getId();
        if (!z2) {
            if (chipGroup.j == id) {
                chipGroup.setCheckedId(-1);
            }
        } else {
            int i3 = chipGroup.j;
            if (i3 != -1 && i3 != id && chipGroup.f11888f) {
                chipGroup.b(i3, false);
            }
            chipGroup.setCheckedId(id);
        }
    }
}
