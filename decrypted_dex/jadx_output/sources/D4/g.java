package D4;

import android.graphics.Typeface;
import com.google.android.gms.internal.measurement.AbstractC0624h2;
import com.google.android.material.chip.Chip;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class g extends AbstractC0624h2 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1326c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1327d;

    public /* synthetic */ g(Object obj, int i3) {
        this.f1326c = i3;
        this.f1327d = obj;
    }

    private final void E(int i3) {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0624h2
    public final void p(int i3) {
        switch (this.f1326c) {
            case 0:
                i iVar = (i) this.f1327d;
                iVar.f1331d = true;
                h hVar = (h) iVar.f1332e.get();
                if (hVar != null) {
                    z4.d dVar = (z4.d) hVar;
                    dVar.s();
                    dVar.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0624h2
    public final void q(Typeface typeface, boolean z2) {
        switch (this.f1326c) {
            case 0:
                if (!z2) {
                    i iVar = (i) this.f1327d;
                    iVar.f1331d = true;
                    h hVar = (h) iVar.f1332e.get();
                    if (hVar != null) {
                        z4.d dVar = (z4.d) hVar;
                        dVar.s();
                        dVar.invalidateSelf();
                        break;
                    }
                }
                break;
            default:
                Chip chip = (Chip) this.f1327d;
                z4.d dVar2 = chip.f11871e;
                chip.setText(dVar2.f24082U0 ? dVar2.f24059G : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
        }
    }
}
