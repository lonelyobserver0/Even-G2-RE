package b9;

import android.app.PendingIntent;
import android.content.Context;
import android.widget.RemoteViews;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10724a;

    /* renamed from: b, reason: collision with root package name */
    public RemoteViews f10725b;

    /* renamed from: c, reason: collision with root package name */
    public RemoteViews f10726c;

    public a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f10724a = context;
    }

    public static void b(RemoteViews remoteViews, int i3, int i10) {
        if (remoteViews != null) {
            remoteViews.setViewVisibility(i3, i10);
        }
    }

    public final void a(PendingIntent pendingIntent) {
        Context context = this.f10724a;
        int color = context.getColor(2131034252);
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        RemoteViews remoteViews = new RemoteViews(packageName, 2131427391);
        String string2 = StubApp.getString2(9327);
        remoteViews.setInt(2131230981, string2, color);
        this.f10725b = remoteViews;
        String packageName2 = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName2, "context.packageName");
        Intrinsics.checkNotNullParameter(packageName2, "packageName");
        RemoteViews remoteViews2 = new RemoteViews(packageName2, 2131427392);
        remoteViews2.setInt(2131230982, string2, color);
        remoteViews2.setOnClickPendingIntent(2131230862, pendingIntent);
        this.f10726c = remoteViews2;
    }
}
