package com.mapbox.navigation.trip.notification.internal;

import C.C0036m;
import D7.d;
import Ec.l;
import F5.c;
import I7.b;
import P7.e;
import P7.f;
import P7.g;
import Sb.i;
import Sb.p;
import Sb.q;
import a0.C0379a;
import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.widget.RemoteViews;
import b9.a;
import c9.C0577a;
import c9.C0578b;
import c9.C0579c;
import c9.C0581e;
import c9.EnumC0580d;
import com.mapbox.api.directions.v5.models.BannerInstructions;
import com.mapbox.api.directions.v5.models.BannerText;
import com.stub.StubApp;
import h8.EnumC1011a;
import h8.InterfaceC1012b;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.math.MathKt;
import s8.C1605a;
import y7.InterfaceC1975a;

@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u0080\u00012\u00020\u0001:\u0005\u0081\u0001olwB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u000f\u0010\u001a\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001a\u0010\u0016J\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"J\u0019\u0010#\u001a\u0004\u0018\u00010 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b#\u0010\"J\u0019\u0010$\u001a\u0004\u0018\u00010 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b$\u0010\"J\u000f\u0010%\u001a\u00020\u0012H\u0002¢\u0006\u0004\b%\u0010\u0016J\u0017\u0010&\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b&\u0010\u0014J\u0017\u0010)\u001a\u00020\u00122\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00122\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b+\u0010*J\u0019\u0010.\u001a\u00020'2\b\u0010-\u001a\u0004\u0018\u00010,H\u0002¢\u0006\u0004\b.\u0010/J\u0019\u00100\u001a\u00020\u00122\b\u0010-\u001a\u0004\u0018\u00010,H\u0002¢\u0006\u0004\b0\u00101J%\u00106\u001a\u0004\u0018\u0001052\b\u00102\u001a\u0004\u0018\u00010,2\b\b\u0002\u00104\u001a\u000203H\u0002¢\u0006\u0004\b6\u00107J\u0019\u00108\u001a\u00020\u00122\b\u00102\u001a\u0004\u0018\u00010,H\u0002¢\u0006\u0004\b8\u00101J\u0017\u0010:\u001a\u00020'2\u0006\u00109\u001a\u000205H\u0002¢\u0006\u0004\b:\u0010;J\u0019\u0010>\u001a\u00020\u00122\b\u0010=\u001a\u0004\u0018\u00010<H\u0002¢\u0006\u0004\b>\u0010?J\u0017\u0010A\u001a\u00020'2\u0006\u0010@\u001a\u00020<H\u0002¢\u0006\u0004\bA\u0010BJ#\u0010D\u001a\u00020\u00122\b\u0010=\u001a\u0004\u0018\u00010<2\b\u0010C\u001a\u0004\u0018\u000105H\u0002¢\u0006\u0004\bD\u0010EJ!\u0010J\u001a\u0004\u0018\u00010I2\u0006\u0010G\u001a\u00020F2\u0006\u0010H\u001a\u00020'H\u0002¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\u0012H\u0002¢\u0006\u0004\bL\u0010\u0016J\u000f\u0010M\u001a\u00020\u0012H\u0002¢\u0006\u0004\bM\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010NR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010OR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010PR\u0014\u0010Q\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR.\u0010T\u001a\u0004\u0018\u0001052\b\u0010S\u001a\u0004\u0018\u0001058\u0006@BX\u0087\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u0012\u0004\bX\u0010\u0016\u001a\u0004\bV\u0010WR(\u0010Y\u001a\u0004\u0018\u0001052\b\u0010S\u001a\u0004\u0018\u0001058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bY\u0010U\u001a\u0004\bZ\u0010WR\u0018\u0010\\\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0018\u0010^\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010`\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010UR\u0018\u0010a\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0018\u0010d\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0018\u0010f\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010UR\u0018\u0010g\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0018\u0010i\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010hR\u0018\u0010j\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010hR\u0014\u0010k\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010UR\u0018\u0010m\u001a\u00060lR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0018\u0010p\u001a\u00060oR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0016\u0010r\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\br\u0010sR\u0016\u0010u\u001a\u00020t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bu\u0010vR\u0016\u0010\u0011\u001a\u00020w8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010xR\u0014\u0010z\u001a\u00020y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u0016\u0010}\u001a\u00020|8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~R\u0014\u0010\u007f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u007f\u0010R¨\u0006\u0082\u0001"}, d2 = {"Lcom/mapbox/navigation/trip/notification/internal/MapboxTripNotification;", "Lh8/b;", "LL7/i;", "navigationOptions", "LI7/b;", "interceptorOwner", "Ly7/a;", "distanceFormatter", "<init>", "(LL7/i;LI7/b;Ly7/a;)V", "Landroid/app/Notification;", "getNotification", "()Landroid/app/Notification;", "", "getNotificationId", "()I", "LP7/g;", "state", "", "updateNotification", "(LP7/g;)V", "onTripSessionStarted", "()V", "onTripSessionStopped", "cleanUp", "registerReceivers", "unregisterReceivers", "LC/m;", "getNotificationBuilder", "()LC/m;", "Landroid/content/Context;", "applicationContext", "Landroid/app/PendingIntent;", "createPendingOpenIntent", "(Landroid/content/Context;)Landroid/app/PendingIntent;", "createPendingCloseIntent", "createPendingDismissalIntent", "createNotificationChannel", "updateNotificationViews", "", "isFreeDriveMode", "setFreeDriveMode", "(Z)V", "updateCurrentManeuverToDefault", "", "distanceRemaining", "isDistanceTextChanged", "(Ljava/lang/Double;)Z", "updateDistanceText", "(Ljava/lang/Double;)V", "durationRemaining", "Ljava/util/Calendar;", "time", "", "generateArrivalTime", "(Ljava/lang/Double;Ljava/util/Calendar;)Ljava/lang/String;", "updateViewsWithArrival", "primaryText", "isInstructionTextChanged", "(Ljava/lang/String;)Z", "Lcom/mapbox/api/directions/v5/models/BannerInstructions;", "bannerInstructions", "updateInstructionText", "(Lcom/mapbox/api/directions/v5/models/BannerInstructions;)V", "bannerInstruction", "isManeuverStateChanged", "(Lcom/mapbox/api/directions/v5/models/BannerInstructions;)Z", "drivingSide", "updateManeuverImage", "(Lcom/mapbox/api/directions/v5/models/BannerInstructions;Ljava/lang/String;)V", "Landroid/graphics/drawable/Drawable;", "drawable", "shouldFlipIcon", "Landroid/graphics/Bitmap;", "getManeuverBitmap", "(Landroid/graphics/drawable/Drawable;Z)Landroid/graphics/Bitmap;", "onEndNavigationBtnClick", "onNotificationDismissed", "LI7/b;", "Ly7/a;", "Landroid/content/Context;", "timeFormatType", "I", "<set-?>", "currentManeuverType", "Ljava/lang/String;", "getCurrentManeuverType", "()Ljava/lang/String;", "getCurrentManeuverType$annotations", "currentManeuverModifier", "getCurrentManeuverModifier", "", "currentRoundaboutAngle", "Ljava/lang/Float;", "currentManeuverImage", "Landroid/graphics/Bitmap;", "currentInstructionText", "currentDistanceText", "Ljava/lang/Double;", "Landroid/text/SpannableString;", "currentFormattedDistance", "Landroid/text/SpannableString;", "currentFormattedTime", "pendingOpenIntent", "Landroid/app/PendingIntent;", "pendingDismissalIntent", "pendingCloseIntent", "etaFormat", "Lc9/c;", "notificationEndReceiver", "Lc9/c;", "Lc9/b;", "notificationDismissedReceiver", "Lc9/b;", "notification", "Landroid/app/Notification;", "Landroid/app/NotificationManager;", "notificationManager", "Landroid/app/NotificationManager;", "Lc9/d;", "Lc9/d;", "LD7/d;", "turnIconHelper", "LD7/d;", "Lb9/a;", "notificationView", "Lb9/a;", "flags", "Companion", "c9/a", "notification_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MapboxTripNotification implements InterfaceC1012b {
    public static final C0577a Companion = new C0577a();
    private static i notificationActionButtonChannel = l.a(1, 0, 6);
    private final Context applicationContext;
    private Double currentDistanceText;
    private SpannableString currentFormattedDistance;
    private String currentFormattedTime;
    private String currentInstructionText;
    private Bitmap currentManeuverImage;
    private String currentManeuverModifier;
    private String currentManeuverType;
    private Float currentRoundaboutAngle;
    private final InterfaceC1975a distanceFormatter;
    private final String etaFormat;
    private final int flags;
    private final b interceptorOwner;
    private Notification notification;
    private final C0578b notificationDismissedReceiver;
    private final C0579c notificationEndReceiver;
    private NotificationManager notificationManager;
    private a notificationView;
    private PendingIntent pendingCloseIntent;
    private PendingIntent pendingDismissalIntent;
    private PendingIntent pendingOpenIntent;
    private EnumC0580d state;
    private final int timeFormatType;
    private final d turnIconHelper;

    public MapboxTripNotification(L7.i navigationOptions, b interceptorOwner, InterfaceC1975a distanceFormatter) {
        Unit unit;
        Intrinsics.checkNotNullParameter(navigationOptions, "navigationOptions");
        Intrinsics.checkNotNullParameter(interceptorOwner, "interceptorOwner");
        Intrinsics.checkNotNullParameter(distanceFormatter, "distanceFormatter");
        this.interceptorOwner = interceptorOwner;
        this.distanceFormatter = distanceFormatter;
        Context context = navigationOptions.f4277a;
        this.applicationContext = context;
        this.timeFormatType = -1;
        String string = context.getString(2131755156);
        Intrinsics.checkNotNullExpressionValue(string, "applicationContext.getSt…string.mapbox_eta_format)");
        this.etaFormat = string;
        this.notificationEndReceiver = new C0579c(this);
        this.notificationDismissedReceiver = new C0578b(this);
        this.state = EnumC0580d.f11047a;
        this.turnIconHelper = new d(new I7.a());
        this.flags = 201326592;
        Object systemService = context.getSystemService(StubApp.getString2(490));
        if (systemService != null) {
            this.notificationManager = (NotificationManager) systemService;
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            throw new IllegalStateException(StubApp.getString2(14731));
        }
        this.pendingOpenIntent = createPendingOpenIntent(context);
        this.pendingCloseIntent = createPendingCloseIntent(context);
        this.pendingDismissalIntent = createPendingDismissalIntent(context);
        a aVar = new a(context);
        this.notificationView = aVar;
        aVar.a(this.pendingCloseIntent);
        createNotificationChannel();
    }

    private final void cleanUp() {
        if (this.state == EnumC0580d.f11048b) {
            this.currentManeuverType = null;
            this.currentManeuverModifier = null;
            this.currentInstructionText = null;
            this.currentDistanceText = null;
            a aVar = this.notificationView;
            RemoteViews remoteViews = aVar.f10725b;
            if (remoteViews != null) {
                remoteViews.setTextViewText(2131230991, "");
                remoteViews.setTextViewText(2131230990, "");
                remoteViews.setTextViewText(2131230992, "");
                remoteViews.setViewVisibility(2131230870, 8);
                remoteViews.setViewVisibility(2131230992, 8);
                remoteViews.setViewVisibility(2131230887, 8);
            }
            RemoteViews remoteViews2 = aVar.f10726c;
            if (remoteViews2 != null) {
                remoteViews2.setTextViewText(2131230991, "");
                remoteViews2.setTextViewText(2131230990, "");
                remoteViews2.setTextViewText(2131230992, "");
                remoteViews2.setTextViewText(2131230862, "");
                remoteViews2.setViewVisibility(2131230870, 8);
                remoteViews2.setViewVisibility(2131230992, 8);
                remoteViews2.setViewVisibility(2131230887, 8);
            }
            unregisterReceivers();
            try {
                notificationActionButtonChannel.d(null);
            } catch (Exception e10) {
                D9.l.c(e10, C0581e.f11051a);
            }
        }
    }

    private final void createNotificationChannel() {
        NotificationChannel notificationChannel = new NotificationChannel(StubApp.getString2(14733), StubApp.getString2(14732), 2);
        NotificationManager notificationManager = this.notificationManager;
        if (notificationManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("notificationManager");
            notificationManager = null;
        }
        notificationManager.createNotificationChannel(notificationChannel);
    }

    private final PendingIntent createPendingCloseIntent(Context applicationContext) {
        Intent intent = new Intent(StubApp.getString2(14734));
        intent.setPackage(applicationContext.getPackageName());
        return PendingIntent.getBroadcast(applicationContext, 0, intent, this.flags);
    }

    private final PendingIntent createPendingDismissalIntent(Context applicationContext) {
        Intent intent = new Intent(StubApp.getString2(14735));
        intent.setPackage(applicationContext.getPackageName());
        return PendingIntent.getBroadcast(applicationContext, 0, intent, this.flags);
    }

    private final PendingIntent createPendingOpenIntent(Context applicationContext) {
        Intent launchIntentForPackage = applicationContext.getPackageManager().getLaunchIntentForPackage(applicationContext.getPackageName());
        if (launchIntentForPackage == null) {
            return null;
        }
        launchIntentForPackage.setPackage(null);
        return PendingIntent.getActivity(applicationContext, 0, launchIntentForPackage, this.flags);
    }

    private final String generateArrivalTime(Double durationRemaining, Calendar time) {
        String format;
        String string2 = StubApp.getString2(14736);
        String string22 = StubApp.getString2(14737);
        String string23 = StubApp.getString2(14738);
        String string24 = StubApp.getString2(699);
        if (durationRemaining == null) {
            return null;
        }
        int i3 = this.timeFormatType;
        double doubleValue = durationRemaining.doubleValue();
        boolean is24HourFormat = DateFormat.is24HourFormat(this.applicationContext);
        Intrinsics.checkNotNullParameter(time, string24);
        time.add(13, (int) doubleValue);
        Intrinsics.checkNotNullParameter(time, string24);
        c chain = new c(new R4.b(is24HourFormat, 1));
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(time, string24);
        if (i3 == 0) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            format = String.format(Locale.getDefault(), string22, Arrays.copyOf(new Object[]{time, time, time}, 3));
            Intrinsics.checkNotNullExpressionValue(format, string23);
        } else {
            Intrinsics.checkNotNullParameter(time, string24);
            if (i3 == 1) {
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                format = String.format(Locale.getDefault(), string2, Arrays.copyOf(new Object[]{time, time}, 2));
                Intrinsics.checkNotNullExpressionValue(format, string23);
            } else {
                R4.b bVar = (R4.b) chain.f2238b;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(time, string24);
                if (bVar.f6177b) {
                    StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                    format = String.format(Locale.getDefault(), string2, Arrays.copyOf(new Object[]{time, time}, 2));
                    Intrinsics.checkNotNullExpressionValue(format, string23);
                } else {
                    StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
                    format = String.format(Locale.getDefault(), string22, Arrays.copyOf(new Object[]{time, time, time}, 3));
                    Intrinsics.checkNotNullExpressionValue(format, string23);
                }
            }
        }
        StringCompanionObject stringCompanionObject5 = StringCompanionObject.INSTANCE;
        String format2 = String.format(this.etaFormat, Arrays.copyOf(new Object[]{format}, 1));
        Intrinsics.checkNotNullExpressionValue(format2, "format(format, *args)");
        return format2;
    }

    public static /* synthetic */ String generateArrivalTime$default(MapboxTripNotification mapboxTripNotification, Double d8, Calendar calendar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            calendar = Calendar.getInstance();
            Intrinsics.checkNotNullExpressionValue(calendar, "getInstance()");
        }
        return mapboxTripNotification.generateArrivalTime(d8, calendar);
    }

    public static /* synthetic */ void getCurrentManeuverType$annotations() {
    }

    private final Bitmap getManeuverBitmap(Drawable drawable, boolean shouldFlipIcon) {
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(\n          …nfig.ARGB_8888,\n        )");
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        canvas.restoreToCount(canvas.getSaveCount());
        if (!shouldFlipIcon) {
            return createBitmap;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Matrix matrix = new Matrix();
        matrix.preScale(-1.0f, 1.0f);
        Unit unit = Unit.INSTANCE;
        return Bitmap.createBitmap(createBitmap, 0, 0, intrinsicWidth, intrinsicHeight, matrix, false);
    }

    private final C0036m getNotificationBuilder() {
        Context context = this.applicationContext;
        Intrinsics.checkNotNullParameter(context, "context");
        String channelId = StubApp.getString2(14733);
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        C0036m c0036m = new C0036m(context, channelId);
        c0036m.f882x = StubApp.getString2(8296);
        c0036m.f869k = 2;
        c0036m.f857I.icon = 2131165386;
        a aVar = this.notificationView;
        c0036m.f850B = aVar.f10725b;
        c0036m.f851C = aVar.f10726c;
        c0036m.d(2, true);
        Intrinsics.checkNotNullExpressionValue(c0036m, "NotificationBuilderProvi…        .setOngoing(true)");
        if (Build.VERSION.SDK_INT >= 31) {
            c0036m.f884z = this.applicationContext.getColor(2131034252);
            c0036m.f880v = true;
            c0036m.f881w = true;
        }
        PendingIntent pendingIntent = this.pendingOpenIntent;
        if (pendingIntent != null) {
            c0036m.f866g = pendingIntent;
        }
        PendingIntent pendingIntent2 = this.pendingDismissalIntent;
        if (pendingIntent2 != null) {
            c0036m.f857I.deleteIntent = pendingIntent2;
        }
        this.interceptorOwner.getClass();
        return c0036m;
    }

    private final boolean isDistanceTextChanged(Double distanceRemaining) {
        return !Intrinsics.areEqual(this.currentDistanceText, distanceRemaining);
    }

    private final boolean isInstructionTextChanged(String primaryText) {
        String str = this.currentInstructionText;
        return str == null || str.length() == 0 || !Intrinsics.areEqual(this.currentInstructionText, primaryText);
    }

    private final boolean isManeuverStateChanged(BannerInstructions bannerInstruction) {
        String str = this.currentManeuverType;
        String str2 = this.currentManeuverModifier;
        Float f10 = this.currentRoundaboutAngle;
        this.currentManeuverType = bannerInstruction.primary().type();
        this.currentManeuverModifier = bannerInstruction.primary().modifier();
        Double degrees = bannerInstruction.primary().degrees();
        this.currentRoundaboutAngle = degrees != null ? Float.valueOf((float) degrees.doubleValue()) : null;
        return (TextUtils.equals(this.currentManeuverType, str) && TextUtils.equals(this.currentManeuverModifier, str2) && Intrinsics.areEqual(this.currentRoundaboutAngle, f10)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onEndNavigationBtnClick() {
        try {
            notificationActionButtonChannel.j(EnumC1011a.f14469a);
        } catch (Exception e10) {
            if (!(e10 instanceof p ? true : e10 instanceof q)) {
                throw e10;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onNotificationDismissed() {
        cleanUp();
        this.state = EnumC0580d.f11049c;
    }

    @SuppressLint({"UnspecifiedRegisterReceiverFlag"})
    private final void registerReceivers() {
        int i3 = Build.VERSION.SDK_INT;
        String string2 = StubApp.getString2(14735);
        String string22 = StubApp.getString2(14734);
        if (i3 >= 34) {
            this.applicationContext.registerReceiver(this.notificationEndReceiver, new IntentFilter(string22), 4);
            this.applicationContext.registerReceiver(this.notificationDismissedReceiver, new IntentFilter(string2), 4);
        } else {
            this.applicationContext.registerReceiver(this.notificationEndReceiver, new IntentFilter(string22));
            this.applicationContext.registerReceiver(this.notificationDismissedReceiver, new IntentFilter(string2));
        }
    }

    private final void setFreeDriveMode(boolean isFreeDriveMode) {
        a aVar = this.notificationView;
        if (isFreeDriveMode) {
            a.b(aVar.f10725b, 2131230870, 8);
            a.b(aVar.f10726c, 2131230870, 8);
            a.b(aVar.f10725b, 2131230992, 8);
            a.b(aVar.f10726c, 2131230992, 8);
            a.b(aVar.f10725b, 2131230887, 0);
            a.b(aVar.f10726c, 2131230887, 0);
            RemoteViews remoteViews = aVar.f10725b;
            if (remoteViews != null) {
                remoteViews.setImageViewResource(2131230941, 2131165386);
            }
            RemoteViews remoteViews2 = aVar.f10726c;
            if (remoteViews2 != null) {
                remoteViews2.setImageViewResource(2131230941, 2131165386);
            }
            RemoteViews remoteViews3 = aVar.f10726c;
            if (remoteViews3 != null) {
                remoteViews3.setTextViewText(2131230862, aVar.f10724a.getString(2131755165));
            }
        } else if (isFreeDriveMode) {
            aVar.getClass();
        } else {
            a.b(aVar.f10725b, 2131230870, 0);
            a.b(aVar.f10726c, 2131230870, 0);
            a.b(aVar.f10725b, 2131230992, 0);
            a.b(aVar.f10726c, 2131230992, 0);
            a.b(aVar.f10725b, 2131230887, 8);
            a.b(aVar.f10726c, 2131230887, 8);
            RemoteViews remoteViews4 = aVar.f10726c;
            if (remoteViews4 != null) {
                remoteViews4.setTextViewText(2131230862, aVar.f10724a.getString(2131755155));
            }
        }
        updateCurrentManeuverToDefault(isFreeDriveMode);
    }

    private final void unregisterReceivers() {
        this.applicationContext.unregisterReceiver(this.notificationEndReceiver);
        this.applicationContext.unregisterReceiver(this.notificationDismissedReceiver);
        NotificationManager notificationManager = this.notificationManager;
        if (notificationManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("notificationManager");
            notificationManager = null;
        }
        notificationManager.cancel(7654);
    }

    private final void updateCurrentManeuverToDefault(boolean isFreeDriveMode) {
        if (isFreeDriveMode) {
            this.currentManeuverType = null;
            this.currentManeuverModifier = null;
            this.currentRoundaboutAngle = null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void updateDistanceText(Double distanceRemaining) {
        String str;
        String str2;
        C1605a b2;
        String distanceSuffix;
        if (isDistanceTextChanged(distanceRemaining) && distanceRemaining != null) {
            this.currentDistanceText = distanceRemaining;
            InterfaceC1975a interfaceC1975a = this.distanceFormatter;
            double doubleValue = distanceRemaining.doubleValue();
            C0379a c0379a = (C0379a) interfaceC1975a;
            c0379a.getClass();
            String str3 = s8.b.f20817a;
            y7.b bVar = (y7.b) c0379a.f9233b;
            y7.c unitType = bVar.f23544c;
            Intrinsics.checkNotNullParameter(unitType, "unitType");
            Context context = bVar.f23542a;
            Intrinsics.checkNotNullParameter(context, "context");
            Locale locale = bVar.f23543b;
            Intrinsics.checkNotNullParameter(locale, "locale");
            int ordinal = unitType.ordinal();
            String string2 = StubApp.getString2(2707);
            String string22 = StubApp.getString2(2706);
            String string23 = StubApp.getString2(2710);
            String string24 = StubApp.getString2(2701);
            String string25 = StubApp.getString2(2709);
            if (ordinal == 0) {
                str = string24;
                str2 = string25;
                HashMap hashMap = H9.a.f2954a;
                double doubleValue2 = ((Double) hashMap.get(str)).doubleValue() * (doubleValue / ((Double) hashMap.get(string2)).doubleValue());
                boolean areEqual = Intrinsics.areEqual(locale.getLanguage(), s8.b.f20817a);
                y7.c cVar = y7.c.f23545b;
                b2 = (areEqual && Intrinsics.areEqual(locale.getCountry(), "GB")) ? (0.0d > doubleValue2 || doubleValue2 > Double.MAX_VALUE) ? s8.b.b(0.0d, 50, string22, cVar) : doubleValue2 < 0.1d ? s8.b.b(((Double) hashMap.get(string22)).doubleValue() * (doubleValue2 / ((Double) hashMap.get(str)).doubleValue()), 50, string22, cVar) : doubleValue2 < 3.0d ? s8.b.a(doubleValue2, 1, StubApp.getString2(2701), cVar, locale) : s8.b.a(doubleValue2, 0, StubApp.getString2(2701), cVar, locale) : (0.0d > doubleValue2 || doubleValue2 > Double.MAX_VALUE) ? s8.b.b(0.0d, 50, string23, cVar) : doubleValue2 < 0.1d ? s8.b.b(((Double) hashMap.get(string23)).doubleValue() * (doubleValue2 / ((Double) hashMap.get(str)).doubleValue()), 50, string23, cVar) : doubleValue2 < 3.0d ? s8.b.a(doubleValue2, 1, StubApp.getString2(2701), cVar, locale) : s8.b.a(doubleValue2, 0, StubApp.getString2(2701), cVar, locale);
            } else {
                if (ordinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                y7.c cVar2 = y7.c.f23546c;
                if (0.0d > doubleValue || doubleValue > Double.MAX_VALUE) {
                    str2 = string25;
                    str = string24;
                    b2 = s8.b.b(0.0d, 50, string2, cVar2);
                } else if (doubleValue < 1000.0d) {
                    b2 = s8.b.b(doubleValue, 50, string2, cVar2);
                    str = string24;
                    str2 = string25;
                } else {
                    HashMap hashMap2 = H9.a.f2954a;
                    double doubleValue3 = (doubleValue / ((Double) hashMap2.get(string2)).doubleValue()) * ((Double) hashMap2.get(string25)).doubleValue();
                    if (doubleValue < 3000.0d) {
                        str = string24;
                        str2 = string25;
                        b2 = s8.b.a(doubleValue3, 1, StubApp.getString2(2709), cVar2, locale);
                    } else {
                        str2 = string25;
                        str = string24;
                        b2 = s8.b.a(doubleValue3, 0, StubApp.getString2(2709), cVar2, locale);
                    }
                }
            }
            Context origApplicationContext = StubApp.getOrigApplicationContext(context.getApplicationContext());
            Intrinsics.checkNotNullExpressionValue(origApplicationContext, "context.applicationContext");
            Configuration configuration = new Configuration(origApplicationContext.getResources().getConfiguration());
            configuration.setLocale(locale);
            Resources resources = origApplicationContext.createConfigurationContext(configuration).getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "this.createConfigurationContext(config).resources");
            String str4 = b2.f20815c;
            switch (str4.hashCode()) {
                case -1077557750:
                    if (str4.equals(string2)) {
                        distanceSuffix = resources.getString(2131755173);
                        break;
                    }
                    distanceSuffix = "";
                    break;
                case 3138990:
                    if (str4.equals(string23)) {
                        distanceSuffix = resources.getString(2131755170);
                        break;
                    }
                    distanceSuffix = "";
                    break;
                case 103898878:
                    if (str4.equals(str)) {
                        distanceSuffix = resources.getString(2131755174);
                        break;
                    }
                    distanceSuffix = "";
                    break;
                case 114748537:
                    if (str4.equals(string22)) {
                        distanceSuffix = resources.getString(2131755176);
                        break;
                    }
                    distanceSuffix = "";
                    break;
                case 1834759339:
                    if (str4.equals(str2)) {
                        distanceSuffix = resources.getString(2131755172);
                        break;
                    }
                    distanceSuffix = "";
                    break;
                default:
                    distanceSuffix = "";
                    break;
            }
            Intrinsics.checkNotNullExpressionValue(distanceSuffix, "when (unit) {\n          …     else -> \"\"\n        }");
            String string26 = StubApp.getString2(14739);
            String str5 = b2.f20814b;
            Intrinsics.checkNotNullParameter(str5, string26);
            Intrinsics.checkNotNullParameter(distanceSuffix, "distanceSuffix");
            Intrinsics.checkNotNullParameter(b2.f20816d, "unitType");
            Pair distanceAndSuffix = new Pair(str5, distanceSuffix);
            Intrinsics.checkNotNullParameter(distanceAndSuffix, "distanceAndSuffix");
            SpannableString spannableString = new SpannableString(((String) distanceAndSuffix.getFirst()) + ' ' + ((String) distanceAndSuffix.getSecond()));
            spannableString.setSpan(new StyleSpan(1), 0, ((String) distanceAndSuffix.getFirst()).length(), 33);
            spannableString.setSpan(new RelativeSizeSpan(0.75f), ((String) distanceAndSuffix.getFirst()).length() + 1, spannableString.length(), 33);
            this.currentFormattedDistance = spannableString;
        }
        SpannableString spannableString2 = this.currentFormattedDistance;
        if (spannableString2 != null) {
            a aVar = this.notificationView;
            RemoteViews remoteViews = aVar.f10725b;
            if (remoteViews != null) {
                remoteViews.setTextViewText(2131230991, String.valueOf(spannableString2));
            }
            RemoteViews remoteViews2 = aVar.f10726c;
            if (remoteViews2 != null) {
                remoteViews2.setTextViewText(2131230991, String.valueOf(spannableString2));
            }
        }
    }

    private final void updateInstructionText(BannerInstructions bannerInstructions) {
        BannerText primary;
        String text;
        if (bannerInstructions != null && (primary = bannerInstructions.primary()) != null && (text = primary.text()) != null) {
            if (!isInstructionTextChanged(text)) {
                text = null;
            }
            if (text != null) {
                this.currentInstructionText = text;
            }
        }
        String primaryText = this.currentInstructionText;
        if (primaryText != null) {
            a aVar = this.notificationView;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(primaryText, "primaryText");
            RemoteViews remoteViews = aVar.f10725b;
            if (remoteViews != null) {
                remoteViews.setTextViewText(2131230992, primaryText);
            }
            RemoteViews remoteViews2 = aVar.f10726c;
            if (remoteViews2 != null) {
                remoteViews2.setTextViewText(2131230992, primaryText);
            }
        }
    }

    private final void updateManeuverImage(BannerInstructions bannerInstructions, String drivingSide) {
        D7.c cVar;
        Bitmap maneuverBitmap;
        String str;
        if (bannerInstructions != null && isManeuverStateChanged(bannerInstructions)) {
            d dVar = this.turnIconHelper;
            String str2 = this.currentManeuverType;
            Float f10 = this.currentRoundaboutAngle;
            String str3 = this.currentManeuverModifier;
            String string2 = StubApp.getString2(1539);
            if (drivingSide == null) {
                drivingSide = string2;
            }
            Map map = dVar.f1498b;
            String string22 = StubApp.getString2(1538);
            D7.a aVar = null;
            if (str2 == null || str2.length() == 0 || !(Intrinsics.areEqual(str2, "roundabout") || Intrinsics.areEqual(str2, "roundabout turn") || Intrinsics.areEqual(str2, "exit roundabout") || Intrinsics.areEqual(str2, "rotary") || Intrinsics.areEqual(str2, "exit rotary"))) {
                D7.c cVar2 = (D7.c) map.get(new D7.b(str2, str3));
                cVar = cVar2 == null ? dVar.f1497a : cVar2;
            } else {
                if (f10 != null) {
                    float roundToInt = MathKt.roundToInt(f10.floatValue() / 45.0f) * 45.0f;
                    if (roundToInt == 0.0f || roundToInt == 45.0f) {
                        str = StubApp.getString2(1545);
                    } else if (roundToInt == 90.0f) {
                        str = string2;
                    } else if (roundToInt == 135.0f) {
                        str = StubApp.getString2(1543);
                    } else if (roundToInt == 180.0f) {
                        str = StubApp.getString2(1540);
                    } else if (roundToInt == 225.0f) {
                        str = StubApp.getString2(1542);
                    } else if (roundToInt == 270.0f) {
                        str = string22;
                    } else if (roundToInt == 315.0f || roundToInt == 360.0f) {
                        str = StubApp.getString2(1544);
                    }
                    cVar = (D7.c) map.get(new D7.b(str2, str));
                }
                str = null;
                cVar = (D7.c) map.get(new D7.b(str2, str));
            }
            if (cVar != null) {
                boolean z2 = false;
                if (cVar.f1496b) {
                    if (drivingSide.length() != 0 && Intrinsics.areEqual(drivingSide, string22)) {
                        z2 = true;
                    } else if (drivingSide.length() != 0) {
                        Intrinsics.areEqual(drivingSide, string2);
                    }
                }
                aVar = new D7.a(f10, drivingSide, z2, Integer.valueOf(cVar.f1495a));
            }
            if (aVar != null) {
                Drawable drawable = this.notificationView.f10724a.getDrawable(aVar.f1492d.intValue());
                if (drawable != null && (maneuverBitmap = getManeuverBitmap(drawable, aVar.f1491c)) != null) {
                    this.currentManeuverImage = maneuverBitmap;
                }
            }
        }
        Bitmap bitmap = this.currentManeuverImage;
        if (bitmap != null) {
            a aVar2 = this.notificationView;
            aVar2.getClass();
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            RemoteViews remoteViews = aVar2.f10725b;
            if (remoteViews != null) {
                remoteViews.setImageViewBitmap(2131230941, bitmap);
            }
            RemoteViews remoteViews2 = aVar2.f10726c;
            if (remoteViews2 != null) {
                remoteViews2.setImageViewBitmap(2131230941, bitmap);
            }
        }
    }

    private final void updateNotificationViews(g state) {
        a aVar = this.notificationView;
        a.b(aVar.f10725b, 2131230983, 8);
        a.b(aVar.f10726c, 2131230983, 8);
        if (state instanceof f) {
            setFreeDriveMode(true);
            return;
        }
        if (state instanceof e) {
            e eVar = (e) state;
            updateDistanceText(eVar.f5595b);
            updateViewsWithArrival(eVar.f5596c);
            BannerInstructions bannerInstructions = eVar.f5594a;
            updateInstructionText(bannerInstructions);
            updateManeuverImage(bannerInstructions, eVar.f5597d);
            setFreeDriveMode(false);
        }
    }

    private final void updateViewsWithArrival(Double durationRemaining) {
        String generateArrivalTime$default = generateArrivalTime$default(this, durationRemaining, null, 2, null);
        if (generateArrivalTime$default != null) {
            this.currentFormattedTime = generateArrivalTime$default;
        }
        String time = this.currentFormattedTime;
        if (time != null) {
            a aVar = this.notificationView;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(time, "time");
            RemoteViews remoteViews = aVar.f10725b;
            if (remoteViews != null) {
                remoteViews.setTextViewText(2131230990, time);
            }
            RemoteViews remoteViews2 = aVar.f10726c;
            if (remoteViews2 != null) {
                remoteViews2.setTextViewText(2131230990, time);
            }
        }
    }

    public final String getCurrentManeuverModifier() {
        return this.currentManeuverModifier;
    }

    public final String getCurrentManeuverType() {
        return this.currentManeuverType;
    }

    @Override // h8.InterfaceC1012b
    public Notification getNotification() {
        if (this.notification == null) {
            Notification b2 = getNotificationBuilder().b();
            Intrinsics.checkNotNullExpressionValue(b2, "getNotificationBuilder().build()");
            this.notification = b2;
        }
        Notification notification = this.notification;
        if (notification != null) {
            return notification;
        }
        Intrinsics.throwUninitializedPropertyAccessException("notification");
        return null;
    }

    @Override // h8.InterfaceC1012b
    public int getNotificationId() {
        return 7654;
    }

    public void onTripSessionStarted() {
        registerReceivers();
        notificationActionButtonChannel = l.a(1, 0, 6);
        a aVar = this.notificationView;
        a.b(aVar.f10725b, 2131230983, 0);
        a.b(aVar.f10726c, 2131230983, 0);
        a aVar2 = this.notificationView;
        RemoteViews remoteViews = aVar2.f10726c;
        if (remoteViews != null) {
            remoteViews.setTextViewText(2131230862, aVar2.f10724a.getString(2131755165));
        }
        this.state = EnumC0580d.f11048b;
    }

    @Override // h8.InterfaceC1012b
    public void onTripSessionStopped() {
        cleanUp();
        this.state = EnumC0580d.f11047a;
    }

    @Override // h8.InterfaceC1012b
    public void updateNotification(g state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (this.state == EnumC0580d.f11048b) {
            this.notificationView.a(this.pendingCloseIntent);
            updateNotificationViews(state);
            Notification b2 = getNotificationBuilder().b();
            Intrinsics.checkNotNullExpressionValue(b2, "getNotificationBuilder().build()");
            this.notification = b2;
            NotificationManager notificationManager = this.notificationManager;
            Notification notification = null;
            if (notificationManager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("notificationManager");
                notificationManager = null;
            }
            Notification notification2 = this.notification;
            if (notification2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("notification");
            } else {
                notification = notification2;
            }
            notificationManager.notify(7654, notification);
        }
    }
}
