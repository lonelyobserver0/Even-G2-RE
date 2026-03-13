package com.mapbox.common;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Handler;
import android.os.Looper;
import com.stub.StubApp;
import java.io.IOException;
import java.net.InetAddress;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.bouncycastle.asn1.x509.DisplayText;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class Reachability implements ReachabilityInterface {
    public final String TAG;
    private ConnectionChangeCallback callback;
    private final ConnectivityManager connectivityManager;
    private final Context context;
    private NetworkStatus currentStatus;
    private final String hostname;
    private final Map<Long, ReachabilityChanged> listeners;
    private boolean networkConnected;
    private final ReachabilityOfflineSwitchObserver offlineObserver;
    public int peer;
    private boolean publish;
    public int timeoutInMs;

    /* renamed from: com.mapbox.common.Reachability$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public class ReachabilityOfflineSwitchObserver implements OfflineSwitchObserver {
        private ReachabilityOfflineSwitchObserver() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$statusChanged$0(boolean z2) {
            Reachability.this.setNetworkConnected(z2);
            Reachability.this.onNetworkChanged();
        }

        @Override // com.mapbox.common.OfflineSwitchObserver
        public void statusChanged(boolean z2) {
            boolean z10 = Looper.myLooper() == Looper.getMainLooper();
            f fVar = new f(0, this, z2);
            if (z10) {
                fVar.run();
            } else {
                new Handler(Looper.getMainLooper()).post(fVar);
            }
        }

        public /* synthetic */ ReachabilityOfflineSwitchObserver(Reachability reachability, AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public Reachability(String str) {
        String string2 = StubApp.getString2(13425);
        this.TAG = string2;
        this.timeoutInMs = DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE;
        this.listeners = new ConcurrentHashMap();
        this.currentStatus = NetworkStatus.NOT_REACHABLE;
        this.networkConnected = true;
        this.publish = false;
        Context context = MapboxSDKCommon.INSTANCE.getContext();
        this.context = context;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(StubApp.getString2(1008));
        this.connectivityManager = connectivityManager;
        AnonymousClass1 anonymousClass1 = null;
        this.callback = null;
        if (connectivityManager == null) {
            throw new AssertionError(StubApp.getString2(13429));
        }
        this.hostname = str;
        if (D.a.a(context, StubApp.getString2(1007)) == 0) {
            NetworkRequest build = new NetworkRequest.Builder().addCapability(12).addCapability(16).build();
            Log.info(StubApp.getString2(13426), string2);
            ConnectionChangeCallback connectionChangeCallback = new ConnectionChangeCallback(this);
            try {
                connectivityManager.registerNetworkCallback(build, connectionChangeCallback);
                this.callback = connectionChangeCallback;
            } catch (RuntimeException e10) {
                Log.error(StubApp.getString2(13427) + e10.getMessage(), string2);
            }
        } else {
            Log.warning(StubApp.getString2(13428), string2);
        }
        ReachabilityOfflineSwitchObserver reachabilityOfflineSwitchObserver = new ReachabilityOfflineSwitchObserver(this, anonymousClass1);
        this.offlineObserver = reachabilityOfflineSwitchObserver;
        OfflineSwitch.getInstance().registerObserver(reachabilityOfflineSwitchObserver);
        onNetworkChanged();
    }

    public static ReachabilityInterface createPlatformReachability(String str) {
        return new Reachability(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void setNetworkConnected(boolean z2) {
        this.networkConnected = z2;
    }

    @Override // com.mapbox.common.ReachabilityInterface
    public synchronized long addListener(ReachabilityChanged reachabilityChanged) {
        long newId;
        newId = IdGenerator.getNewId();
        this.listeners.put(Long.valueOf(newId), reachabilityChanged);
        reachabilityChanged.run(this.currentStatus);
        this.publish = true;
        return newId;
    }

    @Override // com.mapbox.common.ReachabilityInterface
    public synchronized NetworkStatus currentNetworkStatus() {
        return this.currentStatus;
    }

    public void finalize() {
        OfflineSwitch.getInstance().unregisterObserver(this.offlineObserver);
        try {
            ConnectionChangeCallback connectionChangeCallback = this.callback;
            if (connectionChangeCallback != null) {
                this.connectivityManager.unregisterNetworkCallback(connectionChangeCallback);
            }
            super.finalize();
        } catch (Throwable th) {
            Log.error(th.toString(), StubApp.getString2(13425));
        }
    }

    @Override // com.mapbox.common.ReachabilityInterface
    public synchronized boolean isReachable() {
        String string2 = StubApp.getString2(13430);
        String string22 = StubApp.getString2(13431);
        String string23 = StubApp.getString2(13432);
        synchronized (this) {
            boolean z2 = false;
            if (!this.networkConnected) {
                return false;
            }
            String str = this.hostname;
            if (str == null || str.isEmpty()) {
                if (D.a.a(this.context, StubApp.getString2("1007")) == 0) {
                    try {
                        ConnectivityManager connectivityManager = this.connectivityManager;
                        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                        if (networkCapabilities != null) {
                            if (networkCapabilities.hasCapability(12)) {
                                z2 = true;
                            }
                        }
                        return z2;
                    } catch (RuntimeException e10) {
                        Log.error(string2 + e10.getMessage(), StubApp.getString2("13425"));
                    }
                }
                return false;
            }
            try {
                return InetAddress.getByName(this.hostname).isReachable(this.timeoutInMs);
            } catch (IOException e11) {
                Log.warning(string22 + e11.getMessage(), StubApp.getString2("13425"));
                return false;
            } catch (IllegalArgumentException e12) {
                Log.warning(string23 + e12.getMessage(), StubApp.getString2("13425"));
                return false;
            }
        }
    }

    public synchronized void onNetworkChanged() {
        String string2 = StubApp.getString2(13430);
        synchronized (this) {
            NetworkStatus networkStatus = this.currentStatus;
            this.currentStatus = NetworkStatus.NOT_REACHABLE;
            if (this.networkConnected) {
                if (D.a.a(this.context, StubApp.getString2("1007")) == -1) {
                    Log.warning(StubApp.getString2("13433"), StubApp.getString2("13425"));
                    return;
                }
                try {
                    ConnectivityManager connectivityManager = this.connectivityManager;
                    NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                    if (networkCapabilities != null) {
                        if (networkCapabilities.hasTransport(1)) {
                            this.currentStatus = NetworkStatus.REACHABLE_VIA_WI_FI;
                        } else if (networkCapabilities.hasTransport(0)) {
                            this.currentStatus = NetworkStatus.REACHABLE_VIA_WWAN;
                        } else if (networkCapabilities.hasTransport(3)) {
                            this.currentStatus = NetworkStatus.REACHABLE_VIA_ETHERNET;
                        }
                    }
                } catch (RuntimeException e10) {
                    Log.error(string2 + e10.getMessage(), StubApp.getString2("13425"));
                    return;
                }
            }
            if (this.publish && networkStatus != this.currentStatus) {
                Iterator<ReachabilityChanged> it = this.listeners.values().iterator();
                while (it.hasNext()) {
                    it.next().run(this.currentStatus);
                }
            }
        }
    }

    @Override // com.mapbox.common.ReachabilityInterface
    public synchronized boolean removeListener(long j) {
        try {
            this.listeners.remove(Long.valueOf(j));
            if (this.listeners.isEmpty()) {
                this.publish = false;
            }
        } catch (Exception unused) {
            return false;
        }
        return true;
    }
}
