package J1;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class o extends RemoteCallbackList {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f3343a;

    public o(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f3343a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object cookie) {
        h callback = (h) iInterface;
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(cookie, "cookie");
        this.f3343a.f10342b.remove((Integer) cookie);
    }
}
