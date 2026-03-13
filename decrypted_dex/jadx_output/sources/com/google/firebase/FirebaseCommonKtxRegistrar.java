package com.google.firebase;

import Qb.C;
import R4.c;
import U9.h;
import V4.a;
import V4.d;
import W4.b;
import W4.i;
import W4.q;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "LW4/b;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFirebase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Firebase.kt\ncom/google/firebase/FirebaseCommonKtxRegistrar\n+ 2 Firebase.kt\ncom/google/firebase/FirebaseKt\n*L\n1#1,82:1\n76#2,6:83\n76#2,6:89\n76#2,6:95\n76#2,6:101\n*S KotlinDebug\n*F\n+ 1 Firebase.kt\ncom/google/firebase/FirebaseCommonKtxRegistrar\n*L\n67#1:83,6\n68#1:89,6\n69#1:95,6\n70#1:101,6\n*E\n"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b> getComponents() {
        h a3 = b.a(new q(a.class, C.class));
        a3.b(new i(new q(a.class, Executor.class), 1, 0));
        a3.f7525f = c.f6179c;
        b e10 = a3.e();
        Intrinsics.checkNotNullExpressionValue(e10, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        h a9 = b.a(new q(V4.c.class, C.class));
        a9.b(new i(new q(V4.c.class, Executor.class), 1, 0));
        a9.f7525f = c.f6180d;
        b e11 = a9.e();
        Intrinsics.checkNotNullExpressionValue(e11, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        h a10 = b.a(new q(V4.b.class, C.class));
        a10.b(new i(new q(V4.b.class, Executor.class), 1, 0));
        a10.f7525f = c.f6181e;
        b e12 = a10.e();
        Intrinsics.checkNotNullExpressionValue(e12, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        h a11 = b.a(new q(d.class, C.class));
        a11.b(new i(new q(d.class, Executor.class), 1, 0));
        a11.f7525f = c.f6182f;
        b e13 = a11.e();
        Intrinsics.checkNotNullExpressionValue(e13, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        return CollectionsKt.listOf((Object[]) new b[]{e10, e11, e12, e13});
    }
}
