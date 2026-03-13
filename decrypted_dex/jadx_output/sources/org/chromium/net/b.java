package org.chromium.net;

import com.stub.StubApp;
import org.chromium.net.DnsOptions;
import org.json.JSONObject;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final /* synthetic */ class b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19575a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19576b;

    public /* synthetic */ b(Object obj, int i3) {
        this.f19575a = i3;
        this.f19576b = obj;
    }

    public final void a(JSONObject jSONObject) {
        switch (this.f19575a) {
            case 0:
                JSONObject a3 = c.a(jSONObject, StubApp.getString2(35226));
                DnsOptions dnsOptions = (DnsOptions) this.f19576b;
                Boolean useBuiltInDnsResolver = dnsOptions.getUseBuiltInDnsResolver();
                String string2 = StubApp.getString2(35227);
                if (useBuiltInDnsResolver != null) {
                    a3.put(string2, dnsOptions.getUseBuiltInDnsResolver());
                }
                JSONObject a9 = c.a(jSONObject, StubApp.getString2(35228));
                if (dnsOptions.getEnableStaleDns() != null) {
                    a9.put(string2, dnsOptions.getEnableStaleDns());
                }
                if (dnsOptions.getPersistHostCache() != null) {
                    a9.put(StubApp.getString2(35229), dnsOptions.getPersistHostCache());
                }
                if (dnsOptions.getPersistHostCachePeriodMillis() != null) {
                    a9.put(StubApp.getString2(35230), dnsOptions.getPersistHostCachePeriodMillis());
                }
                if (dnsOptions.getStaleDnsOptions() != null) {
                    DnsOptions.StaleDnsOptions staleDnsOptions = dnsOptions.getStaleDnsOptions();
                    if (staleDnsOptions.getAllowCrossNetworkUsage() != null) {
                        a9.put(StubApp.getString2(35231), staleDnsOptions.getAllowCrossNetworkUsage());
                    }
                    if (staleDnsOptions.getFreshLookupTimeoutMillis() != null) {
                        a9.put(StubApp.getString2(35232), staleDnsOptions.getFreshLookupTimeoutMillis());
                    }
                    if (staleDnsOptions.getUseStaleOnNameNotResolved() != null) {
                        a9.put(StubApp.getString2(35233), staleDnsOptions.getUseStaleOnNameNotResolved());
                    }
                    if (staleDnsOptions.getMaxExpiredDelayMillis() != null) {
                        a9.put(StubApp.getString2(35234), staleDnsOptions.getMaxExpiredDelayMillis());
                    }
                }
                JSONObject a10 = c.a(jSONObject, StubApp.getString2(35196));
                if (dnsOptions.getPreestablishConnectionsToStaleDnsResults() != null) {
                    a10.put(StubApp.getString2(35235), dnsOptions.getPreestablishConnectionsToStaleDnsResults());
                    return;
                }
                return;
            case 1:
                JSONObject a11 = c.a(jSONObject, StubApp.getString2(35196));
                ConnectionMigrationOptions connectionMigrationOptions = (ConnectionMigrationOptions) this.f19576b;
                if (connectionMigrationOptions.getEnableDefaultNetworkMigration() != null) {
                    a11.put(StubApp.getString2(35215), connectionMigrationOptions.getEnableDefaultNetworkMigration());
                }
                if (connectionMigrationOptions.getAllowServerMigration() != null) {
                    a11.put(StubApp.getString2(35216), connectionMigrationOptions.getAllowServerMigration());
                }
                if (connectionMigrationOptions.getMigrateIdleConnections() != null) {
                    a11.put(StubApp.getString2(35217), connectionMigrationOptions.getMigrateIdleConnections());
                }
                if (connectionMigrationOptions.getIdleMigrationPeriodSeconds() != null) {
                    a11.put(StubApp.getString2(35218), connectionMigrationOptions.getIdleMigrationPeriodSeconds());
                }
                if (connectionMigrationOptions.getRetryPreHandshakeErrorsOnAlternateNetwork() != null) {
                    a11.put(StubApp.getString2(35219), connectionMigrationOptions.getRetryPreHandshakeErrorsOnAlternateNetwork());
                }
                if (connectionMigrationOptions.getMaxTimeOnNonDefaultNetworkSeconds() != null) {
                    a11.put(StubApp.getString2(35220), connectionMigrationOptions.getMaxTimeOnNonDefaultNetworkSeconds());
                }
                if (connectionMigrationOptions.getMaxPathDegradingEagerMigrationsCount() != null) {
                    a11.put(StubApp.getString2(35221), connectionMigrationOptions.getMaxPathDegradingEagerMigrationsCount());
                }
                if (connectionMigrationOptions.getMaxWriteErrorEagerMigrationsCount() != null) {
                    a11.put(StubApp.getString2(35222), connectionMigrationOptions.getMaxWriteErrorEagerMigrationsCount());
                }
                if (connectionMigrationOptions.getEnablePathDegradationMigration() != null) {
                    boolean booleanValue = connectionMigrationOptions.getEnablePathDegradationMigration().booleanValue();
                    if (connectionMigrationOptions.getAllowNonDefaultNetworkUsage() != null) {
                        boolean booleanValue2 = connectionMigrationOptions.getAllowNonDefaultNetworkUsage().booleanValue();
                        if (!booleanValue && booleanValue2) {
                            throw new IllegalArgumentException(StubApp.getString2(35223));
                        }
                        String string22 = StubApp.getString2(35224);
                        if (booleanValue && booleanValue2) {
                            a11.put(string22, true);
                            return;
                        }
                        a11.put(string22, false);
                    }
                    a11.put(StubApp.getString2(35225), booleanValue);
                    return;
                }
                return;
            default:
                JSONObject a12 = c.a(jSONObject, StubApp.getString2(35196));
                QuicOptions quicOptions = (QuicOptions) this.f19576b;
                boolean isEmpty = quicOptions.getQuicHostAllowlist().isEmpty();
                String string23 = StubApp.getString2(321);
                if (!isEmpty) {
                    a12.put(StubApp.getString2(35197), String.join(string23, quicOptions.getQuicHostAllowlist()));
                }
                if (!quicOptions.getEnabledQuicVersions().isEmpty()) {
                    a12.put(StubApp.getString2(35198), String.join(string23, quicOptions.getEnabledQuicVersions()));
                }
                if (!quicOptions.getConnectionOptions().isEmpty()) {
                    a12.put(StubApp.getString2(35199), String.join(string23, quicOptions.getConnectionOptions()));
                }
                if (!quicOptions.getClientConnectionOptions().isEmpty()) {
                    a12.put(StubApp.getString2(35200), String.join(string23, quicOptions.getClientConnectionOptions()));
                }
                if (!quicOptions.getExtraQuicheFlags().isEmpty()) {
                    a12.put(StubApp.getString2(35201), String.join(string23, quicOptions.getExtraQuicheFlags()));
                }
                if (quicOptions.getInMemoryServerConfigsCacheSize() != null) {
                    a12.put(StubApp.getString2(35202), quicOptions.getInMemoryServerConfigsCacheSize());
                }
                if (quicOptions.getHandshakeUserAgent() != null) {
                    a12.put(StubApp.getString2(35203), quicOptions.getHandshakeUserAgent());
                }
                if (quicOptions.getRetryWithoutAltSvcOnQuicErrors() != null) {
                    a12.put(StubApp.getString2(35204), quicOptions.getRetryWithoutAltSvcOnQuicErrors());
                }
                if (quicOptions.getEnableTlsZeroRtt() != null) {
                    a12.put(StubApp.getString2(35205), !quicOptions.getEnableTlsZeroRtt().booleanValue());
                }
                if (quicOptions.getPreCryptoHandshakeIdleTimeoutSeconds() != null) {
                    a12.put(StubApp.getString2(35206), quicOptions.getPreCryptoHandshakeIdleTimeoutSeconds());
                }
                if (quicOptions.getCryptoHandshakeTimeoutSeconds() != null) {
                    a12.put(StubApp.getString2(35207), quicOptions.getCryptoHandshakeTimeoutSeconds());
                }
                if (quicOptions.getIdleConnectionTimeoutSeconds() != null) {
                    a12.put(StubApp.getString2(35208), quicOptions.getIdleConnectionTimeoutSeconds());
                }
                if (quicOptions.getRetransmittableOnWireTimeoutMillis() != null) {
                    a12.put(StubApp.getString2(35209), quicOptions.getRetransmittableOnWireTimeoutMillis());
                }
                if (quicOptions.getCloseSessionsOnIpChange() != null) {
                    a12.put(StubApp.getString2(35210), quicOptions.getCloseSessionsOnIpChange());
                }
                if (quicOptions.getGoawaySessionsOnIpChange() != null) {
                    a12.put(StubApp.getString2(35211), quicOptions.getGoawaySessionsOnIpChange());
                }
                if (quicOptions.getInitialBrokenServicePeriodSeconds() != null) {
                    a12.put(StubApp.getString2(35212), quicOptions.getInitialBrokenServicePeriodSeconds());
                }
                if (quicOptions.getIncreaseBrokenServicePeriodExponentially() != null) {
                    a12.put(StubApp.getString2(35213), quicOptions.getIncreaseBrokenServicePeriodExponentially());
                }
                if (quicOptions.getDelayJobsWithAvailableSpdySession() != null) {
                    a12.put(StubApp.getString2(35214), quicOptions.getDelayJobsWithAvailableSpdySession());
                    return;
                }
                return;
        }
    }
}
