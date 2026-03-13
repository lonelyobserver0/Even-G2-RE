package com.google.firebase.installations.ktx;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;

@Deprecated(message = "com.google.firebase.installations.FirebaseInstallationsKtxRegistrar has been deprecated. Use `com.google.firebase.installationsFirebaseInstallationsKtxRegistrar` instead.", replaceWith = @ReplaceWith(expression = "", imports = {}))
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/google/firebase/installations/ktx/FirebaseInstallationsKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "com.google.firebase-firebase-installations"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class FirebaseInstallationsKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        return CollectionsKt.emptyList();
    }
}
