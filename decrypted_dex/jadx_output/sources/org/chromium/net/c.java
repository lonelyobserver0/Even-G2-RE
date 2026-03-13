package org.chromium.net;

import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.chromium.net.CronetEngine;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class c extends ICronetEngineBuilder {

    /* renamed from: d, reason: collision with root package name */
    public static final Set f19577d = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 3)));

    /* renamed from: a, reason: collision with root package name */
    public JSONObject f19578a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f19579b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ICronetEngineBuilder f19580c;

    public c(ICronetEngineBuilder iCronetEngineBuilder) {
        this.f19580c = iCronetEngineBuilder;
    }

    public static JSONObject a(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject != null) {
            return optJSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put(str, jSONObject2);
            return jSONObject2;
        } catch (JSONException e10) {
            throw new IllegalArgumentException(E1.a.k(StubApp.getString2(35236), str, StubApp.getString2(511)), e10);
        }
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder addPublicKeyPins(String str, Set set, boolean z2, Date date) {
        this.f19580c.addPublicKeyPins(str, set, z2, date);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder addQuicHint(String str, int i3, int i10) {
        this.f19580c.addQuicHint(str, i3, i10);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ExperimentalCronetEngine build() {
        JSONObject jSONObject = this.f19578a;
        ArrayList arrayList = this.f19579b;
        ICronetEngineBuilder iCronetEngineBuilder = this.f19580c;
        if (jSONObject == null && arrayList.isEmpty()) {
            return iCronetEngineBuilder.build();
        }
        if (this.f19578a == null) {
            this.f19578a = new JSONObject();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((b) it.next()).a(this.f19578a);
            } catch (JSONException e10) {
                throw new IllegalStateException(StubApp.getString2(35237), e10);
            }
        }
        iCronetEngineBuilder.setExperimentalOptions(this.f19578a.toString());
        return iCronetEngineBuilder.build();
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableBrotli(boolean z2) {
        this.f19580c.enableBrotli(z2);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableHttp2(boolean z2) {
        this.f19580c.enableHttp2(z2);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableHttpCache(int i3, long j) {
        this.f19580c.enableHttpCache(i3, j);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableNetworkQualityEstimator(boolean z2) {
        this.f19580c.enableNetworkQualityEstimator(z2);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z2) {
        this.f19580c.enablePublicKeyPinningBypassForLocalTrustAnchors(z2);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableQuic(boolean z2) {
        this.f19580c.enableQuic(z2);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableSdch(boolean z2) {
        this.f19580c.enableSdch(z2);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final String getDefaultUserAgent() {
        return this.f19580c.getDefaultUserAgent();
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final Set getSupportedConfigOptions() {
        return f19577d;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setConnectionMigrationOptions(ConnectionMigrationOptions connectionMigrationOptions) {
        ICronetEngineBuilder iCronetEngineBuilder = this.f19580c;
        if (iCronetEngineBuilder.getSupportedConfigOptions().contains(1)) {
            iCronetEngineBuilder.setConnectionMigrationOptions(connectionMigrationOptions);
            return this;
        }
        this.f19579b.add(new b(connectionMigrationOptions, 1));
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setDnsOptions(DnsOptions dnsOptions) {
        ICronetEngineBuilder iCronetEngineBuilder = this.f19580c;
        if (iCronetEngineBuilder.getSupportedConfigOptions().contains(2)) {
            iCronetEngineBuilder.setDnsOptions(dnsOptions);
            return this;
        }
        this.f19579b.add(new b(dnsOptions, 0));
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setExperimentalOptions(String str) {
        if (str == null || str.isEmpty()) {
            this.f19578a = null;
            return this;
        }
        try {
            this.f19578a = new JSONObject(str);
            return this;
        } catch (JSONException e10) {
            throw new IllegalArgumentException(StubApp.getString2(35238), e10);
        }
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
        this.f19580c.setLibraryLoader(libraryLoader);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setQuicOptions(QuicOptions quicOptions) {
        ICronetEngineBuilder iCronetEngineBuilder = this.f19580c;
        if (iCronetEngineBuilder.getSupportedConfigOptions().contains(3)) {
            iCronetEngineBuilder.setQuicOptions(quicOptions);
            return this;
        }
        this.f19579b.add(new b(quicOptions, 2));
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setStoragePath(String str) {
        this.f19580c.setStoragePath(str);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setThreadPriority(int i3) {
        this.f19580c.setThreadPriority(i3);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setUserAgent(String str) {
        this.f19580c.setUserAgent(str);
        return this;
    }
}
