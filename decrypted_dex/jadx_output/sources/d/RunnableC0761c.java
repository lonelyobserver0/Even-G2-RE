package d;

import i.AbstractActivityC1027h;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: d.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class RunnableC0761c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13050a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC1027h f13051b;

    public /* synthetic */ RunnableC0761c(AbstractActivityC1027h abstractActivityC1027h, int i3) {
        this.f13050a = i3;
        this.f13051b = abstractActivityC1027h;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13050a) {
            case 0:
                this.f13051b.invalidateOptionsMenu();
                return;
            default:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e10) {
                    if (!Intrinsics.areEqual(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e10;
                    }
                    return;
                } catch (NullPointerException e11) {
                    if (!Intrinsics.areEqual(e11.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e11;
                    }
                    return;
                }
        }
    }
}
