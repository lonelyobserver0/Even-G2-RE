package org.chromium.net;

import android.content.Context;
import android.util.Log;
import com.stub.StubApp;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandlerFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.ConnectionMigrationOptions;
import org.chromium.net.DnsOptions;
import org.chromium.net.QuicOptions;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlRequest;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class CronetEngine {
    public static final int ACTIVE_REQUEST_COUNT_UNKNOWN = -1;
    public static final int CONNECTION_METRIC_UNKNOWN = -1;
    public static final int EFFECTIVE_CONNECTION_TYPE_2G = 3;
    public static final int EFFECTIVE_CONNECTION_TYPE_3G = 4;
    public static final int EFFECTIVE_CONNECTION_TYPE_4G = 5;
    public static final int EFFECTIVE_CONNECTION_TYPE_OFFLINE = 1;
    public static final int EFFECTIVE_CONNECTION_TYPE_SLOW_2G = 2;
    public static final int EFFECTIVE_CONNECTION_TYPE_UNKNOWN = 0;
    private static final String TAG = StubApp.getString2(35180);
    public static final long UNBIND_NETWORK_HANDLE = -1;

    public static class Builder {
        public static final int HTTP_CACHE_DISABLED = 0;
        public static final int HTTP_CACHE_DISK = 3;
        public static final int HTTP_CACHE_DISK_NO_HTTP = 2;
        public static final int HTTP_CACHE_IN_MEMORY = 1;
        private static final String TAG = StubApp.getString2(35174);
        protected final ICronetEngineBuilder mBuilderDelegate;

        public static abstract class LibraryLoader {
            public abstract void loadLibrary(String str);
        }

        public Builder(Context context) {
            this(createBuilderDelegate(context));
        }

        public static int compareVersions(String str, String str2) {
            if (str == null || str2 == null) {
                throw new IllegalArgumentException(StubApp.getString2(35173));
            }
            String string2 = StubApp.getString2(1612);
            String[] split = str.split(string2);
            String[] split2 = str2.split(string2);
            for (int i3 = 0; i3 < split.length && i3 < split2.length; i3++) {
                try {
                    int parseInt = Integer.parseInt(split[i3]);
                    int parseInt2 = Integer.parseInt(split2[i3]);
                    if (parseInt != parseInt2) {
                        return Integer.signum(parseInt - parseInt2);
                    }
                } catch (NumberFormatException e10) {
                    throw new IllegalArgumentException(AbstractC1482f.i(StubApp.getString2(35172), split[i3], StubApp.getString2(1293), split2[i3]), e10);
                }
            }
            return Integer.signum(split.length - split2.length);
        }

        private static ICronetEngineBuilder createBuilderDelegate(Context context) {
            CronetProvider cronetProvider = getEnabledCronetProviders(context, new ArrayList(CronetProvider.getAllProviders(context))).get(0);
            String string2 = StubApp.getString2(35174);
            if (Log.isLoggable(string2, 3)) {
                Log.d(string2, String.format(StubApp.getString2(35175), cronetProvider));
            }
            return cronetProvider.createBuilder().mBuilderDelegate;
        }

        public static List<CronetProvider> getEnabledCronetProviders(Context context, List<CronetProvider> list) {
            if (list.isEmpty()) {
                throw new RuntimeException(StubApp.getString2(35177));
            }
            Iterator<CronetProvider> it = list.iterator();
            while (it.hasNext()) {
                if (!it.next().isEnabled()) {
                    it.remove();
                }
            }
            if (list.isEmpty()) {
                throw new RuntimeException(StubApp.getString2(35176));
            }
            Collections.sort(list, new a());
            return list;
        }

        private int getImplementationApiLevel() {
            try {
                return ((Integer) this.mBuilderDelegate.getClass().getClassLoader().loadClass(StubApp.getString2("12434")).getMethod(StubApp.getString2("12435"), new Class[0]).invoke(null, new Object[0])).intValue();
            } catch (Exception unused) {
                return -1;
            }
        }

        private int getMaximumApiLevel() {
            return ApiVersion.getMaximumAvailableApiLevel();
        }

        public Builder addPublicKeyPins(String str, Set<byte[]> set, boolean z2, Date date) {
            this.mBuilderDelegate.addPublicKeyPins(str, set, z2, date);
            return this;
        }

        public Builder addQuicHint(String str, int i3, int i10) {
            this.mBuilderDelegate.addQuicHint(str, i3, i10);
            return this;
        }

        public CronetEngine build() {
            int implementationApiLevel = getImplementationApiLevel();
            if (implementationApiLevel != -1 && implementationApiLevel < getMaximumApiLevel()) {
                Log.w(StubApp.getString2(35174), StubApp.getString2(35178) + (implementationApiLevel + 1) + StubApp.getString2(35179));
            }
            return this.mBuilderDelegate.build();
        }

        public Builder enableBrotli(boolean z2) {
            this.mBuilderDelegate.enableBrotli(z2);
            return this;
        }

        public Builder enableHttp2(boolean z2) {
            this.mBuilderDelegate.enableHttp2(z2);
            return this;
        }

        public Builder enableHttpCache(int i3, long j) {
            this.mBuilderDelegate.enableHttpCache(i3, j);
            return this;
        }

        public Builder enableNetworkQualityEstimator(boolean z2) {
            this.mBuilderDelegate.enableNetworkQualityEstimator(z2);
            return this;
        }

        public Builder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z2) {
            this.mBuilderDelegate.enablePublicKeyPinningBypassForLocalTrustAnchors(z2);
            return this;
        }

        public Builder enableQuic(boolean z2) {
            this.mBuilderDelegate.enableQuic(z2);
            return this;
        }

        @Deprecated
        public Builder enableSdch(boolean z2) {
            return this;
        }

        public String getDefaultUserAgent() {
            return this.mBuilderDelegate.getDefaultUserAgent();
        }

        @ConnectionMigrationOptions.Experimental
        public Builder setConnectionMigrationOptions(ConnectionMigrationOptions connectionMigrationOptions) {
            this.mBuilderDelegate.setConnectionMigrationOptions(connectionMigrationOptions);
            return this;
        }

        @DnsOptions.Experimental
        public Builder setDnsOptions(DnsOptions dnsOptions) {
            this.mBuilderDelegate.setDnsOptions(dnsOptions);
            return this;
        }

        public Builder setLibraryLoader(LibraryLoader libraryLoader) {
            this.mBuilderDelegate.setLibraryLoader(libraryLoader);
            return this;
        }

        @QuicOptions.Experimental
        public Builder setQuicOptions(QuicOptions quicOptions) {
            this.mBuilderDelegate.setQuicOptions(quicOptions);
            return this;
        }

        public Builder setStoragePath(String str) {
            this.mBuilderDelegate.setStoragePath(str);
            return this;
        }

        public Builder setThreadPriority(int i3) {
            this.mBuilderDelegate.setThreadPriority(i3);
            return this;
        }

        public Builder setUserAgent(String str) {
            this.mBuilderDelegate.setUserAgent(str);
            return this;
        }

        public Builder(ICronetEngineBuilder iCronetEngineBuilder) {
            if (iCronetEngineBuilder instanceof c) {
                this.mBuilderDelegate = iCronetEngineBuilder;
            } else {
                this.mBuilderDelegate = new c(iCronetEngineBuilder);
            }
        }

        @ConnectionMigrationOptions.Experimental
        public Builder setConnectionMigrationOptions(ConnectionMigrationOptions.Builder builder) {
            return setConnectionMigrationOptions(builder.build());
        }

        @DnsOptions.Experimental
        public Builder setDnsOptions(DnsOptions.Builder builder) {
            return setDnsOptions(builder.build());
        }

        @QuicOptions.Experimental
        public Builder setQuicOptions(QuicOptions.Builder builder) {
            return setQuicOptions(builder.build());
        }
    }

    public void addRequestFinishedListener(RequestFinishedInfo.Listener listener) {
    }

    public void addRttListener(NetworkQualityRttListener networkQualityRttListener) {
    }

    public void addThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
    }

    public void bindToNetwork(long j) {
    }

    public void configureNetworkQualityEstimatorForTesting(boolean z2, boolean z10, boolean z11) {
    }

    public abstract URLStreamHandlerFactory createURLStreamHandlerFactory();

    public int getActiveRequestCount() {
        return -1;
    }

    public int getDownstreamThroughputKbps() {
        return -1;
    }

    public int getEffectiveConnectionType() {
        return 0;
    }

    public abstract byte[] getGlobalMetricsDeltas();

    public int getHttpRttMs() {
        return -1;
    }

    public int getTransportRttMs() {
        return -1;
    }

    public abstract String getVersionString();

    public BidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor) {
        throw new UnsupportedOperationException(StubApp.getString2(34847));
    }

    public abstract UrlRequest.Builder newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor);

    public abstract URLConnection openConnection(URL url) throws IOException;

    public void removeRequestFinishedListener(RequestFinishedInfo.Listener listener) {
    }

    public void removeRttListener(NetworkQualityRttListener networkQualityRttListener) {
    }

    public void removeThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
    }

    public abstract void shutdown();

    public void startNetLogToDisk(String str, boolean z2, int i3) {
    }

    public abstract void startNetLogToFile(String str, boolean z2);

    public abstract void stopNetLog();
}
