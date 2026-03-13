package o3;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final Gson f18362a;

    static {
        Gson create = new GsonBuilder().create();
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        f18362a = create;
    }
}
