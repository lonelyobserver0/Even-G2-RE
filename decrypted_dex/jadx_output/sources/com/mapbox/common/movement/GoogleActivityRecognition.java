package com.mapbox.common.movement;

import D5.C0051o;
import S3.D;
import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.mapbox.common.MapboxCommonLogger;
import com.mapbox.common.MovementInfo;
import com.mapbox.common.MovementMode;
import com.mapbox.common.MovementModeProvider;
import com.mapbox.common.location.GoogleDeviceLocationProviderKt;
import com.mapbox.common.location.LocationServiceUtils;
import com.mapbox.common.location.a;
import com.mapbox.common.movement.ActivityRecognitionClient;
import com.mapbox.common.movement.GoogleActivityRecognition;
import com.stub.StubApp;
import i4.C1038b;
import i4.C1039c;
import i4.C1040d;
import i4.C1041e;
import i4.C1043g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import q4.j;

@Metadata(d1 = {"\u0000Q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t*\u0001\u0012\b\u0001\u0018\u0000 #2\u00020\u0001:\u0002#$B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016J\b\u0010\u001e\u001a\u00020\u0015H\u0002J\b\u0010\u001f\u001a\u00020\u0015H\u0016J\u0010\u0010 \u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016J\b\u0010!\u001a\u00020\u001cH\u0017J\b\u0010\"\u001a\u00020\u001cH\u0017R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/mapbox/common/movement/GoogleActivityRecognition;", "Lcom/mapbox/common/movement/ActivityRecognitionClient;", "context", "Landroid/content/Context;", "mode", "Lcom/mapbox/common/movement/GoogleActivityRecognition$Mode;", "(Landroid/content/Context;Lcom/mapbox/common/movement/GoogleActivityRecognition$Mode;)V", "activityClient", "Lcom/mapbox/common/movement/ProxyGoogleActivityRecognitionClient;", "activityUpdatesIntentFilter", "Landroid/content/IntentFilter;", "activityUpdatesPendingIntent", "Landroid/app/PendingIntent;", "getActivityUpdatesPendingIntent", "()Landroid/app/PendingIntent;", "activityUpdatesPendingIntent$delegate", "Lkotlin/Lazy;", "broadcast", "com/mapbox/common/movement/GoogleActivityRecognition$broadcast$1", "Lcom/mapbox/common/movement/GoogleActivityRecognition$broadcast$1;", "isSubscribed", "", "observers", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/mapbox/common/movement/ActivityRecognitionClient$Observer;", "activityRecognitionPermissionName", "", "addObserver", "", "observer", "hasActivityRecognitionPermission", "isPlatformActivityRecognitionAvailable", "removeObserver", "start", "stop", "Companion", "Mode", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class GoogleActivityRecognition implements ActivityRecognitionClient {
    private static final long ACTIVITY_DETECTION_INTERVAL_MILLIS = 1000;
    private static final int ACTIVITY_UPDATES_CODE = 1000;
    private static final int TRANSITION_API_CONFIDENCE_SCORE = 85;
    private final ProxyGoogleActivityRecognitionClient activityClient;
    private final IntentFilter activityUpdatesIntentFilter;

    /* renamed from: activityUpdatesPendingIntent$delegate, reason: from kotlin metadata */
    private final Lazy activityUpdatesPendingIntent;
    private final GoogleActivityRecognition$broadcast$1 broadcast;
    private final Context context;
    private boolean isSubscribed;
    private final Mode mode;
    private final CopyOnWriteArrayList<ActivityRecognitionClient.Observer> observers;
    public static final String ACTIVITY_UPDATES_ACTION = StubApp.getString2(13843);
    public static final String GOOGLE_ACTIVITY_RECOGNITION_CLIENT = StubApp.getString2(13848);
    public static final String TAG = StubApp.getString2(13663);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy<List<C1038b>> TRANSITION_API_MONITORING_TYPES$delegate = LazyKt.lazy(new Function0<List<? extends C1038b>>() { // from class: com.mapbox.common.movement.GoogleActivityRecognition$Companion$TRANSITION_API_MONITORING_TYPES$2
        @Override // kotlin.jvm.functions.Function0
        public final List<? extends C1038b> invoke() {
            List listOf = CollectionsKt.listOf((Object[]) new Integer[]{0, 2, 8, 7, 1, 3});
            ArrayList arrayList = new ArrayList(CollectionsKt.f(listOf));
            Iterator it = listOf.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                C1038b.d(0);
                D.j(StubApp.getString2(13838), intValue != -1);
                arrayList.add(new C1038b(intValue, 0));
            }
            return arrayList;
        }
    });
    private static boolean googlePlayActivityRecognitionBundled = LocationServiceUtils.isOnClasspath(StubApp.getString2(13848));

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u0004\u0018\u00010\u0007*\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\b\u001a\u0004\u0018\u00010\u0007*\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u000bJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\u0004\b\u0000\u0010\u0011*\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u001a\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u00138\u0006X\u0087T¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001d\u0010\u0003R!\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R(\u0010%\u001a\u00020\u00178\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b%\u0010&\u0012\u0004\b*\u0010\u0003\u001a\u0004\b'\u0010\u0019\"\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020+8\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\u00138\u0000X\u0080T¢\u0006\u0006\n\u0004\b0\u0010\u001cR\u0014\u00101\u001a\u00020\u00138\u0000X\u0080T¢\u0006\u0006\n\u0004\b1\u0010\u001cR\u0014\u00102\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u0010/¨\u00063"}, d2 = {"Lcom/mapbox/common/movement/GoogleActivityRecognition$Companion;", "", "<init>", "()V", "Li4/e;", "Lcom/mapbox/common/MovementModeProvider;", "provider", "Lcom/mapbox/common/MovementInfo;", "toMovementInfo", "(Li4/e;Lcom/mapbox/common/MovementModeProvider;)Lcom/mapbox/common/MovementInfo;", "Lcom/google/android/gms/location/ActivityRecognitionResult;", "(Lcom/google/android/gms/location/ActivityRecognitionResult;Lcom/mapbox/common/MovementModeProvider;)Lcom/mapbox/common/MovementInfo;", "", "activityType", "Lcom/mapbox/common/MovementMode;", "fromGmsType", "(I)Lcom/mapbox/common/MovementMode;", "T", "Lq4/j;", "", "name", "withLogs", "(Lq4/j;Ljava/lang/String;)Lq4/j;", "", "isAvailable$common_release", "()Z", "isAvailable", "ACTIVITY_UPDATES_ACTION", "Ljava/lang/String;", "getACTIVITY_UPDATES_ACTION$annotations", "", "Li4/b;", "TRANSITION_API_MONITORING_TYPES$delegate", "Lkotlin/Lazy;", "getTRANSITION_API_MONITORING_TYPES", "()Ljava/util/List;", "TRANSITION_API_MONITORING_TYPES", "googlePlayActivityRecognitionBundled", "Z", "getGooglePlayActivityRecognitionBundled$common_release", "setGooglePlayActivityRecognitionBundled$common_release", "(Z)V", "getGooglePlayActivityRecognitionBundled$common_release$annotations", "", "ACTIVITY_DETECTION_INTERVAL_MILLIS", "J", "ACTIVITY_UPDATES_CODE", "I", "GOOGLE_ACTIVITY_RECOGNITION_CLIENT", "TAG", "TRANSITION_API_CONFIDENCE_SCORE", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final MovementMode fromGmsType(int activityType) {
            if (activityType == 0) {
                return MovementMode.IN_VEHICLE;
            }
            if (activityType == 1) {
                return MovementMode.CYCLING;
            }
            if (activityType == 2) {
                return MovementMode.ON_FOOT;
            }
            if (activityType == 3) {
                return MovementMode.STATIONARY;
            }
            if (activityType == 7) {
                return MovementMode.WALKING;
            }
            if (activityType != 8) {
                return null;
            }
            return MovementMode.RUNNING;
        }

        public static /* synthetic */ void getACTIVITY_UPDATES_ACTION$annotations() {
        }

        public static /* synthetic */ void getGooglePlayActivityRecognitionBundled$common_release$annotations() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<C1038b> getTRANSITION_API_MONITORING_TYPES() {
            return (List) GoogleActivityRecognition.TRANSITION_API_MONITORING_TYPES$delegate.getValue();
        }

        private final MovementInfo toMovementInfo(C1041e c1041e, MovementModeProvider movementModeProvider) {
            List<C1039c> list;
            Map map;
            MovementMode fromGmsType;
            if (c1041e == null || (list = c1041e.f14764a) == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (C1039c c1039c : list) {
                Pair pair = (c1039c.f14757b == 0 && (fromGmsType = GoogleActivityRecognition.INSTANCE.fromGmsType(c1039c.f14756a)) != null) ? TuplesKt.to(fromGmsType, Integer.valueOf(GoogleActivityRecognition.TRANSITION_API_CONFIDENCE_SCORE)) : null;
                if (pair != null) {
                    arrayList.add(pair);
                }
            }
            map = MapsKt__MapsKt.toMap(arrayList);
            return new MovementInfo(new HashMap(map), movementModeProvider);
        }

        public static /* synthetic */ MovementInfo toMovementInfo$default(Companion companion, C1041e c1041e, MovementModeProvider movementModeProvider, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                movementModeProvider = MovementModeProvider.SYSTEM;
            }
            return companion.toMovementInfo(c1041e, movementModeProvider);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <T> j withLogs(j jVar, final String str) {
            j addOnFailureListener = jVar.addOnSuccessListener(new a(5, new Function1<T, Unit>() { // from class: com.mapbox.common.movement.GoogleActivityRecognition$Companion$withLogs$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                    invoke2((GoogleActivityRecognition$Companion$withLogs$1<T>) obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(T t3) {
                    MapboxCommonLogger.INSTANCE.logD$common_release(StubApp.getString2(13663), str + StubApp.getString2(13839));
                }
            })).addOnFailureListener(new C0051o(str, 8));
            Intrinsics.checkNotNullExpressionValue(addOnFailureListener, "name: String): Task<T> {…lure: $it\")\n            }");
            return addOnFailureListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void withLogs$lambda$6(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void withLogs$lambda$7(String name, Exception it) {
            Intrinsics.checkNotNullParameter(name, "$name");
            Intrinsics.checkNotNullParameter(it, "it");
            MapboxCommonLogger.INSTANCE.logD$common_release(StubApp.getString2(13663), name + StubApp.getString2(13840) + it);
        }

        public final boolean getGooglePlayActivityRecognitionBundled$common_release() {
            return GoogleActivityRecognition.googlePlayActivityRecognitionBundled;
        }

        public final boolean isAvailable$common_release() {
            return LocationServiceUtils.getGooglePlayServicesBundled() && getGooglePlayActivityRecognitionBundled$common_release() && ProxyGoogleActivityRecognitionClient.INSTANCE.getAvailable$common_release() && GoogleDeviceLocationProviderKt.getGooglePlayServicesHelper().isGooglePlayServicesReady();
        }

        public final void setGooglePlayActivityRecognitionBundled$common_release(boolean z2) {
            GoogleActivityRecognition.googlePlayActivityRecognitionBundled = z2;
        }

        private Companion() {
        }

        public static /* synthetic */ MovementInfo toMovementInfo$default(Companion companion, ActivityRecognitionResult activityRecognitionResult, MovementModeProvider movementModeProvider, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                movementModeProvider = MovementModeProvider.SYSTEM;
            }
            return companion.toMovementInfo(activityRecognitionResult, movementModeProvider);
        }

        private final MovementInfo toMovementInfo(ActivityRecognitionResult activityRecognitionResult, MovementModeProvider movementModeProvider) {
            ArrayList<C1043g> arrayList;
            Map map;
            if (activityRecognitionResult == null || (arrayList = activityRecognitionResult.f11774a) == null) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (C1043g c1043g : arrayList) {
                Companion companion = GoogleActivityRecognition.INSTANCE;
                int i3 = c1043g.f14774a;
                if (i3 > 22 || i3 < 0) {
                    i3 = 4;
                }
                MovementMode fromGmsType = companion.fromGmsType(i3);
                Pair pair = fromGmsType != null ? TuplesKt.to(fromGmsType, Integer.valueOf(c1043g.f14775b)) : null;
                if (pair != null) {
                    arrayList2.add(pair);
                }
            }
            map = MapsKt__MapsKt.toMap(arrayList2);
            return new MovementInfo(new HashMap(map), movementModeProvider);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/mapbox/common/movement/GoogleActivityRecognition$Mode;", "", "(Ljava/lang/String;I)V", "TRANSITION_API", "SAMPLING_API", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum Mode {
        TRANSITION_API,
        SAMPLING_API
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Mode.values().length];
            try {
                iArr[Mode.TRANSITION_API.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Mode.SAMPLING_API.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [com.mapbox.common.movement.GoogleActivityRecognition$broadcast$1] */
    public GoogleActivityRecognition(Context context, Mode mode) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.context = context;
        this.mode = mode;
        this.observers = new CopyOnWriteArrayList<>();
        this.activityClient = new ProxyGoogleActivityRecognitionClient(context);
        this.activityUpdatesIntentFilter = new IntentFilter(StubApp.getString2(13843));
        this.activityUpdatesPendingIntent = LazyKt.lazy(new Function0<PendingIntent>() { // from class: com.mapbox.common.movement.GoogleActivityRecognition$activityUpdatesPendingIntent$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final PendingIntent invoke() {
                Context context2;
                Context context3;
                int i3 = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
                Intent intent = new Intent(StubApp.getString2(13843));
                context2 = GoogleActivityRecognition.this.context;
                intent.setPackage(context2.getPackageName());
                context3 = GoogleActivityRecognition.this.context;
                return PendingIntent.getBroadcast(context3, 1000, intent, i3);
            }
        });
        this.broadcast = new BroadcastReceiver() { // from class: com.mapbox.common.movement.GoogleActivityRecognition$broadcast$1

            @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[GoogleActivityRecognition.Mode.values().length];
                    try {
                        iArr[GoogleActivityRecognition.Mode.TRANSITION_API.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[GoogleActivityRecognition.Mode.SAMPLING_API.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
            @Override // android.content.BroadcastReceiver
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onReceive(android.content.Context r7, android.content.Intent r8) {
                /*
                    Method dump skipped, instructions count: 299
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.mapbox.common.movement.GoogleActivityRecognition$broadcast$1.onReceive(android.content.Context, android.content.Intent):void");
            }
        };
    }

    private final String activityRecognitionPermissionName() {
        return Build.VERSION.SDK_INT >= 29 ? StubApp.getString2(1832) : StubApp.getString2(13849);
    }

    private final PendingIntent getActivityUpdatesPendingIntent() {
        Object value = this.activityUpdatesPendingIntent.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-activityUpdatesPendingIntent>(...)");
        return (PendingIntent) value;
    }

    private final boolean hasActivityRecognitionPermission() {
        return D.a.a(this.context, activityRecognitionPermissionName()) == 0;
    }

    @Override // com.mapbox.common.movement.ActivityRecognitionClient
    public void addObserver(ActivityRecognitionClient.Observer observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.observers.add(observer);
    }

    @Override // com.mapbox.common.movement.ActivityRecognitionClient
    public boolean isPlatformActivityRecognitionAvailable() {
        return hasActivityRecognitionPermission();
    }

    @Override // com.mapbox.common.movement.ActivityRecognitionClient
    public void removeObserver(ActivityRecognitionClient.Observer observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.observers.remove(observer);
    }

    @Override // com.mapbox.common.movement.ActivityRecognitionClient
    @SuppressLint({"MissingPermission"})
    public synchronized void start() {
        String string2 = StubApp.getString2(13850);
        synchronized (this) {
            try {
                if (!this.isSubscribed && hasActivityRecognitionPermission()) {
                    this.isSubscribed = true;
                    D.a.c(this.context, this.broadcast, this.activityUpdatesIntentFilter, 2);
                    int i3 = WhenMappings.$EnumSwitchMapping$0[this.mode.ordinal()];
                    if (i3 == 1) {
                        Companion companion = INSTANCE;
                        companion.withLogs(this.activityClient.requestActivityTransitionUpdates(new C1040d(companion.getTRANSITION_API_MONITORING_TYPES(), null, null, null), getActivityUpdatesPendingIntent()), StubApp.getString2("13852"));
                    } else if (i3 == 2) {
                        INSTANCE.withLogs(this.activityClient.requestActivityUpdates(ACTIVITY_DETECTION_INTERVAL_MILLIS, getActivityUpdatesPendingIntent()), StubApp.getString2("13851"));
                    }
                    return;
                }
                MapboxCommonLogger.INSTANCE.logD$common_release(StubApp.getString2("13663"), string2 + this.isSubscribed + StubApp.getString2("13853") + hasActivityRecognitionPermission());
            } finally {
            }
        }
    }

    @Override // com.mapbox.common.movement.ActivityRecognitionClient
    @SuppressLint({"MissingPermission"})
    public synchronized void stop() {
        String string2 = StubApp.getString2(13854);
        synchronized (this) {
            try {
                if (this.isSubscribed && hasActivityRecognitionPermission()) {
                    this.isSubscribed = false;
                    this.context.unregisterReceiver(this.broadcast);
                    int i3 = WhenMappings.$EnumSwitchMapping$0[this.mode.ordinal()];
                    if (i3 == 1) {
                        INSTANCE.withLogs(this.activityClient.removeActivityTransitionUpdates(getActivityUpdatesPendingIntent()), StubApp.getString2("13856"));
                    } else if (i3 == 2) {
                        INSTANCE.withLogs(this.activityClient.removeActivityUpdates(getActivityUpdatesPendingIntent()), StubApp.getString2("13855"));
                    }
                    return;
                }
                MapboxCommonLogger.INSTANCE.logD$common_release(StubApp.getString2("13663"), string2 + this.isSubscribed + StubApp.getString2("13853") + hasActivityRecognitionPermission());
            } finally {
            }
        }
    }

    public /* synthetic */ GoogleActivityRecognition(Context context, Mode mode, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? Mode.TRANSITION_API : mode);
    }
}
