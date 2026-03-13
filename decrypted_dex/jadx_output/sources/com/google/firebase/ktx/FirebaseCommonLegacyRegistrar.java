package com.google.firebase.ktx;

import W4.b;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.stub.StubApp;
import f5.u0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/ktx/FirebaseCommonLegacyRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "LW4/b;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common-ktx"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class FirebaseCommonLegacyRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b> getComponents() {
        return CollectionsKt.listOf(u0.g(StubApp.getString2(12563), StubApp.getString2(12533)));
    }
}
