package com.mapbox.common.module;

import R0.t;
import R4.i;
import android.content.Context;
import android.content.res.Resources;
import c5.B;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.GetLifecycleStateCallback;
import com.mapbox.common.HttpRequestError;
import com.mapbox.common.HttpRequestErrorType;
import com.mapbox.common.LifecycleMonitorFactory;
import com.mapbox.common.LifecycleMonitorInterface;
import com.mapbox.common.LifecycleMonitoringState;
import com.mapbox.common.LifecycleObserver;
import com.mapbox.common.LifecycleState;
import com.mapbox.common.MapboxSDKCommon;
import com.mapbox.common.NetworkRestriction;
import com.mapbox.common.NetworkStatus;
import com.mapbox.common.OfflineSwitch;
import com.mapbox.common.OfflineSwitchObserver;
import com.mapbox.common.ReachabilityChanged;
import com.mapbox.common.ReachabilityFactory;
import com.mapbox.common.ReachabilityInterface;
import com.mapbox.common.ResultCallback;
import com.mapbox.common.http_backend.Request;
import com.mapbox.common.http_backend.RequestObserver;
import com.mapbox.common.http_backend.Service;
import com.mapbox.common.module.RequestDetail;
import com.stub.StubApp;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001>B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020\"H\u0002J\u0018\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020*H\u0016J\u0012\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020.H\u0002J\b\u0010/\u001a\u00020'H\u0007J\b\u00100\u001a\u00020'H\u0007J\b\u00101\u001a\u00020'H\u0007J\b\u00102\u001a\u00020'H\u0007J\b\u00103\u001a\u000204H\u0007J\u0010\u00105\u001a\u00020\"2\u0006\u0010-\u001a\u00020.H\u0002J\b\u00106\u001a\u00020'H\u0002J\u0012\u00107\u001a\u0004\u0018\u00010\r2\u0006\u0010(\u001a\u00020\u000bH\u0002J\u0018\u0010-\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020.2\u0006\u00108\u001a\u000209H\u0016J\u0010\u0010:\u001a\u00020'2\u0006\u0010;\u001a\u00020<H\u0016J\b\u0010=\u001a\u00020\"H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u0012\u0012\b\u0012\u00060\u000bj\u0002`\f\u0012\u0004\u0012\u00020\r0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u001c\u001a\u0012\u0012\b\u0012\u00060\u000bj\u0002`\f\u0012\u0004\u0012\u00020\r0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006?"}, d2 = {"Lcom/mapbox/common/module/MapboxHttpClient;", "Lcom/mapbox/common/http_backend/Service;", "detail", "Lcom/mapbox/common/module/HttpClientDetail;", "(Lcom/mapbox/common/module/HttpClientDetail;)V", "allowBackgroundRequests", "Ljava/util/concurrent/atomic/AtomicBoolean;", "context", "Landroid/content/Context;", "foregroundRequests", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/mapbox/common/module/RequestId;", "Lcom/mapbox/common/module/RequestDetail;", "getLifeCycleStateCallback", "Lcom/mapbox/common/GetLifecycleStateCallback;", "lifecycleMonitor", "Lcom/mapbox/common/LifecycleMonitorInterface;", "lifecycleObserver", "Lcom/mapbox/common/LifecycleObserver;", "lifecycleState", "Lcom/mapbox/common/LifecycleState;", "networkStatus", "Lcom/mapbox/common/NetworkStatus;", "offline", "offlineObserver", "Lcom/mapbox/common/OfflineSwitchObserver;", "pauseRequestsOnDemand", "pendingCalls", "reachability", "Lcom/mapbox/common/ReachabilityInterface;", "reachabilityChanged", "Lcom/mapbox/common/ReachabilityChanged;", "allowAlways", "", "url", "", "canSendForegroundRequest", "cancelRequest", "", "id", "callback", "Lcom/mapbox/common/ResultCallback;", "checkRequestRestrictions", "Lcom/mapbox/common/HttpRequestError;", "request", "Lcom/mapbox/common/http_backend/Request;", "disableBackgroundRequests", "disablePauseRequestsOnDemand", "enableBackgroundRequests", "enablePauseRequestsOnDemand", "getForegroundQueueSize", "", "needToPauseRequest", "processForegroundQueue", "removeCall", "observer", "Lcom/mapbox/common/http_backend/RequestObserver;", "setMaxRequestsPerHost", "max", "", "supportsKeepCompression", "HttpServiceLifecycleObserver", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MapboxHttpClient implements Service {
    private final AtomicBoolean allowBackgroundRequests;
    private final Context context;
    private final HttpClientDetail detail;
    private final ConcurrentHashMap<Long, RequestDetail> foregroundRequests;
    private final GetLifecycleStateCallback getLifeCycleStateCallback;
    private LifecycleMonitorInterface lifecycleMonitor;
    private LifecycleObserver lifecycleObserver;
    private LifecycleState lifecycleState;
    private NetworkStatus networkStatus;
    private final AtomicBoolean offline;
    private final OfflineSwitchObserver offlineObserver;
    private final AtomicBoolean pauseRequestsOnDemand;
    private final ConcurrentHashMap<Long, RequestDetail> pendingCalls;
    private final ReachabilityInterface reachability;
    private final ReachabilityChanged reachabilityChanged;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/mapbox/common/module/MapboxHttpClient$HttpServiceLifecycleObserver;", "Lcom/mapbox/common/LifecycleObserver;", "(Lcom/mapbox/common/module/MapboxHttpClient;)V", "onLifecycleStateChanged", "", "state", "Lcom/mapbox/common/LifecycleState;", "onMonitoringStateChanged", "Lcom/mapbox/common/LifecycleMonitoringState;", "error", "", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public final class HttpServiceLifecycleObserver implements LifecycleObserver {
        public HttpServiceLifecycleObserver() {
        }

        @Override // com.mapbox.common.LifecycleObserver
        public void onLifecycleStateChanged(LifecycleState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            boolean z2 = MapboxHttpClient.this.lifecycleState == LifecycleState.FOREGROUND || MapboxHttpClient.this.lifecycleState == LifecycleState.MOVING_FOREGROUND;
            MapboxHttpClient.this.lifecycleState = state;
            if (MapboxHttpClient.this.foregroundRequests.isEmpty() || z2 || !MapboxHttpClient.this.canSendForegroundRequest()) {
                return;
            }
            MapboxHttpClient.this.processForegroundQueue();
        }

        @Override // com.mapbox.common.LifecycleObserver
        public void onMonitoringStateChanged(LifecycleMonitoringState state, String error) {
            Intrinsics.checkNotNullParameter(state, "state");
            if (error != null || state == LifecycleMonitoringState.STOPPED) {
                MapboxHttpClient.this.lifecycleState = LifecycleState.UNKNOWN;
            }
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NetworkRestriction.values().length];
            try {
                iArr[NetworkRestriction.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NetworkRestriction.DISALLOW_EXPENSIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NetworkRestriction.DISALLOW_ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MapboxHttpClient(HttpClientDetail detail) {
        Intrinsics.checkNotNullParameter(detail, "detail");
        this.detail = detail;
        Context context = MapboxSDKCommon.INSTANCE.getContext();
        this.context = context;
        ReachabilityInterface reachability = ReachabilityFactory.reachability("");
        Intrinsics.checkNotNullExpressionValue(reachability, "reachability(\"\")");
        this.reachability = reachability;
        NetworkStatus currentNetworkStatus = reachability.currentNetworkStatus();
        Intrinsics.checkNotNullExpressionValue(currentNetworkStatus, "reachability.currentNetworkStatus()");
        this.networkStatus = currentNetworkStatus;
        this.offline = new AtomicBoolean(false);
        B b2 = new B(this, 5);
        this.offlineObserver = b2;
        ReachabilityChanged reachabilityChanged = new ReachabilityChanged() { // from class: com.mapbox.common.module.a
            @Override // com.mapbox.common.ReachabilityChanged
            public final void run(NetworkStatus networkStatus) {
                MapboxHttpClient.reachabilityChanged$lambda$2(MapboxHttpClient.this, networkStatus);
            }
        };
        this.reachabilityChanged = reachabilityChanged;
        this.foregroundRequests = new ConcurrentHashMap<>();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        this.allowBackgroundRequests = atomicBoolean;
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
        this.pauseRequestsOnDemand = atomicBoolean2;
        this.lifecycleState = LifecycleState.UNKNOWN;
        this.pendingCalls = new ConcurrentHashMap<>();
        OfflineSwitch.getInstance().registerObserver(b2);
        reachability.addListener(reachabilityChanged);
        String packageName = context.getPackageName();
        Resources resources = context.getResources();
        if (resources != null) {
            String string2 = StubApp.getString2(13742);
            String string22 = StubApp.getString2(1002);
            int identifier = resources.getIdentifier(string2, string22, packageName);
            if (identifier != 0) {
                atomicBoolean.set(resources.getBoolean(identifier));
            }
            int identifier2 = resources.getIdentifier(StubApp.getString2(13743), string22, packageName);
            if (identifier2 != 0) {
                atomicBoolean2.set(resources.getBoolean(identifier2));
            }
        }
        if (!atomicBoolean.get() || atomicBoolean2.get()) {
            disableBackgroundRequests();
        }
        this.getLifeCycleStateCallback = new b(this, 0);
    }

    private final boolean allowAlways(String url) {
        List list;
        list = MapboxHttpClientKt.ALLOW_FROM_BACKGROUND_LIST;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (StringsKt.O(url, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean canSendForegroundRequest() {
        LifecycleState lifecycleState = this.lifecycleState;
        return lifecycleState == LifecycleState.FOREGROUND || lifecycleState == LifecycleState.MOVING_FOREGROUND || lifecycleState == LifecycleState.UNKNOWN;
    }

    private final HttpRequestError checkRequestRestrictions(Request request) {
        if (this.offline.get()) {
            return new HttpRequestError(HttpRequestErrorType.CONNECTION_ERROR, StubApp.getString2(13744));
        }
        int i3 = WhenMappings.$EnumSwitchMapping$0[request.getNetworkRestriction().ordinal()];
        if (i3 != 2) {
            if (i3 != 3) {
                return null;
            }
            return new HttpRequestError(HttpRequestErrorType.CONNECTION_ERROR, StubApp.getString2(13745));
        }
        if (this.networkStatus == NetworkStatus.REACHABLE_VIA_WWAN) {
            return new HttpRequestError(HttpRequestErrorType.CONNECTION_ERROR, StubApp.getString2(13746));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getLifeCycleStateCallback$lambda$4(MapboxHttpClient this$0, Expected it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Object valueOrElse = it.getValueOrElse(new i(29));
        Intrinsics.checkNotNullExpressionValue(valueOrElse, "it.getValueOrElse { LifecycleState.UNKNOWN }");
        this$0.lifecycleState = (LifecycleState) valueOrElse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecycleState getLifeCycleStateCallback$lambda$4$lambda$3(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return LifecycleState.UNKNOWN;
    }

    private final boolean needToPauseRequest(Request request) {
        if (canSendForegroundRequest()) {
            return false;
        }
        boolean z2 = (request.getFlags() & 2) != 0;
        if (this.pauseRequestsOnDemand.get() && z2) {
            return true;
        }
        if (this.allowBackgroundRequests.get()) {
            return false;
        }
        Intrinsics.checkNotNullExpressionValue(request.getUrl(), "request.url");
        return !allowAlways(r5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void offlineObserver$lambda$1(MapboxHttpClient this$0, boolean z2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.offline.set(!z2);
        if (z2) {
            return;
        }
        Iterator<Map.Entry<Long, RequestDetail>> it = this$0.pendingCalls.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().cancel(new HttpRequestError(HttpRequestErrorType.CONNECTION_ERROR, StubApp.getString2(13747)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processForegroundQueue() {
        while (!this.foregroundRequests.isEmpty() && canSendForegroundRequest()) {
            Map.Entry<Long, RequestDetail> next = this.foregroundRequests.entrySet().iterator().next();
            Intrinsics.checkNotNullExpressionValue(next, "next()");
            Long key = next.getKey();
            next.getValue().start();
            this.foregroundRequests.remove(key);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reachabilityChanged$lambda$2(MapboxHttpClient this$0, NetworkStatus status) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(status, "status");
        this$0.networkStatus = status;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RequestDetail removeCall(long id) {
        this.foregroundRequests.remove(Long.valueOf(id));
        return this.pendingCalls.remove(Long.valueOf(id));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void request$lambda$5(RequestObserver observer, long j, HttpRequestError httpRequestError) {
        Intrinsics.checkNotNullParameter(observer, "$observer");
        observer.onFailed(j, httpRequestError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void request$lambda$6(RequestObserver observer, long j, Exception exception) {
        Intrinsics.checkNotNullParameter(observer, "$observer");
        Intrinsics.checkNotNullParameter(exception, "$exception");
        observer.onFailed(j, new HttpRequestError(HttpRequestErrorType.OTHER_ERROR, String.valueOf(exception.getMessage())));
    }

    @Override // com.mapbox.common.http_backend.Service
    public void cancelRequest(long id, ResultCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        RequestDetail removeCall = removeCall(id);
        if (removeCall == null) {
            callback.run(false);
        } else {
            RequestDetail.DefaultImpls.cancel$default(removeCall, null, 1, null);
            callback.run(true);
        }
    }

    public final void disableBackgroundRequests() {
        this.allowBackgroundRequests.set(false);
        if (this.lifecycleMonitor == null || this.lifecycleObserver == null) {
            this.lifecycleMonitor = LifecycleMonitorFactory.getOrCreate();
            this.lifecycleObserver = new HttpServiceLifecycleObserver();
            LifecycleMonitorInterface lifecycleMonitorInterface = this.lifecycleMonitor;
            Intrinsics.checkNotNull(lifecycleMonitorInterface);
            LifecycleObserver lifecycleObserver = this.lifecycleObserver;
            Intrinsics.checkNotNull(lifecycleObserver);
            lifecycleMonitorInterface.registerObserver(lifecycleObserver);
            LifecycleMonitorInterface lifecycleMonitorInterface2 = this.lifecycleMonitor;
            Intrinsics.checkNotNull(lifecycleMonitorInterface2);
            lifecycleMonitorInterface2.getLifecycleState(this.getLifeCycleStateCallback);
        }
    }

    public final void disablePauseRequestsOnDemand() {
        this.pauseRequestsOnDemand.set(false);
    }

    public final void enableBackgroundRequests() {
        this.allowBackgroundRequests.set(true);
    }

    public final void enablePauseRequestsOnDemand() {
        this.pauseRequestsOnDemand.set(true);
        if (this.lifecycleMonitor == null || this.lifecycleObserver == null) {
            this.lifecycleMonitor = LifecycleMonitorFactory.getOrCreate();
            this.lifecycleObserver = new HttpServiceLifecycleObserver();
            LifecycleMonitorInterface lifecycleMonitorInterface = this.lifecycleMonitor;
            Intrinsics.checkNotNull(lifecycleMonitorInterface);
            LifecycleObserver lifecycleObserver = this.lifecycleObserver;
            Intrinsics.checkNotNull(lifecycleObserver);
            lifecycleMonitorInterface.registerObserver(lifecycleObserver);
            LifecycleMonitorInterface lifecycleMonitorInterface2 = this.lifecycleMonitor;
            Intrinsics.checkNotNull(lifecycleMonitorInterface2);
            lifecycleMonitorInterface2.getLifecycleState(this.getLifeCycleStateCallback);
        }
    }

    public final int getForegroundQueueSize() {
        return this.foregroundRequests.size();
    }

    @Override // com.mapbox.common.http_backend.Service
    public long request(Request request, RequestObserver observer) {
        RequestObserver requestObserver;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(observer, "observer");
        long newId = NetworkIdGenerator.INSTANCE.newId();
        HttpRequestError checkRequestRestrictions = checkRequestRestrictions(request);
        if (checkRequestRestrictions != null) {
            this.detail.executor().execute(new t(observer, newId, checkRequestRestrictions, 1));
            return newId;
        }
        try {
            requestObserver = observer;
            try {
                RequestDetail buildRequest = this.detail.buildRequest(request, newId, requestObserver, new Function1<Long, Unit>() { // from class: com.mapbox.common.module.MapboxHttpClient$request$requestWrapper$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Long l9) {
                        invoke(l9.longValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(long j) {
                        MapboxHttpClient.this.removeCall(j);
                    }
                });
                this.pendingCalls.put(Long.valueOf(newId), buildRequest);
                if (!needToPauseRequest(request)) {
                    buildRequest.start();
                    return newId;
                }
                this.foregroundRequests.put(Long.valueOf(newId), buildRequest);
                return newId;
            } catch (Exception e10) {
                e = e10;
                this.detail.executor().execute(new t(requestObserver, newId, e, 2));
                return newId;
            }
        } catch (Exception e11) {
            e = e11;
            requestObserver = observer;
        }
    }

    @Override // com.mapbox.common.http_backend.Service
    public void setMaxRequestsPerHost(byte max) {
        this.detail.setMaxRequestsPerHost(max);
    }

    @Override // com.mapbox.common.http_backend.Service
    public boolean supportsKeepCompression() {
        return this.detail.supportsKeepCompression();
    }
}
