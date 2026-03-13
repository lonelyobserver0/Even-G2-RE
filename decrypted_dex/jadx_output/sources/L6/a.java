package L6;

import com.google.gson.annotations.SerializedName;
import com.stub.StubApp;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Deprecated(level = DeprecationLevel.WARNING, message = "This enum class is deprecated, and will be removed in next major release.", replaceWith = @ReplaceWith(expression = "MapLoadingErrorType", imports = {}))
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"LL6/a;", "", "a", "b", "c", "d", "e", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @SerializedName("style")
    public static final a f4253a;

    /* renamed from: b, reason: collision with root package name */
    @SerializedName("sprite")
    public static final a f4254b;

    /* renamed from: c, reason: collision with root package name */
    @SerializedName("source")
    public static final a f4255c;

    /* renamed from: d, reason: collision with root package name */
    @SerializedName("tile")
    public static final a f4256d;

    /* renamed from: e, reason: collision with root package name */
    @SerializedName("glyphs")
    public static final a f4257e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a[] f4258f;

    static {
        a aVar = new a(StubApp.getString2(3412), 0);
        f4253a = aVar;
        a aVar2 = new a(StubApp.getString2(3413), 1);
        f4254b = aVar2;
        a aVar3 = new a(StubApp.getString2(3414), 2);
        f4255c = aVar3;
        a aVar4 = new a(StubApp.getString2(3415), 3);
        f4256d = aVar4;
        a aVar5 = new a(StubApp.getString2(3416), 4);
        f4257e = aVar5;
        f4258f = new a[]{aVar, aVar2, aVar3, aVar4, aVar5};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f4258f.clone();
    }
}
