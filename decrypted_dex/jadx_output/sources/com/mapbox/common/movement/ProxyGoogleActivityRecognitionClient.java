package com.mapbox.common.movement;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.location.ActivityRecognition;
import com.mapbox.common.location.FailedTask;
import com.mapbox.common.location.GoogleDeviceLocationProviderKt;
import com.mapbox.common.location.IncompatibleGooglePlayServicesActivityRecognitionVersion;
import com.stub.StubApp;
import i4.C1040d;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import q4.j;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/mapbox/common/movement/ProxyGoogleActivityRecognitionClient;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Li4/d;", "activityTransitionRequest", "Landroid/app/PendingIntent;", "pendingIntent", "Lq4/j;", "Ljava/lang/Void;", "requestActivityTransitionUpdates", "(Li4/d;Landroid/app/PendingIntent;)Lq4/j;", "", "detectionIntervalMillis", "callbackIntent", "requestActivityUpdates", "(JLandroid/app/PendingIntent;)Lq4/j;", "removeActivityTransitionUpdates", "(Landroid/app/PendingIntent;)Lq4/j;", "removeActivityUpdates", "googleActivityRecognitionClient", "Ljava/lang/Object;", "Companion", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class ProxyGoogleActivityRecognitionClient {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy<Boolean> available$delegate = LazyKt.lazy(new Function0<Boolean>() { // from class: com.mapbox.common.movement.ProxyGoogleActivityRecognitionClient$Companion$available$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(GoogleDeviceLocationProviderKt.getGooglePlayServicesHelper().isGooglePlayActivityRecognitionAvailable());
        }
    });
    private static Method removeActivityTransitionUpdates;
    private static Method removeActivityUpdates;
    private static Method requestActivityTransitionUpdates;
    private static Method requestActivityUpdates;
    private final Object googleActivityRecognitionClient;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u000e\u001a\u00020\u000fH\u0000¢\u0006\u0002\b\u0010R\u001b\u0010\u0003\u001a\u00020\u00048@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/mapbox/common/movement/ProxyGoogleActivityRecognitionClient$Companion;", "", "()V", "available", "", "getAvailable$common_release", "()Z", "available$delegate", "Lkotlin/Lazy;", "removeActivityTransitionUpdates", "Ljava/lang/reflect/Method;", "removeActivityUpdates", "requestActivityTransitionUpdates", "requestActivityUpdates", "verifyAndCacheMethods", "", "verifyAndCacheMethods$common_release", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean getAvailable$common_release() {
            return ((Boolean) ProxyGoogleActivityRecognitionClient.available$delegate.getValue()).booleanValue();
        }

        public final void verifyAndCacheMethods$common_release() {
            String string2 = StubApp.getString2(13857);
            String string22 = StubApp.getString2(13858);
            try {
                Companion companion = ProxyGoogleActivityRecognitionClient.INSTANCE;
                Method method = com.google.android.gms.location.ActivityRecognitionClient.class.getMethod(StubApp.getString2("13852"), C1040d.class, PendingIntent.class);
                Intrinsics.checkNotNullExpressionValue(method, string22);
                ProxyGoogleActivityRecognitionClient.requestActivityTransitionUpdates = method;
                Method method2 = com.google.android.gms.location.ActivityRecognitionClient.class.getMethod(StubApp.getString2("13851"), Long.TYPE, PendingIntent.class);
                Intrinsics.checkNotNullExpressionValue(method2, string2);
                ProxyGoogleActivityRecognitionClient.requestActivityUpdates = method2;
                Method method3 = com.google.android.gms.location.ActivityRecognitionClient.class.getMethod(StubApp.getString2("13856"), PendingIntent.class);
                Intrinsics.checkNotNullExpressionValue(method3, string2);
                ProxyGoogleActivityRecognitionClient.removeActivityTransitionUpdates = method3;
                Method method4 = com.google.android.gms.location.ActivityRecognitionClient.class.getMethod(StubApp.getString2("13855"), PendingIntent.class);
                Intrinsics.checkNotNullExpressionValue(method4, string22);
                ProxyGoogleActivityRecognitionClient.removeActivityUpdates = method4;
            } catch (ClassNotFoundException e10) {
                throw new IncompatibleGooglePlayServicesActivityRecognitionVersion(e10);
            } catch (NoSuchMethodException e11) {
                throw new IncompatibleGooglePlayServicesActivityRecognitionVersion(e11);
            } catch (SecurityException e12) {
                throw new IncompatibleGooglePlayServicesActivityRecognitionVersion(e12);
            }
        }

        private Companion() {
        }
    }

    public ProxyGoogleActivityRecognitionClient(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        com.google.android.gms.location.ActivityRecognitionClient client = ActivityRecognition.getClient(context);
        Intrinsics.checkNotNullExpressionValue(client, "getClient(context)");
        this.googleActivityRecognitionClient = client;
    }

    public final j removeActivityTransitionUpdates(PendingIntent pendingIntent) {
        Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
        try {
            Method method = removeActivityTransitionUpdates;
            if (method == null) {
                Intrinsics.throwUninitializedPropertyAccessException("removeActivityTransitionUpdates");
                method = null;
            }
            Object invoke = method.invoke(this.googleActivityRecognitionClient, pendingIntent);
            Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type com.google.android.gms.tasks.Task<java.lang.Void>");
            return (j) invoke;
        } catch (Exception e10) {
            return new FailedTask(e10);
        }
    }

    public final j removeActivityUpdates(PendingIntent pendingIntent) {
        Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
        try {
            Method method = removeActivityUpdates;
            if (method == null) {
                Intrinsics.throwUninitializedPropertyAccessException("removeActivityUpdates");
                method = null;
            }
            Object invoke = method.invoke(this.googleActivityRecognitionClient, pendingIntent);
            Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type com.google.android.gms.tasks.Task<java.lang.Void>");
            return (j) invoke;
        } catch (Exception e10) {
            return new FailedTask(e10);
        }
    }

    public final j requestActivityTransitionUpdates(C1040d activityTransitionRequest, PendingIntent pendingIntent) {
        Intrinsics.checkNotNullParameter(activityTransitionRequest, "activityTransitionRequest");
        Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
        try {
            Method method = requestActivityTransitionUpdates;
            if (method == null) {
                Intrinsics.throwUninitializedPropertyAccessException("requestActivityTransitionUpdates");
                method = null;
            }
            Object invoke = method.invoke(this.googleActivityRecognitionClient, activityTransitionRequest, pendingIntent);
            Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type com.google.android.gms.tasks.Task<java.lang.Void>");
            return (j) invoke;
        } catch (Exception e10) {
            return new FailedTask(e10);
        }
    }

    public final j requestActivityUpdates(long detectionIntervalMillis, PendingIntent callbackIntent) {
        Intrinsics.checkNotNullParameter(callbackIntent, "callbackIntent");
        try {
            Method method = requestActivityUpdates;
            if (method == null) {
                Intrinsics.throwUninitializedPropertyAccessException("requestActivityUpdates");
                method = null;
            }
            Object invoke = method.invoke(this.googleActivityRecognitionClient, Long.valueOf(detectionIntervalMillis), callbackIntent);
            Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type com.google.android.gms.tasks.Task<java.lang.Void>");
            return (j) invoke;
        } catch (Exception e10) {
            return new FailedTask(e10);
        }
    }
}
