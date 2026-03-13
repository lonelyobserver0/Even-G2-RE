package Q9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5779a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B6.a f5780b;

    public /* synthetic */ d(B6.a aVar, int i3) {
        this.f5779a = i3;
        this.f5780b = aVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f5779a) {
            case 0:
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(intent, "intent");
                if (Intrinsics.areEqual(StubApp.getString2(680), intent.getAction())) {
                    this.f5780b.l(StubApp.getString2(5371), new Object[0]);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(intent, "intent");
                this.f5780b.l(StubApp.getString2(5370), Integer.valueOf(intent.getIntExtra(StubApp.getString2(5368), -1)), Integer.valueOf(intent.getIntExtra(StubApp.getString2(5369), -1)));
                break;
        }
    }
}
