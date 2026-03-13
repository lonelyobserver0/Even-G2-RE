package org.bouncycastle.jcajce.provider.config;

import com.stub.StubApp;
import java.security.BasicPermission;
import java.security.Permission;
import java.util.StringTokenizer;
import org.bouncycastle.util.Strings;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ProviderConfigurationPermission extends BasicPermission {
    private static final int ACCEPTABLE_EC_CURVES = 16;
    private static final int ADDITIONAL_EC_PARAMETERS = 32;
    private static final int ALL = 63;
    private static final int DH_DEFAULT_PARAMS = 8;
    private static final int EC_IMPLICITLY_CA = 2;
    private static final int THREAD_LOCAL_DH_DEFAULT_PARAMS = 4;
    private static final int THREAD_LOCAL_EC_IMPLICITLY_CA = 1;
    private final String actions;
    private final int permissionMask;
    private static final String ACCEPTABLE_EC_CURVES_STR = StubApp.getString2(30945);
    private static final String ADDITIONAL_EC_PARAMETERS_STR = StubApp.getString2(30946);
    private static final String ALL_STR = StubApp.getString2(23002);
    private static final String DH_DEFAULT_PARAMS_STR = StubApp.getString2(30944);
    private static final String EC_IMPLICITLY_CA_STR = StubApp.getString2(30942);
    private static final String THREAD_LOCAL_DH_DEFAULT_PARAMS_STR = StubApp.getString2(30943);
    private static final String THREAD_LOCAL_EC_IMPLICITLY_CA_STR = StubApp.getString2(30941);

    public ProviderConfigurationPermission(String str) {
        super(str);
        this.actions = StubApp.getString2(23002);
        this.permissionMask = 63;
    }

    private int calculateMask(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(Strings.toLowerCase(str), StubApp.getString2(30940));
        int i3 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (nextToken.equals(StubApp.getString2(30941))) {
                i3 |= 1;
            } else if (nextToken.equals(StubApp.getString2(30942))) {
                i3 |= 2;
            } else if (nextToken.equals(StubApp.getString2(30943))) {
                i3 |= 4;
            } else if (nextToken.equals(StubApp.getString2(30944))) {
                i3 |= 8;
            } else if (nextToken.equals(StubApp.getString2(30945))) {
                i3 |= 16;
            } else if (nextToken.equals(StubApp.getString2(30946))) {
                i3 |= 32;
            } else if (nextToken.equals(StubApp.getString2(23002))) {
                i3 = 63;
            }
        }
        if (i3 != 0) {
            return i3;
        }
        throw new IllegalArgumentException(StubApp.getString2(30947));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ProviderConfigurationPermission) {
            ProviderConfigurationPermission providerConfigurationPermission = (ProviderConfigurationPermission) obj;
            if (this.permissionMask == providerConfigurationPermission.permissionMask && getName().equals(providerConfigurationPermission.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.BasicPermission, java.security.Permission
    public String getActions() {
        return this.actions;
    }

    public int hashCode() {
        return getName().hashCode() + this.permissionMask;
    }

    @Override // java.security.BasicPermission, java.security.Permission
    public boolean implies(Permission permission) {
        if (!(permission instanceof ProviderConfigurationPermission) || !getName().equals(permission.getName())) {
            return false;
        }
        int i3 = this.permissionMask;
        int i10 = ((ProviderConfigurationPermission) permission).permissionMask;
        return (i3 & i10) == i10;
    }

    public ProviderConfigurationPermission(String str, String str2) {
        super(str, str2);
        this.actions = str2;
        this.permissionMask = calculateMask(str2);
    }
}
