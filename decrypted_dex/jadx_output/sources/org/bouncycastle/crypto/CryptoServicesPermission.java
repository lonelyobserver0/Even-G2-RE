package org.bouncycastle.crypto;

import com.stub.StubApp;
import java.security.Permission;
import java.util.HashSet;
import java.util.Set;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CryptoServicesPermission extends Permission {
    public static final String CONSTRAINTS = StubApp.getString2(28317);
    public static final String DEFAULT_RANDOM = StubApp.getString2(28318);
    public static final String GLOBAL_CONFIG = StubApp.getString2(28319);
    public static final String THREAD_LOCAL_CONFIG = StubApp.getString2(28320);
    private final Set<String> actions;

    public CryptoServicesPermission(String str) {
        super(str);
        HashSet hashSet = new HashSet();
        this.actions = hashSet;
        hashSet.add(str);
    }

    public boolean equals(Object obj) {
        return (obj instanceof CryptoServicesPermission) && this.actions.equals(((CryptoServicesPermission) obj).actions);
    }

    @Override // java.security.Permission
    public String getActions() {
        return this.actions.toString();
    }

    public int hashCode() {
        return this.actions.hashCode();
    }

    @Override // java.security.Permission
    public boolean implies(Permission permission) {
        if (!(permission instanceof CryptoServicesPermission)) {
            return false;
        }
        CryptoServicesPermission cryptoServicesPermission = (CryptoServicesPermission) permission;
        return getName().equals(cryptoServicesPermission.getName()) || this.actions.containsAll(cryptoServicesPermission.actions);
    }
}
