package l2;

import android.app.Notification;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15867a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15868b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f15869c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f15870d;

    public /* synthetic */ g(int i3, int i10, Object obj, Object obj2) {
        this.f15867a = i10;
        this.f15869c = obj;
        this.f15870d = obj2;
        this.f15868b = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15867a) {
            case 0:
                ((h) this.f15869c).a((Intent) this.f15870d, this.f15868b);
                break;
            case 1:
                ((TextView) this.f15869c).setTypeface((Typeface) this.f15870d, this.f15868b);
                break;
            case 2:
                ((SystemForegroundService) this.f15870d).f10391e.notify(this.f15868b, (Notification) this.f15869c);
                break;
            default:
                ((BottomSheetBehavior) this.f15870d).C((View) this.f15869c, this.f15868b);
                break;
        }
    }

    public g(SystemForegroundService systemForegroundService, int i3, Notification notification) {
        this.f15867a = 2;
        this.f15870d = systemForegroundService;
        this.f15868b = i3;
        this.f15869c = notification;
    }

    public g(BottomSheetBehavior bottomSheetBehavior, View view, int i3) {
        this.f15867a = 3;
        this.f15870d = bottomSheetBehavior;
        this.f15869c = view;
        this.f15868b = i3;
    }
}
