package w7;

import com.mapbox.maps.threading.AnimationThreadController;
import kotlin.jvm.functions.Function0;

/* renamed from: w7.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class RunnableC1869a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22142a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f22143b;

    public /* synthetic */ RunnableC1869a(Function0 function0, int i3) {
        this.f22142a = i3;
        this.f22143b = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22142a) {
            case 0:
                AnimationThreadController.postOnAnimatorThread$lambda$3$lambda$2(this.f22143b);
                break;
            default:
                AnimationThreadController.postOnMainThread$lambda$1(this.f22143b);
                break;
        }
    }
}
