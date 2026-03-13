package K6;

import com.google.gson.annotations.SerializedName;
import com.stub.StubApp;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;

@Deprecated(level = DeprecationLevel.WARNING, message = "This data class is deprecated, and will be removed in next major release.", replaceWith = @ReplaceWith(expression = "RenderFrameFinished", imports = {}))
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017¨\u0006\u001c"}, d2 = {"LK6/c;", "", "", "a", "J", "getBegin", "()J", "begin", "b", "Ljava/lang/Long;", "getEnd", "()Ljava/lang/Long;", "end", "LL6/b;", "c", "LL6/b;", "getRenderMode", "()LL6/b;", "renderMode", "", "d", "Z", "getNeedsRepaint", "()Z", "needsRepaint", "e", "getPlacementChanged", "placementChanged", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("begin")
    private final long begin;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("end")
    private final Long end;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("render-mode")
    private final L6.b renderMode;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("needs-repaint")
    private final boolean needsRepaint;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("placement-changed")
    private final boolean placementChanged;

    public c(long j, Long l9, L6.b renderMode, boolean z2, boolean z10) {
        Intrinsics.checkNotNullParameter(renderMode, "renderMode");
        this.begin = j;
        this.end = l9;
        this.renderMode = renderMode;
        this.needsRepaint = z2;
        this.placementChanged = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.begin == cVar.begin && Intrinsics.areEqual(this.end, cVar.end) && this.renderMode == cVar.renderMode && this.needsRepaint == cVar.needsRepaint && this.placementChanged == cVar.placementChanged;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = Long.hashCode(this.begin) * 31;
        Long l9 = this.end;
        int hashCode2 = (this.renderMode.hashCode() + ((hashCode + (l9 == null ? 0 : l9.hashCode())) * 31)) * 31;
        boolean z2 = this.needsRepaint;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i10 = (hashCode2 + i3) * 31;
        boolean z10 = this.placementChanged;
        return i10 + (z10 ? 1 : z10 ? 1 : 0);
    }

    public final String toString() {
        return StubApp.getString2(3267) + this.begin + StubApp.getString2(3263) + this.end + StubApp.getString2(3268) + this.renderMode + StubApp.getString2(3269) + this.needsRepaint + StubApp.getString2(3270) + this.placementChanged + ')';
    }
}
