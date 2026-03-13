package K6;

import com.google.gson.annotations.SerializedName;
import com.stub.StubApp;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;

@Deprecated(level = DeprecationLevel.WARNING, message = "This data class is deprecated, and will be removed in next major release.", replaceWith = @ReplaceWith(expression = "StyleImageMissing", imports = {}))
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"LK6/h;", "", "", "a", "J", "getBegin", "()J", "begin", "b", "Ljava/lang/Long;", "getEnd", "()Ljava/lang/Long;", "end", "", "c", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* data */ class h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("begin")
    private final long begin;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("end")
    private final Long end;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("id")
    private final String id;

    public h(long j, Long l9, String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.begin = j;
        this.end = l9;
        this.id = id;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.begin == hVar.begin && Intrinsics.areEqual(this.end, hVar.end) && Intrinsics.areEqual(this.id, hVar.id);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.begin) * 31;
        Long l9 = this.end;
        return this.id.hashCode() + ((hashCode + (l9 == null ? 0 : l9.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(3277));
        sb2.append(this.begin);
        sb2.append(StubApp.getString2(3263));
        sb2.append(this.end);
        sb2.append(StubApp.getString2(2296));
        return Xa.h.s(sb2, this.id, ')');
    }
}
