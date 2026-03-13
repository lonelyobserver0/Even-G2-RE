package org.chromium.support_lib_boundary;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Map;
import java.util.Set;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public interface WebSettingsBoundaryInterface {

    @Retention(RetentionPolicy.SOURCE)
    public @interface AttributionBehavior {
        public static final int APP_SOURCE_AND_APP_TRIGGER = 3;
        public static final int APP_SOURCE_AND_WEB_TRIGGER = 1;
        public static final int DISABLED = 0;
        public static final int WEB_SOURCE_AND_WEB_TRIGGER = 2;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ForceDarkBehavior {
        public static final int FORCE_DARK_ONLY = 0;
        public static final int MEDIA_QUERY_ONLY = 1;
        public static final int PREFER_MEDIA_QUERY_OVER_FORCE_DARK = 2;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface SpeculativeLoadingStatus {
        public static final int DISABLED = 0;
        public static final int PRERENDER_ENABLED = 1;
    }

    @Target({ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface WebViewMediaIntegrityApiStatus {
        public static final int DISABLED = 0;
        public static final int ENABLED = 2;
        public static final int ENABLED_WITHOUT_APP_IDENTITY = 1;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface WebauthnSupport {
        public static final int APP = 1;
        public static final int BROWSER = 2;
        public static final int NONE = 0;
    }

    int getAttributionBehavior();

    boolean getBackForwardCacheEnabled();

    int getDisabledActionModeMenuItems();

    boolean getEnterpriseAuthenticationAppLinkPolicyEnabled();

    int getForceDark();

    int getForceDarkBehavior();

    boolean getHasEnrolledInstrumentEnabled();

    boolean getIncludeCookiesOnIntercept();

    boolean getOffscreenPreRaster();

    boolean getPaymentRequestEnabled();

    Set<String> getRequestedWithHeaderOriginAllowList();

    boolean getSafeBrowsingEnabled();

    int getSpeculativeLoadingStatus();

    Map<String, Object> getUserAgentMetadataMap();

    int getWebViewMediaIntegrityApiDefaultStatus();

    Map<String, Integer> getWebViewMediaIntegrityApiOverrideRules();

    int getWebauthnSupport();

    boolean getWillSuppressErrorPage();

    boolean isAlgorithmicDarkeningAllowed();

    void setAlgorithmicDarkeningAllowed(boolean z2);

    void setAttributionBehavior(int i3);

    void setBackForwardCacheEnabled(boolean z2);

    void setDisabledActionModeMenuItems(int i3);

    void setEnterpriseAuthenticationAppLinkPolicyEnabled(boolean z2);

    void setForceDark(int i3);

    void setForceDarkBehavior(int i3);

    void setHasEnrolledInstrumentEnabled(boolean z2);

    void setIncludeCookiesOnIntercept(boolean z2);

    void setOffscreenPreRaster(boolean z2);

    void setPaymentRequestEnabled(boolean z2);

    void setRequestedWithHeaderOriginAllowList(Set<String> set);

    void setSafeBrowsingEnabled(boolean z2);

    void setSpeculativeLoadingStatus(int i3);

    void setUserAgentMetadataFromMap(Map<String, Object> map);

    void setWebViewMediaIntegrityApiStatus(int i3, Map<String, Integer> map);

    void setWebauthnSupport(int i3);

    void setWillSuppressErrorPage(boolean z2);
}
