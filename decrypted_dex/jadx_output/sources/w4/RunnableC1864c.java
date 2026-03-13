package w4;

import N.I;
import S.e;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.WeakHashMap;

/* renamed from: w4.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class RunnableC1864c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final View f22113a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f22114b;

    /* renamed from: c, reason: collision with root package name */
    public int f22115c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f22116d;

    public RunnableC1864c(BottomSheetBehavior bottomSheetBehavior, View view, int i3) {
        this.f22116d = bottomSheetBehavior;
        this.f22113a = view;
        this.f22115c = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BottomSheetBehavior bottomSheetBehavior = this.f22116d;
        e eVar = bottomSheetBehavior.f11851v;
        if (eVar == null || !eVar.f()) {
            bottomSheetBehavior.B(this.f22115c);
        } else {
            WeakHashMap weakHashMap = I.f4732a;
            this.f22113a.postOnAnimation(this);
        }
        this.f22114b = false;
    }
}
