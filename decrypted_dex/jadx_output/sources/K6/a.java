package K6;

import com.google.gson.annotations.SerializedName;
import com.stub.StubApp;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;

@Deprecated(level = DeprecationLevel.WARNING, message = "This data class is deprecated, and will be removed in next major release.", replaceWith = @ReplaceWith(expression = "MapLoaded", imports = {}))
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"LK6/a;", "", "", "a", "J", "getBegin", "()J", "begin", "b", "Ljava/lang/Long;", "getEnd", "()Ljava/lang/Long;", "end", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("begin")
    private final long begin;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("end")
    private final Long end;

    public a(long j, Long l9) {
        this.begin = j;
        this.end = l9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.begin == aVar.begin && Intrinsics.areEqual(this.end, aVar.end);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.begin) * 31;
        Long l9 = this.end;
        return hashCode + (l9 == null ? 0 : l9.hashCode());
    }

    public final String toString() {
        return StubApp.getString2(3262) + this.begin + StubApp.getString2(3263) + this.end + ')';
    }
}
