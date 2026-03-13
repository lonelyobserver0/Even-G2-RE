package wc;

import com.stub.StubApp;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class v {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f22427c = Pattern.compile(StubApp.getString2(35579));

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f22428d = Pattern.compile(StubApp.getString2(35580));

    /* renamed from: a, reason: collision with root package name */
    public final String f22429a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f22430b;

    public v(String str, String[] strArr) {
        this.f22429a = str;
        this.f22430b = strArr;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof v) && Intrinsics.areEqual(((v) obj).f22429a, this.f22429a);
    }

    public final int hashCode() {
        return this.f22429a.hashCode();
    }

    public final String toString() {
        return this.f22429a;
    }
}
