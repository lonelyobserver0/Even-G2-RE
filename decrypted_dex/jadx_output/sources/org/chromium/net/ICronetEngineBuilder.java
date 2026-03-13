package org.chromium.net;

import java.util.Collections;
import java.util.Date;
import java.util.Set;
import org.chromium.net.CronetEngine;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class ICronetEngineBuilder {
    public static final int CONNECTION_MIGRATION_OPTIONS = 1;
    public static final int DNS_OPTIONS = 2;
    public static final int QUIC_OPTIONS = 3;

    public abstract ICronetEngineBuilder addPublicKeyPins(String str, Set<byte[]> set, boolean z2, Date date);

    public abstract ICronetEngineBuilder addQuicHint(String str, int i3, int i10);

    public abstract ExperimentalCronetEngine build();

    public ICronetEngineBuilder enableBrotli(boolean z2) {
        return this;
    }

    public abstract ICronetEngineBuilder enableHttp2(boolean z2);

    public abstract ICronetEngineBuilder enableHttpCache(int i3, long j);

    public ICronetEngineBuilder enableNetworkQualityEstimator(boolean z2) {
        return this;
    }

    public abstract ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z2);

    public abstract ICronetEngineBuilder enableQuic(boolean z2);

    public abstract ICronetEngineBuilder enableSdch(boolean z2);

    public abstract String getDefaultUserAgent();

    public Set<Integer> getSupportedConfigOptions() {
        return Collections.EMPTY_SET;
    }

    public ICronetEngineBuilder setConnectionMigrationOptions(ConnectionMigrationOptions connectionMigrationOptions) {
        return this;
    }

    public ICronetEngineBuilder setDnsOptions(DnsOptions dnsOptions) {
        return this;
    }

    public abstract ICronetEngineBuilder setExperimentalOptions(String str);

    public abstract ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader);

    public ICronetEngineBuilder setQuicOptions(QuicOptions quicOptions) {
        return this;
    }

    public abstract ICronetEngineBuilder setStoragePath(String str);

    public ICronetEngineBuilder setThreadPriority(int i3) {
        return this;
    }

    public abstract ICronetEngineBuilder setUserAgent(String str);
}
