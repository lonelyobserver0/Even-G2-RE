package K2;

import B0.o;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3631a;

    /* renamed from: b, reason: collision with root package name */
    public final J2.b f3632b;

    /* renamed from: c, reason: collision with root package name */
    public o f3633c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f3634d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, J2.b onCalendarChanged) {
        super(new Handler(Looper.getMainLooper()));
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onCalendarChanged, "onCalendarChanged");
        this.f3631a = context;
        this.f3632b = onCalendarChanged;
        this.f3634d = new Handler(Looper.getMainLooper());
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z2, Uri uri) {
        super.onChange(z2, uri);
        Log.d(StubApp.getString2(2982), StubApp.getString2(3240) + uri);
        o oVar = this.f3633c;
        Handler handler = this.f3634d;
        if (oVar != null) {
            handler.removeCallbacks(oVar);
        }
        o oVar2 = new o(this, 7);
        this.f3633c = oVar2;
        handler.postDelayed(oVar2, 2000L);
    }
}
