package z4;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* renamed from: z4.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C2007a extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Chip f24043a;

    public C2007a(Chip chip) {
        this.f24043a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        d dVar = this.f24043a.f11871e;
        if (dVar != null) {
            dVar.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
