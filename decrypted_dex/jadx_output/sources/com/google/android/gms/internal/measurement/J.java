package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface J extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(L l9);

    void getAppInstanceId(L l9);

    void getCachedAppInstanceId(L l9);

    void getConditionalUserProperties(String str, String str2, L l9);

    void getCurrentScreenClass(L l9);

    void getCurrentScreenName(L l9);

    void getGmpAppId(L l9);

    void getMaxUserProperties(String str, L l9);

    void getSessionId(L l9);

    void getTestFlag(L l9, int i3);

    void getUserProperties(String str, String str2, boolean z2, L l9);

    void initForTests(Map map);

    void initialize(Z3.a aVar, U u2, long j);

    void isDataCollectionEnabled(L l9);

    void logEvent(String str, String str2, Bundle bundle, boolean z2, boolean z10, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, L l9, long j);

    void logHealthData(int i3, String str, Z3.a aVar, Z3.a aVar2, Z3.a aVar3);

    void onActivityCreated(Z3.a aVar, Bundle bundle, long j);

    void onActivityCreatedByScionActivityInfo(W w10, Bundle bundle, long j);

    void onActivityDestroyed(Z3.a aVar, long j);

    void onActivityDestroyedByScionActivityInfo(W w10, long j);

    void onActivityPaused(Z3.a aVar, long j);

    void onActivityPausedByScionActivityInfo(W w10, long j);

    void onActivityResumed(Z3.a aVar, long j);

    void onActivityResumedByScionActivityInfo(W w10, long j);

    void onActivitySaveInstanceState(Z3.a aVar, L l9, long j);

    void onActivitySaveInstanceStateByScionActivityInfo(W w10, L l9, long j);

    void onActivityStarted(Z3.a aVar, long j);

    void onActivityStartedByScionActivityInfo(W w10, long j);

    void onActivityStopped(Z3.a aVar, long j);

    void onActivityStoppedByScionActivityInfo(W w10, long j);

    void performAction(Bundle bundle, L l9, long j);

    void registerOnMeasurementEventListener(Q q10);

    void resetAnalyticsData(long j);

    void retrieveAndUploadBatches(N n10);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(Z3.a aVar, String str, String str2, long j);

    void setCurrentScreenByScionActivityInfo(W w10, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z2);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(Q q10);

    void setInstanceIdProvider(T t3);

    void setMeasurementEnabled(boolean z2, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, Z3.a aVar, boolean z2, long j);

    void unregisterOnMeasurementEventListener(Q q10);
}
