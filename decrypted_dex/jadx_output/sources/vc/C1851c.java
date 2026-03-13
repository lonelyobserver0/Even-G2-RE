package vc;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: vc.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class C1851c extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final String f21941a;

    public C1851c(String str, String str2) {
        super(str2);
        this.f21941a = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1851c(String message) {
        this(StubApp.getString2(35403), message);
        Intrinsics.checkNotNullParameter(message, "message");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1851c() {
        this(StubApp.getString2(35402), "Update manager does not exist");
        Intrinsics.checkNotNullParameter("Update manager does not exist", StubApp.getString2(1905));
    }
}
